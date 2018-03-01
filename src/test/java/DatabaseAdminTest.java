import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Danny", "JG098765C", 20000);
    }

    @Test
    public void getName(){
        assertEquals("Danny", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JG098765C", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(20000, databaseAdmin.getSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(6000, databaseAdmin.raiseSalary(.30), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(200, databaseAdmin.payBonus());
    }

}
