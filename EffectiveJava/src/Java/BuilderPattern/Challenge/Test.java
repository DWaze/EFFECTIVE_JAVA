package Java.BuilderPattern.Challenge;

import Java.BuilderPattern.Challenge.Builder.MealBuilderInterface;
import Java.BuilderPattern.Challenge.ConcreteBuilder.NonVegMealBuilderInterface;
import Java.BuilderPattern.Challenge.ConcreteBuilder.VegMealBuilderInterface;
import Java.BuilderPattern.Challenge.Director.MealDirector;
import Java.BuilderPattern.Challenge.Product.Meal;

public class Test {
    public static void main(String[] args) {
        System.out.println("****  Meal Pattern Demo ****");

        MealDirector mealDirector = new MealDirector();

        MealBuilderInterface vegMealBuilderInterface = new VegMealBuilderInterface();

        MealBuilderInterface nonVegMealBuilderInterface = new NonVegMealBuilderInterface();

        mealDirector.construct(vegMealBuilderInterface);

        Meal meal1 = vegMealBuilderInterface.getMeal();
        meal1.showItems();

        mealDirector.construct(nonVegMealBuilderInterface);

        Meal meal2 = nonVegMealBuilderInterface.getMeal();
        meal2.showItems();

    }
}
