package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 4;
        assertEquals(2, new ThreeSumClosest().threeSumClosest(nums, target));
    }
}