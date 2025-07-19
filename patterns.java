import java.util.Scanner;

public class patterns {

    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * n - (2 * i + 1)); k++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern9(int n) {
        for (int i = 0; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = (2 * n - i);
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i=1; i<=n; i++){
            int start = 1;
            if(i%2 == 0) start = 0;
            // else start = 1;
            for(int j=0; j<i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int space = 2*(n-1);
        for (int i=1; i<=n; i++){
            // numbers
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
            // spaces
                for(int j=1; j<space; j++){
                    System.out.print(" ");
                }
            // numbers
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                System.out.println();
                space -= 2;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern11(n);
        }
        sc.close();

    }

}
