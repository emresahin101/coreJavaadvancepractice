package day04;
import java.util.Scanner;
public class AracSigortaApplication {
    public static void main(String[] args) {

        start();

    }

    public static void start() {

        Scanner input = new Scanner(System.in);
        boolean isfail;
        do {
            isfail = false;

            System.out.println("Lutfen tarife donemini giriniz...\n 1 ==> Haziran 2023\n 2==>Aralik 2023");

            int term = input.nextInt();
            if (term == 1 || term == 2) {

                Arac arac = new Arac();
                System.out.println("lutfen arac tipini giriniz...");
                arac.type = input.next().toLowerCase();

                arac.prim = arac.countPrim(term);
                int select;//tamami mi variable
                String termName = term == 1 ? "Haziran 2023" : "Aralik 2023";
                if (arac.prim > 0) {
                    System.out.println("Hesaplama basariyla tamamlandi...");
                    System.out.println("Arac Tip : " + arac.type);
                    System.out.println("Tarife Donemi : " + termName);
                    System.out.println("Aracinizin sigorta primi odemesi : " + arac.prim);
                    System.out.println("Yeni islem icin ==>1 \n Cikmak icin ==>0'a basiniz...");
                    select = input.nextInt(); //tamam mi devam mi
                    if (select == 1 ){
                        isfail=true;
                    }else {
                        isfail=false;
                    }
                }else {
                    System.out.println("Hesaplama Basarisiz...");
                    System.out.println("Yeni islem icin ==>1 \n cikis islemi icin ==>0 giriniz...");
                    select=input.nextInt();
                    if (select == 1){
                        isfail=true;
                    }else {
                        isfail=false;
                    }
                }

            } else {
                System.out.println("Hatali giris yaptiniz...");
                isfail = true; //tekrar donus yaptirabilmek icin
            }

        }while (isfail);

    }

}
