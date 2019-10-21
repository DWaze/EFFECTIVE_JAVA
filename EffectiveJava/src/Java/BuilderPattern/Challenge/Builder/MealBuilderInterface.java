package Java.BuilderPattern.Challenge.Builder;

import Java.BuilderPattern.Challenge.Product.Meal;

public interface MealBuilderInterface {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
