public class MainApp {
    public static void main(String[] args) {
        UserDefined2 uf = new UserDefined2();
        try {
            uf.Validate2(5001);
            uf.Validate2(23);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
