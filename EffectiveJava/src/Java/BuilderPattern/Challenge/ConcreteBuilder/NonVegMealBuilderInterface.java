package Java.BuilderPattern.Challenge.ConcreteBuilder;

import Java.BuilderPattern.Challenge.Builder.MealBuilderInterface;
import Java.BuilderPattern.Challenge.ClassHierarchy.ChickenBurger;
import Java.BuilderPattern.Challenge.ClassHierarchy.Coke;
import Java.BuilderPattern.Challenge.Product.Meal;

public class NonVegMealBuilderInterface implements MealBuilderInterface {
    private Meal meal;

    public NonVegMealBuilderInterface() {
        this.meal = new Meal();
    }

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
