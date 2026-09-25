import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double BOBOT_PRAKTIKUM = 0.30 , BOBOT_TUGAS =  0.20 , BOBOT_MID = 0.20 ,
                BOBOT_FINAL = 0.30;

System.out.print("Nilai Praktikum : ");
double praktikum = input.nextDouble();

System.out.print("Nilai Tugas : ");
double tugas = input.nextDouble();

System.out.print("Nilai MID : ");
double mid = input.nextDouble();

System.out.print("Nilai Final : ");
double nfinal = input.nextDouble();

double akhir = praktikum*BOBOT_PRAKTIKUM + tugas*BOBOT_TUGAS + mid*BOBOT_MID + nfinal*BOBOT_FINAL;

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