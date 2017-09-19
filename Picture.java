/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square background;
    private Triangle upYellow;
    private Triangle downGreen;
    private Circle circleRed;
    private Circle circleBlue;
    private Circle circleMagenta;
    private Circle circleYellow;
    private Circle circleBlack;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeColor("green");
        background.moveHorizontal(-310);
        background.moveVertical(-120);
        background.changeSize(500);
        background.makeVisible();

        circleRed = new Circle();
        circleRed.changeColor("red");
        circleRed.moveHorizontal(-130);
        circleRed.moveVertical(-90);
        circleRed.changeSize(300);
        circleRed.makeVisible();
        
        circleBlue = new Circle();
        circleBlue.changeColor("blue");
        circleBlue.moveHorizontal(-230);
        circleBlue.moveVertical(-90);
        circleBlue.changeSize(120);
        circleBlue.makeVisible();
        
        circleMagenta = new Circle();
        circleMagenta.changeColor("magenta");
        circleMagenta.moveHorizontal(150);
        circleMagenta.moveVertical(-90);
        circleMagenta.changeSize(120);
        circleMagenta.makeVisible();
        
        circleYellow = new Circle();
        circleYellow.changeColor("yellow");
        circleYellow.moveHorizontal(150);
        circleYellow.moveVertical(90);
        circleYellow.changeSize(120);
        circleYellow.makeVisible();
        
        circleBlack = new Circle();
        circleBlack.changeColor("black");
        circleBlack.moveHorizontal(-230);
        circleBlack.moveVertical(90);
        circleBlack.changeSize(120);
        circleBlack.makeVisible();
        
        upYellow = new Triangle();
        upYellow.changeColor("yellow");
        upYellow.changeSize(228, 266);
        upYellow.moveHorizontal(40);
        upYellow.moveVertical(-140);
        upYellow.makeVisible();
        
        downGreen = new Triangle();
        downGreen.changeColor("green");
        downGreen.changeSize(-228, 266);
        downGreen.moveHorizontal(40);
        downGreen.moveVertical(160);
        downGreen.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (background != null)   // only if it's painted already...
        {
            background.changeColor("black");
            circleRed.changeColor("white");
            circleBlue.changeColor("white");
            circleMagenta.changeColor("white");
            circleYellow.changeColor("white");
            circleBlack.changeColor("white");
            upYellow.changeColor("black");
            downGreen.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (background != null)   // only if it's painted already...
        {
            background.changeColor("green");
            circleRed.changeColor("red");
            circleBlue.changeColor("blue");
            circleMagenta.changeColor("magenta");
            circleYellow.changeColor("yellow");
            circleBlack.changeColor("black");
            upYellow.changeColor("yellow");
            downGreen.changeColor("green");
        }
    }
}
