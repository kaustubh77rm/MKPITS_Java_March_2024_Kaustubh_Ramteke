package onlineshoppingsystem;
class Customer implements User {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}