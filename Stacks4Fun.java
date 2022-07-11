import java.util.Stack;

public class Stacks4Fun {
  
  public static void main(String[] args) {
    
    Stack<String> games = new Stack<String>();
    
    games.add("Super Smash Bros");
    games.add("Mario Kart");
    games.add("Mario Party");
    
    System.out.println(games.peek());  //views the top element of the stack without removing it.
    
    System.out.println(games.pop());  //removes the top element from the stack, in this case would be Mario Party.
    
    System.out.println(games);
    
  }
  
} 
