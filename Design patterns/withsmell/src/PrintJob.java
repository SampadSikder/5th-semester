import javax.print.Doc;
import java.util.Queue;

public class PrintJob {
    Queue<PrintRequest> printRequests;
    PrioritySetting prioritySetting;
    public PrintJob(){

    }
    public void pullJob(){

    }
    public void changePriority(){

    }

}
class PrioritySetting{

}

class PrintRequest{
    Document document;
    TonerSaveMode tonerSaveMode;
    PageSaveMode pageSaveMode;
    BoosterMode boosterMode;
    public PrintRequest(Document document, TonerSaveMode tonerSaveMode,BoosterMode boosterMode,PageSaveMode pageSaveMode){

    }


}
class Document{
    public void readDocument(){

    }
}
