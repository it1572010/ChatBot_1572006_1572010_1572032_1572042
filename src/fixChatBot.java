
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class fixChatBot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int temp = r.nextInt(4);
        String pertanyaan = "";                                                 //pertanyaan akan menampung input user
        //HashMap dataUser ini digunakan untuk menampung beberapa data user yang diinput.
        HashMap dataUser = new HashMap();

        //Linkedlist openingQ untuk menampung pertanyaan pembuka percakapan.
        LinkedList<String> openingQ = new LinkedList<>();
        openingQ.add("Lagi ngapain nih ?");
        openingQ.add("Udah makan belom ?");
        openingQ.add("Kamu lagi dimana ?");
        openingQ.add("Gimana hari ini ?");

        //Linkedlist randomQ untuk menampung pertanyaan pembuka percakapan.
        LinkedList<String> randomQ = new LinkedList<>();
        randomQ.add("Kamu suka makanan apa ?");                                 //respon user akan disimpan di dataUser
        randomQ.add("Kamu tinggal dimana ?");                                   //respon user akan disimpan di dataUser
        randomQ.add("Kamu udah pernah pergi ke Lembang ?");
        randomQ.add("Apa hobimu ?");                                            //respon user akan disimpan di dataUser
        randomQ.add("Kamu sekarang lagi sama siapa ?");
        randomQ.add("Kamu berapa bersaudara ?");                                //respon user akan disimpan di dataUser
        randomQ.add("Masih sekolah atau udah kuliah ?");
        randomQ.add("Ohh. . ");
        randomQ.add("Bagaimana cuaca disana ?");
        randomQ.add("Kamu lagi apa ?");
        randomQ.add("Kamu dari kota mana ?");
        randomQ.add("Kamu tinggal sama siapa ?");

        //Bagian ini akan membuka obrolan dan menampung nama user ke dalam dataUser
        System.out.println("Vinny : Hai, nama saya Vinny, Siapa nama kamu ?");
        System.out.print("User : ");
        pertanyaan = s.nextLine();
        pertanyaan = pertanyaan.trim();
        String[] printNama = pertanyaan.split("\\s+");
        String fixNama = printNama[printNama.length - 1];
        dataUser.put("Nama", fixNama);

        //Bagian ini akan menentukan apakah input user hanya berisi respon nama saja
        if (pertanyaan.split(".").length == 1 || pertanyaan.split(",").length
                == 1) {
            System.out.println("Vinny : Hai " + dataUser.get("Nama") + " "
                    + openingQ.get(
                            temp));
            System.out.print(dataUser.get("Nama") + " : ");
            pertanyaan = s.nextLine();
        }

        int count = 0;                                                          //count akan menampung berapa kali vinny sudah bertanya
        int count2 = 0;                                                         //count akan menampung berapa kali user sudah bertanya

        //while akan berhenti selama user tidak menginput kata "bye"
        while (!pertanyaan.toLowerCase().contains("bye")) {
            //if ini akan memeriksa apakah masih ada randomQ, apabila sudah habis akan keluar dari while
            if (randomQ.size() < 1) {
                break;
            }
            int temp2 = r.nextInt(randomQ.size());
            String respon = "";                                                 //respon akan menampung respon Vinny
            //if ini untuk menentukan kalimat tanya atau bukan
            if (pertanyaan.endsWith("?")) {
                //bagian ini untuk membagi pertanyaan user dengan kriteria 5W1H dan lainnya
                if (pertanyaan.toLowerCase().contains("siapa")) {
                    count2++;
                    //bagian ini untuk memisahkan pertanyaan untuk Vinny dan bukan
                    if (pertanyaan.toLowerCase().contains("kamu")) {
                        if (pertanyaan.toLowerCase().contains("nama")) {        //untuk klo nanya nama botnya lagi.
                            respon
                                    = "Kan dah kubilang tadi namaku Vinny. Gimana sih? Koq bisa lupa? ";
                        } else if (pertanyaan.toLowerCase().contains("sama")) {
                            respon = "Ihh. . . Kepo banget sihh. . .";
                        } else if (pertanyaan.toLowerCase().contains("tinggal")) {
                            respon = "Mau tau aja. . .";
                        }
                    } else if (pertanyaan.toLowerCase().contains("saya")
                            || pertanyaan.
                                    toLowerCase().contains("aku")) {
                        if (pertanyaan.toLowerCase().contains("nama")) {        //untuk klo nanya nama botnya lagi.
                            respon
                                    = "Nama kamu kan " + dataUser.get("Nama")
                                    + " koq bisa lupa sih ?";
                        }
                    } else {
                        respon = "jawaban tidak tersedia";
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
                        if (pertanyaan.toLowerCase().contains("tinggal")) {        //untuk klo nanya nama botnya lagi.
                            respon
                                    = dataUser.get(
                                            "Alamat").toString();
                        }
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
                        if (pertanyaan.toLowerCase().contains("makan")) {        //untuk klo nanya nama botnya lagi.
                            respon
                                    = "Kita kan sama-sama suka " + dataUser.get(
                                            "Makan");
                        } else if (pertanyaan.toLowerCase().contains("hobi")) {        //untuk klo nanya nama botnya lagi.
                            respon
                                    = "Hobi kamu tuh " + dataUser.get(
                                            "Hobi");
                        }

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
                } else if (pertanyaan.toLowerCase().contains("ya")) {
                    respon = "Iya dong ^_^";
                } else if (pertanyaan.toLowerCase().contains("vinny")) {
                    respon = "apa?";
                } else {
                    respon
                            = "Maaf, Saya tidak mengerti pertanyaan anda. Anda bisa mendonasikan minimal Rp 200 juta kepada developer untuk pengembangan lebih lanjut di versi berikutnya.";
                }
            } else {                                                            //bukan pertanyaan
                count++;
                if (pertanyaan.toLowerCase().contains("maaf")) {                //untuk klo minta maaf.
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////Pemisah Bagian Obrolan dan Memberikan Respon////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //If ini akan membuat vinny memberikan pertanyaan randomQ apabila user sudah bertanya 3 kali
            if (count2 == 3) {
                respon = respon + ", " + randomQ.remove(temp2);
                System.out.println("Vinny : " + respon);
                count2 = 0;
            } else {
                //If ini akan membuat vinny meminta user untuk mengajukan pertanyaan apabila vinny sudah bertanya 3 kali
                if (count == 3) {
                    System.out.println(
                            "Vinny : Ohh. . . Koq aku terus yang nanya sih, kamu atuh yang nanya .");
                    count = 0;
                } else {
                    System.out.println("Vinny : " + respon);
                    if (respon != "" && respon != null) {
                        //Bagian ini akan menampung situasi khusus dimana percakapan bisa terjadi
                        if (respon.toLowerCase().contains("cuaca")) {
                            System.out.print(dataUser.get("Nama") + " : ");
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
                                        + dataUser.get("Nama")
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
                            System.out.print(dataUser.get("Nama") + " : ");
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
                            System.out.print(dataUser.get("Nama") + " : ");
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
                            System.out.print(dataUser.get("Nama") + " : ");
                            pertanyaan = s.nextLine();
                            int Ialamat = pertanyaan.indexOf("tinggal");
                            Ialamat += 8;
                            String alamat = pertanyaan.substring(Ialamat,
                                    pertanyaan.length());

                            dataUser.put("Alamat", dataUser.get("Nama")
                                    + ", kamu tinggal "
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
                            System.out.print(dataUser.get("Nama") + " : ");
                            pertanyaan = s.nextLine();
                            String bersaudara = "Anak tunggal";
                            if (!pertanyaan.toLowerCase().contains("tunggal")) {
                                int Ibersaudara = pertanyaan.indexOf(
                                        "bersaudara");
                                Ibersaudara -= 3;
                                bersaudara = pertanyaan.substring(Ibersaudara,
                                        pertanyaan.length());
                            }

                            dataUser.put("Bersaudara", dataUser.get("Nama")
                                    + ", kamu itu "
                                    + bersaudara.trim());
                            System.out.println(
                                    "Vinny : Kalo aku anak tunggal tapi aku punya 3 ayah 1 ibu");
                        } else if (respon.toLowerCase().contains(
                                "suka makanan")) {
                            System.out.print(dataUser.get("Nama") + " : ");
                            pertanyaan = s.nextLine();
                            int Imakan = pertanyaan.indexOf("makan");
                            String Makan = pertanyaan.substring(Imakan,
                                    pertanyaan.length());

                            dataUser.put("Makan", dataUser.get("Nama")
                                    + ", kamu suka "
                                    + Makan.trim());
                            System.out.println(
                                    "Vinny : Oh sama dong aku juga suka "
                                    + Makan);

                        } else if (respon.toLowerCase().contains(
                                "hobimu")) {
                            System.out.print(dataUser.get("Nama") + " : ");
                            pertanyaan = s.nextLine();
                            int Imakan = pertanyaan.indexOf("saya");
                            Imakan += 5;
                            String Hobi = pertanyaan.substring(Imakan,
                                    pertanyaan.length());

                            dataUser.put("Hobi", dataUser.get("Nama")
                                    + ", kamu punya hobi "
                                    + Hobi.trim());
                            if (Hobi.toLowerCase().contains("basket")) {
                                System.out.println(
                                        "Vinny : Oh sama dong, aku juga suka main basket");
                            } else {
                                System.out.println(
                                        "Vinny : Ohhhh kalo aku sukanya main basket");
                            }
                        }
                    }
                }
            }
            //Bagian ini akan meminta input dari pengguna
            System.out.print(dataUser.get("Nama") + " : ");
            pertanyaan = s.nextLine();
        }
        //Bagian ini adalah respon akhir vinny apabla obrolan akan berakhir
        System.out.println("Vinny : Ok deh. Makasih dah nemenin aku ya. Bye.");
        System.out.println("Vinny : Vinny telah meninggalkan ruang obrolan");

        System.out.println(dataUser);

        s.close();

    }
}
