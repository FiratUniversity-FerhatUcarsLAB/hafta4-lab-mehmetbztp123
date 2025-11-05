/*
* Ad Soyad: [ADINIZ SOYADINIZ]
* Ogrenci No: [NUMARANIZ]
* Tarih: 05 Kasim 2025
* Aciklama: Ogrenci Bilgi Sistemi - Timeout Riski Azaltilmis Versiyon
*/

import java.util.Scanner;

public class OgrenciBilgiOptimize {

    public static void main(String[] args) {
        // Scanner nesnesi oluşturuldu
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        
        // Girdiler sırayla alınıyor
        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();
        
        System.out.print("Ogrenci numaraniz : ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yasiniz : ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        // Scanner kapatıldı
        input.close();

        // Durum kontrolü
        String durum;
        // Basit kontrol: 3.00 ve üzeri başarılı kabul edildi.
        if (gpa >= 3.00) {
            durum = "Basarili Ogrenci";
        } else {
            durum = "Normal Ogrenci";
        }
        
        // --- ÇIKTI ---
        System.out.println("\n=== OGRENCI BILGI SISTEMI SONUCLARI ===");
        
        // Düzenli çıktı formatı
        System.out.printf("%-15s: %s %s%n", "Ad Soyad", ad, soyad);
        System.out.printf("%-15s: %d%n", "Ogrenci No", ogrenciNo);
        System.out.printf("%-15s: %d%n", "Yas", yas);
        
        // GPA için zorunlu olan 2 ondalık basamak formatı
        System.out.printf("%-15s: %.2f%n", "GPA", gpa); 
        
        System.out.printf("%-15s: %s%n", "Durum", durum);
    }
}
