package day07;
/*Proje:   Restaurant Fiş Üretme Uygulaması (BillGenerator)
        1-Bir restaurantın online sipariş sisteminde hesabı
        yazdıran uygulama tasarlayınız.

        2-Restauranttaki yiyecekler bir listte tutulsun.
        Yiyeceklerin kodu, ismi ve ücreti olsun.

        3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
        oluşturma için seçim menüsü gösterilsin.

        4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
        Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
        Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
        Her bir yiyecek siparişi için tutar hesaplansın

        5-Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
        Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
        toplam tutarı gösteren bir hesap fişi yazdırılsın.  */
public class MenuItem {
    //Yiyeceklerin kodu, ismi ve ücreti olsun.
    private int code;
    private String name;
    private  double price;

    public MenuItem() {

    }

    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
