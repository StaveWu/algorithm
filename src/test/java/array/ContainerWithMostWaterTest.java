package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    public void maxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, solution.maxArea(height));

        int[] height2 = {1, 2};
        assertEquals(1, solution.maxArea(height2));

        // test executed time
        long start = System.nanoTime();
        solution.maxAreaSOTA(height);
        long end = System.nanoTime();
        System.out.println((end - start));
    }

    @Test
    public void maxAreaSOTA() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, solution.maxAreaSOTA(height));

        int[] height2 = {1, 2};
        assertEquals(1, solution.maxAreaSOTA(height2));

        // test executed time
        long start = System.nanoTime();
        solution.maxAreaSOTA(height);
        long end = System.nanoTime();
        System.out.println((end - start));
    }
}