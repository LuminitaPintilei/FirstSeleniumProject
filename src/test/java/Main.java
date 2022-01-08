public class Main {

    public static void main(String[] args) {



        LoginTest login = new LoginTest();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Starting tests...");
        login.loginWithValidCredentials();
       //login.loginWithInvalidCredentials();

        CartTest cart = new CartTest();
        System.out.println("Starting cart test..");
        cart.addToCartTest();
        System.out.println("Your item is in the cart");

        login.loginWithValidCredentials();
        WishListTest wishlist = new WishListTest();
        System.out.println("starting wishlist test");
        wishlist.addToWishList();

        RegisterTest register = new RegisterTest();
        System.out.println("Starting register test..");
        register.registerNewUser();

    }
}
