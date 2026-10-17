/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant.ilham;

import java.util.Scanner;

public class RestaurantIlham {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("|  Selamat Datang di Restaurant Ilham  |");
        System.out.println("+--------------------------------------+");

        System.out.println("+---------------+");
        System.out.println("|  Daftar Menu  |");
        System.out.println("+---------------+");

        Menu dataMenu = new Menu();

        dataMenu.getDataMenu();

        System.out.println("INGIN PESAN SESUATU? (y/t)");

        while (true) {
            String selected_con = input.nextLine();

            if (selected_con.toLowerCase().equals("t")) {
                return;
            } else if (selected_con.toLowerCase().equals("y")) {
                break;
            } else {
                System.out.println("Pilihan hanya boleh y / t!");
            }
        }

        System.out.println("MAKSIMAL 4 JENIS MENU YANG BOLEH DIPESAN,\nUNTUK JUMLAH NYA TIDAK TERBATAS!");
        System.out.println("PESAN MAKANAN (MASUKAN ANGKA DARI DAFTAR MENU DIATAS) : ");
        
        Order order = new Order();
        
        order.getOrder();

    }
}
