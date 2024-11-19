import java.util.Scanner;
public class RekapKafe15 {

    static String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];

    public static void main(String[] args) {
        inputData(penjualan);
        outputData(penjualan);
        menuTerlaris();
        avgTiapMenu();
    }

    public static void inputData(int[][] penjualan) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= INPUT REKAP PENJUALAN =======");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(namaMenu[i] + ", hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void outputData(int[][] penjualan) {
        System.out.println("======= OUTPUT REKAP PENJUALAN =======");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(namaMenu[i] + ", hari ke-" + (j + 1) + ": " + penjualan[i][j]);
            }
        }
    }

    public static void menuTerlaris() {
        int terbesar = 0, c = 0;
        System.out.println("======= MENU DENGAN PENJUALAN TERBESAR =======");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > terbesar) {
                terbesar = total;
                c = i;
            }
        }
        System.out.println("Menu dengan jumlah penjualan terbanyak adalah " + namaMenu[c] + " sebanyak " + terbesar);
    }

    public static void avgTiapMenu() {
        System.out.println("======= RATA RATA TIAP MENU =======");
        for (int i = 0; i < 5; i++) {
            double avg = 0, total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            avg = total / 7;
            System.out.println("Rata-rata penjualan " + namaMenu[i] + " adalah " + avg);
        }
    }
} 