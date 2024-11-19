import java.util.Scanner;
public class DataMahasiswa15 {
    static String[] namaMhs;
    static int[][][] nilaiMhs;
    static int jmlMhs, tugas;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa tugas yang ada: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        sc.nextLine();
    
        nilaiMhs = new int[tugas][jmlMhs][7];
        namaMhs = new String[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.printf("Masukkan nama mahasiswa ke-%d: ", (i+1));
            namaMhs[i] = sc.nextLine();
        }
        for (int i = 0; i < tugas; i++) {
            System.out.printf("========== UNTUK TUGAS KE-%d ==========\n", (i+1));
            inputData(i);
            outputData(i);
            mingguTerbesar(i);
            mhsTertinggi(i);
        }
    }

    public static void inputData(int tugasKe) {
        Scanner sc = new Scanner(System.in);
  
        System.out.println("======= INPUT NILAI MAHASISWA =======");
        for (int i = 0; i < jmlMhs; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(namaMhs[i] + ", minggu ke-" + (j + 1) + ": ");
                nilaiMhs[tugasKe][i][j] = sc.nextInt();
            }
        }
    }

    public static void outputData(int tugasKe) {
        System.out.println("======= OUTPUT NILAI SELURUH MAHASISWA =======");
            for (int i = 0; i < jmlMhs; i++) {
               for (int j = 0; j < 7; j++) {
                   System.out.println(namaMhs[i] + ", minggu ke-" + (j + 1) + ": " + nilaiMhs[tugasKe][i][j]);
                }
            }
    }

    public static void mingguTerbesar(int tugasKe) {
        int[] nilaiMinggu = new int[7];
        int terbesar = 0, minggu = 0, c = 0;
        System.out.println("======= MINGGU DENGAN NILAI TERBESAR =======");
        for (int i = 0; i < 7; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jmlMhs; j++) {
                totalNilai += nilaiMhs[tugasKe][j][i];
            }
            nilaiMinggu[i] = totalNilai;
        }
        for (int i = 0; i < 7; i++) {
            if (nilaiMinggu[i] > terbesar) {
                terbesar = nilaiMinggu[i];
                minggu = i + 1;
            }
        }
        System.out.println("Minggu dengan jumlah nilai terbanyak ada di minggu ke-" + minggu + " yaitu " + terbesar);
    }

    public static void mhsTertinggi(int tugasKe) {
        int terbesar = 0, minggu = 0, absen = 0, c = 0;
        System.out.println("======= MAHASISWA DENGAN NILAI TERTINGGI =======");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < jmlMhs; j++) {
                if (nilaiMhs[tugasKe][j][i] > terbesar) {
                    terbesar = nilaiMhs[tugasKe][j][i];
                    minggu = i + 1;
                    absen = j;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMhs[absen] + " pada minggu ke-" + minggu + " yaitu " + terbesar);
    }
}