import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int smallest = a[0];
        int Ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                Ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < Ssmallest) {
                Ssmallest = a[i];
            }
        }
        return Ssmallest;
    }

    public static boolean checkSort(int[] a, int n) {

        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static int duplicateBrute(int[] a, int n) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(a[i]);
        }

        int uniqueElements = s.size();
        return uniqueElements;
    }

    public static int duplicateOpt(int[] a, int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (a[i] != a[j]) {
                a[i + 1] = a[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void leftRotateBy1Opt(int[] a, int n) {
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void leftRotateByDBrute(int[] a, int n, int rotation) {
        int d = rotation % n;
        int[] temp = new int[d];
        // assigning the d elements to a temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        // rotating the array
        for (int i = d; i < n; i++) {
            a[i - d] = a[i];
        }
        // adding the temporary array elements back to main array
        for (int i = n - d; i < n; i++) {
            a[i] = temp[i - (n - d)];
        }
        // printing array
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void leftRotateByDOpt(int[] a, int n, int rotation) {
        int d = rotation % n;
        Collections.reverse(Arrays.asList(a, a[d]));
        Collections.reverse(Arrays.asList(a[d], a[n - 1]));
        Collections.reverse(Arrays.asList(a));
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void moveZeroesEndBrute(int[] a, int n) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[j] = a[i];
                j++;
            }
        }
        // adding the non negative elements at front
        for (int i = 0; i < temp.length; i++) { // we can also use n insted of temp.length
            a[i] = temp[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] moveZeroesEndOpt(int[] a, int n) {
        // two pointer approach
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        // for non zero array the result will be
        if (j == -1) {
            return a;
        }
        for (int i = j+1; i < n; i++) {
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        moveZeroesEndOpt(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
