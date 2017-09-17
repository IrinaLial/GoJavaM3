import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type array size:");
        int[] arr;
        arr = new int[in.nextInt()];

        numsFilling(arr, in);
        findMaxrepeats(arr);
        findMinrepeats(arr);
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
        System.out.println("Result of max repeats: " + max);}

     public static void findMinrepeats(int[]arr){
         int min = Integer.MAX_VALUE;
         for (int i = 0; i < arr.length-1; i++) {
             int count = 0;
             for (int j = 0; j < arr.length; j++) {
                 if (arr[i]==arr[j])
                     count++;
             }
             if (count <= min)
                 min = count;
         }
         System.out.println("Result of min repeats: " + min);
}}

