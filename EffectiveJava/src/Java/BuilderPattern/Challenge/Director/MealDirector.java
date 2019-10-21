package Java.BuilderPattern.Challenge.Director;

import Java.BuilderPattern.Challenge.Builder.MealBuilderInterface;

public class MealDirector {
    MealBuilderInterface mBuilder;

    public void construct (MealBuilderInterface mBuilder) {
        this.mBuilder = mBuilder;
        mBuilder.buildBurger();
        mBuilder.buildDrink();
    }
}
