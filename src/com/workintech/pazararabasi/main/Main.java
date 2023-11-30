package com.workintech.pazararabasi.main;

import com.workintech.pazararabasi.model.Pazar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pazarArabasiUygulamasi();
    }
    public static void pazarArabasiUygulamasi(){
        Scanner scanner = new Scanner(System.in);
        List<String> pazarListesi = new LinkedList<>();
        while(true){
            System.out.println("Merhaba,Pazar Arabasına hoşgeldiniz./nYapılmasını istediğiniz işlemi giriniz: /n0:Çıkış 1:Ürün Ekle 2:Ürün Çıkar");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            if(input==1){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                Pazar.addItems(pazarListesi);
            }if(input==2){
                System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                Pazar.removeItems(pazarListesi);
            }
        }

    }
}
