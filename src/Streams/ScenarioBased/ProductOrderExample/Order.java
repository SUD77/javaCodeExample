package Streams.ScenarioBased.ProductOrderExample;

public class Order {

    private String orderId;
    private String productId;
    private double orderAmount;
    private int quantity;
    private String paymentMode;
    private String orderStatus; // e.g. "PLACED", "CANCELLED", "RETURNED"
    private String source; // e.g. "WEB", "MOBILE_APP", "POS"


    public Order(String orderId, String productId, double orderAmount, int quantity, String paymentMode, String orderStatus, String source) {
        this.orderId = orderId;
        this.productId = productId;
        this.orderAmount = orderAmount;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
        this.orderStatus = orderStatus;
        this.source = source;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", orderAmount=" + orderAmount +
                ", quantity=" + quantity +
                ", paymentMode='" + paymentMode + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
