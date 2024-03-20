package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor Singleton() is not visible
        // Singleton object = new Singleton();

        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // show the message
        singleton.showMessage();
    }
}