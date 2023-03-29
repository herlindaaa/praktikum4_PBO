import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        String bonus = "";
        float totalPembelian = getTotalPembelian();
        if(totalPembelian >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if(totalPembelian >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if(totalPembelian >= 50000 && jumlah > 2) {
            bonus = "Ballpoint";
        } else {
            bonus = "Tidak mendapat bonus";
        }
        return bonus;
    }

    public void cetakNota() {
        float totalPembelian = getTotalPembelian();
        String bonus = getBonus();
        System.out.println("=== Nota Penjualan ===");
        System.out.println("Kode Barang: "+kode);
        System.out.println("Nama Barang: "+nama);
        System.out.println("Harga Barang: "+harga);
        System.out.println("Jumlah Barang: "+jumlah);
        System.out.println("Total Pembelian: "+totalPembelian);
        System.out.println("Bonus: "+bonus);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=== Input Data Penjualan ===");
            System.out.print("Masukkan kode barang: ");
            String kode = input.nextLine();
            System.out.print("Masukkan nama barang: ");
            String nama = input.nextLine();
            System.out.print("Masukkan harga barang: ");
            float harga = input.nextFloat();
            System.out.print("Masukkan jumlah barang: ");
            int jumlah = input.nextInt();
            input.nextLine();
            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();
            System.out.print("Input data lagi [Y/T]? ");
        } while (input.nextLine().equalsIgnoreCase("Y"));
        input.close();
    }
}