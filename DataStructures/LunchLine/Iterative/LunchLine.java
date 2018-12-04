public class LunchLine {
  
  private String first;
  private LunchLine rest;

  public LunchLine() {
    first = "Default Student";
    rest = null;
  }

  public LunchLine(String leader, LunchLine allelse) {
    first = leader;
    rest = allelse;
  }

  // prints all of the people in the line
  public void printLineMembers() {

  }

  // returns the number of people in the line
  public int countLineLength() {
    return 0;
  }

  // adds addme to the front of the line
  public LunchLine addToFront(String addme) {
    return null;
  }

  // removes the first person from the line
  public LunchLine removeFront() {
    return null;
  }

  // adds addme to the back of the line
  public LunchLine addToBack(String addme) {
    return null;
  }

  // adds addme in front of aheadOf in line
  public LunchLine cutInLine(String addme, String aheadOf) {
    return null;
  }
}
