public class UserDefined {
    public void Validate(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }


}
