package q1071;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            if (m % nArr[i] == 0) {
                c += nArr[i];
            }
            if (nArr[i] % m == 0) {
                d += nArr[i];
            }

        }

        System.out.println(c);
        System.out.println(d);
    }
}