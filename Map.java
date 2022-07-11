import java.util.HashMap;

public class Map {
  
  public static void main(String[] args) {
    
    
  HashMap<String, Integer> empIDs = new HashMap<>();
  
  empIDs.put("Jamie", 10166186);
  empIDs.put("David", 1237771);
  empIDs.put("Kate", 206621349);
  
  System.out.println(empIDs);
  
  System.out.println(empIDs.get("Jamie"));  //this will pull a specific element, this will pull Jamie's employee ID number.
  
  System.out.println(empIDs.containsKey("David"));  //containsKey will determine if a certain key exists in the map and will come back with either true or false.
  
  System.out.println(empIDs.put("Kate", 1234567));  //this will either add or update an existing key. 
  
  System.out.println(empIDs.putIfAbsent("Liam", 7654321));  //can also use putIfAbsent to add a key if it does not already exist.
  
  System.out.println(empIDs.remove("Liam"));  //this removes the element.
    
  }
  
}
  
