import java.util.LinkedList; 

public class Q4Fun {
  public static void main(String[] args) {
    
    Queue<String> bbqLine = new LinkedList<String>();
    
    bbqLine.add("Michael");
    bbqLine.add("Jamie");
    bbqLine.add("David");
    bbqLine.add("Kate");
    
    bbqLine.poll();  //this will remove the first person in line.
    
    System.out.println(bbqLine.poll());  //this will show the element that was removed as well show the remaining queue.
    
    bbqLine.peek();  //this will view the first element.
    
    System.out.println(bbqLine.peek());  //this will show the first element, but also show the rest of the queue.  
    
    System.out.println(bbqLine);
    
  }
