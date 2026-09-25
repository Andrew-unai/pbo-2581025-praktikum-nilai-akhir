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
    }
}