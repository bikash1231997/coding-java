// Eager Initialization
public class SingletonEager {
    // Step 1: Create a private static final instance
    private static final SingletonEager INSTANCE = new SingletonEager();

    // Step 2: Private constructor to prevent instantiation
    private SingletonEager() {}

    // Step 3: Public method to provide access to the instance
    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}

// Lazy Initialization
public class SingletonLazy {
    // Step 1: Private static instance, not initialized
    private static SingletonLazy instance;

    // Step 2: Private constructor to prevent instantiation
    private SingletonLazy() {}

    // Step 3: Public method to provide access to the instance
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy(); // Create the instance if not already created
        }
        return instance;
    }
}

// Double-Checked Locking (Thread-Safe)
public class SingletonDoubleCheckedLocking {
    // Step 1: Private static instance, not initialized
    private static volatile SingletonDoubleCheckedLocking instance;

    // Step 2: Private constructor to prevent instantiation
    private SingletonDoubleCheckedLocking() {}

    // Step 3: Public method to provide access to the instance
    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking(); // Create the instance if not already created
                }
            }
        }
        return instance;
    }
}


