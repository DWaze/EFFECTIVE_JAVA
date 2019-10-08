package Java8.BuilderPattern.Challenge.ConcreteBuilder;

import Java8.BuilderPattern.Challenge.Builder.MealBuilder;
import Java8.BuilderPattern.Challenge.ClassHierarchy.Pepsi;
import Java8.BuilderPattern.Challenge.ClassHierarchy.VegBurger;
import Java8.BuilderPattern.Challenge.Product.Meal;

public class VegMealBuilder implements MealBuilder {

    private Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
