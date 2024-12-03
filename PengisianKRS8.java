import java.util.Scanner;

public class PengisianKRS8 {
    

    public static void main(String[] args) {
        // buat nyimpen data krs
        String[][] dataMahasiswa = new String[100][5]; // 100 itu cuma asumsi aja wkwk
        int jumlahMahasiswa = 0;
    Scanner input = new Scanner(System.in);
        
        int fitur;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar ");
            System.out.print("Pilih menu : ");
            fitur = input.nextInt();

            switch (fitur) {
                case 1:
                System.out.println("\n--- Tambah Data KRS ---");
                tambahData(dataMahasiswa, jumlahMahasiswa);
                jumlahMahasiswa++;
                break;
                case 2 :
                System.out.println("Tampil");
                break;
                case 3 :
                System.out.println("Analisis");
                break;
                case 4 :
                System.out.println("-- Terima Kasih --");
                break;
                default:
                  System.out.println("Pilihan tidak valid.");
            }
        } while (fitur != 4);
    }

    // ini fungsi buat nambah data mahasiswa
    static void tambahData(String[][] data, int jumlah) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nTambah Data Mahasiswa");
        System.out.print("Masukkan nama: ");
        String nama = input.next();
        System.out.print("Masukkan NIM: ");
        String nim = input.next();
        System.out.print("Masukkan kode mata kuliah: ");
        String kodeMK = input.next();
        System.out.print("Masukkan nama mata kuliah: ");
        String namaMK = input.next();
        System.out.print("Masukkan jumlah SKS: ");
        int sks = input.nextInt();
        System.out.println("\n-----------------------------");

        // ini buat ngoreksi waktu sks
        if (sks < 1 || sks > 3) {
            System.out.println("Jumlah SKS harus antara 1 dan 3.");
            return;
        }

        // ini buat masukin data ke array
        data[jumlah][0] = nama;
        data[jumlah][1] = nim;
        data[jumlah][2] = kodeMK;
        data[jumlah][3] = namaMK;
        data[jumlah][4] = String.valueOf(sks); // ini buat ngubah data sks dari int ke string
    }
}