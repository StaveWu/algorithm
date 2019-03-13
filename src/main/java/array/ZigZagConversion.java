package array;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>(numRows);
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        // assign row values
        int currentRow = 0;
        boolean goingDown = false;
        for (int i = 0; i < s.length(); i++) { // here loop can be written as: for (char c: s.toCharArray())
            char c = s.charAt(i);
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1: -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row:
             rows) {
            res.append(row);
        }
        return res.toString();
    }
}
