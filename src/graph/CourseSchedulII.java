package graph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ZoeLiu on 7/6/15.
 * There are a total of n courses you have to take, labeled from 0 to n - 1.

 Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.

 There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

 For example:

 2, [[1,0]]
 There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1]

 4, [[1,0],[2,0],[3,1],[3,2]]
 There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0. So one correct course order is [0,1,2,3]. Another correct ordering is[0,2,1,3].

Note:
 If it is impossible to finish all courses, return an empty array.
 we need return new int[0],
 cant not just return null;
 */
public class CourseSchedulII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int len=prerequisites.length;
        if(len==0)
        {
            int[] result=new int[numCourses];
            for(int i=0;i<numCourses;i++)
            {
                result[i]=i;
            }
            return result;
        }

        int[] preCount=new int[numCourses];//len may be greater than numcourses, cause some courses may have several prerequisites.

        for(int i=0;i<len;i++)
        {
            preCount[prerequisites[i][0]]++;
        }

        LinkedList<Integer> nopreQueue=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++)
        {//caculate no pre courses
            if(preCount[i]==0)
                nopreQueue.add(i);
        }
        int[] result=new int[numCourses];
        int courses=0;
        int courseTaken=nopreQueue.size();
        while(!nopreQueue.isEmpty())
        {
            int top=nopreQueue.remove();
            result[courses++]=top;
            for(int i=0;i<len;i++)
            {
                if(prerequisites[i][1]==top)
                {
                    preCount[prerequisites[i][0]]--;
                    if(preCount[prerequisites[i][0]]==0)
                    {
                        nopreQueue.add(prerequisites[i][0]);

                        courseTaken++;
                    }
                }
            }
        }
        if(numCourses==courseTaken) return result;
        else
            return new int[0];


    }
}
