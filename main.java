import laptop.*;
import user.LaptopUser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih merk laptop (lenovo/toshiba/macbook): ");
        String merk = input.nextLine().toLowerCase();

        Laptop laptop;

        switch (merk) {
            case "lenovo":
                laptop = new Lenovo();
                break;
            case "toshiba":
                laptop = new Toshiba();
                break;
            case "macbook":
                laptop = new MacBook();
                break;
            default:
                System.out.println("Merk tidak dikenal.");
                return;
        }

        LaptopUser user = new LaptopUser(laptop);

        while (true) {
            System.out.print("Masukkan perintah (ON/OFF/UP/DOWN/EXIT): ");
            String command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "EXIT":
                    System.out.println("Keluar program...");
                    return;
                default:
                    System.out.println("Perintah tidak dikenal.");
            }
        }
    }
}
