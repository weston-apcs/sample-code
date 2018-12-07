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
    if (this.rest == null) {
      System.out.println(this.first);
      return;
    }

    System.out.print(this.first + ", ");
    this.rest.printLineMembers();
  }

  // returns the number of people in the line
  public int countLineLength() {
    if (this.rest == null) {
      return 1;
    }

    return 1 + this.rest.countLineLength();
  }

  // adds addme to the front of the line
  public LunchLine addToFront(String addme) {
    LunchLine ret = new LunchLine(addme, this);
    return ret;
  }

  // removes the first person from the line
  public LunchLine removeFront() {
    return this.rest;
  }

  // adds addme to the back of the line
  public LunchLine addToBack(String addme) {
    if (this.rest == null) {
      this.rest = new LunchLine(addme, null);
      return this;
    }

    return this.rest.addToBack(addme);
  }

  // adds addme in front of aheadOf in line
  public LunchLine cutInLine(String addme, String aheadOf) {
    if (this.rest.first.equals(aheadOf)) {
      LunchLine next = this.rest;
      this.rest = new LunchLine(addme, next);
      return this;
    }

    return this.rest.cutInLine(addme, aheadOf);
  }

  // merges two LunchLines by alternatively taking members from each existing line and returning the new line
  public LunchLine mergeLines(LunchLine other) {
    if (this.rest == null)
      return new LunchLine(this.first, other);
    else if (other.rest == null)
      return new LunchLine(other.first, this);
    return new LunchLine(this.first, new LunchLine(
        other.first,
        this.rest.mergeLines(other.rest)
      )
    );
  }
}

