package Streams.ScenarioBased.ProductOrderExample;

import java.util.ArrayList;
import java.util.List;

public class MockDataUtil {

    public static List<Product> getMockProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("P55555", "Noise Cancelling Headphones", "Electronics", 5999.00, "INR"));
        products.add(new Product("P66666", "Smart LED Bulb", "Home Automation", 899.00, "INR"));
        products.add(new Product("P77777", "Portable Power Bank", "Accessories", 1299.00, "INR"));
        products.add(new Product("P88888", "Smart Watch", "Wearables", 4999.00, "INR"));
        products.add(new Product("P99999", "USB-C Hub", "Computer Accessories", 2199.00, "INR"));

        return products;
    }

    public static List<Order> getMockOrders() {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order("O11111", "P55555", 11998.00, 2, "DEBIT_CARD", "PLACED", "WEB"));
        orders.add(new Order("O22222", "P66666", 1798.00, 2, "UPI", "PLACED", "MOBILE_APP"));
        orders.add(new Order("O33333", "P77777", 1299.00, 1, "CREDIT_CARD", "CANCELLED", "POS"));
        orders.add(new Order("O44444", "P88888", 9998.00, 2, "UPI", "PLACED", "WEB"));
        orders.add(new Order("O55555", "P99999", 4398.00, 2, "NET_BANKING", "PLACED", "MOBILE_APP"));
        orders.add(new Order("O66666", "P55555", 5999.00, 1, "CASH", "RETURNED", "POS"));
        orders.add(new Order("O77777", "P66666", 899.00, 1, "CREDIT_CARD", "PLACED", "WEB"));
        orders.add(new Order("O88888", "P88888", 4999.00, 1, "UPI", "PLACED", "MOBILE_APP"));
        orders.add(new Order("O99999", "P77777", 1299.00, 1, "DEBIT_CARD", "PLACED", "WEB"));
        orders.add(new Order("O00001", "P99999", 2199.00, 1, "CREDIT_CARD", "PLACED", "POS"));
        orders.add(new Order("O00001", "P99999", 2199.00, 1, "CREDIT_CARD", "PLACED", "POS"));

        return orders;
    }

}
