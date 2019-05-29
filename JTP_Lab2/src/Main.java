public class Main {
    //1 - List, 2 - Set, 3 - HashMap, 4 - Queue
    /*
    1 - Lista bedzie zawierala wszystkich klientow firmy. Co miesiac bedzie mozna
    losowac index listy, aby wybrac klienta, ktory dostanie upominek
    2 - Set zapewnia, ze lista bedzie posiadac jedynie unikatowe wartosci
    3 - Jako wartosci do HashMapy proponuje imiona, ktore chcemy uzyc a wartosci to
    liczba pracownikow z danym imieniem
    4 - Queue zapewnia organizacje kolejnosci dla rozdawania biletow
     */
    public static void main(String[] args) {
        Names names = new Names();
        FrequentNames frequentNames = new FrequentNames();
        String testString, name;

        for (Integer i = 0; i < 10; i++) {
            names.addName(i.toString());
        }
        for (int i = 0; i < 10; i++) {
           name = frequentNames.insert(names.choose());
           System.out.println("Dodane imie to: " + name);
        }

        while (true){
            testString = frequentNames.choose();
            if (testString.equals("End"))
                break;
            System.out.println("Wybrane imie to: " + testString);
        }


    }
}
