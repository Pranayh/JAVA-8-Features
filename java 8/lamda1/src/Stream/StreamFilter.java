package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Here, we want filter our result from collection
// example, filter products which have  price greater than RS.10.
public class StreamFilter {
    public static void main(String[] args) {

        // Using traditional way

        List<Product> list = new ArrayList<Product>();

        for(Product product:getProducts()){
            if (product.getPrice() > 10f){
                list.add(product);
            }
        }
        list.forEach(System.out::println);


        System.out.println("**************************");

        // Using Stream API

//        List<Product> list2= getProducts().stream()
//        .filter((product)->product.getPrice() > 10)
//        .collect(Collectors.toList());

//        list2.forEach(System.out::println);

        // Here, we only used single line code:
         getProducts().stream().filter((product)->product.getPrice() > 10).forEach(System.out::println);

    }



    public static List<Product> getProducts(){
        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1,"pen",20f));
        productList.add(new Product(2,"Eraser",5f));
        productList.add(new Product(3,"Compass",20f));
        productList.add(new Product(1,"Pencil",7f));
        return productList;

    }

}

class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
