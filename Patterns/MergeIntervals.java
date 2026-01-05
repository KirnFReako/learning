package Patterns;
import java.util.*;
public class MergeIntervals {

        public int[][] merge(int[][] intervals) {
            if(intervals.length == 0){
                return new int[0][0];
            }


<<<<<<< HEAD
            Arrays.sort(intervals,  Comparator.comparingInt(a -> a[0]));
=======
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
// What this means

// a is an int[] (an interval)

// a[0] is the start time

// Comparator.comparingInt creates a comparator that:

// Extracts a[0]

// Compares intervals by that value
>>>>>>> 86801e34d48fac053569dcaa7bd5f7266d77f936

            List<int[]> result = new ArrayList<>();

            result.add(intervals[0]);

            for(int i =1;i< intervals.length;i++){
                int[] last = result.get(result.size()-1);
                int[] current = intervals[i];

                if(current[0] <= last[1]){
                    last[1] = Math.max(last[1] , current[1]);

                }else{
                    result.add(current);
                }
            }
            return result.toArray(new int[result.size()][]);
        }
    }


