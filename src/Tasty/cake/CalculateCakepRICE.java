
    package Tasty.cake;

import java.util.Scanner;

    public class CalculateCakepRICE {
        public static orderCake[] oc = new orderCake[10];
        public static readymadeCake[] rmc = new readymadeCake[10];
        public static Scanner input = new Scanner(System.in);
        public static String cakeName;
        public static double cakeRate = 0;
        public static double cakeWeight = 0.0;
        public static int cakeQty = 0;

        public static void main(String[] args) {
            int cakeCount = 10;
            ordercakeSetter(cakeCount);
            readymadeCakeSetter(cakeCount);
            getAllPriceAlltypeCake(cakeCount);
        }

        private static void getAllPriceAlltypeCake(int cakeCount) {
            double sumPrice=0.0;
            double sumPriceforReadymadeCake=0.0;
            int ReadymadeCakeQty=0;

            String cakeNameWIthMaxPrice="";
            double maxPrice=0.0;

            for (int count = 0; count < cakeCount; count++) {
                sumPrice=sumPrice+oc[count].calPrice()+rmc[count].calPrice();
                sumPriceforReadymadeCake=sumPriceforReadymadeCake+rmc[count].calPrice();
                ReadymadeCakeQty=ReadymadeCakeQty+rmc[count].quantity;
                if(maxPrice<rmc[count].calPrice())
                {
                    maxPrice=rmc[count].calPrice();
                    cakeNameWIthMaxPrice=rmc[count].name;
                }
                if(maxPrice<oc[count].calPrice())
                {
                    maxPrice=oc[count].calPrice();
                    cakeNameWIthMaxPrice=oc[count].name;
                }
            }
            System.out.println("Total price for all type cake: "+sumPrice);
            System.out.println("Total price for ready cake: "+sumPriceforReadymadeCake);
            System.out.println("Total price for Qty for ready cake: "+ReadymadeCakeQty);
            System.out.println("Max price cake name: "+cakeNameWIthMaxPrice);
            System.out.println("Max price: "+maxPrice);
        }

        public static void ordercakeSetter(int cakeCount) {

            for (int i = 0; i < cakeCount; i++) {
                System.out.print("Enter Order Cake Name: ");
                cakeName = input.next();
                System.out.print("Enter Order Cake Rate: ");
                cakeRate = input.nextDouble();
                System.out.print("Enter Order Cake Weight: ");
                cakeWeight = input.nextDouble();
                oc[i] = new orderCake(cakeName, cakeRate, cakeWeight);
            }
        }

        public static void readymadeCakeSetter(int cakeCount) {

            //int i=0;
            for (int i = 0; i < cakeCount; i++) {
                System.out.print("Enter Ready Cake Name: ");
                cakeName = input.next();
                System.out.print("Enter Ready Cake Rate: ");
                cakeRate = input.nextDouble();
                System.out.print("Enter Ready Cake Quantity: ");
                cakeQty = input.nextInt();
                rmc[i] = new readymadeCake(cakeName, cakeRate, cakeQty);
            }
        }
    }

