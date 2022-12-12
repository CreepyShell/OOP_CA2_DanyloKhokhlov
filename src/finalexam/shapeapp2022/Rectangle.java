package finalexam.shapeapp2022;

import java.awt.*;

public class Rectangle extends AbstractShape implements Drawable{
    private Color colour;
    private boolean filled;

    public Rectangle() {
        super();
        setColour(new Color(0, 0, 0));
        setFilled(false);
    }

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color color, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        setColour(color);
        setFilled(filled);
    }

    @Override
    public String toString() {
        return super.toString() +
                "color: " + colour +
                ", filled: " + filled +
                '}';
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color color) {
        this.colour = color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(colour);
        if(!filled)
            g.drawRect(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
        else
            g.fillRect(getTopLeftX(), getTopLeftY(),getWidth(), getHeight());

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
