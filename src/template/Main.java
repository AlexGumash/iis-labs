package template;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose bike:\n" + "1 - Road bike\n" + "2 - MTB");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Bike bike = null;

        if (choice == 1) {
            bike = new RoadBike();
        } else if (choice == 2) {
            bike = new Mtb();
        }
        if (bike != null) {
            System.out.println(bike.toString());
        }
    }
}
