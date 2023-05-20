import java.util.ArrayList;

public interface Equipments { //Component
    public void addComponent(Equipments equipment);
    public void removeComponent(Equipments equipment);

    public Double calculatePrice();
}

class Motherboard implements Equipments{ //Composite inherits Component
    private ArrayList<Equipments> equipments=new ArrayList<>();

    public Motherboard(){

    }

    public void addComponent(Equipments equipment){
        this.equipments.add(equipment);
    }
    public void removeComponent(Equipments equipment){
        this.equipments.remove(equipment);
    }

    public Double calculatePrice(){
        Double price=0.0;
        for(Equipments equipment: equipments){
            price+=equipment.calculatePrice();
        }
        return price;
    }
}

class CPU implements Equipments{
    private ArrayList<Equipments> equipments=new ArrayList<>();

    public CPU(){

    }

    public void addComponent(Equipments equipment){
        this.equipments.add(equipment);
    }
    public void removeComponent(Equipments equipment){
        this.equipments.remove(equipment);
    }

    public Double calculatePrice(){
       return 150.0;
    }
}

class Storage implements Equipments{ //Composite
    private ArrayList<Equipments> equipments=new ArrayList<>();

    public Storage(){

    }

    public void addComponent(Equipments equipment){
        this.equipments.add(equipment);
    }
    public void removeComponent(Equipments equipment){
        this.equipments.remove(equipment);
    }

    public Double calculatePrice(){
        Double price=0.0;
        for(Equipments equipment: equipments){
            price+=equipment.calculatePrice();
        }
        return price;
    }
}

class SSD implements Equipments{
    private ArrayList<Equipments> equipments=new ArrayList<>();

    public SSD(){

    }

    public void addComponent(Equipments equipment){
        this.equipments.add(equipment);
    }
    public void removeComponent(Equipments equipment){
        this.equipments.remove(equipment);
    }

    public Double calculatePrice(){
       return 200.0;
    }
}

class HDD implements Equipments{
    private ArrayList<Equipments> equipments=new ArrayList<>();

    public HDD(){

    }

    public void addComponent(Equipments equipment){
        this.equipments.add(equipment);
    }
    public void removeComponent(Equipments equipment){
        this.equipments.remove(equipment);
    }

    public Double calculatePrice(){
        return 100.0;
    }
}