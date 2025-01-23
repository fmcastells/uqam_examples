package ca.uqam.example.session3;

import org.junit.jupiter.api.*;

import static ca.uqam.example.session3.TriangleType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Nested
class TrianglesTest {

    private Triangle triangle;

    @BeforeEach
    void setup() {
        triangle = new Triangle();
    }

    @AfterAll
    public static void tearDown() {
        message();
    }
    @Test
    void invalidInputTest() {
        assertThrows(InvalidInputException.class, () -> triangle.findTriangleType(-1, 1, 1));
    }

    @Test
    void testEquilateral() {
        TriangleType triangleType = triangle.findTriangleType(1, 1, 1);

        assertThat(triangleType).isEqualTo(EQUILATERAL);
    }

    @Test
    void testIsosceles() {
        TriangleType triangleType = triangle.findTriangleType(1, 1, 2);

        assertThat(triangleType).isEqualTo(ISOSCELES);
    }

    @Test
    void testScalene() {
        TriangleType triangleType = triangle.findTriangleType(1, 2, 3);

        assertThat(triangleType).isEqualTo(SCALENE);
    }

    private static void message() {
        System.out.println("print message at the end of execution");
    }
}
