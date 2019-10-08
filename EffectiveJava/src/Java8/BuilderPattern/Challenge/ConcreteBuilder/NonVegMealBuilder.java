package Java8.BuilderPattern.Challenge.ConcreteBuilder;

import Java8.BuilderPattern.Challenge.Builder.MealBuilder;
import Java8.BuilderPattern.Challenge.ClassHierarchy.ChickenBurger;
import Java8.BuilderPattern.Challenge.ClassHierarchy.Coke;
import Java8.BuilderPattern.Challenge.Product.Meal;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal;

    public NonVegMealBuilder() {
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
