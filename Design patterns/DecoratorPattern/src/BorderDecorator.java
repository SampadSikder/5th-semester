import javax.swing.border.Border;

public class BorderDecorator extends Decorator{
    VisualComponent visualComponent;
    int borderWidth;
    public BorderDecorator(VisualComponent visualComponent, int borderWidth){
        super(visualComponent);
        this.visualComponent=visualComponent;
        this.borderWidth=borderWidth;
    }

    public void Draw(){
        super.Draw();
        DrawBorder(2);
    }

    private void DrawBorder(int width){
        System.out.println("drawing border");
    }

    public void Resize(){
        super.Resize();
        System.out.println("drawing resize border");
    }
}
