package Streams.ScenarioBased.ProductOrderExample;

public class Product {

    private String productId;
    private String productName;
    private String category;
    private double price;
    private String currency;

    public Product(String productId, String productName, String category, double price, String currency) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
