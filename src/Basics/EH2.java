package Basics;

public class EH2 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 11;
        a[1] = 20;
        a[2] = 30;
        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            try {
                System.out.println(a[10]);
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }
}