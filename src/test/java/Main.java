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

    }
}
