package animal;

public class Bird implements Animal
{
    @Override
    public String eat() {
        return "beans";
    }

    @Override
    public String sleep() {
        return "at 11:59pm";
    }

    @Override
    public String makeSound() {
        return "chirp";
    }
}