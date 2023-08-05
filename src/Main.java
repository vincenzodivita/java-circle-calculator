import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Benvenuto! Adesso ti aiuterò a calcolare raggio, circonferenza e area dell tuo cerchio!");

        // Ask for radius
        System.out.println("Dimmi un po', quanti cm è lungo il raggio del tuo cerchio?");
        double r = scanner.nextDouble();
        scanner.nextLine();

        // Calculate diameter
        double d = 2 * r;

        // Calculate circumference
        double C = d * Math.PI;

        // Calculate area
        double A = r * r * Math.PI;

        // Report printing
        System.out.println("Bene, ecco a te i risultati:");
        System.out.println("Diametro: " + d + " cm");
        System.out.println("Circonferenza: " + C + " cm");
        System.out.println("Area: " + A + " cm\u00B2");

        // Ending message
        System.out.println("Spero di esserti stato utile, alla prossima!");
    }
}
