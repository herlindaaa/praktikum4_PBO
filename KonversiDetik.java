import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilih;
        do {
            System.out.print("Masukkan jumlah detik: ");
            int detik = input.nextInt();
            int hari = detik / 86400;
            detik = detik % 86400;
            int jam = detik / 3600;
            detik = detik % 3600;
            int menit = detik / 60;
            detik = detik % 60;
            System.out.println("Konversi waktu: "+hari+" hari, "+jam+" jam, "+menit+" menit, "+detik+" detik");
            System.out.print("Input data lagi [Y/T]? ");
            pilih = input.next().charAt(0);
        } while(pilih == 'Y' || pilih == 'y');

        input.close();
    }
}
