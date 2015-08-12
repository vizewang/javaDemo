package inner_class;

//: innerclasses/Wrapping.java
public class Wrapping {
  private int i;
  public Wrapping(int x) { i = x; }
  public Wrapping(int x,int y){
    i=x+y;
  }
  public int value() { return i; }
} ///:~
