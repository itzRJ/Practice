package test.java;

import main.java.ConnectionPool;
import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolTest {
    @Test
    public void testGetInstance()
    {
        ConnectionPool lConnectionPool = ConnectionPool.getInstance();
        Assert.assertNotNull(lConnectionPool);
    }
}
