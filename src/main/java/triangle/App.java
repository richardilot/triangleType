package triangle;

public class App {

    public static void main(String[] args) {
        MagicTriangle magic = new MagicTriangle();
        magic.setTriangle(8, 88, 888);
        System.out.println(magic.sidesBased());
        System.out.println(magic.anglesBased());
    }

    public String getGreeting() {
        return "greeting go brr";
    }
}
