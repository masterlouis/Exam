
package exam;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int val1 = scanner.nextInt();

        System.out.println("inserisci il secondo numero");
        int val2 = scanner.nextInt();

        if(val1 < val2){
            System.out.println(val1);
        }
        else{
            System.out.println(val2);
        }
    }
}
