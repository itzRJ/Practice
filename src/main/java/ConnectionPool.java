package main.java;

/**
 * Singleton impl
 * 1. Create a private constructor
 * 2. Create class instance
 * 3. Create public/global access point or a static initializer for instance
 */
public class ConnectionPool {
    //eager creation
    private static ConnectionPool instance;

    private ConnectionPool(){}

    /**
     * on demand creation or lazy loading
     * Creation of instance while calling public endpoint
     *
     * @return ConnectionPoolInstance
     */
    public static ConnectionPool getInstanceLazy(){
        if(instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    /**
     * Double Check Locking(multithreading): Sync method -> Sync block
     *
     * @return ConnectionPoolInstance
     */
    public synchronized static ConnectionPool getInstanceLazyMT(){
        if(instance == null) {
            synchronized (ConnectionPool.class){
                if (instance == null)
                    instance = new ConnectionPool();
            }
        }
        return instance;
    }

    private static ConnectionPool instanceEager = new ConnectionPool();
    /**
     * Eager creation: Creation at time of class loading
     *
     * @return ConnectionPoolInstance
     */
    public static ConnectionPool getInstance()
    {
        return instanceEager;
    }
}
