public class PengunjungCafe15 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung (for loop):");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
        System.out.println("Daftar nama pengunjung (foreach loop):");  // modif for each loop
        for (String list : namaPengunjung) {
            System.out.println("- " + list);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
