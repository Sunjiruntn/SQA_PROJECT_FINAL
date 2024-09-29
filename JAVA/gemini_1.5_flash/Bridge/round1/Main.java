package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a red circle
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();  // Output: Drawing Circle with color. Coloring with Red.

        // Create a blue circle
        Shape blueCircle = new Circle(new BlueColor());
        blueCircle.draw();  // Output: Drawing Circle with color. Coloring with Blue.
    }
}
