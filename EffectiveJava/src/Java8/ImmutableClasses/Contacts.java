package Java8.ImmutableClasses;

public final class Contacts {

//   to make a class immutable we need to follow the steps below:
//   1- Making the class final to avoid breaking immutability when inheritance and polymorphism
//   2- Making all the fields final so they will never change once an object is created
//   Advantage of immutable objects:
//   1- Thread safe can be shared between threads without using synchronisation
//   2- An immutable object when modified will not the change the current object but will create a new one
//   Disadvantage of immutable objects:
//   1- They create a lot of garbage because immutable objects tends to duplicate a lot when modified, like Strings

    private final String name;
    private final String mobile;

    Contacts(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
}
