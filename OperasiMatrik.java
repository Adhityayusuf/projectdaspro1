import java.util.Scanner;
public class OperasiMatrik {
    static int barisA,kolomA,barisB,kolomB,fitur;
    static int[][] matriksA;
    static int[][] matriksB;
    static int[][] matriks2x2 = new int[2][2];
    static int[][] matriks3x3 = new int[3][3];
    static int[][] hasilPenjumlahan;
    static int[][] hasilPengurangan;
    static int[][] hasilPerkalian;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("\n====== OPERASI MATRIKS ======");
            System.out.println("\nSilahkan Pilih Menu Operasi :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Transpose");
            System.out.println("6. keluar");
            System.out.print("Pilih menu : ");
            fitur = input.nextInt();
            switch (fitur) {
                case 1:
                    System.out.println("\n===== OPERASI PENJUMLAHAN =====");
                    inputMatriksA();
                    inputMatriksB();
                    tambahDanKurang();
                    break;
                case 2 :
                    System.out.println("\n===== OPERASI PENGURANGAN =====");
                    inputMatriksA();
                    inputMatriksB();
                    tambahDanKurang();
                    break;
                case 3 :
                    System.out.println("\n===== OPERASI PERKALIAN =====");
                    inputMatriksA();
                    inputMatriksB();
                    Perkalian();
                    break;
                case 4 :
                    System.out.println("\n===== OPERASI INVERS =====");
                    hitungInvers();
                    break;
                case 5 :
                    System.out.println("\n===== OPERASI TRANSPOSE =====");
                    inputMatriksA();
                    transposeMatriks();
                    break;
                case 6 :
                    System.out.println("===== TERIMA KASIH =====");
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
            }
        } while (fitur != 6);
    }
    public static void inputMatriksA() {
        do {
            System.out.print("\nMasukkan jumlah baris matriks A: ");
            barisA = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks A: ");
            kolomA = input.nextInt();

            if (barisA == 0 || kolomA == 0) {
                System.out.println("Baris atau kolom tidak boleh nol !!");
            }
        } while (barisA == 0 || kolomA == 0);

        matriksA = new int[barisA][kolomA];
        System.out.println("\n===== PENGINPUTAN ELEMEN MATRIKS A =====");
        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }
    }
    public static void inputMatriksB() {
        do {
            System.out.print("\nMasukkan jumlah baris matriks B: ");
            barisB = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks B: ");
            kolomB = input.nextInt();

            if (barisB == 0 || kolomB == 0) {
                System.out.println("Baris atau kolom tidak boleh nol !!");
            }
        } while (barisB == 0 || kolomB == 0);

        matriksB = new int[barisB][kolomB];
        System.out.println("\n===== PENGINPUTAN ELEMEN MATRIKS B =====");
        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }
    }
    public static void tambahDanKurang() {
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
                for(int i = 0; i < barisA; i++){
                    System.out.print("|");
                    for(int j = 0; j < kolomA; j++) {
                        System.out.print(" " + matriksA[i][j]);
                    }
                    System.out.print("|  +  |");
                    for(int j = 0; j < kolomB; j++){
                        System.out.print(" " + matriksB[i][j]);
                    }
                    System.out.print("|  =  |");
                    for(int j = 0; j < kolomA; j++){
                        System.out.print(" " + hasilPenjumlahan[i][j]);
                    }
                    System.out.print("|");
                    System.out.println();
                }
            } else if (fitur == 2) {
                for (int i = 0; i < barisA; i++) {
                    for (int j = 0; j < kolomA; j++) {
                        hasilPengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
                    }
                }
                System.out.println("\n===== Hasil pengurangan matriks =====");
                System.out.println();
                for(int i = 0; i < barisA; i++){
                    System.out.print("|");
                    for(int j = 0; j < kolomA; j++) {
                        System.out.print(" " + matriksA[i][j]);
                    }
                    System.out.print("|  -  |");
                    for(int j = 0; j < kolomB; j++){
                        System.out.print(" " + matriksB[i][j]);
                    }
                    System.out.print("|  =  |");
                    for(int j = 0; j < kolomA; j++){
                        System.out.print(" " + hasilPengurangan[i][j]);
                    }
                    System.out.print("|");
                    System.out.println();
                }
            }
        } else {
            System.out.println();
            System.out.println("===== INPUTAN BARIS DAN KOLOM TIDAK SESUAI !!! =====");
            System.out.println();
        }
    }
    public static void Perkalian() {
        if (kolomA != barisB) {
            System.out.println();
            System.out.println("===== BARIS DAN KOLOM TIDAK MEMENUHI SYARAT =====");
            System.out.println();
            return;
        }
        hasilPerkalian = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                hasilPerkalian[i][j] = 0;
                for (int k = 0; k < kolomA; k++) {
                    hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        System.out.println("\nHasil perkalian matriks:");
        System.out.println();
        for (int i = 0; i < barisA; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolomB; j++) {
                System.out.print(hasilPerkalian[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }
    public static void hitungInvers(){
        System.out.println("-- ordo matriks yang tersedia --");
        System.out.println("1. ordo 2x2");
        System.out.println("2. ordo 3x3");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        double[][] invers2x2 = new double[2][2];
        double[][] invers3x3 = new double[3][3];
        if (pilih == 1) {
            System.out.println("\nMasukkan nilai matriks :");
            for (int i = 0; i < matriks2x2.length; i++) {
                for (int j = 0; j < matriks2x2[i].length; j++) {
                    System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriks2x2[i][j] = input.nextInt();
                }
            }
            double det = matriks2x2[0][0] * matriks2x2[1][1] - matriks2x2[0][1] * matriks2x2[1][0];
            if (det == 0) {
                System.out.println("Determinan = " + det);
                System.out.println("Matriks tidak memiliki invers.");
            } else {
                System.out.println("Determinan = " + det);
                invers2x2[0][0] = matriks2x2[1][1] / det;
                invers2x2[0][1] = -matriks2x2[0][1] / det;
                invers2x2[1][0] = -matriks2x2[1][0] / det;
                invers2x2[1][1] = matriks2x2[0][0] / det;
            }
        } else if (pilih == 2) {
            System.out.println("\nMasukkan nilai matriks :");
            for (int i = 0; i < matriks3x3.length; i++) {
                for (int j = 0; j < matriks3x3[i].length; j++) {
                    System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriks3x3[i][j] = input.nextInt();
                }
            }
            int det = matriks3x3[0][0] * matriks3x3[1][1] * matriks3x3[2][2]
                + matriks3x3[0][1] * matriks3x3[1][2] * matriks3x3[2][0]
                + matriks3x3[0][2] * matriks3x3[1][0] * matriks3x3[2][1]
                - matriks3x3[0][2] * matriks3x3[1][1] * matriks3x3[2][0]
                - matriks3x3[0][1] * matriks3x3[1][0] * matriks3x3[2][2]
                - matriks3x3[0][0] * matriks3x3[1][2] * matriks3x3[2][1];
                if (det == 0) {
                    System.out.println("Determinan = " + det);
                    System.out.println("Matriks tidak memiliki invers.");
                }else {
                    invers3x3[0][0] = (matriks3x3[1][1]*matriks3x3[2][2]-matriks3x3[1][2]*matriks3x3[2][1])*1/det;
                    invers3x3[0][1] = -(matriks3x3[1][0]*matriks3x3[2][2]-matriks3x3[1][2]*matriks3x3[2][0])*1/det;
                    invers3x3[0][2] = (matriks3x3[1][0]*matriks3x3[2][1]-matriks3x3[1][1]*matriks3x3[2][0])*1/det;
                    invers3x3[1][0] = -(matriks3x3[0][1]*matriks3x3[2][2]-matriks3x3[0][2]*matriks3x3[2][1])*1/det;
                    invers3x3[1][1] = (matriks3x3[0][0]*matriks3x3[2][2]-matriks3x3[0][2]*matriks3x3[2][0])*1/det;
                    invers3x3[1][2] = -(matriks3x3[0][0]*matriks3x3[2][1]-matriks3x3[0][1]*matriks3x3[2][0])*1/det;
                    invers3x3[2][0] = (matriks3x3[0][1]*matriks3x3[1][2]-matriks3x3[0][2]*matriks3x3[1][1])*1/det;
                    invers3x3[2][1] = -(matriks3x3[0][0]*matriks3x3[1][2]-matriks3x3[0][2]*matriks3x3[1][0])*1/det;
                    invers3x3[2][2] = (matriks3x3[0][0]*matriks3x3[1][1]-matriks3x3[0][1]*matriks3x3[1][0])*1/det;
                    System.out.println("Determinan = " + det);
                }
        } else {
            System.out.println("Ordo matriks tidak valid.");
        }
        // Tampilkan invers
        if (pilih == 1) {
            System.out.println("Matriks invers:");
            for (int i = 0; i < invers2x2.length; i++) {
                System.out.print( "| ");
                for (int j = 0; j < invers2x2[i].length; j++) {
                    System.out.print(invers2x2[i][j] + "  ");
                }
                System.out.print("|");
                System.out.println("\n");
            }
        } else if (pilih == 2) {
            System.out.println("Matriks invers:");
            for (int i = 0; i < invers3x3.length; i++) {
                System.out.print( "| ");
                for (int j = 0; j < invers3x3[i].length; j++) {
                    System.out.print(invers3x3[i][j] + "  ");
                }
                System.out.print("|"); 
            }System.out.println("\n");
        }  
    }
    public static void transposeMatriks() {
        System.out.println("\n--- Matriks sebelum ditranspose ---");
        for (int i = 0; i < barisA; i++) {
            System.out.print( "\n| ");
            for (int j = 0; j < kolomA; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("\n--- Matriks setelah ditranspose ---");
        int barisX = kolomA;
        kolomA = barisA;
        barisA = barisX;
        int[][] transpose = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                transpose[i][j] = matriksA[j][i];
            }
        }
        matriksA = transpose;
        for (int i = 0; i < barisA; i++) {
            System.out.print( "\n| ");
            for (int j = 0; j < kolomA; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.print("|");
        }
        System.out.println("\n");
    }
}