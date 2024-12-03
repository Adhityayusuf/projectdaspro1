import java.util.Scanner;

public class PengisianKRS8 {
    static Scanner input = new Scanner(System.in);
    static String[][] dataMahasiswa = new String[100][5]; // 100 itu cuma asumsi aja wkwk
    static int jumlahMahasiswa = 0;

    public static void main(String[] args) {
        // buat nyimpen data krs
        
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
    public static void tambahData(String[][] data, int jumlah) {
        String lanjut;
        System.out.println("\nTambah Data Mahasiswa");
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        System.out.print("Masukkan NIM : ");
        String nim = input.next();

        do {
        System.out.print("Masukkan kode mata kuliah : ");
        String kodeMK = input.next();
        System.out.print("Masukkan nama mata kuliah : ");
        String namaMK = input.next();
        System.out.print("Masukkan jumlah SKS (1-3): ");
        int sks = input.nextInt();
        if (sks >= 1 || sks <= 3) {
            System.out.println("Data mata kuliah berhasil ditambahkan!");
        } else {
            return;
        }
        System.out.print("Tambah mata kuliah? (y/t) : ");
        lanjut = input.next();
        input.nextLine();
        System.out.println("\n-----------------------------");
        
        // ini buat masukin data ke array
        data[jumlah][0] = nama;
        data[jumlah][1] = nim;
        data[jumlah][2] = kodeMK;
        data[jumlah][3] = namaMK;
        data[jumlah][4] = String.valueOf(sks); // ini buat ngubah data sks dari int ke string
        } while (lanjut.equalsIgnoreCase("y"));
    }
}