import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {
  //  поле "газированный" (да/нет)
//  поле "алкогольный" (да/нет)
//  метод "открыть", который:
//  для газированного напитка печатает "пшш",
//  для негазированного - "скр",
//  а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
  boolean fizzy;
  boolean alcohol;

  public Drink(String title, double calories) {
    super(title, calories);
  }

  public Drink(String title) {
    super(title);
  }

  public void openDrink() throws IOException {
    if (alcohol&&readAge()) {
      if (fizzy) {
        System.out.println("pshhhhhhh!");
      } else {
        System.out.println("skrr");
      }
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
