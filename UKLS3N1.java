import java.util.Scanner;

public class UKLS3N1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double nilai,totalnilai=0,ratarata;
        int jumlahsiswa;

        System.out.println("masukkan jumlah siswa: ");
        jumlahsiswa=s.nextInt();
        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.println("masukkan nilai siswa ke "+i +":");
            nilai=s.nextInt();
            totalnilai=totalnilai+nilai;
           
        }
        System.out.println("total nilai keseluruhan adalah: "+totalnilai);
         ratarata=totalnilai/jumlahsiswa;
         System.out.println("rata rata nilai adalah: "+ratarata);
       
    }
}
