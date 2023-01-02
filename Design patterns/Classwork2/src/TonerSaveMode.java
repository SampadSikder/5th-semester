public class TonerSaveMode {
    int colorIntensity;

    public void setColorIntensity(int colorIntensity){
        this.colorIntensity=colorIntensity;
    }
    public void saveToner(TonerSavingLevel tonerSavingLevel){
        this.colorIntensity=tonerSavingLevel.algorithm(colorIntensity);
    }

}
