package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    MagicTriangle triangle = new MagicTriangle();

    @Test public void testAppHasGreeting(){
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testScalene() {
        triangle.setTriangle(4, 5, 6);
        String result = triangle.sidesBased();
        //assertEquals or assertSame?
        assertEquals("Scalene", result);
    }

    @Test
    public void testIsosceles() {
        triangle.setTriangle(8, 8, 10);
        String result = triangle.sidesBased();
        assertEquals("Isosceles", result);
    }

    @Test
    public void testEquilateral() {
        triangle.setTriangle(8, 8, 8);
        String result = triangle.sidesBased();
        assertEquals("Equilateral", result);
    }

    @Test
    public void testAcute() {
        triangle.setTriangle(35, 45, 60);
        String result = triangle.anglesBased();
        assertEquals("Acute", result);

    }

    @Test
    public void testRight() {
        triangle.setTriangle(90, 80, 35);
        String result = triangle.anglesBased();
        assertEquals("Right", result);
    }

    @Test
    public void testObtuse() {
        triangle.setTriangle(120, 90, 80);
        String result = triangle.anglesBased();
        assertEquals("Obtuse", result);
    }

    @Test
    public void testNotRecognizeAngle() {
        triangle.setTriangle(-1, 1024, 34 * 34);
        String result = triangle.anglesBased();
        assertEquals("Triangle not recognized!", result);
    }

}
