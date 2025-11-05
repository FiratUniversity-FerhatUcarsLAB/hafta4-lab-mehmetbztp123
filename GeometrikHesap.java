/*
* Ad Soyad: [ADINIZ SOYADINIZ]
* Ogrenci No: [NUMARANIZ]
* Tarih: 05 Kasim 2025
* Aciklama: Daire ve Kure Geometrik Hesaplayicisi (Gorev 2)
*/

import java.util.Scanner;

public class GeometrikHesap {

    public static void main(String[] args) {
        // Istenen sabit PI degerini final olarak tanimlama
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        
        // Kullanicidan yaricapi double olarak alma
        System.out.print("Dairenin yaricapini girin (cm): ");
        double yaricap = input.nextDouble(); // Burasi girdi beklenilen yerdir.
        
        // Scanner kapatildi
        input.close();

        // -----------------------------------------------------
        // 1. DAİRE HESAPLAMALARI
        // -----------------------------------------------------
        
        // 1. Daire Alanı: π × r^2
        double daireAlani = PI * yaricap * yaricap; 
        
        // 2. Daire Çevresi: 2 × π × r
        double daireCevresi = 2 * PI * yaricap;
        
        // 3. Daire Çapı: 2 × r
        double daireCapi = 2 * yaricap;

        // -----------------------------------------------------
        // 2. KÜRE HESAPLAMALARI
        // -----------------------------------------------------

        // 4. Küre Hacmi: (4/3) × π × r^3
        // Integer division'ı onlemek icin 4.0/3.0 kullanildi
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        
        // 5. Küre Yüzey Alanı: 4 × π × r^2
        double kureYuzeyAlani = 4 * PI * yaricap * yaricap;

        // -----------------------------------------------------
        // 3. ÇIKTILAR (Tüm sonuçlar 2 ondalık basamakla gösteriliyor)
        // -----------------------------------------------------
        
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        
        // Daire Hesaplamalari (Daha belirgin hizalama: 25 karakter)
        // %-25s: 25 karakter sola hizali metin
        // %.2f: 2 ondalik basamakli double
        System.out.printf("%-25s: %.2f cm^2%n", "Daire Alani", daireAlani);
        System.out.printf("%-25s: %.2f cm%n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-25s: %.2f cm%n", "Daire Capi", daireCapi); 
        
        // Küre Hesaplamalari
        System.out.printf("%-25s: %.2f cm^3%n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-25s: %.2f cm^2%n", "Kure Yuzey Alani", kureYuzeyAlani);
        System.out.println("--------------------------------");
        
    }
}
