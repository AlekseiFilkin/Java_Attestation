import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class toysMenu {

    public static void anyToys() {
        List <toys> toyList = Arrays.asList(
            new toys(1, "Mouse", 20),
            new toys(2, "Car", 25),
            new toys(3, "Ball", 30),
            new toys(4, "Tamagochi", 15),
            new toys(5, "Kinder", 10)
        );
        System.out.println(toyList);

        toyShop ts = new toyShop(toyList);

        ArrayList<Integer> givePrize = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("Что делаем?");
                System.out.println("1. Розыгрыш");
                System.out.println("2. Забрать игрушку");
                System.out.println("3. Выход");
                String button = in.next(); 
                System.out.print("\033[H\033[J");
                switch (button) {
                    case "1":
                        givePrize.add(ts.dropToys(toyList));
                        System.out.println("Игрушки: " + givePrize);
                        break;
                    case "2":
                        try {
                            ts.getToys(givePrize, toyList);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Игрушки закончились...");
                        }                        
                        break;
                    case "3":
                        System.exit(0);                        
                    default:
                        System.out.println("Попробуйте еще раз...");
                        break;
                }
            }
        }
    }
}