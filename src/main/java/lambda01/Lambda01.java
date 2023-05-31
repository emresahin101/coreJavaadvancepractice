package lambda01;


import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        allEvenPrint(nums);
        System.out.println();
        anyMatchOddPrint(nums);
        System.out.println();
        enKucukIlk3AtlaKalan50Artis(nums);
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        tekElemanlarınKareleriniYazdır(nums);
        System.out.println();
        tekSayiKupTekrarsiz(nums);
        System.out.println();
        benzersizCiftSayiKareTop(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinTopYazdır(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinToplamiYazdır2(nums);
        System.out.println();


    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.
    public static void allEvenPrint( List<Integer> nums ){

        boolean allEven= nums.
                stream().
                allMatch(t->t%2 == 0);
        System.out.println("allEven = " + allEven);//false
    }

    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz

    public static void anyMatchOddPrint( List<Integer> nums ){

        boolean anyOdd= nums.stream().anyMatch(t->t %2 != 0);
        System.out.println("anyOdd = " + anyOdd);

    }

    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.
    public static void enKucukIlk3AtlaKalan50Artis( List<Integer> nums ){
        nums.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        nums.
                stream().
                sorted().
                skip(3).
                map(t->t*0.5).
                forEach(t-> System.out.print(t+" "));


    }


    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void ciftElemanlar (List<Integer> nums){
        nums.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }



    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void tekElemanlarınKareleriniYazdır( List<Integer> nums ){
        System.out.print("tekElemanlarınKareleriniYazdır: ");

        nums.
                stream().
                filter(t->t%2!=0).map(t->t*t).
                forEach(t-> System.out.print(t+" "));

    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void tekSayiKupTekrarsiz (List<Integer> nums){
        nums.stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftSayiKareTop (List<Integer> nums) {
        System.out.print("7.1 : ");
        int ciftSayiTop= nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

        System.out.println("ciftSayiTop = " + ciftSayiTop);
    }

    public static void benzersizCiftElemanlarınKarelerinTopYazdır( List<Integer> nums ) {
        System.out.print("7.2 : ");
        int benzersizCiftElKareTop =
                nums.
                        stream().
                        distinct()
                        .filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(Math::addExact).orElseThrow();

        System.out.print(benzersizCiftElKareTop);
    }

    public static void benzersizCiftElemanlarınKarelerinToplamiYazdır2( List<Integer> nums ){
        System.out.print("7.3 : ");
        int benzersizCiftElKareToplami2 =
                nums.
                        stream().
                        distinct()
                        .filter(t->t%2==0).
                        map(t->t*t).
                        reduce(0,Integer::sum);//get() mehodu yerine 0,Integer::sum kullanabiliriz.

        System.out.print(benzersizCiftElKareToplami2);

    }
    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftSayilarinKareCarpimiYazdir (List<Integer> nums) {
        Integer benzersizCiftKareCarpimi =
                nums.stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();

        System.out.println(benzersizCiftKareCarpimi);
    }



    //9)Liste ogelerinden max degerini veren bir method olusturunuz



    //10)Liste ogelerinden minumum degerini veren method olusturunuz


}
