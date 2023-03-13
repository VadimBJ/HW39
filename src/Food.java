public class Food {
  private String title;
  private double calories;

  public Food(String title, double calories) {
    this.title = title;
    this.calories = calories;
  }

  public Food(String title) {
    this.title = title;
    this.calories=0;
  }

  public void setCalories(double calories) {
    this.calories = calories;
  }

  public double getCalories() {
    return calories;
  }

  public String getTitle() {
    return title;
  }

  public void eatFood(){
    System.out.printf("You just ate %s%n",title);
    if (calories!=0){
      System.out.printf("With a calorie count of %.2f calories%n",calories);
    }
  }
}
