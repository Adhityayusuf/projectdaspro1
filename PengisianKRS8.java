import java.util.Scanner;

public class PengisianKRS8 {
    static Scanner input = new Scanner(System.in);
    static String[][] dataMahasiswa = new String[123][5]; // 123 itu untuk mhsiswa yg input lebuh dri 1 
    static int jumlahMahasiswa = 0;
    static int jumlahsks[] = new int [123];
    public static void main(String[] args) {
        // buat nyimpen data Krs
        
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
                tampilData();
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
        int sks;
        int jmlsks = 0;
       
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
        sks = input.nextInt();
        if (sks >= 1 || sks <= 3) {
            System.out.println("Data mata kuliah berhasil ditambahkan!");
        } else {
            return;
        }
        System.out.print("Tambah mata kuliah? (y/t) : ");
        lanjut = input.next();
        input.nextLine();
        
        // ini buat masukin data ke array
        data[jumlah][0] = nama;
        data[jumlah][1] = nim;
        data[jumlah][2] = kodeMK;
        data[jumlah][3] = namaMK;
        data[jumlah][4] = String.valueOf(sks); // ini buat ngubah data sks dari int ke string
        jumlahsks[jumlah] = sks;
        jmlsks += sks;
        jumlah++;
        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("Total SKS yang diambil : "+jmlsks);
        System.out.println("\n-----------------------------");
    }
    public static void tampilData(){
        System.out.println("--- Tampilkan Daftar KRS Mahasiswa ---");
        input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = input.nextLine();
        System.out.println();
        System.out.println("Daftar KRS : ");
        int jmlsks = 0;
    
        System.out.print("NIM");
        System.out.print("\tNama");
        System.out.print("\t\tKode MK");
        System.out.print("\t\tNama Mata Kuliah");
        System.out.println("\t\tSKS");
        for (int i = 0; i < dataMahasiswa.length; i++ ){
            if(nim.equalsIgnoreCase(dataMahasiswa[i][1])){
            System.err.println(dataMahasiswa[i][0] +"\t"+ dataMahasiswa[i][1] +"\t\t"+ dataMahasiswa[i][2] +"\t\t"+ dataMahasiswa[i][3] +"\t\t\t\t"+ dataMahasiswa[i][4]);
            jmlsks += jumlahsks[i];
            }
        }
        System.out.println("Total SKS : " + jmlsks);
    }
}