 import java.util.Scanner;
import java.util.Random;
class Terningspil {
        private Spiller spiller1;
        private Spiller spiller2;
        private Random random;


        public Terningspil(String navn1, String navn2) {
            spiller1 = new Spiller(navn1);
            spiller2 = new Spiller(navn2);
            random = new Random();
        }


        public void startSpil() {
            Scanner scanner = new Scanner(System.in);


           
            while (spiller1.getKonto().getSaldo() < 3000 && spiller2.getKonto().getSaldo() < 3000) {
                System.out.println(spiller1.getNavn() + ", tryk på Enter for at kaste terningerne.");
                scanner.nextLine();


                int kast1 = random.nextInt(6) + 1;
                int kast2 = random.nextInt(6) + 1;
                int sum = kast1 + kast2;


                System.out.println(spiller1.getNavn() + " slog " + kast1 + " og " + kast2 + " (sum: " + sum + ")");


                int feltEffekt = 0;
                String feltBesked = "";


                switch (sum) {
                    case 2:
                        feltEffekt = 250;
                        feltBesked = "Tower: +250";
                        break;
                    case 3:
                        feltEffekt = -100;
                        feltBesked = "Crater: -100";
                        break;
                    case 4:
                        feltEffekt = 100;
                        feltBesked = "Palace gates: +100";
                        break;
                    case 5:
                        feltEffekt = -20;
                        feltBesked = "Cold Desert: -20";
                        break;
                    case 6:
                        feltEffekt = 180;
                        feltBesked = "Walled city: +180";
                        break;
                    case 7:
                        feltEffekt = 0;
                        feltBesked = "Monastery: 0";
                        break;
                    case 8:
                        feltEffekt = -70;
                        feltBesked = "Black cave: -70";
                        break;
                    case 9:
                        feltEffekt = 60;
                        feltBesked = "Huts in the mountain: +60";
                        break;
                    case 10:
                        feltEffekt = -80;
                        feltBesked = "The Werewall: -80 (Ekstra tur)";
                        break;
                    case 11:
                        feltEffekt = -50;
                        feltBesked = "The pit: -50";
                        break;
                    case 12:
                        feltEffekt = 650;
                        feltBesked = "Goldmine: +650";
                        break;
                }


                spiller1.getKonto().indsætPenge(feltEffekt);
                System.out.println(feltBesked);
                System.out.println("Saldo for " + spiller1.getNavn() + ": " + spiller1.getKonto().getSaldo());
                System.out.println();


         


                System.out.println(spiller2.getNavn() + ", tryk på Enter for at kaste terningerne.");
                scanner.nextLine();


                int kast1_2 = random.nextInt(6) + 1;
                int kast2_2 = random.nextInt(6) + 1;
                int sum_2 = kast1_2 + kast2_2;


                System.out.println(spiller2.getNavn() + " kastede " + kast1_2 + " og " + kast2_2 + " (sum: " + sum_2 + ")");


                int feltEffekt_2 = 0;
                String feltBesked_2 = "";


                        switch (sum_2) {
                    case 2:
                        feltEffekt_2 = 250;
                        feltBesked_2 = "Du har fundet et guld i et tårn og sælger det for 250";
                        break;
                    case 3:
                        feltEffekt_2 = -100;
                        feltBesked_2 = "Du falder ned i et krater og mister 100";
                        break;
                    case 4:
                        feltEffekt_2 = 100;
                        feltBesked_2 = "Du indtræder en palads port og får 100";
                        break;
                    case 5:
                        feltEffekt_2 = -20;
                        feltBesked_2 = "Du ankommer til en kold ørken og mister 20";
                        break;
                    case 6:
                        feltEffekt_2 = 180;
                        feltBesked_2 = "Du befinder dig i en befæstet by, her finder du 180";
                        break;
                    case 7:
                        feltEffekt_2 = 0;
                        feltBesked_2 = "Du indtræder et tempel, her er tomt 0";
                        break;
                    case 8:
                        feltEffekt_2 = -70;
                        feltBesked_2 = "Black cave: -70";
                        break;
                    case 9:
                        feltEffekt_2 = 60;
                        feltBesked_2 = "Huts in the mountain: +60";
                        break;
                    case 10:
                        feltEffekt_2 = -80;
                        feltBesked_2 = "The Werewall: -80 (Ekstra tur)";
                        break;
                    case 11:
                        feltEffekt_2 = -50;
                        feltBesked_2 = "The pit: -50";
                        break;
                    case 12:
                        feltEffekt_2 = 650;
                        feltBesked_2 = "Goldmine: +650";
                        break;
                }


                spiller2.getKonto().indsætPenge(feltEffekt_2);
                System.out.println(feltBesked_2);
                System.out.println("Saldo for " + spiller2.getNavn() + ": " + spiller2.getKonto().getSaldo());
                System.out.println();
            }




            if (spiller1.getKonto().getSaldo() >= 3000) {
                System.out.println(spiller1.getNavn() + " har vundet!");
            } else {
                System.out.println(spiller2.getNavn() + " har vundet!");
            }
        }
    }
