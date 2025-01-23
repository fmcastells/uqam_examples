package ca.uqam.example.session3;

public class Triangle {

    public TriangleType findTriangleType(int a, int b, int c) {
        validateInputs(a, b, c);
        if (a == b || a == c || b == c) {
            if (a == b && a == c) {
                return TriangleType.EQUILATERAL;
            } else {
                return TriangleType.ISOSCELES;
            }
        } else {
            return TriangleType.SCALENE;
        }
    }

    private void validateInputs(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new InvalidInputException();
        }
    }
}
