//new commit
import java.util.*;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int numsMax = Collections.max(nums);
        int numsMin = Collections.min(nums);
        int numsDiff = numsMax - numsMin;

        return numsDiff;
    }
}
