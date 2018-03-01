import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "DS246790T", 70000, "CEO", 121123.32);
    }

    @Test
    public void getName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("DS246790T", director.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(70000, director.getSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(21000, director.raiseSalary(.30), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(1400, director.payBonus());
    }

    @Test
    public void getDeptName(){
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(121123.32, director.getBudget(), .10);
    }
}
