package q608;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.contains("c")){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
        if(a.contains("ab")){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
