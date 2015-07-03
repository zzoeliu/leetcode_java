package string;

/**
 * Created by ZoeLiu on 7/2/15.
 *
 * Given a sorted integer array without duplicates, return the summary of its ranges.

 For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

 We need to variable to record the start and end point.

 specofy the only senario that needs to move forward that is end+1 < length && [end]+1=[end+1]
 other senarios we need to add a new range, which could be divided to two conditions: start=end or start < end

 */
import java.util.ArrayList;

public class SummaryRange {
    public ArrayList<String> summaryRanges(int[] nums) {

        ArrayList<String> result=new ArrayList<String>();

        if(nums==null || nums.length<1)
            return result;

        int start=0, end =0;
        while(end<nums.length)
        {
            if(end+1<nums.length && nums[end]+1==nums[end+1])
            {
                end++;
            }
            else
            {
                if(start==end)
                {
                    result.add(Integer.toString(nums[end]));
                }else
                {
                    String cur=nums[start]+"->"+nums[end];
                    result.add(cur);
                }
                ++end;
                start=end;
            }
        }
        return result;

    }
}
