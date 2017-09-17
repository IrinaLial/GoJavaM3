import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type array size:");
        int[] arr;
        arr = new int[in.nextInt()];

        numsFilling(arr, in);
        findMaxrepeats(arr);
    }
    public static void numsFilling(int[] arr, Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Type " + (i + 1) + " index:");
            arr[i] = in.nextInt();
        }}

        public static void findMaxrepeats(int[]arr){

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            if (count >= max)
                max = count;
        }
        System.out.println("Result: " + max);}}

