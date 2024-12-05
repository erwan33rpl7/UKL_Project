import java.util.Random;
import java.util.Scanner;

public class UKLS2N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;
        while (lanjut) {
            int bilanganPertama = random.nextInt(10) + 1; // Bilangan acak antara 1 dan 10
            int bilanganKedua = random.nextInt(10) + 1; // Bilangan acak antara 1 dan 10
            int operator = random.nextInt(3); // 0 untuk *, 1 untuk /, 2 untuk %
            System.out.print(bilanganPertama + " ");
            switch (operator) {
                case 0:
                    System.out.print("* ");
                    break;
                case 1:
                    System.out.print("/ ");
                    break;
                case 2:
                    System.out.print("% ");
                    break;
            }
            System.out.print(bilanganKedua + " = ");
            double jawabanUser = scanner.nextDouble();
            double jawabanBenar = 0;
            switch (operator) {
                case 0:
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case 1:
                    jawabanBenar = (double) bilanganPertama / bilanganKedua;
                    break;
                case 2:
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
            }
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban benar!");
            } else {
                System.out.println("Jawaban salah. Jawaban yang benar adalah " + jawabanBenar);
            }
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String jawabanLanjut = scanner.next();
            if (jawabanLanjut.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }
        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}

