import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama barang : ");
            String namaBarang = scanner.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok: ");
            int jumlahStok = scanner.nextInt();

            System.out.print("Masukkan harga per unit: ");
            double hargaPerUnit = scanner.nextDouble();

            double totalNilaiStok = jumlahStok * hargaPerUnit;
            System.out.println("Total nilai stok: " + totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan: ");
            int jumlahPermintaan = scanner.nextInt();

            if (jumlahPermintaan <= jumlahStok) {
                jumlahStok -= jumlahPermintaan;
                System.out.println("Permintaan dapat dipenuhi. Stok tersisa: " + jumlahStok);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }

            scanner.nextLine();
        }
    }
}
