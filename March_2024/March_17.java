import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class March_17 {
    class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int value : head1) {
            set.add(value);
        }
        
        
        for(int value : head2) {
            if(set.contains(x - value)) {
                count++;
            }
        }
        
        return count;
    }
}
    
}
