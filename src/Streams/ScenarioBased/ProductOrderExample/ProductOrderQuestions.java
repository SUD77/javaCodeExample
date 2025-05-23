package Streams.ScenarioBased.ProductOrderExample;


import java.util.List;
import java.util.stream.Collectors;

public class ProductOrderQuestions {
    public static void main(String[] args) {

        // Note : Don't write solutions in this file.
        // Create a new file with ProductOrderSolutionByName
        // Copy and Paste questions from here and solve there.


        List<Order> orderList=MockDataUtil.getMockOrders();
        List<Product> productsList=MockDataUtil.getMockProducts();


        // 1. Get all orders placed via MOBILE_APP
        /**
         * Hint: Filter orders where the source contains the word "MOBILE_APP".
         * Convert the result to a list and get the size.
         **/


        // 2. List all the product names.
        /**
         * Hint:
         * Extract the product names from the product list.
         * Collect them into a new list.
         **/


        // 3. Count the number of orders placed for each product.
        /**
         * Hint:
         * Group the orders by the product ID.
         * Count how many orders are placed for each product.
         **/


        // 4. Find the total revenue generated by "Smart Watch" orders.
        /**
         * Hint:
         * First, find the product with the name "Smart Watch".
         * Filter orders based on this product ID and sum (Collectors.summingDouble)  their amounts .
         **/


        // 5. Get a distinct list of payment methods used in the orders.
        /**
         * Hint:
         * Extract the payment methods from the orders .
         * Get only distinct values (no duplicates).
         */


        // 6. Get the top 2 products with the highest price.
        /**
         * Hint:
         * Sort the products by price in descending order (use .sorted).
         * Limit the result to the top 2 products.
         */


        // 7️. Detect duplicate orders (same orderId) and list them.
        /**
         * Hint:
         * Group the orders by order ID (Use Collectors.groupingBy).
         * Iterate through entrySet
         * Filter where value size is greater than 1.
         */


        // 8.For each product, find total quantity sold across all orders.
        /**
         * Hint:
         * Group the orders by product ID (Use Collectors.groupingBy).
         * Sum the quantities for each product (Use Collectors.summingInt).
         */


        //9️ Find the product whose total revenue is highest.
        /**
         * Hint: Group the orders by product ID and sum the revenue for each(Use
         * Collectors.groupingBy and Collectors.summingDouble).
         * Find the product with the highest total revenue.
         */





        /*  ----------  EXTRA QUESTIONS -----------

            Hints for these q are written in

            BEGINNER TO INTERMEDIATE QUESTIONS

            1. Print all product names using forEach.
            2. Filter and collect all orders where amount > 2000.
            3. Map products to their names and collect to a Set.
            4. Get all distinct product categories.
            5. Flatten a list of orders from multiple users into a single list.
            6. Sort products by name (A-Z), then by price (low to high).
            7. Sort orders by amount in descending order and get top 3.
            8. Find the order with the maximum quantity.
            9. Find the product with the minimum price.
            10. Group orders by payment method.
            11. Find the first product with price above 5000.
            12. Find any order placed via POS.
            13. Check if any product name contains the word "Smart".
            14. Check if all products are in "INR" currency.
            15. Check if no order was placed with amount 0.
            16. Skip the first 3 cheapest products and list the rest.
            17. Limit to 5 orders placed via Web.

            ADVANCED COMBINATIONS

            18. For each category, list the names of products.
            19. Group orders by product ID and for each group get the total amount.
            20. Flatten list of product names per category from a Map<String, List<Product>>.
            21. Find top 3 categories with the most products.
            22. Get a list of all order IDs in uppercase.
            23. Filter orders that are not "CANCELLED", then group by source.
            24. Find if any order has quantity more than 5. If so, print details.
            25. List names of all products sorted by price descending, but skip the most expensive one.

         */
    }
}
