import java.awt.*;

public class Word extends Shape
{
    public Word()
    {
        super();
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        if (Math.random() < .5)
        {
            g.drawString("Hello", getMinX(), getMinY());
        }
        else
        {
            g.drawString("Bye!", getMinX(), getMinY());
        }
    }
}
