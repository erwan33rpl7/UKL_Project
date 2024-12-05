import java.util.Scanner;

public class UKLS1N3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nawal, nakhir;

        System.out.println("nilai awal: ");
        nawal = s.nextInt();
        System.out.println("masukkan nilai akhir: ");
        nakhir = s.nextInt();
        for (int i = nakhir; i > nawal; i--) {
            if (i % 3 == 0) {
                System.out.println(i+".saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i+".saya anak moklet");
            } else {
                System.out.println(i+".saya anak wikusama");
            }
        }
        System.out.println("1.saya senang");
    }
}
