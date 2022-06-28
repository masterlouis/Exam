
package exam;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int val1 = scanner.nextInt();

        System.out.println("inserisci il secondo numero");
        int val2 = scanner.nextInt();

        System.out.println(Math.min(val1, val2));

        System.out.println("conc".concat("atenzaione"));

        Persona persona1 = new Persona("aldo", "lops", 14, "blu");

        System.out.println(persona1.nome);
    }
}