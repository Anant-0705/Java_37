public class UserDefined2 {
    public void Validate2(int Balance) throws InsufficientBalanceException {
        if (Balance < 5000) {
            throw new InsufficientBalanceException(
                    "Do not check your balance again and again, there are only 23 rupees in your account :)"
            );
        } else {
            System.out.println("Balance check successful!");
        }
    }
}
