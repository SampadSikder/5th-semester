public abstract class Chipset { //abstract class instead of interface
    private String model;

    protected Chipset(){

    }
    protected Chipset(Chipset chipset){
        this.model= chipset.model;

    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public abstract Chipset clone();
}

class MobileChipset extends Chipset{
    private boolean e_sim;
    private GPS gps;

    public MobileChipset(){

    }
    public MobileChipset(MobileChipset mobileChipset){
        super(mobileChipset);
        this.e_sim= mobileChipset.e_sim;
        this.gps=mobileChipset.gps;//shallow copy, variable shares memory
        //this.gps=new GPS(); deep copy
    }

    public MobileChipset clone(){
        return new MobileChipset(this);
    }
    public void setGps(GPS gps){
        this.gps=gps;
    }
   public void setE_sim(boolean e_sim){
        this.e_sim=e_sim;
   }
   public String toString(){
        return super.getModel();
   }
}

class PCChipset extends Chipset{
    private boolean pci_e;

    public PCChipset(){

    }
    public PCChipset(PCChipset pcChipset){
        super(pcChipset);
        this.pci_e=pcChipset.pci_e;
    }
    public void setPci_e(boolean pci_e){
        this.pci_e=pci_e;
    }
    public PCChipset clone(){
        return new PCChipset(this);
    }
    public String toString(){
        return super.getModel();
    }
}


