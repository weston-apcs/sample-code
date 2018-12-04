public class LunchLineTester {
  
  public static void main(String[] args) {
    LunchLine a = new LunchLine("Foo", null);
    LunchLine b = new LunchLine("Foo", new LunchLine("Bar", new LunchLine("Baz", null)));

    a.printLineMembers();
    System.out.println(a.countLineLength()); 
    b.printLineMembers();
    System.out.println(b.countLineLength());
    b = b.removeFront();
    b.printLineMembers();
    System.out.println(b.countLineLength());
    b = b.addToFront("Qux");
    b.printLineMembers();
    System.out.println(b.countLineLength());
    a = a.addToBack("Quux");
    a.printLineMembers();
    System.out.println(a.countLineLength());
    a = a.cutInLine("Bar", "Quux");
    a.printLineMembers();
    System.out.println(a.countLineLength());
  }
}
