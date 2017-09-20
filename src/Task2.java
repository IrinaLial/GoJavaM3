import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Array size: ");
        int length = in.nextInt();
        in.nextLine();

        System.out.print("Your array is: ");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt ();
            in.nextLine();

        findMaxrepeats(arr);
        findMinrepeats(arr);
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
            System.out.println ( "Result of max repeats: " + max);}


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

