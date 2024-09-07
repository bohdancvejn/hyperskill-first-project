package calculator;

import java.util.Scanner;

public class Main {
    private double earnedBubblegum = 202.0;
    private double earnedToffee = 118.0;
    private double earnedIceCream = 2250.0;
    private double earnedMilkChocolate = 1680.0;
    private double earnedDoughnut = 1075.0;
    private double earnedPancake = 80.0;

    public static void main(String[] args) {
        // constructors
        Main calculator = new Main();
        Scanner scan = new Scanner(System.in);

        // scenario
        calculator.printIncome();
        System.out.printf("Income: $%.2f", calculator.sumIncome());

        // net calculation scenario
        System.out.println("Staff expenses: ");
        double expensesStuff = scan.nextDouble();
        System.out.println("Other expenses: ");
        double expensesOther = scan.nextDouble();

        double netIncome = calculator.sumIncome() - expensesStuff - expensesOther;
        System.out.printf("Net income: $%f", netIncome);

    }

    private double sumIncome() {
        return getEarnedBubblegum() + getEarnedToffee() + getEarnedIceCream()
                + getEarnedMilkChocolate() + getEarnedDoughnut() + getEarnedPancake();
    }

    public void printPrices() {
        System.out.println("""
                Prices:
                Bubblegum: $2
                Toffee: $0.2
                Ice cream: $5
                Milk chocolate: $4
                Doughnut: $2.5
                Pancake: $3.2
                """);
    }

    private void printIncome() {
        System.out.println("""
                Earned amount:
                Bubblegum: $202
                Toffee: $118
                Ice cream: $2250
                Milk chocolate: $1680
                Doughnut: $1075
                Pancake: $80
                
                """);
    }

    public double getEarnedBubblegum() {
        return earnedBubblegum;
    }

    public double getEarnedToffee() {
        return earnedToffee;
    }

    public double getEarnedIceCream() {
        return earnedIceCream;
    }

    public double getEarnedMilkChocolate() {
        return earnedMilkChocolate;
    }

    public double getEarnedDoughnut() {
        return earnedDoughnut;
    }

    public double getEarnedPancake() {
        return earnedPancake;
    }
}