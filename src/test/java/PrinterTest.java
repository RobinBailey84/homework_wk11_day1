import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 1000);
    }

    @Test
    public void hasPaper(){
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void prints(){
        printer.prints(10, 5);
        assertEquals(450, printer.getPaper());
    }

    @Test
    public void notEnoughPaper(){
        printer.prints(100, 10);
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void refillPrinter(){
        assertEquals(1000, printer.fillPrinter());
    }

    @Test
    public void hasToner(){
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void reducesToner(){
        printer.prints(50, 1);
        assertEquals(950, printer.getToner());
    }
}
