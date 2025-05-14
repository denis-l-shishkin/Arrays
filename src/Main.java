import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 3};
        float [] arr2 = {1.57f, 7.654f, 9.986f};
        long [] arr3 = {1000L, 2000L, 3000L};
        System.out.println("--End of task 1--\n");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println("\n--End of task 2--\n");
        for (int i = arr1.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        for (int i = arr2.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = arr3.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println("\n--End of task 3--\n");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1 [i] % 2 != 0) {
                arr1 [i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("--End of task 4--\n");
    }
}