package ShoppingCart;

import java.util.List;
import java.util.ArrayList;

public class Purchase extends Product{

    public Purchase(String name, double price) {
        super(name, price);
    }
}

class Shopping {

    public static <T> void affordable(List<? extends T> source, List<? super T> destination, double minPrice, double maxPrice) {
        for (T item: source) {
            Product product = (Product) item;
            if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                destination.add(item);
            }
        }
    }

    public static void main(String[] args) {
        List<Purchase> fullList = new ArrayList<>(); //source

        fullList.add(new Purchase("Cereal",5.99));
        fullList.add(new Purchase("PS5",599.99));
        fullList.add(new Purchase("Wooly Socks",5.96));
        fullList.add(new Purchase("Regular Shirt",5.99));
        fullList.add(new Purchase("Soap",6.99));
        fullList.add(new Purchase("iPad",399.99));

        List<Product> affordableList = new ArrayList<>(); // destination

        Shopping.affordable(fullList, affordableList, 6, 1000);
        for(Product x: affordableList) {
            System.out.println(x);
        }
    }
}
