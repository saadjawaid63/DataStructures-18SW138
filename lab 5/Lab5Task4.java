import java.util.*;
import java.util.Queue;
class Lab5Task4 {
	public static void main(String[] args) {
        Queue <Object> list = new  PriorityQueue<Object>();
        for (int i=0; i<5; i++)
            list.add(i);
        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.remove(0));
        System.out.println(list.size());
        System.out.println(list.poll());
        list.add(16);
        list.offer(12);
        System.out.println(list);
        System.out.println(list.isEmpty());
	}
}