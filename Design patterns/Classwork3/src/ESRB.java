import java.util.ArrayList;

public class ESRB{
    private static ESRB instance = null;
    private ArrayList<Cinema>database=new ArrayList<>();
    private ESRB(){

    }
    public static ESRB getESRB(){
        if(instance!=null){
            return instance;
        }
        else{
            instance=new ESRB();
            return instance;
        }
    }
    public void register(Cinema cinema){
        database.add(cinema);
    }
}
