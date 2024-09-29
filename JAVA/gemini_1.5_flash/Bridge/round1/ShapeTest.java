package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;


public class ShapeTest {

    @Test
    public void testDrawRedCircle() {
        // Arrange
        Color mockRedColor = Mockito.mock(Color.class);
        Shape redCircle = new Circle(mockRedColor);

        // Act
        redCircle.draw();

        // Assert
        verify(mockRedColor).fill(); // Verify that fill method is called
    }

    @Test
    public void testDrawBlueCircle() {
        // Arrange
        Color mockBlueColor = Mockito.mock(Color.class);
        Shape blueCircle = new Circle(mockBlueColor);

        // Act
        blueCircle.draw();

        // Assert
        verify(mockBlueColor).fill(); // Verify that fill method is called
    }
}
