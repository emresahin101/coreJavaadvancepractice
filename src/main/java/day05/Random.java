package day05;
/*
Proje: Sayısal Loto Uygulaması

       1) Kullanici Bileti icin sistem tarafindan rastgele n tane sayı üretilsin.
       2) Loto sonucu icin de rastgele n tane sayı ile üretilsin.
       3) Sayısal lotoda tekrarlı sayılar olmasin.
       4) n(hane sayısı), sayılar için kullanicidan min ve max degerler alınsın.
       5) loto sonucu ile bilet ile karsılastırılsın,
       6) kac eslesme oldugu kullanıcıya bildirilsin.
       7)  Eger eslesme varsa;
           Max deger>50 ise ==>buyuk ikramiye
           Max deger>100 ise ==>super ikramiye
           Max deger>0 ise ==>amorti kazandiniz yazdirsin

*/


public class Random {
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();
        int sayi;
        sayi = rnd.nextInt();
        System.out.println("sayi : "+sayi);//sayi : -447098777
        //-2 milyar ile +2 milyar arasindaki sayilardan herhangi birini bize dondurur

        //int sayi = rnd.nextInt(n); 0,1,2,3,4...(n-1)
        int sayi1 = rnd.nextInt(5);// ==>[0,5) arasindaki degerlerden birini dondurur

        // int sayi = rnd.nextInt(n)+m; 0+m,1+m,2+m,3+m,4+m...(n-1+m) m==> kaydirma degeri
        int sayi2 = rnd.nextInt(5)+2;
        //                                       0,1,2,3,4
        System.out.println("sayi2 = " + sayi2);//2,3,4,5,6

        //int sayi3 = k * rnd.nextInt(5)+2; k aralarindaki mesafeyi gosterir
        //                                       2,3,4,5,6
        int sayi3 = 3*rnd.nextInt(5)+2;//3*==> sayilar arasindaki mesafeyi gosterir
        System.out.println("sayi3 = " + sayi3);//2,5,8,11,14

        int max =10;
        int min =5;
        //5,6,7,8,9,10
        int sayi4=rnd.nextInt(max);// 0,1,2,3,4,5,6,7,8,9  [0,max)
        System.out.println("sayi4 = " + sayi4);

        int sayi5=rnd.nextInt(max+1);//0,1,2,3,4,5,6,7,8,9,10  [0,max]
        System.out.println("sayi5 = " + sayi5);
// //5,6,7,8,9,10
        int sayi6=rnd.nextInt(max+1)+min;//5,6,7,8,9,10,11,12,13,14,15
        System.out.println("sayi6 = " + sayi6);

        int sayi7=rnd.nextInt(max+1-min)+min;//5,6,7,8,9,10
        System.out.println("sayi7 = " + sayi7);







    }
}
