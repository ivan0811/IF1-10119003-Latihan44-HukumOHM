package com.ivanfaathirza.hukumohm;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung tegangan baterai (volt) menggunakan
 * overloading dengan berorientasi objek
 */

public class IF110119003Latihan44 {

    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3f, 12f);

        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : "+ baterai1.hitungTegangan() + " volt");
    }
}
