public class MethodDemo2 {
    public static void main(String[] args) {
        fn(55,55);
    }
    public static void fn(byte b1 ,byte b2){
        System.out.println(b1 == b2);
    }
    public static void fn(int i1 ,int  i2){
        System.out.println(i1 == i2);
    }
    public static void fn(short s1 ,short s2){
        System.out.println(s1 == s2);
    }
    public static void fn(long n1 ,long n2){
        System.out.println(n1 == n2);
    }
}
