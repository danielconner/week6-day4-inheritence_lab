import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David", "JA123456F", 50000, "Logistics");
    }

    @Test
    public void getName(){
        assertEquals("David", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JA123456F", manager.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(15000.00, manager.raiseSalary(.30), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(500, manager.payBonus());
    }

    @Test
    public void getDeptName(){
        assertEquals("Logistics", manager.getDeptName());
    }




}
