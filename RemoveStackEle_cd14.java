import java.util.*;
public class RemoveStackEle_cd14 {
public static void main(String args[])
{
Stack<Integer>stack = new Stack<Integer>(); 
stack.add(-5);
stack.add(8);
stack.add(9);
stack.add(3);
stack.add(46);
stack.add(98);
System.out.println("Stack:" +stack);
int rem_ele =stack.remove(5);
System.out.println("Removed element:"+ rem_ele); 
System.out.println("Final Stack :"+ stack);
}
}