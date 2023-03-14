import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Food bred = new Food("Bred", 10);
    bred.eatFood();

    Drink vodka = new Drink("Vodka", 15, false, true);
    Drink pepsi = new Drink("Pepsi", 30.3, true, false);
    Drink beer = new Drink("Beer", 20.6, true, true);

    vodka.openDrink();
    pepsi.openDrink();
    beer.openDrink();

  }
}