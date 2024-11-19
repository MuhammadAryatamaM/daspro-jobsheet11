import java.util.Scanner;
public class Kubus15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side, v, sa;

        System.out.print("Masukkan sisi kubus: ");
        side = sc.nextInt();

        v = hitungVolume(side);
        System.out.printf("Volumenya adalah: %d\n", v);
        
        sa = hitungLuasPermukaan(side);
        System.out.printf("Luas permukaannya adalah: %d", sa);

    }

    public static int hitungVolume(int side) {
        int vol = side * side * side;
        return vol;
    }

    public static int hitungLuasPermukaan(int side) {
        int surface = 6 * side * side;
        return surface;
    }
}