package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourSumTest {

    @Test
    public void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(new FourSum().fourSum(nums, target));
    }
}