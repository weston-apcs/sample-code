public class SampleCodeLesson2 {

  public String getItemNoArrays(int item) {
    if (item == 1)
      return "Chips";
    else if (item == 2)
      return "Salsa";
    else if (item == 3)
      return "Guacamole";
    else if (item == 4)
      return "Cheese";
    else
      return "Tacos";
  }

  public String getItemWithArrays(int item) {
    String[] shelf = new String[]{
      "Chips",
      "Salsa",
      "Guacamole",
      "Cheese",
      "Peanuts"
    };

    return shelf[item-1];
  }

  public void printShelfContents() {
    String[] shelf = new String[]{
      "Chips",
      "Salsa",
      "Guacamole",
      "Cheese",
      "Peanuts"
    };

    for (int i = 0; i < shelf.length; i++) {
      System.out.println(shelf[i]);
    }
  }

  public int findMax(int[] array) {
    // we don't know the contents of array, just that it contains ints
    int result = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > result) {
        result = array[i];
      }
    }
    
    return result;
  }
}
