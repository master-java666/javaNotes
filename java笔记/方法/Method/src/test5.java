public class test5 {
    public static void main(String[] args) {
        int[] arr = {5,7,8,10,96};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }
        return max;
    }
}
