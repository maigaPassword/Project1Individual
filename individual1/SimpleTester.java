
import java.util.Iterator;

public class SimpleTester {

    public static void main(String[] args) {

        Product p1 = new Product("Mango", 5, 20);
        Product p2 = new Product("Avocado", 5, 10.50);
        Product p3 = new Product("Phone", 1, 200);
        Product p4 = new Product("Computer", 4, 1500);

        WishList wishlist = new WishList();

        System.out.println(wishlist.addProduct(p1, 2)
                + " should be true");

        System.out.println(wishlist.addProduct(p2, 3)
                + " should be true");

        WishListItem item =
                wishlist.findProduct(p1.getProductID());

        System.out.println(item.getQuantity()
                + " should be 2");

        System.out.println(
                wishlist.updateQuantity(p1.getProductID(), 5)
                + " should be true");

        item = wishlist.findProduct(p1.getProductID());

        System.out.println(item.getQuantity()
                + " should be 5");

        System.out.println(
                wishlist.updateQuantity("fakeID", 10)
                + " should be false");

        wishlist.addProduct(p1, 10);

        item = wishlist.findProduct(p1.getProductID());

        System.out.println(item.getQuantity()
                + " should be 10");

        System.out.println(wishlist.addProduct(p3, 1)
                + " should be true");

        System.out.println(wishlist.addProduct(p4, 2)
                + " should be true");

        Iterator<WishListItem> items =
                wishlist.getWishlistItems();

        System.out.println();
        System.out.println("List of wishlist items");
        System.out.println("----------------------");

        while (items.hasNext()) {

            WishListItem currentItem = items.next();
            Product product = currentItem.getProduct();

            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getSalePrice());
            System.out.println("Wishlist Quantity: " + currentItem.getQuantity());
            System.out.println("----------------------");
        }
    }
}
