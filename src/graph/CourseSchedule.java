package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ZoeLiu on 7/6/15.
 * There are a total of n courses you have to take, labeled from 0 to n - 1.

 Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed
 as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

 For example:

 2, [[1,0]]
 There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.

 2, [[1,0],[0,1]]
 There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you
 should also have finished course 1. So it is impossible.

 Key Problem:
 Detect circle in graph.

 Find all no prerequisite courses and then calculate new no prerequisite courses based on it.
 First ,caculate prerequisite of each course.
 */
public class CourseSchedule {

        public boolean canFinish(int numCourses, int[][] prerequisites) {

        int len=prerequisites.length;
        if(numCourses==0 || prerequisites==null || len==0) return true;

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
        int courseTaken=nopreQueue.size();
        while(!nopreQueue.isEmpty())
        {
            int top=nopreQueue.remove();
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
        return numCourses==courseTaken;

    }

}
