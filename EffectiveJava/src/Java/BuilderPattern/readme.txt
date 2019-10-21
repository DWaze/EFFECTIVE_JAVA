Hi Bilel,

This project is composed of two sections, the first one introduces an example in "Example" package, and the second one
is a challenge of a course that I implemented from scratch in the "Challenge" package.

The example is pretty simple and i have added comments for explanation.

The challenge is a little bigger, the composition of the challenge is as follows :

    1- Builder : contains a MealBuilder interface the describe what the concrete builder should implement.
    2- ClassHierarchy : contains a set of interfaces classes and abstract classes needed in our example.
    3- ConcreteBuilder : implements the interface MealBuilder for different kind of Meals, one for Vegetarian meals and
       and the other for non vegetarian meals ,we are using what we have defined in ClassHierarchy.
       The ConcreteBuilder is responsible for builder either a Veg meal of a Non Veg meal.
    4- Director is using the builder to create any kind of meals.
    5- Product in our case the product is s meal so we implemented a class that defines what the meal is.
    6- a Test main class is just to demonstrate how the builder design pattern works.