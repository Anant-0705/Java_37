import java.util.*;


public class ArrayList1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<String> product=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            product.add(in.next());
        }
        System.out.println(product);
        Collections.sort(product);
        System.out.println(product);


    }
}
