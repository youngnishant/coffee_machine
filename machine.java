package machine;

import java.util.Scanner;

public class Machine {

    Scanner scan;
    private int water;
    private int milk;
    private int beans;
    private int dispCups;
    private int money;

    public Machine() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.dispCups = 9;
        this.money = 550;
        this.scan = new Scanner(System.in);
    }

    public void buy(String choice) {
        switch (choice) {
            case "1":
                if (water >= 250 && beans >= 16 && dispCups > 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println("");
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    dispCups -= 1;
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < 16) {
                    System.out.println("Sorry, not enough beans!");
                } else if (dispCups == 0) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2":
                if (water >= 350 && milk >= 75 && beans >= 20 && dispCups > 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println("");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    dispCups -= 1;
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < 20) {
                    System.out.println("Sorry, not enough beans!");
                } else if (dispCups == 0) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
            case "3":
                if (water >= 200 && milk >= 100 && beans >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println("");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    dispCups -= 1;
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < 12) {
                    System.out.println("Sorry, not enough beans!");
                } else if (dispCups == 0) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += scan.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scan.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scan.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        dispCups += scan.nextInt();
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void display() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(dispCups + " of disposable cups");
        System.out.println("$" + money + " of money" + "\n");

    }
 }
