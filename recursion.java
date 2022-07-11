public class recursion {
  
  public static void main(String[] args) {
    countBackwards(12);
  }
  
  public static void countBackwards(int n) {
    if(n==0) {
      System.out.println("Done!");
    } else {
      System.out.println(n);
      n--;
      countBackwards(n);
      
    }
    
  }
  
}
