package Java8.BuilderPattern.Challenge.Builder;

import Java8.BuilderPattern.Challenge.Product.Meal;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
