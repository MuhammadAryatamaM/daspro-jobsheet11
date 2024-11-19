import java.util.Scanner;
public class hitungTotalHarga15 {

    public static double hitungTotalHarga (int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon;

        if (kodePromo.equals("DISKON50")) {                                   // modif kode promo
            System.out.println("Anda mendapatkan diskon sebesar 50% !");
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon sebesar 30% !");
            diskon = 0.7;
        } else {
            System.out.println("Maaf, kode yang Anda masukkan tidak valid.");
            diskon = 1;
        }
        
        double hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem) * diskon;
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalHarga = 0;
        int counter = 0;
        String[] pesanan = new String[100];
        String[] list = {"Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};

        Menu();
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk keluar): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) break;

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            pesanan[i] = banyakItem + " " + list[pilihanMenu - 1];                     // modif menampilkan total pesanan
            counter++; 

            System.out.print("Masukkan kode promo: ");                               // modif kode promo        
            String code = sc.nextLine();
            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem, code);            
        }

        for (int i = 0; i < counter; i++) System.out.println(pesanan[i]);              // modif menampilkan total pesanan

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }

    public static void Menu() {                                                         // modif tampilan menu
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");        
        System.out.println("2. Cappuccino - Rp 20,000");       
        System.out.println("3. Latte - Rp 22,000");       
        System.out.println("4. Teh Tarik - Rp 12,000");       
        System.out.println("5. Roti Bakar - Rp 10,000");       
        System.out.println("6. Mie Goreng - Rp 18,000");       
        System.out.println("===========================");       
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
}