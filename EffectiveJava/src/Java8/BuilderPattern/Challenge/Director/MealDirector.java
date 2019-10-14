package Java8.BuilderPattern.Challenge.Director;

import Java8.BuilderPattern.Challenge.Builder.MealBuilderInterface;

public class MealDirector {
    MealBuilderInterface mBuilder;

    public void construct (MealBuilderInterface mBuilder) {
        this.mBuilder = mBuilder;
        mBuilder.buildBurger();
        mBuilder.buildDrink();
    }
}
