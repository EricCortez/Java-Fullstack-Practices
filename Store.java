import java.util.ArrayList;
import java.util.List;

public class Store {

    public Store(int store_id, String name, String location) {
        Store_id = store_id;
        Name = name;
        Location = location;
       //Lista_producto = lista_producto;
    }

    public int getStore_id() {
        return Store_id;
    }

    public void setStore_id(int store_id) {
        Store_id = store_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getLista_producto(Product p) {


        return p.toString();
    }


   /* public void setLista_producto(List lista_producto) {
        Lista_producto = lista_producto;
        Product p=new Product();
        lista_producto.addAll(Collections.singleton(p));
    }*/


 /*   public void addProduct(Product p) {
        this.Lista_producto.add(p);
    }*/

    private int Store_id;
    private String Name;
    private  String Location;

    public void setLista_producto(Product p) {

        this.Lista_producto.add(p);

    }

    private List  Lista_producto = new ArrayList ();


}

