package finalexam.shapeapp2022;

import java.awt.*;

public interface Drawable {
    void setColour(Color color);

    void setFilled(boolean filled);

    Color getColour();

    boolean isFilled();

    void draw(Graphics graphics);
}
