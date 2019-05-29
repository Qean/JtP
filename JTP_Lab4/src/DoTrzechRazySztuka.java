import java.util.Scanner;

public class DoTrzechRazySztuka {
    public static void wypisz() {
        float number;
        int error = 3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Podaj liczbę typu float: ");
                String test = scanner.nextLine();
                number = Float.parseFloat(test);
                System.out.println("x = " + number);
                break;
            } catch (Exception e) {
                error -= 1;
                if (error <= 0) {
                    System.out.println("Za dużo prób, program zakończy działanie");
                    break;
                }
                System.out.println("Nie podano danej typu float, pozostała " + error + " próba");
            }
        }
    }
}
