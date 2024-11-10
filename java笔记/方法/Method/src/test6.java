public class test6 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("前" + number);
        change (number);
        System.out.println("后" + number);
    }
    public static int change(int number){
        number =200;
    }
}
