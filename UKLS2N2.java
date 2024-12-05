import java.util.Scanner;

public class UKLS2N2 {
    public static double volume(double jarijari, double tinggi) {
        double PI = 3.14;
        return PI * jarijari * jarijari * tinggi;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double jarijari = 0, tinggi = 0;
        double PI = 3.14;

        System.out.println("masukkan jari-jari: ");
        jarijari = s.nextDouble();
        System.out.println("masukkan tinggi:");
        tinggi = s.nextDouble();
        volume(jarijari, tinggi);
        System.out.println(volume(jarijari, tinggi));
        
    }
}
// volume = PI* jarijari * jarijari * tinggi;
// System.out.println(volume);
// double volume = volume(jarijari, tinggi);
// System.out.println("volume tabung dengan jari jari " + jarijari + "dan tinggi
// " + tinggi + " adalah: " + volume);