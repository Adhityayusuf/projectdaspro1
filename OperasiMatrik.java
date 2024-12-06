import java.util.Scanner;
public class OperasiMatrik {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int fitur;
        do {
            System.out.println("====== OPERASI MATRIKS ======");
            System.out.println("\nSilahkan Pilih Menu Operasi :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Tranfus");
            System.out.println("6. keluar");
            System.out.print("Pilih menu : ");
            fitur = input.nextInt();
            switch (fitur) {
                case 1:
                System.out.println("\n--- Tambah Data KRS ---");
                break;
                case 2 :
                break;
                case 3 :
                break;
                case 4 :
                System.out.println("-- Terima Kasih --");
                break;
                default:
                System.out.println("Pilihan tidak valid.");
            }
        } while (fitur != 4);
        
    }
}
