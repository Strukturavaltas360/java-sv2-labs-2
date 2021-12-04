package interfaces.figure;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {
    Triangle triangle = new Triangle(2, 1);
    Rectangle rectangle = new Rectangle(2, 1);
    Circle circle = new Circle(1);

    @Test
    void getArea() {
        Area item = triangle;
        assertEquals(1, item.getArea());
        item = rectangle;
        assertEquals(2, item.getArea());
        item = circle;
        assertEquals(3.14, item.getArea(), 0.005);
    }
}