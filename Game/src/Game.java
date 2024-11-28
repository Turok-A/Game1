import java.util.Random;
import java.util.Scanner;
public class Game {
    private Player player;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
        }

        public void start() {
            System.out.println("Введите имя Вашего персонажа");
            String name = scanner.nextLine();
            player = new Player(name);

            while (true) {
                System.out.println("\nКуда Вы хотите пойти?");
                System.out.println("1. К торговцу");
                System.out.println("2. В тёмный лес");
                System.out.println("3. На выход");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        goToMerchant();
                        break;
                    case 2:
                        goToForest();
                        break;
                    case 3:
                        System.out.println("Выход из игры...");
                        return;
                    default:
                        System.out.println("Некорректный выбор");
                }
            }
        }
    private void goToMerchant() {
        System.out.println("Торговец ещё не вышел на работу.");
}
private void goToForest() {
    System.out.println("Вы идете в темный лес...");
    Random rand = new Random();
    Character monster = (rand.nextBoolean()) ? new Goblin("Гоблин") : new Skeleton("Скелет");
    Battle battle = new Battle(player, monster);
    battle.start();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}