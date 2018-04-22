
import java.util.LinkedList;
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
        String buatberes = "selamat tinggal";
        String pertanyaan = "";

        LinkedList<String> openingQ = new LinkedList<>();
//        String[] openingQ = new String[4];
        openingQ.add("Lagi ngapain nih ?");
        openingQ.add("Udah makan belom ?");
        openingQ.add("Kamu lagi dimana ?");
        openingQ.add("Gimana hari ini ?");
//        openingQ[0] = "Lagi ngapain nih ?";
//        openingQ[1] = "Udah makan belom ?";
//        openingQ[2] = "Kamu lagi dimana ?";
//        openingQ[3] = "Gimana hari ini ?";
        LinkedList<String> randomQ = new LinkedList<>();
        randomQ.add("Kamu suka makanan apa ?");
        randomQ.add("Kamu tinggal dimana ?");
        randomQ.add("Kamu udah pernah pergi ke Lembang ?");
        randomQ.add("Apa hobimu ?");
        randomQ.add("Kamu berapa bersaudara ?");
        randomQ.add("Kamu masih sekolah atau sudah kuliah ?");
        randomQ.add("Ohh. . ");
        randomQ.add("Bagaimana cuaca disana?");
//        String[] randomQ = new String[8];
//        randomQ[0] = "Kamu suka makanan apa ?";
//        randomQ[1] = "Kamu tinggal dimana ?";
//        randomQ[2] = "Kamu udah pernah pergi ke Lembang ?";
//        randomQ[3] = "Apa hobimu ?";
//        randomQ[4] = "Kamu berapa bersaudara ?";
//        randomQ[5] = "Kamu masih sekolah atau sudah kuliah ?";
//        randomQ[6] = "Ohh. . ";
//        randomQ[7] = "Bagaimana cuaca disana?";

        System.out.println("Regina : Hai, nama saya Regina, Siapa nama kamu ?");
        System.out.print("User : ");
        String nama = s.nextLine();
        String fixnama;
        nama = nama.trim();
        String[] printnama = nama.split("\\s+");
        //nama user
        fixnama = printnama[printnama.length - 1];
        if (nama.split(".").length == 1 || nama.split(",").length == 1) {
            System.out.println("Regina : Hai " + fixnama + " " + openingQ.get(
                    temp));
            System.out.print(fixnama + " : ");
            pertanyaan = s.nextLine();
        }
        int count = 0;
        int count2 = 0;
        // pertanyaan = nama;
        while (!pertanyaan.toLowerCase().contains(buatberes)) {
            if (randomQ.size() == 0) {
                System.out.println("Aduh aku ngantuk, tidur dulu yahh");
                System.out.println("Regina Has Left The Chat");
                break;
            }
            int temp2 = r.nextInt(randomQ.size() - 1);
            String respon = "";
            if (pertanyaan.toLowerCase().contains("siapa")) {
                System.out.println("masuk ke siapa");
                count2++;
                if (pertanyaan.toLowerCase().contains("kamu")) {
                    if (pertanyaan.toLowerCase().contains("nama")) {//untuk klo nanya nama botnya lagi.
                        respon
                                = "Kan dah kubilang tadi namaku Regina. Gimana sih? Koq bisa lupa? ";
                    } else if (pertanyaan.toLowerCase().contains("sama")) {
                        respon = "Ihh. . . Kepo banget sihh. . .";
                    } else if (pertanyaan.toLowerCase().contains("tinggal")) {
                        respon = "Mau tau aja. . .";
                    }
                } else {

                }
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat ke user
                } else {
                    //nanya buat ke si bot
                }
            } else if (pertanyaan.toLowerCase().contains("darimana")) {
                count2++;
                if (pertanyaan.toLowerCase().contains("kamu")) {
                    //nanya buat user
                    respon = "aku abis dari curve";
                }
            } else if (pertanyaan.toLowerCase().contains("kapan")) {
                System.out.println("masuk ke kapan");
                count2++;
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat user
                } else {
                    //nanya buat si bot
                }
            } else if (pertanyaan.toLowerCase().contains("dimana")) {
                System.out.println("masuk ke dimana");
                count2++;
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat user
                    respon = "iih kan ga tau kan lagi ga bareng";
                } else if (pertanyaan.toLowerCase().contains("kamu")) {
                    //nanya buat si bot
                    if (pertanyaan.toLowerCase().contains("lagi")) {
                        respon = "Di. . hatimu. . .";
                    } else if (pertanyaan.toLowerCase().contains("rumah")
                            || pertanyaan.toLowerCase().contains("tinggal")) {
                        respon = "Rumahku di Jalan Surya Sumantri 65 Bandung";
                    }
                }
            } else if (pertanyaan.toLowerCase().contains("mengapa")
                    || pertanyaan.toLowerCase().contains("kenapa")) {
                System.out.println("masuk ke mengapa");
                count2++;
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat user
                    if (pertanyaan.toLowerCase().contains("sedih")) {
                        respon = "ihhhhh kasian, sini ditemenin";
                    } else if (pertanyaan.toLowerCase().contains("senang")) {
                        respon = "karena ada akuuuuu";
                    }
                } else if (pertanyaan.toLowerCase().contains("ga enak badan")) {
                    respon = "iya kemaren telat makan";
                } else {
                    //nanya buat si bot
                    if (pertanyaan.toLowerCase().contains("sedih")) {
                        respon = "iya lagi bete sama temen aku";
                    } else if (pertanyaan.toLowerCase().contains("senang")) {
                        respon = "ih kepo ... :P";
                    }
                }
            } else if (pertanyaan.toLowerCase().contains("bagaimana")
                    || pertanyaan.toLowerCase().contains("gimana")) {
                System.out.println("masuk ke bagaimana");
                count2++;
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat user
                } else {
                    if (pertanyaan.toLowerCase().contains("keadaan")
                            || pertanyaan.toLowerCase().contains("kondisi")) {
                        respon = "ga enak badan nihhhhh";
                    }
                }
            } else if (pertanyaan.toLowerCase().contains("bersaudara")) {
                respon = "Kalo aku anak tunggal tapi aku punya 3 ayah 1 ibu";
                count2++;
            } else if (pertanyaan.toLowerCase().contains("apa")) {
                System.out.println("masuk ke apa");
                count2++;
                if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                        toLowerCase().contains("aku")) {
                    //nanya buat user
                } else if (pertanyaan.toLowerCase().contains("kamu")) {
                    //nanya buat si bot
                    if (pertanyaan.toLowerCase().contains("lagi") || pertanyaan.
                            toLowerCase().contains("sedang")) {
                        respon = "Lagi chat sama kamu.";
                    } else if (pertanyaan.toLowerCase().contains("suka")) {
                        respon = "Hmmm. . . Suka kamu. . .";
                    }
                }
            } else if (pertanyaan.toLowerCase().contains("maaf")) {                 //untuk klo minta maaf.
                respon = "Iya dimaafin. Jangan diulangin lagi ya. Btw, "
                        + randomQ.remove(temp2);
            } else if (pertanyaan.toLowerCase().contains("lagi")) {
                respon = "Semangat yah ...";
            } else if (pertanyaan.toLowerCase().contains("makan")) {
                respon = "kok ga ngajak-ngajak sih ...";
            } else if (pertanyaan.toLowerCase().contains("regina")) {
                respon = "ya?";
            } else {
//                respon = "Regina : Maaf aku ga ngerti maksud kamu. Coba ulangi lagi dong.";
                respon = randomQ.remove(temp2);
            }
            System.out.println("cek size : " + randomQ.size());
            System.out.println("cek random : " + temp2);
