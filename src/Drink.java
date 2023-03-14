import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {

  private boolean isCarbonated;
  private boolean isAlcoholic;

  public Drink(String title, double calories, boolean isCarbonated, boolean isAlcoholic) {
    super(title, calories);
    this.isCarbonated = isCarbonated;
    this.isAlcoholic = isAlcoholic;
  }

  public void openDrink() throws IOException {
    if (!isAlcoholic){
      if (isCarbonated) {
        System.out.println("pshhhhhhh!");
      } else {
        System.out.println("skrr");
      }
    } else if (readAge()) {
      if (isCarbonated) {
        System.out.println("pshhhhhhh!");
      } else {
        System.out.println("skrr");
      }
    } else {
      System.out.println("You are too young to be drinking alcoholic beverages!");
    }
  }

  private static boolean readAge() throws IOException {
    System.out.print("Please enter your age: ");
    return (readIntLimited(0, 150) >= 18);
  }

  private static int readIntLimited(int min, int max) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = 0;
    do {
      try {
        num = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Only numbers need to be entered!");
      }
      if (!(num >= min && num <= max)) {
        System.out.printf("The number must be between %d and %d: ", min, max);
      }
    } while (!(num >= min && num <= max));
    return num;
  }

}
