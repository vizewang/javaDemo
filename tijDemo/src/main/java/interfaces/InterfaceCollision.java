//: interfaces/InterfaceCollision.java
package interfaces;

interface I1 { int f(); }

interface I2 { int f(int i); }

interface I3 { int f(); }

class C { public int f() { return 1; } }

class C2 implements I1, I2,I3 {
  public int f() {return 11;}
  public int f(int i) { return 2; } // overloaded
}

class C3 extends C implements I2 {
  public int f(int i) { return 3; } // overloaded
}

class C4 extends C implements I3 {
  // Identical, no problem:
  public int f() { return 4; }
}
public class InterfaceCollision{

  public static void main(String[] args) {
    System.out.println(new C2().f(1));
    System.out.println(new C3().f(1));
    System.out.println(new C4().f());
  }
}
// Methods differ only by return type:
//! class C5 extends C implements I1 {}
//! interface I4 extends I1, I3 {} ///:~
