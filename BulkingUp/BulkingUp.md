# Bulking Up


### Scenario
________________
You are a wrestler about to compete in the Charlottesville Area Scheduled Tournaments (CASTS, for short) wrestling competition. It's not very formal or anything, but you would like to try to win your weight class.

You are currently in the 174 lb weight class which is, surprisingly, very crowded. However, the heavyweight class, 183-285 lb, is basically empty. You, being clever, decide to bulk up before the big day and, hopefully, reach the next class. Of course, you're not a fan of cooking, so decide that you will visit local restaurants to get the food that you need.

The next day, after a hearty breakfast, you go to talk to your good friend and CPA, Chuck. Chuck is really not a fan of the idea and reminds you of your current financial situation (it's not very good). However, he notes, it is possible with some shuffling of financials, to budget it in. He gives you an amount that you could use each day.

You decide that the most important factor is calories, and write a Java program that will maximize for the number of calories given menus from restaurants with prices and a budget. You also want your wrestling buddies to be able to use this program when you're done with it, so you make it efficient, at least partially to impress them.

You are not a picky eater, but easily bore of the same food. As such, you will order only one of each food item at a restaurant. You decide you could visit several different restaurants for a single meal if it would be more economical in relation to the calories, but there is a base fee you must pay at each restaurant, regardless of how many food items you order. This will be added on to the total food cost. For instance, if you visit a restaurant with a base fee of $2 and order $10 of food, the total will be $12. If you order $5 of food, the total will be $7.

____________________

### The Deats

Two 2D arrays will be passed into your program, one for calories and one for cost. The "getPlan()" method will take in a budget and construct a plan based on the budget, returning a "PlannedMeal" object. PlannedMeal contains a calorie count and total cost of the meal. There are several test cases that should help debug the program, with a hidden test case or two for runtime.

In the cost 2D array, the 0 index will hold the gas cost of getting to the restaurant, which must be factored into the cost if the restaurant is visited. For instance, take the following line:
```
cost[2][0] 
```
This references the 3rd restaurant's base fee, while a line such as this:
```
cost[2][1] 
```
Refers to the first food item on the menu at that restaurant. To get the number of calories of this particular item, a line such as the following may be used:
```
calories[2][1] 
```

**Please note: This is was written by someone who knows nothing about wrestling, financials, or the restaurant industry. Please exercise a lot of suspension of disbelief. **