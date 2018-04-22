
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anthony
 */
public class fixChatBot {

    LinkedList<String> dataUser = new LinkedList<>();

    public String cek(String x) {
        String ayey;
        int panjangList = dataUser.size();
        for (String data : dataUser) {
            if (dataUser.contains(x)) {
//                ayey =
            }
        }
        return "asa";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String fixNama;
        int temp = r.nextInt(4);
        HashMap dataUser = new HashMap();

        String pertanyaan = "";
        LinkedList<String> openingQ = new LinkedList<>();
        openingQ.add("Lagi ngapain nih ?");
        openingQ.add("Udah makan belom ?");
        openingQ.add("Kamu lagi dimana ?");
        openingQ.add("Gimana hari ini ?");

        LinkedList<String> randomQ = new LinkedList<>();
        randomQ.add("Kamu suka makanan apa ?");                             //udah
        randomQ.add("Kamu tinggal dimana ?");                               //udah
        randomQ.add("Kamu udah pernah pergi ke Lembang ?");
        randomQ.add("Apa hobimu ?");                                        //udh
        randomQ.add("Kamu sekarang lagi sama siapa ?");
        randomQ.add("Kamu berapa bersaudara ?");                            //udah
        randomQ.add("Masih sekolah atau udah kuliah ?");
        randomQ.add("Ohh. . ");
        randomQ.add("Bagaimana cuaca disana ?");
        randomQ.add("Kamu lagi apa ?");
        randomQ.add("Kamu dari kota mana ?");
        randomQ.add("Kamu tinggal sama siapa ?");

        System.out.println("Vinny : Hai, nama saya Vinny, Siapa nama kamu ?");
        System.out.print("User : ");
        String namaUser = s.nextLine();
        namaUser = namaUser.trim();
        String[] printNama = namaUser.split("\\s+");
        fixNama = printNama[printNama.length - 1];
        if (namaUser.split(".").length == 1 || namaUser.split(",").length == 1) {
            System.out.println("Vinny : Hai " + fixNama + " " + openingQ.get(
                    temp));
            System.out.print(fixNama + " : ");
            pertanyaan = s.nextLine();
        }
        int count = 0;
        int count2 = 0;
        while (!pertanyaan.toLowerCase().contains("bye")) {
            if (randomQ.size() < 1) {
                break;
            }
            int temp2 = r.nextInt(randomQ.size());
            String respon = "";
            if (pertanyaan.endsWith("?")) {
                if (pertanyaan.toLowerCase().contains("siapa")) {
                    count2++;
                    if (pertanyaan.toLowerCase().contains("kamu")) {
                        if (pertanyaan.toLowerCase().contains("nama")) {//untuk klo nanya nama botnya lagi.
                            respon
                                    = "Kan dah kubilang tadi namaku Vinny. Gimana sih? Koq bisa lupa? ";
                        } else if (pertanyaan.toLowerCase().contains("sama")) {
                            respon = "Ihh. . . Kepo banget sihh. . .";
                        } else if (pertanyaan.toLowerCase().contains("tinggal")) {
                            respon = "Mau tau aja. . .";
                        }
                    } else {
                        respon = "jawaban tidak tersedia";
                    }
                    if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                            toLowerCase().contains("aku")) {
                        //nanya buat ke user
                    } else {
                        //nanya buat ke si bot
                    }
                } else if (pertanyaan.toLowerCase().contains("mengapa")
                        || pertanyaan.toLowerCase().contains("kenapa")) {
                    count2++;
                    if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                            toLowerCase().contains("aku")) {
                        //nanya buat user
                        if (pertanyaan.toLowerCase().contains("sedih")) {
                            respon = "ihhhhh kasian, sini ditemenin";
                        } else if (pertanyaan.toLowerCase().contains("senang")) {
                            respon = "karena ada akuuuuu";
                        }
                    } else if (pertanyaan.toLowerCase().
                            contains("ga enak badan")) {
                        respon = "iya kemaren telat makan";
                    } else {
                        //nanya buat si bot
                        if (pertanyaan.toLowerCase().contains("sedih")) {
                            respon = "iya lagi bete sama temen aku";
                        } else if (pertanyaan.toLowerCase().contains("senang")) {
                            respon = "ih kepo ... :P";
                        }
                    }
                } else if (pertanyaan.toLowerCase().contains("darimana")) {
                    count2++;
                    if (pertanyaan.toLowerCase().contains("kamu")) {
                        //nanya buat user
                        respon = "aku abis dari curve";
                    }
                } else if (pertanyaan.toLowerCase().contains("kapan")) {
                    count2++;
                    if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                            toLowerCase().contains("aku")) {
                        //nanya buat user
                    } else {
                        //nanya buat si bot
                    }
                } else if (pertanyaan.toLowerCase().contains("dimana")) {
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
                            respon
                                    = "Rumahku di Jalan Surya Sumantri 65 Bandung";
                        }
                    }
                } else if (pertanyaan.toLowerCase().contains("bagaimana")
                        || pertanyaan.toLowerCase().contains("gimana")) {
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
                } else if (pertanyaan.toLowerCase().contains("apa")) {
                    count2++;
                    if (pertanyaan.toLowerCase().contains("saya") || pertanyaan.
                            toLowerCase().contains("aku")) {
                        //nanya buat user
                    } else if (pertanyaan.toLowerCase().contains("kamu")) {
                        //nanya buat si bot
                        if (pertanyaan.toLowerCase().contains("lagi")
                                || pertanyaan.
                                        toLowerCase().contains("sedang")) {
                            respon = "Lagi chat sama kamu.";
                        } else if (pertanyaan.toLowerCase().contains("suka")) {
                            respon = "Hmmm. . . Suka kamu. . .";
                        } else if (pertanyaan.toLowerCase().contains(
                                "bersaudara")) {
                            respon
                                    = "Kalo aku anak tunggal tapi aku punya 3 ayah 1 ibu";
                            count2++;
                        }
                    }
                }
            } else {//bukan kata tanya
                count++;
                if (pertanyaan.toLowerCase().contains("maaf")) {//untuk klo minta maaf.
                    respon = "Iya dimaafin. Jangan diulangin lagi ya. Btw, "
                            + randomQ.remove(temp2);
                } else if (pertanyaan.toLowerCase().contains("lagi")) {
                    if (pertanyaan.toLowerCase().contains("di ")) {
                        respon = "lagi ngapain?";
                    } else {
                        respon = "Semangat yah ...";
                    }
                } else if (pertanyaan.toLowerCase().contains("makan")) {
                    respon = "kok ga ngajak-ngajak sih ...";
                } else if (pertanyaan.toLowerCase().contains("regina")) {
                    respon = "ya?";
                } else {
                    respon = randomQ.remove(temp2);
                }
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////////////////
            if (count2 == 3) {
                respon = respon + ", " + randomQ.remove(temp2);
                System.out.println("Vinny : " + respon);
                count2 = 0;
            } else {
                if (count == 3) {
                    System.out.println(
                            "Vinny : Ohh. . . Koq aku terus yang nanya sih, kamu atuh yang nanya .");
                    count = 0;
                } else {
                    System.out.println("Vinny : " + respon);
                    if (respon != "" && respon != null) {
                        if (respon.toLowerCase().contains("cuaca")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            if (pertanyaan.toLowerCase().contains("bye")) {
                                break;
                            } else if (pertanyaan.toLowerCase().
                                    contains("cerah")) {
                                System.out.println(
                                        "Vinny : secerah wajah kamu ya??");;
                            } else if (pertanyaan.toLowerCase().contains(
                                    "mendung")) {
                                System.out.println(
                                        "Vinny : Semoga hati kamu ga ikut mendung ya. . .");
                            } else if (pertanyaan.toLowerCase().contains(
                                    "gerimis")) {
                                System.out.println(
                                        "Vinny : Kalau mau keluar, bawa payung ya "
                                        + fixNama
                                        + ", klo ga nanti kamu sakit. .");
                            } else if (pertanyaan.toLowerCase().
                                    contains("hujan")) {
                                System.out.println(
                                        "Vinny : Semoga cepat reda biar kita cepat ketemu^_^");
                            } else {
                                System.out.println(
                                        "Vinny : Cuaca macam apa itu?");
                            }
                        } else if (respon.toLowerCase().contains("kuliah")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            if (pertanyaan.toLowerCase().contains("bye")) {
                                break;
                            } else if (pertanyaan.toLowerCase().contains(
                                    "jurusan")) {
                                System.out.println(
                                        "Vinny : Wiii keren aku juga mau masuk jurusan itu");
                            } else if (pertanyaan.toLowerCase().contains(
                                    "sekolah")) {
                                System.out.println(
                                        "Vinny : Kamu ternyata masih muda yahhhh");
                            } else {
                                System.out.println("Vinny : Ohh...");
                            }
                        } else if (respon.toLowerCase().contains("lembang")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            if (pertanyaan.toLowerCase().contains("bye")) {
                                break;
                            } else if (pertanyaan.toLowerCase().contains(
                                    "ayo pergi")) {
                                System.out.println(
                                        "Vinny : Yu pergi bareng, katanya disana bagus pemandangan ");
                            } else if (pertanyaan.toLowerCase().
                                    contains("bosen")) {
                                System.out.println(
                                        "Vinny : Ya udh kamu maunya kemana?");
                            } else {
                                System.out.println("Vinny : Ohh. . .");
                            }
                        } else if (respon.toLowerCase().contains(
                                "tinggal dimana")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            int Ialamat = pertanyaan.indexOf("tinggal");
                            Ialamat += 8;
                            String alamat = pertanyaan.substring(Ialamat,
                                    pertanyaan.length());

                            dataUser.put("Alamat", fixNama + ", kamu tinggal "
                                    + alamat);
                            if (pertanyaan.toLowerCase().contains("bye")) {
                                break;
                            } else if (pertanyaan.toLowerCase().contains("hati")) {
                                System.out.println(
                                        "Vinny : Ihh... masa baru kenal udah digombalin sih.");
                            } else if (pertanyaan.toLowerCase().contains(
                                    "kalau kamu") || pertanyaan.toLowerCase().
                                            contains("kalo kamu")) {
                                System.out.println(
                                        "Vinny : Rumahku di Jalan Surya Sumantri 65 Bandung");
                            } else if (pertanyaan.toLowerCase().contains(
                                    "kepo")) {
                                System.out.println(
                                        "Vinny : Yaudah deh klo gamau ngasih tau. "
                                        + randomQ.remove(temp2));
                            } else {
                                System.out.println("Vinny : Ohh...");
                            }
                        } else if (respon.toLowerCase().contains(
                                "bersaudara")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            String bersaudara = "Anak tunggal";
                            if (!pertanyaan.toLowerCase().contains("tunggal")) {
                                int Ibersaudara = pertanyaan.indexOf(
                                        "bersaudara");
                                Ibersaudara -= 3;
                                bersaudara = pertanyaan.substring(Ibersaudara,
                                        pertanyaan.length());
                            }

                            dataUser.put("Bersaudara", fixNama + ", kamu itu "
                                    + bersaudara.trim());
                        } else if (respon.toLowerCase().contains(
                                "suka makanan")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            int Imakan = pertanyaan.indexOf("makan");
                            String Makan = pertanyaan.substring(Imakan,
                                    pertanyaan.length());

                            dataUser.put("Makan", fixNama + ", kamu suka "
                                    + Makan.trim());
                        } else if (respon.toLowerCase().contains(
                                "hobimu")) {
                            System.out.print(fixNama + " : ");
                            pertanyaan = s.nextLine();
                            int Imakan = pertanyaan.indexOf("saya");
                            Imakan += 5;
                            String Hobi = pertanyaan.substring(Imakan,
                                    pertanyaan.length());

                            dataUser.put("Hobi", fixNama + ", kamu punya hobi "
                                    + Hobi.trim());
                        }
                    }
                }
                //randomQ.remove(temp2);
            }
            System.out.print(fixNama + " : ");
            pertanyaan = s.nextLine();
//            dataUser.add(pertanyaan);
        }
        System.out.println("Vinny : Ok deh. Makasih dah nemenin aku ya. Bye.");
        System.out.println("Vinny : Vinny telah meninggalkan ruang obrolan");
        s.close();

    }
}
