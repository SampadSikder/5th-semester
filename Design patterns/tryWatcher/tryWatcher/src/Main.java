import java.nio.file.FileSystems;
import java.nio.file.*;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Main{
    public static void main(String[] args){
        String pathStr = ".";
        Path path= Paths.get(pathStr);
        System.out.println(path);
        try (final WatchService watchService = FileSystems.getDefault().newWatchService()) {
            final WatchKey watchKey = path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
            while (true) {
                final WatchKey wk = watchService.take();
                for (WatchEvent<?> event : wk.pollEvents()) {
                    final Path changed = (Path) event.context();
                    System.out.println(changed);
                    System.out.println(event.toString());
                    if (changed.endsWith("nice.txt")) {
                        System.out.println("My file has changed");
                    }
                }
                // reset the key
                boolean valid = wk.reset();
                if (!valid) {
                    System.out.println("Key has been unregisterede");
                }
            }
        } catch(Exception err){
            err.printStackTrace();
        }
    }
}