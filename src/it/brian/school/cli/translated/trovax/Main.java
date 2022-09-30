package it.brian.school.cli.translated.trovax;

public class Main {

    private static final int targetSum = 15;
    private static final int[] numbers = new int[]{1, 3, 5, 10, 11};

    public static void main(String[] args) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == targetSum) {
                System.out.printf("Found: %d (at index %d) + %d (at index %d) = %d%n", numbers[i], i, numbers[j], j, sum);
                break;
            } else if (sum < targetSum) {
                i++;
            } else {
                j--;
            }
        }
    }
}
