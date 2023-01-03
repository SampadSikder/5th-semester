abstract class PrintMode {
    int numberOfPages;
    int pageSize;
    int orientation;
    int colorIntensity;
    int costPerPage;

    public void saveToner(int colorIntensity){
        this.colorIntensity=colorIntensity
    }
    public void savePage(int orientation, int pageSize){
        this.pageSize=pageSize;
    }
    public void boost(){

    }
}

class TonerSaveMode extends PrintMode{
    int tonerSavingLevel;

    public TonerSaveMode(int tonerSavingLevel){
        this.tonerSavingLevel=tonerSavingLevel;
        if(tonerSavingLevel>500){
            highTonerAlgorithm();
        }
        else if(tonerSavingLevel>250 && tonerSavingLevel<500){
            mediumTonerAlgorithm();
        }
        else{
            lowTonerAlgorithm();
        }
    }
    public void highTonerAlgorithm(){

    }
    public void mediumTonerAlgorithm(){

    }
    public void lowTonerAlgorithm(){

    }
}
class PageSaveMode extends PrintMode{

    public PageSaveMode(){

    }

    public void algorithm(){

    }
    public void renderPreview(){

    }
}
class BoosterMode{
    int intensityThreshold;
    public BoosterMode(int intensityThreshold){
        this.intensityThreshold=intensityThreshold;
    }
    public void increaseIntensity(){

    }
}