public class PlannedMeal {

    public int calories;
    public double cost;
    public boolean[][] meal;

    public PlannedMeal(int calories, double cost, boolean[][] meal){
        this.calories = calories;
        this.cost = cost;
        this.meal = meal;
    }

    public PlannedMeal(int calories, double cost){
        this.calories = calories;
        this.cost = cost;
    }

}
