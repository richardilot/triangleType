package trianglePackage;

public class App {

    public String getGreeting(){
        return "greeting go brr";
    }
    public static void main(String[] args){
        magicTriangle magic = new magicTriangle();
        System.out.println(magic.sidesBased(4,5,6));
        System.out.println(magic.anglesBased(58,58,60));
        System.out.println(magic.anglesBased(360, 1090, 120));
    }
}
