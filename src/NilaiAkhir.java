import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

System.out.print("Nilai Praktikum : ");
int praktikum = input.nextInt();

System.out.print("Nilai Tugas : ");
int tugas = input.nextInt();

System.out.print("Nilai MID : ");
int mid = input.nextInt();

System.out.print("Nilai Final : ");
int nfinal = input.nextInt();

int akhir = praktikum * 30 / 100 + tugas * 20 / 100 + mid * 20 / 100 + nfinal * 30 / 100;
// Hasilnya 78, bukan 79.1 — karena semua variabel bertipe int, setiap pembagian (/) langsung dibulatkan ke bawah sebelum dijumlahkan

int potong = (int) akhir;
int dibulatkan = (int) Math.round(akhir);
double selisih = dibulatkan-akhir;
boolean lulus = akhir >= 60;

        System.out.println();
        System.out.println("==== NILAI AKHIR ====");
        System.out.println("Praktikum : " + praktikum);
        System.out.println("Tugas : " + tugas);
        System.out.println("MID : " + mid);
        System.out.println("final : " + nfinal);
        System.out.println("Nilai akhir : " + akhir);
        System.out.println("Dipotong (int) : " + potong);
        System.out.println("Dibulatkan (round) : " + dibulatkan);
        System.out.println("Selisih : " + selisih);
        System.out.println("Lulus >= 60 : " + lulus);
    }
}