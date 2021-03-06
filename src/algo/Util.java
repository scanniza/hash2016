package algo;

import hasch.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: algo
 * Author: Joakim
 * Date: 2016-02-11 - 20:52
 * Purpose:
 */
public class Util {


    public static <E> List<E> part(double v, List<E> list){
        int stop = (int) ((list.size()-1)*v);

        return list.subList(0, stop);
    }

    public static List<ProductLine> extractProducts(List<Order> orders){
        List<ProductLine> products = new ArrayList<>();
        List<ProductLine> balancedList = new ArrayList<>();
        for(Order o : orders) {
            products.addAll(o.items);
        }
        for(int i = 0; i < products.size(); i++){
            ProductLine tmpProductLine = products.get(i);
            if(!balancedList.contains(tmpProductLine)){
                balancedList.add(tmpProductLine);
            } else {
                for(int j = 0; j < balancedList.size(); j++){
                    if(balancedList.get(j).equals(tmpProductLine)){
                        balancedList.get(j).increase(tmpProductLine.getAmount());
                    }
                }
            }
        }

        return balancedList;
    }

    public static Drone firstDroneAt(List<Drone> drones, Warehouse warehouse){
        for(Drone d : drones){
            if (warehouse.posX == d.posX && warehouse.posY == d.posY)
                return d;
        }
        return null;
    }

    public static List<Order> ordersWeCanSupply(List<Order> orders, List<ProductLine> products){
        List<Order> suppliedOrders = new ArrayList<>();
        for (Order o : orders){
            //if (o.items)
        }
        return null;
    }

}
