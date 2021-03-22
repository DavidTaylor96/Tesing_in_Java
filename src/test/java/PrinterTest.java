import org.junit.Test;

import java.awt.print.Paper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void hasPaperToPrint(){
        printer.print(10, 5);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void hasTheTonerBeenUsed(){
        printer.tonerUsed(5);
        assertEquals(95, printer.getToner());
    }

}
