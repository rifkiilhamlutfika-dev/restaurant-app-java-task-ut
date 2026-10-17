/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant.ilham;

public class Menu {

    String cat_food = "FOOD";
    String cat_drink = "DRINK";

    private String[][] data_foods = {
        {"Sate Ayam", "25000", cat_food},
        {"Nasi Goreng", "20000", cat_food},
        {"Mie Ayam", "10000", cat_food},
        {"Bakso", "15000", cat_food},
        {"Soto Ayam", "20000", cat_food},
        {"Soto Daging", "25000", cat_food},
        {"Tahu Telor", "10000", cat_food},
        {"Tahu Kocek", "7000", cat_food},
        {"Kue Pancong", "12000", cat_food},
        {"Ketoprak", "11000", cat_food},
        {"Nasi Padang", "12000", cat_food}
    };

    private String[][] data_drinks = {
        {"Es Teh Manis", "5000", cat_drink},
        {"Teh Hangat", "3000", cat_drink},
        {"Es Jeruk", "6000", cat_drink},
        {"Jeruk Hangat", "5000", cat_drink},
        {"Soda Gembira", "10000", cat_drink},
        {"Es Campur", "15000", cat_drink},
        {"Es Kelapa", "6000", cat_drink},
        {"Kopi Susu", "4000", cat_drink},
        {"Es Cendol", "10000", cat_drink},
        {"Air Mineral", "4000", cat_drink}
    };

    public void getDataMenu() {
        System.out.println("+------------------+");
        System.out.println("|      MAKANAN     |");
        System.out.println("+------------------+");

//        for (int i = 0; i < data_foods.length; i++) {
//            System.out.print(i + 1 + ".");
//            System.out.print(" " + data_foods[i][0]);
//            System.out.println(" - " + "Rp"+data_foods[i][1]);
//        }
        System.out.println("1. " + data_foods[0][0] + " - Rp" + data_foods[0][1]);
        System.out.println("2. " + data_foods[1][0] + " - Rp" + data_foods[1][1]);
        System.out.println("3. " + data_foods[2][0] + " - Rp" + data_foods[2][1]);
        System.out.println("4. " + data_foods[3][0] + " - Rp" + data_foods[3][1]);
        System.out.println("5. " + data_foods[4][0] + " - Rp" + data_foods[4][1]);
        System.out.println("6. " + data_foods[5][0] + " - Rp" + data_foods[5][1]);
        System.out.println("7. " + data_foods[6][0] + " - Rp" + data_foods[6][1]);
        System.out.println("8. " + data_foods[7][0] + " - Rp" + data_foods[7][1]);
        System.out.println("9. " + data_foods[8][0] + " - Rp" + data_foods[8][1]);
        System.out.println("10. " + data_foods[9][0] + " - Rp" + data_foods[9][1]);
        System.out.println("11. " + data_foods[10][0] + " - Rp" + data_foods[10][1]);

        System.out.println("+------------------+");

        System.out.println("+------------------+");
        System.out.println("|      MINUMAN     |");
        System.out.println("+------------------+");

//        for (int i = 0; i < data_drinks.length; i++) {
//            System.out.print(i + 1 + ".");
//            System.out.print(" " + data_drinks[i][0]);
//            System.out.println(" - " + "Rp"+data_drinks[i][1]);
//        }
        System.out.println("1. " + data_drinks[0][0] + " - Rp" + data_drinks[0][1]);
        System.out.println("2. " + data_drinks[1][0] + " - Rp" + data_drinks[1][1]);
        System.out.println("3. " + data_drinks[2][0] + " - Rp" + data_drinks[2][1]);
        System.out.println("4. " + data_drinks[3][0] + " - Rp" + data_drinks[3][1]);
        System.out.println("5. " + data_drinks[4][0] + " - Rp" + data_drinks[4][1]);
        System.out.println("6. " + data_drinks[5][0] + " - Rp" + data_drinks[5][1]);
        System.out.println("7. " + data_drinks[6][0] + " - Rp" + data_drinks[6][1]);
        System.out.println("8. " + data_drinks[7][0] + " - Rp" + data_drinks[7][1]);
        System.out.println("9. " + data_drinks[8][0] + " - Rp" + data_drinks[8][1]);
        System.out.println("10. " + data_drinks[9][0] + " - Rp" + data_drinks[9][1]);
    }

    public String[][] getDataFoods() {
        return data_foods;
    }

    public String[][] getDataDrinks() {
        return data_drinks;
    }
}
