import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
import java .lang.*;
public class l_list1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elementd: ");
        int input=sc.nextInt();
        for (int i = 0; i <input ; i++) {
            l1.add(sc.nextInt() );
            Iterator itr=l1.descendingIterator();
            while(itr.hasNext()){
                System.out.println(itr.next());




            }
            Collections.sort(l1);
            System.out.println(l1);
        }

    }
}
