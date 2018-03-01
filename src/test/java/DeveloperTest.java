import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sophia", "GY123456H", 25000);
        }

    @Test
    public void getName(){
        assertEquals("Sophia", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("GY123456H", developer.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(7500, developer.raiseSalary(.30), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(250, developer.payBonus());
    }

}
