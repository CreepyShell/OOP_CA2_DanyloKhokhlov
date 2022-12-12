package finalexam.shapeapp2022;

public abstract class AbstractShape {
    private int topLeftX;
    private int topLeftY;
    private int bottomRightX;
    private int bottomRightY;

    public AbstractShape() {
        setBottomRightY(0);
        setTopLeftX(0);
        setTopLeftY(0);
        setBottomRightX(0);
    }

    public AbstractShape(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        setTopLeftX(topLeftX);
        setTopLeftY(topLeftY);
        setBottomRightX(bottomRightX);
        setBottomRightY(bottomRightY);
    }

    public int getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(int topLeftX) {
        this.topLeftX = topLeftX;
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(int topLeftY) {
        this.topLeftY = topLeftY;
    }

    public int getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(int bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public int getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(int bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    @Override
    public String toString() {
        return this.getType() + ": {" +
                "topLeftX: " + topLeftX +
                ", topLeftY: " + topLeftY +
                ", bottomRightX: " + bottomRightX +
                ", bottomRightY: " + bottomRightY;
    }

    public int getWidth() {
        return Math.abs(this.getTopLeftX() - this.getBottomRightX());
    }

    public int getHeight() {
        return Math.abs(this.getTopLeftY() - this.getBottomRightY());
    }

    public abstract String getType();
}
