package Java8.BuilderPattern.Challenge.ConcreteBuilder;

import Java8.BuilderPattern.Challenge.Builder.MealBuilderInterface;
import Java8.BuilderPattern.Challenge.ClassHierarchy.Pepsi;
import Java8.BuilderPattern.Challenge.ClassHierarchy.VegBurger;
import Java8.BuilderPattern.Challenge.Product.Meal;

public class VegMealBuilderInterface implements MealBuilderInterface {

    private Meal meal;

    public VegMealBuilderInterface() {
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