//            System.out.println("cek respon : "+respon);

            if (count2 == 3) {
                //System.out.println("Regina : ... ");
                respon = respon + ", " + randomQ.remove(temp2);
                System.out.println("Regina : " + respon);
                count2 = 0;
            } else {
                System.out.println("Regina : " + respon);
                if (respon != "" && respon != null) {
                    if (respon.toLowerCase().contains("cuaca")) {
                        System.out.print(fixnama + " : ");
                        pertanyaan = s.nextLine();
                        if (pertanyaan.toLowerCase().contains("cerah")) {
                            System.out.println(
                                    "Regina : secerah wajah kamu ya??");;
                        } else if (pertanyaan.toLowerCase().contains("mendung")) {
                            System.out.println(
                                    "Regina : Semoga hati kamu ga ikut mendung ya. . .");
                        } else if (pertanyaan.toLowerCase().contains("gerimis")) {
                            System.out.println(
                                    "Regina : Kalau mau keluar, bawa payung ya "
                                    + fixnama + ", klo ga nanti kamu sakit. .");
                        } else if (pertanyaan.toLowerCase().contains("hujan")) {
                            System.out.println(
                                    "Regina : Semoga cepat reda biar kita cepat ketemu^_^");
                        } else {
                            System.out.println("Regina : Cuaca macam apa itu?");
                        }
                    } else if (respon.toLowerCase().contains("kuliah")) {
                        System.out.print(fixnama + " : ");
                        pertanyaan = s.nextLine();
                        if (pertanyaan.toLowerCase().contains("jurusan")) {
                            System.out.println(
                                    "Regina : Wiii keren aku juga mau masuk jurusan itu");
                        } else if (pertanyaan.toLowerCase().contains("sekolah")) {
                            System.out.println(
                                    "Regina : Kamu ternyata masih muda yahhhh");
                        }
                    } else if (respon.toLowerCase().contains("lembang")) {
                        System.out.print(fixnama + " : ");
                        pertanyaan = s.nextLine();
                        if (pertanyaan.toLowerCase().contains("ayo pergi")) {
                            System.out.println(
                                    "Regina : Yu pergi bareng, katanya disana bagus pemandangan ");
                        } else if (pertanyaan.toLowerCase().contains("bosen")) {
                            System.out.println(
                                    "Regina : Ya udh kamu maunya kemana?");
                        }
                    }
                }
                randomQ.remove(temp2);
            }
            System.out.print(fixnama + " : ");
            pertanyaan = s.nextLine();
        }
        System.out.println("Ok deh. Makasih dah nemenin aku ya. Bye.");
    }
}

//Regina : Hai, nama saya Regina, Siapa nama kamu ?
//User : hai nama saya bla
//Regina : Hai bla Gimana hari ini ?
//bla : baik, kalo kamu
//Regina : Kamu suka makanan apa ?
//bla : kok jadi makan ya
//Regina : kok ga ngajak-ngajak sih ...
//bla : emang ga lagi makan
//Regina : Semangat yah ...
//bla : yaudah udah dulu ya
//Regina : Kamu berapa bersaudara ?
//bla : 2
//Regina : Bagaimana cuaca disana?
//bla : exit
//Regina : Kamu berapa bersaudara ?
//bla : 2
//Regina : Ohh. .
//bla : ohh. .
//Regina : Kamu berapa bersaudara ?
//bla : 2
//Regina : Kamu masih sekolah atau sudah kuliah ?
//bla : kuliah kenapa gitu?
//masuk ke mengapa
//bla : ada apa
//masuk ke apa
//bla : tak papa
//masuk ke apa
//bla :
