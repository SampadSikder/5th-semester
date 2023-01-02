public class BoosterMode {
    int intensityThreshold;

    public void setIntensityThreshold(int intensityThreshold){
        this.intensityThreshold=intensityThreshold;
    }
    public int boost(int colorIntensity){
        return colorIntensity*intensityThreshold;
    }
}
