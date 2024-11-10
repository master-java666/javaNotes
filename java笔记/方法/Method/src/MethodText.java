public class MethodText {
    public static void main(String[] args) {
        System.out.println("a");
        method();
    }
    public static void method(){
        method2();
        System.out.println("d");
    }
    public static void method2(){
        System.out.println("e");
        System.out.println("d");
        System.out.println("f");
    }
}
