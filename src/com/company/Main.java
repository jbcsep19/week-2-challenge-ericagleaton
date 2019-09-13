package com.company;
/*
Write a program that will allow a robot to assemble 25 burritos. Use a random generator for each burrito option and build a list of 25 burrito customizations:

Rice: white, brown, none, all
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
Beans: pinto, black, none
Salsa: mild, medium, hot, none, all
Veggies: lettuce, fajita veggies, none, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Randomly generate a number of ingredients per burrito. Each burrito should have a minimum of 5 ingredients and a maximum of 9 ingredients. Save the finished burritos and display the contents.

Calculate and display a price for each burrito. Pricing will be $3.00 plus 0.50 for each additional ingredient.

If you're finished with above before 3pm, modify your program to use methods. For example, you can call a method from main whose sole purpose is to calculate the price of the burrito.


 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double orderTotal = 0.0;
        //String orderStrTotal = Double.toString(orderTotal);
        //Rice: white, brown, none, all
        ArrayList<String> rice = new ArrayList<>();
        Collections.addAll(rice, "Rice: white", "Rice: brown", "Rice: all", "no");
        double countRice = 0.0;
        //All
        // Rice = 2
        //Meat = 6
        //Beans 2
        //Salsa = 3
        //Veggie 3

        //Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
        ArrayList<String> meat = new ArrayList<>();
        Collections.addAll(meat, "Meat: chicken", "Meat: steak", "Meat: carnidas", "Meat: chorizo", "Meat: sofritas", "Meat: veggies", "Meat: all"," Meat: no");
        double countMeat = 0.0;

        //Beans: pinto, black, none
        ArrayList<String> beans = new ArrayList<>();
        Collections.addAll(beans, "Beans: pinto", "Beans: black", "Beans: no");
        double countBeans = 0.0;
        //Salsa: mild, medium, hot, none, all
        ArrayList<String> salsa = new ArrayList<>();
        Collections.addAll(salsa, "Salsa: mild", "Salsa: medium", "Salsa: hot", "Salsa: all","Salsa: no");
        double countSalsa = 0.0;
        //Veggies: lettuce, fajita veggies, none, all
        ArrayList<String> veggies = new ArrayList<>();
        Collections.addAll(veggies, "Veggies: lettuce", "Veggies: fajita veggies", "Veggies: all","Veggies: no");
        double countVeggies = 0.0;
        //Cheese: yes/no
        ArrayList<String> cheese = new ArrayList<>();
        Collections.addAll(cheese, "Cheese: yes", "Cheese: no");
        double countCheese = 0.0;
        //Guac: yes/no
        ArrayList<String> xguac = new ArrayList<>();
        Collections.addAll(xguac, "Guac: yes", "Guac: no");
        double countXguac = 0.0;
        //Queso: yes/no
        ArrayList<String> xqueso = new ArrayList<>();
        Collections.addAll(xqueso, "Queso: yes", "Queso: no");
        double countXqueso = 0.0;
        //Sour cream: yes/no
        ArrayList<String> xsourcream = new ArrayList<>();
        Collections.addAll(xsourcream, "Sour Cream: yes", "Sour Cream: no");
        double countXSourcream = 0.0;

        //All
        // Rice = 2
        //Meat = 6
        //Beans 2
        //Salsa = 3
        //Veggie 3


        for(int b = 1; b <=25; b ++) {
            ArrayList<String> order = new ArrayList<>();
            double count = 0.0;
            double countsum = 0.0;
            double price = .50;
            Random randomRiceItem = new Random();


            int riceItem = randomRiceItem.nextInt(rice.size());
            //System.out.println(rice.get(riceItem));
            if(rice.get(riceItem)== "Rice: all")
                countRice = 2.0;
            else if ( rice.get(riceItem)=="Rice: no")
                countRice = 0.0;
            else {countRice = 1.0;
                System.out.println(countRice);
            }

            order.add(rice.get(riceItem));


            Random randomMeatItem = new Random();
            int meatItem = randomMeatItem.nextInt(meat.size());
            //System.out.println(meat.get(meatItem));
            if(meat.get(meatItem)== "Meat: all")
                countMeat = 6.0;
            else if ( meat.get(meatItem)=="Meat: no")
                countMeat = 0.0;
            else {countMeat = 1.0;

            }
            order.add(meat.get(meatItem));

            Random randomBeansItem = new Random();
            int beansItem = randomBeansItem.nextInt(beans.size());
            //System.out.println(beans.get(beansItem));
            if(beans.get(beansItem)== "Beans: all")
                countBeans = 2.0;
            else if ( beans.get(beansItem)=="Beans: no")
                countBeans = 0.0;
            else {countBeans = 1.0;

            }
            order.add(beans.get(beansItem));

            Random randomSalsaItem = new Random();
            int salsaItem = randomSalsaItem.nextInt(salsa.size());
            //  System.out.println(salsa.get(salsaItem));
            if(salsa.get(salsaItem)== "Salsa: all")
                countSalsa = 3.0;
            else if ( salsa.get(salsaItem)=="Salsa: no")
                countSalsa = 0.0;
            else {countSalsa = 1.0;
            }
            order.add(salsa.get(salsaItem));

            Random randomVeggieItem = new Random();
            int veggiesItem = randomVeggieItem.nextInt(veggies.size());
            //System.out.println(veggies.get(veggiesItem));
            if(veggies.get(veggiesItem)== "Veggies: all")
                countVeggies = 3.0;
            else if ( veggies.get(veggiesItem)=="Veggies: no")
                countVeggies = 0.0;
            else {countVeggies = 1.0;
            }
            order.add(veggies.get(veggiesItem));

            Random randomCheeseItem = new Random();
            int cheeseItem = randomCheeseItem.nextInt(cheese.size());
            // System.out.println(cheese.get(cheeseItem));
            if(cheese.get(cheeseItem)== "Cheese: yes")
                countCheese = 1.0;
            else {countCheese = 0.0;
            }
            order.add(cheese.get(cheeseItem));

            Random randomXguacItem = new Random();
            int xguacItem = randomXguacItem.nextInt(xguac.size());
            //System.out.println(xguac.get(xguacItem));
            if(rice.get(xguacItem)== "Guac: yes")
                countXguac = 1.0;
           else {countXguac = 0.0;
            }
            order.add(xguac.get(xguacItem));

            Random randomXquesoItem = new Random();
            int xquesoItem = randomXquesoItem.nextInt(xqueso.size());
            // System.out.println(xqueso.get(xquesoItem));
            if(xqueso.get(xquesoItem)== "Queso: yes")
                countXqueso = 1.0;
            else {countXqueso = 0.0;

            }
            order.add(xqueso.get(xquesoItem));

            Random randomXsourcreamItem = new Random();
            int xSourCreamItem = randomXsourcreamItem.nextInt(xsourcream.size());
            System.out.println(xsourcream.get(xSourCreamItem));
            //System.out.println(xsourcream.size());
            if(xsourcream.get(xSourCreamItem)== "Sour Cream: yes")
                countXSourcream = 1.0;
            else {countXSourcream = 0.0;

            }
            order.add(xsourcream.get(xSourCreamItem));
            countsum = countRice + countBeans + countCheese + countSalsa + countVeggies + countXguac + countXqueso + countXSourcream;
//System.out.println("countsum="+countsum);
//System.out.println("price="+price);
            orderTotal = (3+(countMeat  + countBeans + countCheese + countSalsa + countVeggies + countXguac + countXqueso + countXSourcream)* price);
 //System.out.println("orderTotal ="+ orderTotal);
            String orderStrTotal = Double.toString(orderTotal);
            order.add(orderStrTotal);

            System.out.println("Burrito #  " + b + " " + order);
        }
   }
}