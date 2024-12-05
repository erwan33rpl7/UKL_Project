import java.util.Scanner;

public class UKLS1N2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan nilai: ");
        int nilai = s.nextInt();
        if (nilai % 2 == 0) {
            System.out.println("bilangan tersebut adalah genap");
        } else {
            System.out.println("bilangan tersebut adalah ganjil");
        }
    }
}