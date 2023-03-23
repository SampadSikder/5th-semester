public abstract class Decorator extends VisualComponent{
    private VisualComponent visualComponent;

    public Decorator(){

    }
    public Decorator(VisualComponent visualComponent){
        this.visualComponent=visualComponent;
    }

    public void Draw(){
        System.out.println("Drawing default");
        visualComponent.Draw();
    }
    public void Resize(){
        System.out.println("Resizing default");
        visualComponent.Resize();
    }

}
