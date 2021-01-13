package template;

import java.util.Scanner;

public class RoadBike extends Bike {

    RoadBike() {
        this.suspension = "No suspension";
        this.type = "Road";
        selectWheels();
    }

    @Override
    public void selectWheels() {
        System.out.println("Choose wheels:\n" + "1 - 700x30\n" + "2 - 700x35");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            this.wheels = "700x30";
        } else if (choice == 2) {
            this.wheels = "700x35";
        }
    }
}
