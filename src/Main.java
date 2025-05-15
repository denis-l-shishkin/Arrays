public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int [] {7, 4, 8, 5, 9};
        int totalSumMonth = 0;
        for (int sum : arr1) {
            totalSumMonth += sum;
        }
        System.out.println("Сумма трат за месяц составила " + totalSumMonth + " рублей");
        System.out.println("--End of task 1--\n");
        int [] arr2 = {7, 4, 8, 5, 9};
        int maxSum = arr2[0];
        int minSum = arr2[0];
        for (int sum : arr2) {
            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < minSum) {
                minSum = sum;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей.");
        System.out.println("--End of task 2--\n");
        int [] arr3 = new int [] {7, 4, 8, 5, 9};
        float meanSum = 0f;
        for (int sum : arr3) {
            meanSum += sum;
        }
        System.out.println(meanSum / arr3.length);
        System.out.println("--End of task 3--\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n--End of task 4--\n");
    }
}