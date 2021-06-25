public class Product {


    public Product(int product_Id, String name, String type, int quantity, Double price) {
        Product_Id = product_Id;
        Name = name;
        Type = type;
        Quantity = quantity;
        Price = price;
    }

    public Product() {

    }

    public int getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(int product_Id) {
        Product_Id = product_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Product_Id=" + Product_Id +
                ", Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                ", Quantity=" + Quantity +
                ", Price=" + Price +
                '}';
    }

    public Double assetValue(){
         double asset = getPrice()* getQuantity();
        return asset;
    }
    private int Product_Id;
     private String Name;
     private String Type;
     private int Quantity;
     private Double Price;

}
