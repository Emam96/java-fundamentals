/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args) {

        roll(5);

        int[] sampleOne = { 1, 2, 1, 3, 5, 6, 8, 6, 4 };
        int[] sampleTwo = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] sampleThree = { 1, 2, 3 };

        System.out.println("///////////////////////////////////////////");

        System.out.println(containsDuplicates(sampleOne));
        System.out.println(containsDuplicates(sampleTwo));

        System.out.println("///////////////////////////////////////////");

        System.out.println("the avg is =" + calculatingAverages(sampleThree));

        System.out.println("///////////////////////////////////////////");

        int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
                { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };

        calculatingAveragesOfMultipleArrays(weeklyMonthTemperatures);

    }

    public static void roll(int n) {

        int newArr[] = new int[n]; // we declare an array with the length of n.

        for (int i = 0; i < n; i++) {

            newArr[i] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1); // this for loop generates a random number
                                                                           // between 1 and 6 to simulate the dice roll.
        }

         System.out.println(Arrays.toString(newArr)); // we import the Arrays package to stringify the array print out.

    }

    public static boolean containsDuplicates(int a[]) {

        Set<Integer> arr = new HashSet<Integer>(); // we imported a package to fix the primitive.
        for (int i : a) {
            if (arr.contains(i))
                return true; // a for loop that will iterate the array looking for any identical elements
                             // inside.
            arr.add(i);
        }
        return false;

    }

    public static double calculatingAverages(int a[]) {

        return Arrays.stream(a).average().orElse(Double.NaN);

    }

    public static void calculatingAveragesOfMultipleArrays(int[][] a) {
        int sum = 0;

        double[] arr = new double[4];

        for (int i = 0; i < a.length; i++) {

            for (int k = 0; k < a[i].length; k++)
                sum = sum + a[i][k];
            // calculate average value
            double average = sum / a[i].length;
            arr[i] = average;
            System.out.println("Average value of the array elements is : " + average);

        }

        System.out.println(Arrays.toString(arr));

        double min = arr[0];
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Compare elements of array with min
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);

    }

    public BooleanSupplier someLibraryMethod() {
        return null;
    }

}
