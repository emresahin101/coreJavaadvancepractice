package day07;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public double getTotalAmount(){//toplam siparis tutari
        return orders.
                stream().
                mapToDouble(Order ::getTotalAmount).
                sum();
    }

    public void printHesap(){
        System.out.println("********************* HESAP FISI *****************************");
//
        for (Order order :orders ) {
            System.out.println("Siparis kodu : "+order.getOrderCode());
            System.out.println("Yiyecekler :");
            HashMap<MenuItem,Integer> items = order.getItems();

            for (Map.Entry<MenuItem,Integer> entry :items.entrySet()) {
                MenuItem item= entry.getKey();
                int adet =entry.getValue();





            }


        }//for each





    }

}
