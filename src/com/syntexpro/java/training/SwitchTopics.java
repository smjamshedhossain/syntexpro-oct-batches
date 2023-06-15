package com.syntexpro.java.training;

public class SwitchTopics {


    public static void main(String[] args) {

        String name = "Mind change";

        switch ("name") {
            case "used 7 days":
                System.out.println("100% cash back");
                break;

            case "used 15 days":
                System.out.println("50 % cashback ");
                break;

            case "used 30 days":
                System.out.println("20% cashback");
                break;

            case "damage":
                System.out.println("5% cashback");
                break;

            case "open box":
                System.out.println("10% cashback");
                break;

            default:
                System.out.println("full refund");

        }
        int month = 6;

        switch (month) {
            case 1:
                System.out.println("january");
                break;

            case 2:
                System.out.println("february");
                break;

            case 3:
                System.out.println("march");
                break;

            case 4:
                System.out.println("april");
                break;

            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;

            case 8:
                System.out.println("august");
                break;

            case 9:
                System.out.println("september");
                break;

            case 10:
                System.out.println("october");
                break;

            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");


            default:
                System.out.println("no month like this");
        }


    }
}
