package template;

import java.util.Scanner;

public class Mtb extends Bike{
    Mtb() {
        selectSuspension();
        this.type = "MTB";
        selectWheels();
    }

    @Override
    public void selectWheels() {
        System.out.println("Choose wheels:\n" + "1 - 29x2.25\n" + "2 - 27.5x2.3");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            this.wheels = "29x2.25";
        } else if (choice == 2) {
            this.wheels = "27.5x2.3";
        }
    }

    private void selectSuspension() {
        System.out.println("Choose suspension travel:\n" + "1 - 100mm\n" + "2 - 120mm");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            this.suspension = "100mm";
        } else if (choice == 2) {
            this.suspension = "120mm";
        }
    }
}
