package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(nums, target));
    }
}