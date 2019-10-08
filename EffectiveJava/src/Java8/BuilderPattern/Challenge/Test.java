package Java8.BuilderPattern.Challenge;

import Java8.BuilderPattern.Challenge.Builder.MealBuilder;
import Java8.BuilderPattern.Challenge.ConcreteBuilder.NonVegMealBuilder;
import Java8.BuilderPattern.Challenge.ConcreteBuilder.VegMealBuilder;
import Java8.BuilderPattern.Challenge.Director.MealDirector;
import Java8.BuilderPattern.Challenge.Product.Meal;

public class Test {
    public static void main(String[] args) {
        System.out.println("****  Restaurant Example ****");

        MealDirector mealDirector = new MealDirector();

        MealBuilder vegMealBuilder = new VegMealBuilder();

        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        mealDirector.construct(vegMealBuilder);

        Meal meal1 = vegMealBuilder.getMeal();
        meal1.showItems();

        mealDirector.construct(nonVegMealBuilder);

        Meal meal2 = nonVegMealBuilder.getMeal();
        meal2.showItems();

    }
}
