import java.io.IOException;
import java.nio.file.*;
import java.util.Date;

public abstract class ConcreteSubject extends Subject{
    protected String fileName;
    protected String path;
    protected String state;

    public ConcreteSubject(String fileName, String path){
        this.fileName=fileName;
        this.path=path;
    }
    public void getUpdate() throws IOException, InterruptedException {
        WatchService watchService= FileSystems.getDefault().newWatchService();
        Path dirPath= Paths.get(path);
        System.out.println(dirPath);
        dirPath.register(watchService, this.registerEvent());

        while(true){
            WatchKey key=watchService.take();

            for(WatchEvent<?> event: key.pollEvents()){
                String eventFileName = event.context().toString();

                if(eventFileName.equals(fileName)){
                    String changeType=event.kind().name();
                    String changeTime=new Date().toString();

                    //notify observer
                    notify(fileName, changeType, changeTime);
                }
            }

            boolean valid=key.reset();

            if(!valid){
                break;
            }
        }
    }

    public abstract WatchEvent.Kind<Path> registerEvent() throws IOException;


}
class SubjectModify extends ConcreteSubject{
    public SubjectModify(String fileName, String path){
        super(fileName,path);
    }
    @Override
    public WatchEvent.Kind<Path> registerEvent() throws IOException{
        System.out.println("modify");
        return StandardWatchEventKinds.ENTRY_MODIFY;
    }

}

class SubjectAdd extends ConcreteSubject{
    public SubjectAdd(String fileName, String path){
        super(fileName,path);
    }
    @Override
    public WatchEvent.Kind<Path> registerEvent() throws IOException{
        System.out.println("add");
        return StandardWatchEventKinds.ENTRY_CREATE;
    }
}

class SubjectDelete extends ConcreteSubject{
    public SubjectDelete(String fileName, String path){
        super(fileName,path);
    }
    @Override
    public WatchEvent.Kind<Path> registerEvent() throws IOException{
        System.out.println("delete");
        return StandardWatchEventKinds.ENTRY_DELETE;
    }
}

