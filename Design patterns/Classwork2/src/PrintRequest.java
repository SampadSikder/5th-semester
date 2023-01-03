import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintRequest {
    private Document document;
    private ArrayList<IModes> modes;
    public PrintRequest(Document document, ArrayList<IModes>modes){
        for(IModes mode:modes){
            modes.add(mode);
        }
        this.document=document;
    }

}

class Document{

    public void readDocument(){

    }
}
