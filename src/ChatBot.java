
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ChatBot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nama = s.next();
        String buatberes = "selamat tinggal";
        String buatberes2 = "dadah";
        String pertanyaan = "";
        while (!pertanyaan.equals(buatberes) || !pertanyaan.equals(buatberes2)) {
            System.out.print(nama+" : ");
            pertanyaan=s.next();
            String[] hasilsplit= pertanyaan.split(" ");
            if(hasilsplit[0].toLowerCase().equals("siapa")){
                
            }
            else if(hasilsplit[0].toLowerCase().equals("apa")){
                
            }
            else if(hasilsplit[0].toLowerCase().equals("kapan")){
                
            }
            else if(hasilsplit[0].toLowerCase().equals("dimana")){
                
            }
            else if(hasilsplit[0].toLowerCase().equals("mengapa")){
                
            }
            else if(hasilsplit[0].toLowerCase().equals("bagaimana")){
                
            }
        }
    }
}
