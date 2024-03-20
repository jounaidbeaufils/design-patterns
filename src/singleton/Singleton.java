package singleton;

public class Singleton {
    // Private static variable of the same class that is the only instance of the class
    private static Singleton instance;

    // Private constructor to restrict instantiation of the class from other classes
    private Singleton() {}

    // Public static method that returns the instance of the class, this is the global access point for outer classes to get the instance of the singleton class
    public static Singleton getInstance() {
        if (instance == null) { // if there is no instance available, create a new one
            instance = new Singleton();
        }
        return instance;
    }

    // method to show a message
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
