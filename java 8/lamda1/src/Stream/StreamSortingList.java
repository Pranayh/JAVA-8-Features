package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// Here, we are going sort list using stream:
// steps:  first have to convert list into stream --> sort it using aggregate functions --> again convert it to list using collect() function

public class StreamSortingList {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("papaya");

        // Ascending Order

        // 1) Using Comparator : which is used to sort objects by comparing data members of user defined class object
        List<String> sortedFruits =fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);

        // 2) Using Lambda method:
        List<String> sortedFruits2 =fruits.stream().sorted(((o1, o2) -> o1.compareTo(o2))).collect(Collectors.toList());
        System.out.println(sortedFruits2);

        // 3) Simple Sorted method:
        List<String> sortedFruits3 =fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits3);

        System.out.println("######################Descending########################");

        // Descending Order :

        // 1) Using Comparator

        List<String> sortedFruits4 =fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits4);

        // 2) Using Lambda method:
        List<String> sortedFruits5 =fruits.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.out.println(sortedFruits5);






        List<Product> productList1 = new ArrayList<Product>();

        productList1.add(new Product(1,"pen",20f));
        productList1.add(new Product(2,"Eraser",5f));
        productList1.add(new Product(3,"Compass",20f));
        productList1.add(new Product(4,"Pencil",7f));


        // Sorting according to particular data member here,  data member: price

        // Ascending Order:

        //1) Sorting Using Comparator:
        List<Product> productSortedList = productList1.stream().sorted(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2)
            {
                return (int) (o1.getPrice()- o2.getPrice());
            }
        }).collect(Collectors.toList());
        System.out.println(productSortedList);

        // or

        List<Product> productSortedList3 = productList1.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
        System.out.println(productSortedList3);

        // 2) Using Lambda method:

        List<Product> productSortedList2 = productList1.stream().sorted((o1,o2)->(int)(o1.getPrice()- o2.getPrice())).collect(Collectors.toList());
        System.out.println(productSortedList2);







        // Descending Order:

        // 1) Using Comparator:

        List<Product> productSortedList4 = productList1.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).collect(Collectors.toList());
        System.out.println(productSortedList4);


        // 2) Using Lambda:

        List<Product> productSortedList5 = productList1.stream().sorted((o1,o2)->(int)(o2.getPrice()- o1.getPrice())).collect(Collectors.toList());
        System.out.println(productSortedList5);
    }
}
