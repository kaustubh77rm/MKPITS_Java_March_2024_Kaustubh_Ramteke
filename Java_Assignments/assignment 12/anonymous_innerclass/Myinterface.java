public interface Myinterface {
    void myMethod();
}

public static void main(String[] args) {
    Myinterface mi = new Myinterface() {
        @Override
        public void myMethod() {
            System.out.println("Inside anonymous inner class");
        }
    };
    mi.myMethod();
}