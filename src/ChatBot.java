
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ChatBot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int temp = r.nextInt(4);
        String buatberes = "selamat tinggal";
        String pertanyaan = "";
        String[] daftarPertanyaan = new String[4];
        daftarPertanyaan[0] = "Lagi ngapain ?";
        daftarPertanyaan[1] = "Udah makan belom ?";
        daftarPertanyaan[2] = "Kamu lagi dimana ?";
        daftarPertanyaan[3] = "Gimana hari ini ?";
//        daftarPertanyaan[4] = "";
//        daftarPertanyaan[5] = "";
//        daftarPertanyaan[6] = "";
//        daftarPertanyaan[7] = "";
//        daftarPertanyaan[8] = "";
//        daftarPertanyaan[9] = "";
        System.out.println("Regina : Hai, nama saya Regina, Siapa nama kamu ?");
        String nama = s.nextLine();
        nama = nama.trim();
        String[] printnama = nama.split("\\s+");
        if (nama.split(".").length == 1 || nama.split(",").length == 1) {
            System.out.println("Regina : Hai " + printnama[printnama.length - 1] + " " + daftarPertanyaan[temp]);
            pertanyaan = s.nextLine();
        }

        pertanyaan = nama;
        while (!pertanyaan.toLowerCase().contains(buatberes)) {
            String[] hasilsplit = pertanyaan.split(" ");
            if (pertanyaan.toLowerCase().contains("siapa")) {
                System.out.println("masuk ke siapa");
            } else if (pertanyaan.toLowerCase().contains("kapan")) {
                System.out.println("masuk ke kapan");
            } else if (pertanyaan.toLowerCase().contains("dimana")) {
                System.out.println("masuk ke dimana");
            } else if (pertanyaan.toLowerCase().contains("mengapa") || pertanyaan.toLowerCase().contains("kenapa")) {
                System.out.println("masuk ke mengapa");
            } else if (pertanyaan.toLowerCase().contains("bagaimana")) {
                System.out.println("masuk ke bagaimana");
            } else if (pertanyaan.toLowerCase().contains("apa")) {
                System.out.println("masuk ke apa");
            } else {
                System.out.println("Regina : Ga tau apa-apa");
            }
            pertanyaan = s.nextLine();
        }
    }
}
