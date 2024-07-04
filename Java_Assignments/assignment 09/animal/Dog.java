package animal;

public class Dog implements Animal
{
    @Override
    public String eat() {
        return "cereal";
    }

    @Override
    public String sleep() {
        return "at 10pm";
    }

    @Override
    public String makeSound() {
        return "bhow bhow";
    }
}