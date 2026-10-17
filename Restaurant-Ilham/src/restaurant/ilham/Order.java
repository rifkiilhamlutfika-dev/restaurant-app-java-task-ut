/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant.ilham;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    Scanner input = new Scanner(System.in);

    Menu menu = new Menu();
    String[][] dataFoods = menu.getDataFoods();
    String[][] dataDrinks = menu.getDataDrinks();

    ArrayList<ArrayList<String>> dataOrder = new ArrayList<>();

    String drinkBonus = "";

    public void getOrder() {

        int selectedType;

        do {
            System.out.println("TOTAL MENU DIPESAN : " + dataOrder.size());

            System.out.println("");

            if (dataOrder.size() < 4) {
                System.out.println("INGIN PESAN : ");

                System.out.println("1. MAKANAN");
                System.out.println("2. MINUMAN");
            }

            if (dataOrder.size() > 0) {
                System.out.println("3. SELESAI");
            }

            System.out.println("4. BATAL");
            System.out.println("------------");
            System.out.println("");

            while (true) {
                selectedType = Integer.parseInt(input.nextLine());

                if ((selectedType == 1 || selectedType == 2) && (dataOrder.size() < 4 && dataOrder.size() >= 0)) {
                    postOrder(selectedType);
                    break;
                } else if (selectedType == 3 && dataOrder.size() > 0) {
                    int totalOrder = 0;
                    totalOrder += Integer.parseInt(dataOrder.get(0).get(1)) * Integer.parseInt(dataOrder.get(0).get(3));
                    if (dataOrder.size() > 1) {
                        totalOrder += Integer.parseInt(dataOrder.get(1).get(1)) * Integer.parseInt(dataOrder.get(1).get(3));
                    }
                    if (dataOrder.size() > 2) {
                        totalOrder += Integer.parseInt(dataOrder.get(2).get(1)) * Integer.parseInt(dataOrder.get(2).get(3));
                    }
                    if (dataOrder.size() > 3) {
                        totalOrder += Integer.parseInt(dataOrder.get(3).get(1)) * Integer.parseInt(dataOrder.get(3).get(3));
                    }

                    if (totalOrder > 50000) {
                        postBonusDrink();
                    }
                    
                    invoiceOrder();
                    break;
                } else if (selectedType == 4) {
                    System.out.println("TERIMA KASIH ATAS KUNJUNGAN ANDA");
                    break;
                } else {
                    System.out.println("PILIHAN TIDAK TERSEDIA");
                }
            }
        } while (selectedType < 3 || selectedType > 4);

    }

    void invoiceOrder() {
        System.out.println("");
        System.out.println("BERIKUT PESANAN ANDA");

        int total = 0;

        System.out.println("MAKANAN : ");
        if (dataOrder.size() > 0 && dataOrder.get(0).get(2).equals("FOOD")) {
            int subtotal = Integer.parseInt(dataOrder.get(0).get(1)) * Integer.parseInt(dataOrder.get(0).get(3));
            System.out.println("- " + dataOrder.get(0).get(0) + " (" + dataOrder.get(0).get(1) + ") " + dataOrder.get(0).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 1 && dataOrder.get(1).get(2).equals("FOOD")) {
            int subtotal = Integer.parseInt(dataOrder.get(1).get(1)) * Integer.parseInt(dataOrder.get(1).get(3));
            System.out.println("- " + dataOrder.get(1).get(0) + " (" + dataOrder.get(1).get(1) + ") " + dataOrder.get(1).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 2 && dataOrder.get(2).get(2).equals("FOOD")) {
            int subtotal = Integer.parseInt(dataOrder.get(2).get(1)) * Integer.parseInt(dataOrder.get(2).get(3));
            System.out.println("- " + dataOrder.get(2).get(0) + " (" + dataOrder.get(2).get(1) + ") " + dataOrder.get(2).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 3 && dataOrder.get(3).get(2).equals("FOOD")) {
            int subtotal = Integer.parseInt(dataOrder.get(3).get(1)) * Integer.parseInt(dataOrder.get(3).get(3));
            System.out.println("- " + dataOrder.get(3).get(0) + " (" + dataOrder.get(3).get(1) + ") " + dataOrder.get(3).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
//        for (int i = 0; i < dataOrder.size(); i++) {
//            if (dataOrder.get(i).get(2).equals("FOOD")) {
//                int dataTotalTemp = Integer.parseInt(dataOrder.get(i).get(1)) * Integer.parseInt(dataOrder.get(i).get(3));
//                System.out.println("- " + dataOrder.get(i).get(0) + "(" + dataOrder.get(i).get(1) + ") " + dataOrder.get(i).get(3) + " = Rp" + dataTotalTemp);
//                total += dataTotalTemp;
//            }
//        }

        System.out.println("");
        System.out.println("MINUMAN : ");
        
        if (dataOrder.size() > 0 && dataOrder.get(0).get(2).equals("DRINK")) {
            int subtotal = Integer.parseInt(dataOrder.get(0).get(1)) * Integer.parseInt(dataOrder.get(0).get(3));
            System.out.println("- " + dataOrder.get(0).get(0) + " (" + dataOrder.get(0).get(1) + ") " + dataOrder.get(0).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 1 && dataOrder.get(1).get(2).equals("DRINK")) {
            int subtotal = Integer.parseInt(dataOrder.get(1).get(1)) * Integer.parseInt(dataOrder.get(1).get(3));
            System.out.println("- " + dataOrder.get(1).get(0) + " (" + dataOrder.get(1).get(1) + ") " + dataOrder.get(1).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 2 && dataOrder.get(2).get(2).equals("DRINK")) {
            int subtotal = Integer.parseInt(dataOrder.get(2).get(1)) * Integer.parseInt(dataOrder.get(2).get(3));
            System.out.println("- " + dataOrder.get(2).get(0) + " (" + dataOrder.get(2).get(1) + ") " + dataOrder.get(2).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 3 && dataOrder.get(3).get(2).equals("DRINK")) {
            int subtotal = Integer.parseInt(dataOrder.get(3).get(1)) * Integer.parseInt(dataOrder.get(3).get(3));
            System.out.println("- " + dataOrder.get(3).get(0) + " (" + dataOrder.get(3).get(1) + ") " + dataOrder.get(3).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
        if (dataOrder.size() > 4 && dataOrder.get(4).get(2).equals("DRINK")) {
            int subtotal = Integer.parseInt(dataOrder.get(4).get(1)) * Integer.parseInt(dataOrder.get(4).get(3));
            System.out.println("- " + dataOrder.get(4).get(0) + " (" + dataOrder.get(4).get(1) + ") " + dataOrder.get(4).get(3) + " = Rp" + subtotal);
            total += subtotal;
        }
        
//        for (int i = 0; i < dataOrder.size(); i++) {
//            if (dataOrder.get(i).get(2).equals("DRINK")) {
//                int dataTotalTemp = Integer.parseInt(dataOrder.get(i).get(1)) * Integer.parseInt(dataOrder.get(i).get(3));
//                System.out.println("- " + dataOrder.get(i).get(0) + "(" + dataOrder.get(i).get(1) + ") " + dataOrder.get(i).get(3) + " = Rp" + dataTotalTemp);
//                total += dataTotalTemp;
//            }
//        }

        System.out.println("");
        if (total > 50000) {
            System.out.println("BONUS PEMBELIAN > 50.000 : " + drinkBonus.toUpperCase() +" (1)");
        }

        int tax = (int) Math.round(total * 0.1);
        int discount = (int) Math.round(total * 0.1);
        int serviceFee = 20000;

        System.out.println("");
        System.out.println("+--------------------------------------+");
        System.out.println("| TOTAL AWAL : Rp" + total);
        System.out.println("| PAJAK(10%) : Rp" + tax);
        System.out.println("| BIAYA PELAYANAN : Rp" + serviceFee);
        if (total > 100000) {
            System.out.println("| DISKON (10%): " + discount);
        }

        total = total + tax + serviceFee - discount;
        System.out.println("| TOTAL AKHIR : " + total);

        System.out.println("+--------------------------------------+");
        System.out.println("|   TERIMA KASIH ATAS PEMBELIAN ANDA   |");
        System.out.println("+--------------------------------------+");

    }

    void postOrder(int typeOrder) {
        ArrayList<String> dataTemp = new ArrayList<String>();

        if (typeOrder == 1) {
            System.out.print("MASUKAN MENU MAKANAN : ");
        } else {
            System.out.print("MASUKAN MENU MINUMAN : ");
        }

        int selectedMenu;

        if (typeOrder == 1) {
            do {
                selectedMenu = Integer.parseInt(input.nextLine());

                if (selectedMenu > 0 && selectedMenu <= dataFoods.length) {
                    break;
                } else {
                    System.out.println("MENU TIDAK TERSEDIA");
                }

            } while (selectedMenu <= 0 || selectedMenu > dataFoods.length);
        } else {
            do {
                selectedMenu = Integer.parseInt(input.nextLine());

                if (selectedMenu > 0 && selectedMenu <= dataDrinks.length) {
                    break;
                } else {
                    System.out.println("MENU TIDAK TERSEDIA");
                }

            } while (selectedMenu <= 0 || selectedMenu > dataFoods.length);
        }

        if (typeOrder == 1) {
            System.out.println("DIPILIH " + dataFoods[selectedMenu - 1][0].toUpperCase());
        } else {
            System.out.println("DIPILIH " + dataDrinks[selectedMenu - 1][0].toUpperCase());
        }

        System.out.print("MASUKAN JUMLAH : ");

        int quantity;

        do {
            quantity = Integer.parseInt(input.nextLine());

            if (quantity < 1) {
                System.out.println("HARUS DIATAS 0");
            }
        } while (quantity < 1);

        int total;

        if (typeOrder == 1) {
            total = Integer.parseInt(dataFoods[selectedMenu - 1][1]) * quantity;

            System.out.println("");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| " + dataFoods[selectedMenu - 1][0].toUpperCase() + " (" + dataFoods[selectedMenu - 1][1] + ") - " + quantity + " : " + "Rp" + total);
            System.out.println("+----------------------------------------------------+");

            dataTemp.add(dataFoods[selectedMenu - 1][0]);
            dataTemp.add(dataFoods[selectedMenu - 1][1]);
            dataTemp.add(dataFoods[selectedMenu - 1][2]);
            dataTemp.add(String.valueOf(quantity));

        } else {
            total = Integer.parseInt(dataDrinks[selectedMenu - 1][1]) * quantity;

            System.out.println("");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| " + dataDrinks[selectedMenu - 1][0].toUpperCase() + " (" + dataDrinks[selectedMenu - 1][1] + ") - " + quantity + " : " + "Rp" + total);
            System.out.println("+----------------------------------------------------+");

            dataTemp.add(dataDrinks[selectedMenu - 1][0]);
            dataTemp.add(dataDrinks[selectedMenu - 1][1]);
            dataTemp.add(dataDrinks[selectedMenu - 1][2]);
            dataTemp.add(String.valueOf(quantity));
        }
        dataOrder.add(dataTemp);
    }

    void postBonusDrink() {

        ArrayList<String> dataTemp = new ArrayList<String>();
        int selectedMenu;
        System.out.println("SELAMAT ANDA MENDAPATKAN PROGRAM BUY 1 GET 1");
        System.out.println("TOTAL BELANJA > 50.000");
        System.out.println("SILAHKAN PILIH 1 MINUMAN YANG INGIN DIBELI DAN DAPATKAN BONUS 1 GRATIS");

        do {
            System.out.print("PILIH MINUMAN ANDA : ");
            selectedMenu = Integer.parseInt(input.nextLine());

            if (selectedMenu > 0 && selectedMenu <= dataDrinks.length) {
                break;
            } else {
                System.out.println("MENU TIDAK TERSEDIA");
            }

        } while (selectedMenu <= 0 || selectedMenu > dataFoods.length);

        dataTemp.add(dataDrinks[selectedMenu - 1][0]);
        dataTemp.add(dataDrinks[selectedMenu - 1][1]);
        dataTemp.add(dataDrinks[selectedMenu - 1][2]);
        dataTemp.add(String.valueOf(1));

        dataOrder.add(dataTemp);

        drinkBonus = dataDrinks[selectedMenu - 1][0];
    }
}
