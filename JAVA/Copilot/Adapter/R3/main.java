package Java.Copilot.Adapter.R3;
// Main.java
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.execute();
    }
}