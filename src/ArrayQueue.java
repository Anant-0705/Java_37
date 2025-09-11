import java.util.*;

public class ArrayQueue {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        dq.add("first");
        dq.addFirst("zero");
        dq.addLast("second");
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
