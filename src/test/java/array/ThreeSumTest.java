package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumTest {

    ThreeSum solution = new ThreeSum();

    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums));
    }
}