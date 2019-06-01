import org.junit.Test;
import static org.junit.Assert.*;

public class BulkingUpTests {

    @Test
    public void oneRestaurantSimple(){
        int[][] calories = new int[1][10];
        double[][] cost = new double[1][10];
        cost[0][0] = 5;
        for (int i = 1; i < calories[0].length; i++){ //Picking up after the gas cost.
            calories[0][i] = i*100;
        }
        for (int i = 1; i < cost[0].length; i++){ //Picking up after the gas cost.
            cost[0][i] = 10.0;
        }
        BulkingUp bulking = new BulkingUp(calories, cost);
        PlannedMeal resFoodTen = bulking.getPlan(15);
        PlannedMeal resFoodTwenty = bulking.getPlan(25);
        PlannedMeal resFoodThirty = bulking.getPlan(35);

        /*
        Expected outcomes:
        resFoodTen: 900 calories for 10, 5 base cost.
        resFoodTwenty: 1700 calories for 20, 5 base cost.
        resFoodThirty: 2300 calories for 30, 5 base cost.
         */

        assertEquals(900, resFoodTen.calories);
        assertEquals(15, resFoodTen.cost, .001);
        //If here, the budget 15 case worked.
        assertEquals(1700, resFoodTwenty.calories);
        assertEquals(25, resFoodTwenty.cost, .001);
        //If here, the budget 25 case worked.
        assertEquals(2300, resFoodThirty.calories);
        assertEquals(35, resFoodThirty.cost, .001);
        //If here, the budget 35 case worked.


    }

    @Test
    public void twoRestaurantSimple(){
        int[][] calories = new int[2][3];
        double[][] cost = new double[2][3];
        calories[0][1] = 1000;
        calories[0][2] = 200;
        calories[1][1] = 1000;
        calories[1][2] = 700;
        cost[0][0] = 2;
        cost[0][1] = 8;
        cost[0][2] = 10;
        cost[1][0] = 3;
        cost[1][1] = 10;
        cost[1][2] = 5;

        /*
        Expected:
        Budget is 12: Visit only restaurant 0, get 1000 calories.
        Budget is 20: Visit restaurant 0, get 1000 calories. Visit restaurant 1, get another 700.
         */
        BulkingUp bulking = new BulkingUp(calories, cost);
        PlannedMeal bud12 = bulking.getPlan(12.0);
        PlannedMeal bud20 = bulking.getPlan(20.0);

        assertEquals(1000, bud12.calories);
        assertEquals(12, bud12.cost, .001);
        //If here, budget of 12 case passed.

        assertEquals(1700, bud20.calories);
        assertEquals(20, bud20.cost, .001);
        //If here, budget of 20 case passed.
    }

    @Test
    public void oneRestaurantLong(){

    }

    @Test
    public void twoRestaurantLong(){

    }

}
