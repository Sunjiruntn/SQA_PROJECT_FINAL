package Java.Copilot.Bridge.R2;
// Shape.java
public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}