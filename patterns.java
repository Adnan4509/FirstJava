import java.util.Scanner;
import java.lang.Math;

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

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if (i % 2 == 0)
                start = 0;
            // else start = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void pattern12(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = 0; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = n; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i <= n; i++) {

            // spaces
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            // char
            char ch = 'A';

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }

            }
            // spaces
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char lmt = (char) ('A' + n - 1);
            for (char ch = (char) (lmt - i); ch < lmt; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(lmt);
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            int space = 2 * n - 2 * i - 2;
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern19A2(int n) {
        int spaces = 0;
        int stars = n;
        for (int i = 1; i < 2 * n; i++) {
            // stars

            if (i > n)
                stars++;
            else
                stars--;
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            if (i < n)
                spaces += 2;
            else
                spaces -= 2;

            // stars
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Stars
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            // print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;

            // print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    protected static void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        int lmt = 2 * n - 1;
        for (int i = 0; i < lmt; i++) {
            for (int j = 0; j < lmt; j++) {
                int top = i;
                int left = j;
                int right = lmt - 1 - j;
                int btm = lmt - 1 - i;
                int half1 = Math.min(top, left);
                int half2 = Math.min(right, btm);
                int totalMin = Math.min(half2, half1);
                System.out.print(n - totalMin + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern19A2(n);
        }
        sc.close();

    }

}
