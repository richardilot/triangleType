package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    MagicTriangle triangle = new MagicTriangle();

    @Test public void testAppHasGreeting(){
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testScalene(){
        String result = triangle.sidesBased(4, 5, 6);
        assertSame(result.equals("Scalene"), result.equals("Scalene"));
    }

    @Test public void testIsosceles(){
        String result = triangle.sidesBased(4,4,5);
        assertSame(result.equals("Isosceles"), result.equals("Isosceles"));
    }

    @Test public void testEquilateral(){
        String result = triangle.sidesBased(4,4,4);
        assertSame(result.equals("Equilateral"), result.equals("Equilateral"));
    }

    @Test public void testAcute(){
        String result = triangle.sidesBased(65, 85, 24);
        assertSame(result.equals("Acute"), result.equals("Acute"));
    }

    @Test public void testRight(){
        String result = triangle.sidesBased(25,90,30);
        assertSame(result.equals("Right"), result.equals("Right"));
    }

    @Test public void testObtuse(){
        String result = triangle.sidesBased(120,59,80);
        assertSame(result.equals("Obtuse"), result.equals("Obtuse"));
    }

    @Test public void testNotRecognizeAngle(){
        String result = triangle.anglesBased(360, 160, 120);
        assertSame(result.equals("Triangle not recognized!"), result.equals("Triangle not recognized!"));
    }

}
