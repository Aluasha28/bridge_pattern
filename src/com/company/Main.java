package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi. I'll help you to buy jewelry you would like. Enter the number of the brand that will make your order. \nPick the number: \n1. Tiffany \n2. Cartier");
        Scanner scan = new Scanner(System.in);
        int brand = scan.nextInt();

        if (brand == 1) {
            System.out.println("What exactly would you like to buy? \nChoose one option:\n1. Ring\n2. Necklace");
            int form = scan.nextInt();
            if (form == 1) {
                System.out.println("What material will your ring be made of? \nChoose one option:\n1. Gold\n2. Silver");
                int material = scan.nextInt();
                if (material == 1) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Ring(new Tiffany(), new Gold(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Ring(new Tiffany(), new Gold(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else if (material == 2) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Ring(new Tiffany(), new Silver(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Ring(new Tiffany(), new Silver(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                }
            } else if (form == 2) {
                System.out.println("What material will your necklace be made of? \nChoose one option:\n1. Gold\n2. Silver");
                int material = scan.nextInt();
                if (material == 1) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Necklace(new Tiffany(), new Gold(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Necklace(new Tiffany(), new Gold(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else if (material == 2) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Necklace(new Tiffany(), new Silver(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Necklace(new Tiffany(), new Silver(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else {
                    System.out.println("You entered the wrong number :(\nPlease try again");
                }
            } else {
                System.out.println("You entered the wrong number :(\nPlease try again");
            }
        } else if (brand == 2) {
            System.out.println("What exactly would you like to buy? \nChoose one option:\n1. Ring\n2. Necklace");
            int form = scan.nextInt();
            if (form == 1) {
                System.out.println("What material will your ring be made of? \nChoose one option:\n1. Gold\n2. Silver");
                int material = scan.nextInt();
                if (material == 1) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Ring(new Cartier(), new Gold(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Ring(new Cartier(), new Gold(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else if (material == 2) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Ring(new Cartier(), new Silver(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Ring(new Cartier(), new Silver(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                }
            } else if (form == 2) {
                System.out.println("What material will your necklace be made of? \nChoose one option:\n1. Gold\n2. Silver");
                int material = scan.nextInt();
                if (material == 1) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Necklace(new Cartier(), new Gold(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Necklace(new Cartier(), new Gold(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else if (material == 2) {
                    System.out.println("What would you like to add? \nChoose one option:\n1. Brilliants\n2. Sapphires");
                    int dop = scan.nextInt();
                    if (dop == 1) {
                        Jewelry order = new Necklace(new Cartier(), new Silver(), new Brilliant());
                        order.manufacture();
                    } else if (dop == 2) {
                        Jewelry order = new Necklace(new Cartier(), new Silver(), new Sapphire());
                        order.manufacture();
                    } else {
                        System.out.println("You entered the wrong number :(\nPlease try again");
                    }
                } else {
                    System.out.println("You entered the wrong number :(\nPlease try again");
                }
            } else {
                System.out.println("You entered the wrong number :(\nPlease try again");
            }
        } else {
            System.out.println("You entered the wrong number :(\nPlease try again");
        }
    }
}

