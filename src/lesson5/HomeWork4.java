package lesson5;

public class HomeWork4 {

    public static void mineFrom4Num(int a, int b, int c, int d) {

        if (a <= b && a <= c && a <= d) {
            System.out.println(a);
        } else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
        } else if (c <= b && c <= a && c <= d) {
            System.out.println(c);
        } else if (d <= b && d <= c && d <= a) {
            System.out.println(d);
        }
    }

    public static void minFrom4Num(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);

    }
}
