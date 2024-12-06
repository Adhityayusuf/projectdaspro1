import java.util.Scanner;
public class OperasiMatrik {
    static int barisA,kolomA,barisB,kolomB,fitur;
    static int[][] matriksA;
    static int[][] matriksB;
    static int[][] hasilPenjumlahan;
    static int[][] hasilPengurangan;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("====== OPERASI MATRIKS ======");
            System.out.println("\nSilahkan Pilih Menu Operasi :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Transfose");
            System.out.println("6. keluar");
            System.out.print("Pilih menu : ");
            fitur = input.nextInt();
            switch (fitur) {
                case 1:
                    System.out.println("\n===== OPERASI PENJUMLAHAN =====");
                    inputMatrik();
                    tambahDanKurang();
                    break;
                case 2 :
                    System.out.println("\n===== OPERASI PENGURANGAN =====");
                    inputMatrik();
                    tambahDanKurang();
                    break;
                case 3 :
                    System.out.println("\n===== OPERASI PERKALIAN =====");
                    inputMatrik();
                    break;
                case 4 :
                    System.out.println("\n===== OPERASI INVERS =====");
                    inputMatrik();
                    break;
                case 5 :
                    System.out.println("\n===== OPERASI TRANSFOSE =====");
                    inputMatrik();
                    break;
                case 6 :
                    System.out.println("===== TERIMA KASIH =====");
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
            }
        } while (fitur != 6);
        
    }
    public static void inputMatrik () {
        System.out.print("\nMasukkan jumlah baris matriks A: ");
        barisA = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        kolomA = input.nextInt();
        System.out.print("Masukkan jumlah baris matriks B: ");
        barisB = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        kolomB = input.nextInt();
        matriksA = new int[barisA][kolomA];
        matriksB = new int[barisB][kolomB];
        System.out.println("\n===== PENGINPUTAN ELEMEN MATRIKS =====");
        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("B[" + (i+1) + "][" + (j+1) + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }
    }
    public static void tambahDanKurang () {
        if (barisA == barisB && kolomA == kolomB) {
            hasilPenjumlahan = new int[barisA][kolomA];
            hasilPengurangan = new int[barisA][kolomA];
            if (fitur == 1) {
                for (int i = 0; i < barisA; i++) {
                    for (int j = 0; j < kolomA; j++) {
                        hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                    }
                }
                System.out.println("\n===== Hasil penjumlahan matriks =====");
                System.out.println();
                for (int i = 0; i < barisA; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < kolomA; j++) {
                        System.out.print(hasilPenjumlahan[i][j] + " ");
                    }
                    System.out.print("|");
                    System.out.println();
                }
                System.out.println();
            } else if (fitur == 2) {
                for (int i = 0; i < barisA; i++) {
                    for (int j = 0; j < kolomA; j++) {
                        hasilPengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
                    }
                }
                System.out.println("\n===== Hasil pengurangan matriks =====");
                System.out.println();
                for (int i = 0; i < barisA; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < kolomA; j++) {
                        System.out.print(hasilPengurangan[i][j] + " ");
                    }
                    System.out.print("|");
                    System.out.println();
                }
                System.out.println();
            }
        } else {
            System.out.println();
            System.out.println("===== INPUTAN BARIS DAN KOLOM TIDAK SESUAI !!! =====");
            System.out.println();
        }
    }
}
