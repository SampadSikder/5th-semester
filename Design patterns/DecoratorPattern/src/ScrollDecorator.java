

public class ScrollDecorator extends Decorator{
    VisualComponent visualComponent;
    public ScrollDecorator(VisualComponent visualComponent){
        super(visualComponent);
        this.visualComponent=visualComponent;

    }

    public void Draw(){
        super.Draw();
        DrawScroll(2);
    }

    private void DrawScroll(int width){
        System.out.println("drawing scroll");
    }

    public void Resize(){
        super.Resize();
        System.out.println("resizing scroll");
    }
}
