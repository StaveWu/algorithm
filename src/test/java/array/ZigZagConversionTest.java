package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convert() {
        String s = "PAYPALISHIRING";
        assertEquals("PAHNAPLSIIGYIR", new ZigZagConversion().convert(s, 3));
    }
}