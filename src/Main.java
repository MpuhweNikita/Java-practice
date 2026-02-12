//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();
        Bikes b1 = new Bikes();
        Bikes b2 = new Bikes();
        Bikes b3 = new Bikes();
        Bikes b4 = new Bikes();
        Bikes b5 = new Bikes();
        car1.name = "Lamborghini";
        car2.name = "Ferrari";
        car3.name = "Bugatti";
        car4.name = "BMW";
        car5.name = "Porsche";
        b1.name = "Harley Davidson";
        b2.name = "Isuzu";
        b3.name = "Yamaha";
        b4.name = "Pagani";
        b5.name = "Suzuki";
        b1.cost = "$110,000";
        b2.cost = "$120,000";
        b3.cost = "$130,000";
        b4.cost = "$140,000";
        b5.cost = "$150,000";
        car1.cost = "$200,000";
        car2.cost = "$300,000";
        car3.cost = "$400,000";
        car4.cost = "$500,000";
        car5.cost = "$600,000";
        System.out.println("What do you want to buy?");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");
        int choice;
        System.out.println("Enter your choice");
        choice = s.nextInt();
        if (choice == 1) {
            System.out.println("We have five models");
            System.out.println("1." + b1.name);
            System.out.println("2." + b2.name);
            System.out.println("3." + b3.name);
            System.out.println("4." + b4.name);
            System.out.println("5." + b5.name);
            System.out.println("Enter your choice");
            int n;
            n = s.nextInt();
            if (n == 1) {
                System.out.println("The cost of " + b1.name + " is " + b1.cost);
            } else if (n == 2) {
                System.out.println("The cost of " + b2.name + " is " + b2.cost);
            } else if (n == 3) {
                System.out.println("The cost of " + b3.name + " is " + b3.cost);
            } else if (n == 4) {
                System.out.println("The cost of " + b4.name + " is " + b4.cost);
            } else if (n == 5) {
                System.out.println("The cost of " + b5.name + " is " + b5.cost);
            } else {
                System.out.println("Invalid choice");
            }
        } else if (choice == 2) {
            System.out.println("We sell five models");
            System.out.println("1." + car1.name);
            System.out.println("2." + car2.name);
            System.out.println("3." + car3.name);
            System.out.println("4." + car4.name);
            System.out.println("5." + car5.name);
            System.out.println("Enter your choice");
            int no;
            no = s.nextInt();
            if (no == 1) {
                System.out.println("The cost of " + car1.name + " is " + car1.cost);
            } else if (no == 2) {
                System.out.println("The cost of " + car2.name + " is " + car2.cost);
            } else if (no == 3) {
                System.out.println("The cost of " + car3.name + " is " + car3.cost);
            } else if (no == 4) {
                System.out.println("The cost of " + car4.name + " is " + car4.cost);
            } else if (no == 5) {
                System.out.println("The cost of " + car5.name + " is " + car5.cost);
            } else {
                System.out.println("Invalid choice");
            }

        }
    }
}