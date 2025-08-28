public class MyException {
    public static  void main(String[] args) {
        UserDefined uf=new UserDefined();
        try{
            uf.Validate(18);
            uf.Validate(15);
        }catch (InvalidAge e){
            System.out.println(e.getMessage());
        }
    }
}
