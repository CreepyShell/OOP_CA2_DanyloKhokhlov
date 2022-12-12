package finalexam.shapeapp2022;

import java.awt.*;

public class Oval extends AbstractShape implements Drawable {
    private Color colour;
    private boolean filled;

    public Oval() {
        setColour(new Color(0, 0, 0));
        setFilled(false);
    }

    public Oval(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color colour, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        setColour(colour);
        setFilled(filled);
    }

    @Override
    public String toString() {
        return super.toString() +
                "colour=" + colour +
                ", filled=" + filled +
                '}';
    }

    @Override
    public String getType() {
        return "Oval";
    }

    @Override
    public void setColour(Color color) {
        this.colour = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public Color getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return false;
    }

    @Override
    public void draw(Graphics g) {
        if (!filled)
            g.drawOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
        else
            g.fillOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());

    }
}
