package day04;

import java.util.Scanner;

public class Arac {
    public String type;
    public int prim;

    public int countPrim(int term) {//prim hesapla methodu
        if (term == 1) {

            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2000;
                    break;

                case "kamyon":
                    prim = 3000;
                    break;
                case "otobus":
                    prim = countBusPrim(term);
                    break;
                case "motosiklet":
                    prim = 1500;
                    break;
                default:
                    System.out.println("Hatali giris");
                    prim = 0;
                    break;
            }

        } else if (term == 2) {

            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2500;
                    break;

                case "kamyon":
                    prim = 3500;
                    break;
                case "otobus":
                    prim = countBusPrim(term);
                    break;
                case "motosiklet":
                    prim = 1750;
                    break;
                default:
                    System.out.println("Hatali giris");
                    prim = 0;
                    break;
            }

        } else {
            System.out.println("Hatali giris yaptiniz...");
        }
        return prim;
    }


    public int countBusPrim(int term) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen otobus tipini giriniz...\n ==>18-30 \n 2==> 31++ uzeri koltuklu");

        String busTypeStr = "";
        while (!busTypeStr.equals("1") && !busTypeStr.equals("2")){
            try {
                busTypeStr =  input.nextLine();
                if (!busTypeStr.equals("1") && !busTypeStr.equals("2")){
                    System.out.println("Hatali giris yaptiniz.\nLutfen gecerli bir otobus type'i seciniz.");
                }

            }catch (Exception e){
                System.out.println("Hatali veri girdiniz lutfen dogru type'i seciniz");
            }

        }
        int busType = Integer.parseInt(busTypeStr);
        prim =  busType ==1 ? ((term ==1) ? 4000 : 4500 ):
                ((term == 1)? 5000 : 5500);
        return prim;
    }
}
