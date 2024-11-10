public class test3 {
    public static void main(String[] args) {
        double area1 = getArea(5.1,6.6);
        double area2 = getArea(4.1,7.6);
        if (area1 > area2){
            System.out.println("area1的面积比area2大");
        }else {
            System.out.println("area2的面积比area1大");
        }
    }

    public static double getArea(double leng,double width){
        double Area = leng * width;
        return Area;
    }
}
