package g150;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            String a = sc.next();
//            System.out.print(a + " ");
            arr[i] = a;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}

