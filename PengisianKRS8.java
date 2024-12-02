import java.util.Scanner;

public class PengisianKRS8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int fitur;
        
        do {
        System.out.println("====== SISTEM PENGISIAN KRS ======");
        System.out.println(" 1. Tambah Data KRS ");
        System.out.println(" 2. Tampilkan Daftar KRS Mahasiswa ");
        System.out.println(" 3. Analisis Data KRS ");
        System.out.println(" 4. EXIT  ");

        System.out.print("Pilih fitur yang ingin anda gunakan : ");
        fitur = sc.nextInt();
        
        switch (fitur) {
            case 1 :
            System.out.println("Tambah");
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
        }
        } while (fitur >= 1 && fitur < 4);
    }
}