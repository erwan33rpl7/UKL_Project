import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;

public class UKLS3N3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = s.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        int[] frekuensi = new int[100];
        for (int i = 0; i < n; i++) {
            frekuensi[array[i]]++;
        }

        System.out.println("Frekuensi setiap elemen dalam array:");
        for (int i = 0; i < frekuensi.length; i++) {
            if (frekuensi[i] > 0) {
                System.out.println("Elemen " + i + " muncul " + frekuensi[i] + " kali.");
                
            } 
        }
            // Map<Integer, Integer> frekuensi = new HashMap<>();
              // for (int num : array) {
              // if (frekuensi.containsKey(num)) {
              // frekuensi.put(num, frekuensi.get(num) + 1);
              // } else {
              // frekuensi.put(num, 1);
              //w}
              // }
              // System.out.println("Frekuensi setiap elemen dalam array:");
              // for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
              // System.out.println("Elemen " + entry.getKey() + " muncul " + entry.getValue()
              // + " kali.");
              // }
        
    }
}