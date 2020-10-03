package trianglePackage;

public class magicTriangle {
    //triangle based on sides
    public String sidesBased(int a, int b, int c){
        if (a != b && a != c && b != c) //scalene: length of all sides are different
            return "Scalene";
        else if (a != b && a != c && b != c) //isosceles: length of two sides are equal
            return "Isosceles";
        else if(a == b ^ a == c ^ b == c ) //equilateral: length of all sides are equal
            return "Equilateral";
        else
            return "Triangle not recognized!";
    }
    //scalene: length of all sides are different
    public boolean scalene(int a, int b, int c) {
        if (a != b && a != c && b != c)
            return true;
        else
            return false;
    }

    //isosceles: length of two sides are equal
    public boolean isosceles(int a, int b, int c){
        if(a == b ^ a == c ^ b == c )
            return true;
        else
            return false;
    }

    //equilateral: length of all sides are equal
    public boolean equilateral(int a, int b, int c){
        if(a == b && a == c && b == c )
            return true;
        else
            return false;
    }

    //triangles based on angles
    public String anglesBased(int a, int b, int c){
        if(a < 90 && b < 90 && c < 90) //acute: each angle is less than 90 deg
            return "Acute";
        else if(a == 90 ^ b == 90 ^ c == 90) //right: one angle is 90 deg
            return "Right";
        else if(a > 90 ^ b > 90 ^ c > 90) //obtuse: one angle is more than 90 deg
            return "Obtuse";
        else
            return "Triangle not recognized!";
    }
    //acute: each angle is less than 90 deg
    public boolean acute(int a, int b, int c){
        if(a < 90 && b < 90 && c < 90)
            return true;
        else
            return false;
    }

    //right: one angle is 90 deg
    public boolean right(int a, int b, int c){
        if(a == 90 ^ b == 90 ^ c == 90)
            return true;
        else
            return false;
    }

    //obtuse: one angle is more than 90 deg
    public boolean obtuse(int a, int b, int c){
        if(a > 90 ^ b > 90 ^ c > 90)
            return true;
        else
            return false;
    }
}
