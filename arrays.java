import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static int problem1Brute(int[] arr, int n) {
        // brute force method
        Arrays.sort(arr);
        int largest = arr[n - 1];
        return largest;
    }

    public static int problem1opt(int[] arr, int n) {

        // optimal method
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    public static int problem2Brute(int[] arr, int n) {
        Arrays.sort(arr);
        int Slargest = arr[n - 2];

        return Slargest;
    }

    public static int problem2Btr(int[] arr, int n) {

        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int Slargest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > Slargest && arr[i] != largest) {
                Slargest = arr[i];
            }
        }
        return Slargest;
    }

    public static int problem2opt(int[] arr, int n) {
        int largest = arr[0];
        int Slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                Slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > Slargest) {
                Slargest = arr[i];
            }
        }

        return Slargest;
    }

    public static int secondSmallest(int[] a, int n) {
        int Ssmallest = a[0];

        return Ssmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int Slargest = problem2opt(arr, n);
        int Ssmallest = secondSmallest(arr, n);
        System.out.println(Slargest);
        System.out.println(Ssmallest);

    }
}
