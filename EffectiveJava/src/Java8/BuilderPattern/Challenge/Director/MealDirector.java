package Java8.BuilderPattern.Challenge.Director;

import Java8.BuilderPattern.Challenge.Builder.MealBuilder;

public class MealDirector {
    MealBuilder mBuilder;

    public void construct (MealBuilder mBuilder) {
        this.mBuilder = mBuilder;
        mBuilder.buildBurger();
        mBuilder.buildDrink();
    }

}
