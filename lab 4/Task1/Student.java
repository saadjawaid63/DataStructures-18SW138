import java.util.LinkedList;

class Person{
    
}
public class Student extends Person {

    public static void main(String[] args) 
    {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("A");
        obj.add("C");
        obj.add(1,"B");
        obj.add("D");
        System.out.println("Elements in linkedList are: "+obj);
        obj.addFirst("E");
        obj.addLast("Z");
        System.out.println("LInkedList: "+obj);
        System.out.println("Size of LinkedList is: "+obj.size());
        System.out.println("LinkedList contains the element B: " +obj.contains("B"));
        Object obj2=obj.clone();
        System.out.println("Shallow copy of LinkedList: "+obj2);
        System.out.println("First element in linkedList is: "+obj.element());
        System.out.println("Elment at Index 3 is: "+obj.get(3) );
        System.out.println("Last element in linkedList is: "+obj.getLast());
        System.out.println("add 'F' element: "+obj.offer("F"));
        System.out.println("LinkedList: "+obj );
        System.out.println("Show the First element: "+obj.peekFirst());
        System.out.println("Show the Last element: "+obj.peekLast());
        System.out.println("Remove the First element: "+obj.poll());
        System.out.println("Remove the Last element: "+obj.pollLast());
        System.out.println("LinkedList: "+obj);
        System.out.println("Remove index 4 : "+obj.remove(4));
        System.out.println("THe final size of LinkedList is: "+obj.size());
    }   
}