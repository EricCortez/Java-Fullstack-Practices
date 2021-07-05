import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PlazaSania {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         Product product1=new Product(1,"leche","lacteos",10,15.5);
         Product product2=new Product(31,"fish","seafood",5,19.99);
         Product product3=new Product(2,"bread","Bread",100,1.99);
        Store tienda1=new Store(1,"comidamx","frst");

         Store tienda2=new Store(2,"Sushi","second");
         Store tienda3=new Store(3,"Pan","thrd");
      //  tienda1.addProduct(product1);

    String op="y";
do {


         System.out.println("What are you looking for?  1 "+ tienda1.getName()+
                 "2 "+tienda2.getName() +"3  "+tienda3.getName() );


         int num=input.nextInt();
         if (num==1) {
             tienda1.setLista_producto(product1);
             System.out.println(" id " + tienda1.getStore_id() + " lista  " +
                     tienda1.getLista_producto(product1) + "  location  " +
                     tienda1.getLocation() +
                     "  name " + tienda1.getName() + "");
             System.out.println("Asset value :"+ product1.assetValue());

         }
         else if (num==2) {


             tienda2.setLista_producto(product2);
             System.out.println(" id " + tienda2.getStore_id() + " lista  " +
                     tienda2.getLista_producto(product2) + "  location  " +
                     tienda2.getLocation() +
                     "  name " + tienda2.getName() + "");

             System.out.println("Asset value :"+ product2.assetValue());
         }
         else {

             tienda3.setLista_producto(product3);
             System.out.println(" id " + tienda3.getStore_id() + " lista  " +
                     tienda3.getLista_producto(product3) + "  location  " +
                     tienda3.getLocation() +
                     "  name " + tienda3.getName() + "");
             System.out.println("Asset value :"+ product3.assetValue());

         }


         System.out.println("Compare \n"+"Store 1"+ product1.assetValue()+"\n"
                 +"Store 2"+product2.assetValue()+"\n"+"Store 3"+product3.assetValue() );


         System.out.println("THKS");
    System.out.println("you want to run again the program? no (n)/yes(y)");
    op=input.next();

} while (op.equals("y"));

    }
}
