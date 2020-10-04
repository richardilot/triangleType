package triangle;

public class App {

    public static void main(String[] args) {
        MagicTriangle magic = new MagicTriangle();
        System.out.println(magic.sidesBased(4, 5, 6));
        System.out.println(magic.anglesBased(58, 58, 60));
        System.out.println(magic.anglesBased(360, 1090, 120));
    }

    public String getGreeting() {
        return "greeting go brr";
    }
}
