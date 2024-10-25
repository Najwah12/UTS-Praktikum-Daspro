import java.util.Scanner;

public class RataRataNilaiSiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahSiswa = 0;
        int totalNilai = 0;
        int diAtasRataRata = 0;
        String nama;
        int nilai;

        do {
            System.out.print("Masukkan nama siswa : ");
            nama = scanner.nextLine();

            System.out.print("Masukkan nilai : ");
                nilai = scanner.nextInt();

            if (!nama.equalsIgnoreCase("selesai")) {

                jumlahSiswa++;
                totalNilai += nilai;

                double rataRataSaatIni = (double) totalNilai / jumlahSiswa;
                if (nilai > rataRataSaatIni) {
                    diAtasRataRata++;
                }
            }
        } while (!nama.equalsIgnoreCase("selesai"));

        double rataRataAkhir = (double) totalNilai / jumlahSiswa;

        System.out.println("Rata-rata nilai kelas: " + rataRataAkhir);
        System.out.println("Jumlah siswa yang nilainya di atas rata-rata: " + diAtasRataRata);
        System.out.println("Jumlah siswa yang nilainya di bawah rata-rata: " + (jumlahSiswa - diAtasRataRata));

        if ((double) diAtasRataRata / jumlahSiswa > 0.5) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else {
            System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
        }
    }
}