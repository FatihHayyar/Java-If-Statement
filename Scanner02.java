package day04IfStatement;

import java.util.Scanner;
//kullanicidan isim ve soyisim ilk harfini cekme
public class Scanner02 {
    public static void main(String[] args) {
        Scanner unit= new Scanner(System.in);
//        System.out.println("adinizi girin");
//        char ad=unit.next().charAt(0);
//        System.out.println("soyadinizi girin");
//        char soyad=unit.next().charAt(0);
//        System.out.println(""+ad + soyad);

//2.yol
        System.out.println("tam isminizi girin");
        String tamisim=unit.nextLine();
        char ilkharf =tamisim.charAt(0);
char soyisimilkharf=tamisim.split(" ")[1].charAt(0);
        System.out.println(""+ilkharf+soyisimilkharf);


    }






}
