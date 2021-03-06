import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array size: ");
        int length = in.nextInt();
        in.nextLine();

        System.out.print("Your array is: ");
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt ();
        }
            in.nextLine();

        //или еще такой вариант ввода размера массива
        //int size = in.nextInt();
        //int[] nums = new int[size];


        findMinvalue ( nums );
        findMaxvalue ( nums );
        findRepetitions ( nums, 5 );
        sortingNums ( nums );}


    public static void findMinvalue(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min ( min, nums[i] );
        }

        System.out.println ( "Minimum value of Nums: " + min );
    }

    public static void findMaxvalue(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max ( max, nums[i] );
        }

        System.out.println ( "Max value of Nums: " + max );

    }

    public static void findRepetitions(int[] nums, int n) {
        int r = 0;
        for (int i : nums) {
            if (i == n) {
                r++;
            }
        }
        System.out.println ( "Repetitions of " + n + "  = " + r );
    }


    public static void sortingNums(int[] nums) {
        System.out.println ( "Sorted array: " );
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < (nums.length - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println ( "nums[" + i + "] = " + nums[i] );
    }
}
