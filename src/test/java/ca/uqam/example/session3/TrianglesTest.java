package ca.uqam.example.session3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ca.uqam.example.session3.TriangleType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianglesTest {

    private Triangle triangle;

    @BeforeEach
    void setup() {
        triangle = new Triangle();
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
}
