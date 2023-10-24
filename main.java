 import java.util.Scanner;
import java.util.Random;

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


       


            System.out.print("Indtast navn for spiller 1: ");
            String navn1 = scanner.nextLine();


            System.out.print("Indtast navn for spiller 2: ");
            String navn2 = scanner.nextLine();


            Terningspil terningspil = new Terningspil(navn1, navn2);
            terningspil.startSpil();
        }
    }
