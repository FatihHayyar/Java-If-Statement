package day04IfStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
       System.out.println("isminizi girin");
//        String isim= unit.next();
//        System.out.println("soyismnizi girin");
//        String soyisim= unit.next();
//        System.out.println("Tc nizi girin");
//        String tcno= unit.next();
//        System.out.println(isim+" "+soyisim);
//        System.out.println(tcno);
        //2.yol
        System.out.println("ad soyad ve tc girin");
        String ad= unit.next();
        String soyad= unit.next();
        String kimlik= unit.next();
        System.out.println(ad+" "+soyad);
        System.out.println(kimlik);

    }



}
