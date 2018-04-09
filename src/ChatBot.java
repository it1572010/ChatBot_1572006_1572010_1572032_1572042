
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ChatBot {

    public String siapaNama(String subjek) {
        String hasil = "";

        return hasil;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int temp = r.nextInt(4);
        int temp2 = r.nextInt(4);
        String buatberes = "selamat tinggal";
        String pertanyaan = "";

        String[] openingQ = new String[4];
        openingQ[0] = "Lagi ngapain nih ?";
        openingQ[1] = "Udah makan belom ?";
        openingQ[2] = "Kamu lagi dimana ?";
        openingQ[3] = "Gimana hari ini ?";

        String[] randomQ = new String[5];
        randomQ[0] = "Kamu suka makanan apa?";
        randomQ[1] = "Kamu tinggal dimana?";
        randomQ[2] = "Siapa artis favoritmu?";
        randomQ[3] = "Apa hobimu?";
        randomQ[4] = "Kamu berapa bersaudara?";

        System.out.println("Regina : Hai, nama saya Regina, Siapa nama kamu ?");
        String nama = s.nextLine();
        nama = nama.trim();
        String[] printnama = nama.split("\\s+");
        if (nama.split(".").length == 1 || nama.split(",").length == 1) {
            System.out.println("Regina : Hai " + printnama[printnama.length - 1] + " " + openingQ[temp]);
            pertanyaan = s.nextLine();
        }

        pertanyaan = nama;
        while (!pertanyaan.toLowerCase().contains(buatberes)) {
            String[] hasilsplit = pertanyaan.split(" ");
            String respon = ". . .";
            if (pertanyaan.toLowerCase().contains("siapa")) {
                System.out.println("masuk ke siapa");
                if (pertanyaan.toLowerCase().contains("nama")) {                    //untuk klo nanya nama botnya lagi.
                    respon = "Kan dah kubilang tadi namaku Regina. Gimana sih? Koq bisa lupa? ";
                }
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
            } else if (pertanyaan.toLowerCase().contains("maaf")) {                 //untuk klo minta maaf.
                respon = "Iya dimaafin. Jangan diulangin lagi ya. Btw, "+ randomQ[temp2];
            } else {
                respon = "Regina : Maaf aku ga ngerti maksud kamu. Coba ulangi lagi dong.";
            }
            System.out.println(respon);
            pertanyaan = s.nextLine();
        }
        System.out.println("Ok deh. Makasih dah nemenin aku ya. Bye.");
    }
}
