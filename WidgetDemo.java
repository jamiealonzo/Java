package com.example.collections;

import java.util.ArrayList;

public class WidgetDemo {
  
  public enum Colors {
    Orange, Yellow, Blue, Purple, White
    }
  
  public WidgetDemo(int weight, Colors color) {
    super ();
    this.weight = weight;
    this.color = color;
    
  }
  
  int weight;
  Colors color; 
  
  
  
  public static void main(String[] args) {
    
    List<WidgetDemo> widgets = new ArrayList<>();
    
    WidgetDemo w1 = new WidgetDemo(30, Colors.White);
    WidgetDemo w2 = new WidgetDemo(45, Colors.Orange);
    WidgetDemo w3 = new WidgetDemo(60, Colors.Yellow);
    WidgetDemo w4 = new WidgetDemo(90, Colors.White);
    WidgetDemo w5 = new WidgetDemo(120, Colors.Blue);
    WidgetDemo w6 = new WidgetDemo(135, Colors.Purple);
    WidgetDemo w7 = new WidgetDemo(150, Colors.White);
    
    widgets.add(w1);
    widgets.add(w2);
    widgets.add(w3);
    widgets.add(w4);
    widgets.add(w5);
    widgets.add(w6);
    widgets.add(w7);
    
    int sum = widgets.stream()
      .filter(w -> w.getColor() == Colors.White)
      .mapToInt(w -> w.getWeight())
      .sum();
    
    System.out.println("The sum of this color is: " + sum);
  }
  
  
  public int getWeight(){
    return weight;
  }
  
  public Colors getColor() {
    return color;
  }
}
