package exercises.technology;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Program {
    @Test
    public void testComputer(){
        Computer test_Computer = new Computer("Windows", 64, 15.0, 50.0);
        assertEquals(64, test_Computer.getMemorySize(), .001);
        assertEquals(15.0, test_Computer.getDisplaysize(), .001);
        assertEquals(50.0, test_Computer.getWeight(), .001);

    }

    @Test
    public void testLaptop(){
        Laptop test_Laptop = new Laptop("Windows", 64, 15.0, 50.0,3);
        assertEquals(3,test_Laptop.getNumberOfUSBPorts());
    }
    @Test
    public void testweight(){
        //Computer test_Computer = new Computer("Windows", 64, 15.0, 50.0);
        Laptop laptop = new Laptop("Windows", 64, 15.0, 50.0,3);

    }
}
