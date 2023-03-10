import java.util.Scanner;

public class Main {
    static double min, max, average, ips;
    static int sks_max;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         /*
        Nama    : Jeason Lie
        NPM     : 2024250022
        Kelas   : IF2B
         */

        IdentitasMahasiswa identitasMahasiswa = new IdentitasMahasiswa();
        System.out.print("Nama : ");
        identitasMahasiswa.Nama = scanner.nextLine();
        System.out.print("NPM : ");
        identitasMahasiswa.NPM = scanner.nextLine();
        MKNilai[] mkNilai = new MKNilai[5];

        for (int i = 0; i < mkNilai.length; i++) {
            mkNilai[i] = new MKNilai();
            scanner.nextLine();
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.println("--------------------");
            System.out.print("Nama Mata Kuliah : ");
            mkNilai[i].NamaMK = scanner.nextLine();
            System.out.print("Nilai Tugas : ");
            mkNilai[i].NilaiTugas = scanner.nextDouble();
            System.out.print("Nilai Kuis : ");
            mkNilai[i].NilaiKuis = scanner.nextDouble();
            System.out.print("Nilai UTS : ");
            mkNilai[i].NilaiUTS = scanner.nextDouble();
            System.out.print("Nilai UAS : ");
            mkNilai[i].NilaiUAS = scanner.nextDouble();
            System.out.print("Nilai Soft Skill : ");
            mkNilai[i].Softskill = scanner.nextDouble();

            mkNilai[i].nilaiAkhir();
        }
        min(mkNilai);
        max(mkNilai);
        average(mkNilai);
        ips(mkNilai);
        sks_max();

        System.out.println("--------------------");
        System.out.println("===============================================================================================");
        System.out.print("NPM : " + identitasMahasiswa.NPM);
        System.out.print("\tNama : " + identitasMahasiswa.Nama + "\n");
        System.out.println("===============================================================================================");
        System.out.printf("%s%s%s%s%s%s%s%s%s", "No ", "Nama Mata Kuliah ", "Nilai Tugas ", "Nilai Kuis ", "Nilai UTS ", "Nilai UAS ", "Nilai Soft Skill ", "Nilai Akhir ", "Grade\n");
        System.out.println("===============================================================================================");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s%s%s%s%s%s%s%s%s", i + 1, mkNilai[i].NamaMK + " ", mkNilai[i].NilaiTugas + " ", mkNilai[i].NilaiKuis + " ", mkNilai[i].NilaiUTS + " ", mkNilai[i].NilaiUAS + " ", mkNilai[i].Softskill + " ", mkNilai[i].NilaiAkhir + " ", mkNilai[i].Grade + "\n");
        }
        System.out.println("===============================================================================================");
        System.out.println("Nilai akhir terkecil = " + min);
        System.out.println("Nilai akhir terbesar = " + max);
        System.out.println("Rata-rata na akhir = " + average);
        System.out.println("===============================================================================================");
        System.out.println("Indeks Prestasi Semester = " + ips);
        System.out.println("Jumlah SKS yang dapat diambil di semester depan = " + sks_max + " sks");
        System.out.println("===============================================================================================");

    }

    static void min(MKNilai[] mkNilai) {
        min = mkNilai[0].NilaiAkhir;
        for (int i = 0; i < mkNilai.length; i++) {
            if (mkNilai[i].NilaiAkhir < min) {
                min = mkNilai[i].NilaiAkhir;
            }
        }
    }

    static void max(MKNilai[] mkNilai) {
        max = mkNilai[0].NilaiAkhir;
        for (int i = 0; i < mkNilai.length; i++) {
            if (mkNilai[i].NilaiAkhir > max) {
                max = mkNilai[i].NilaiAkhir;
            }
        }
    }

    static void average(MKNilai[] mkNilai) {
        double sum = 0;

        for (int i = 0; i < mkNilai.length; i++) {
            sum += mkNilai[i].NilaiAkhir;
        }
        average = (sum / mkNilai.length);
    }

    static void ips(MKNilai[] mkNilai) {
        double sum = 0;

        for (int i = 0; i < mkNilai.length; i++) {
            sum += mkNilai[i].Bobot;
        }
        ips = (sum / mkNilai.length);
    }
    static void sks_max(){
        if (ips >= 3.0) {
            sks_max = 24;
        } else if(ips >=2.5) {
            sks_max = 21;
        } else if(ips >=2.0) {
            sks_max = 18;
        } else if(ips >= 1.5) {
            sks_max = 15;
        } else {
            sks_max = 12;
        }
    }
}