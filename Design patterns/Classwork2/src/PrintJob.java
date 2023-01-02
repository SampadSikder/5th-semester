import java.util.Queue;

public class PrintJob {
    Queue<PrintRequest> printRequests;
    TonerSaveMode tonerSaveMode;
    PageSaveMode pageSaveMode;
    BoosterMode boosterMode;

    public PrintJob(PrintRequest printRequest,TonerSaveMode tonerSaveMode,PageSaveMode pageSaveMode,BoosterMode boosterMode){
        printRequests.add(printRequest);
        this.tonerSaveMode=tonerSaveMode;
        this.pageSaveMode=pageSaveMode;
        this.boosterMode=boosterMode;

    }
    public void pullJob(){
        //do something to queue
    }
    public void changePriority(int priority){
        //increase priority of a job
    }
}

