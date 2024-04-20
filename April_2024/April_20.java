class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : arr1) {
            set.add(num);
        }
        
        for(int num : arr2) {
            set.add(num);
        }
        
        for(int num : set) {
            ans.add(num);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}



