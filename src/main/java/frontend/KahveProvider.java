package frontend;



import backend.Cappuccino;
import backend.Espresso;
import backend.FiltreKahve;
import backend.Kahve;
import backend.TurkKahvesi;

public class KahveProvider {

    public static Kahve kahveOlustur(String selection) {
        Kahve kahve = null;

        switch (selection) {
            case "türk kahvesi":
                kahve = new TurkKahvesi();  // Sınıf değişkenine object atanıyor !!!!!!!
                break;
            case "filtre kahve":
                kahve = new FiltreKahve();
                break;
            case "espresso":
                kahve = new Espresso();
                break;
            case "cappuccino":
                kahve = new Cappuccino();
                break;
        }

        return kahve;
    }
}
