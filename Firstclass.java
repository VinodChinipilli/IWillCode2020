public class FirstClass {
  public static void main(final String[] args) {

    // check red colour car avaialble if not buy white colour if not dont buy a car
    // If red colour car exists buy red colour , dont buy White colour
    // If red colour car dosen't exist and white colour exists buy white colour car
    // If both of them are not exist dont buy a car!

    final boolean IsRedColourCarAvailableIWantToBuy = false;
    final boolean IsWhiteColourCarAvailableIWantToBuy = false;

    if (IsRedColourCarAvailableIWantToBuy) {
      System.out.print("I need red colour car");

    } else if (IsWhiteColourCarAvailableIWantToBuy) {
      System.out.print("I need white colour car");

    } else {
      System.out.print("i dont want to buy a car");
    }

  }
}
