package triangle;


public class MagicTriangle {
    private int a;
    private int b;
    private int c;

    public MagicTriangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void setTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String sidesBased() {
        if (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c && c == a)
                return "Equilateral";
            else if (a == b ^ b == c ^ c == a)
                return "Isosceles";
            else if (a != b && b != c && c != a)
                return "Scalene";
        } else return "Triangle not recognized!";
        return null;
    }

    public String anglesBased() {
        if ((a > 0 && a < 180) && (b > 0 && b < 180) && (c > 0 && c < 180)) {
            if (this.a < 90 && this.b < 90 && this.c < 90)
                return "Acute";
            else if (a > 90 ^ b > 90 ^ c > 90)
                return "Obtuse";
            else if (a == 90 ^ b == 90 ^ c == 90)
                return "Right";
        } else return "Triangle not recognized!";
        return null;
    }
}
