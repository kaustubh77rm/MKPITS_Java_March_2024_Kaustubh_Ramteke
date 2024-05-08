package animal;

public class Cat implements Animal
{
    @Override
    public String eat() {
        return "milk";
    }

    @Override
    public String sleep() {
        return "at 7pm";
    }

    @Override
    public String makeSound() {
        return "meow meow";
    }
}