package testingTarte;

public class Product {

    private String id;
    private String name;
    private double price;
    private double discount;


    public Product(String id, String name, double price, double... discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        if (discount.length > 0) {
            this.discount = discount[0];
        } else {
            this.discount = 0.0;
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
