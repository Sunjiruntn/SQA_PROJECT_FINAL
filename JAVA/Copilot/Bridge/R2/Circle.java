package Java.Copilot.Bridge.R2;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color: ");
        color.fill();
    }
}
