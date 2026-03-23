import java.util.*;
class sample
 {
public static void main(String[] args)
 {
  Vector<Integer> v=new Vector<>(3);
    v.addElement(10);
    v.addElement(20);
    v.addElement(30);
    v.addElement(40);
  System.out.println("vector element "+v);
  System.out.println("vector size "+v.size());
  System.out.println("vector capacity "+v.capacity());
  System.out.println("vector removed element "+v.remove(2));
  System.out.println("vector element at 1st index "+v.element(1));
  v.clear();
   System.out.println("vector elements "+v);
   }
}
   