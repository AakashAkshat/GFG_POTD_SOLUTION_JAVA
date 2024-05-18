class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here

        // Collections.sort(a);
        // return a.get(a.size()-1);

        int left = 0;
        int right = a.size() - 1;

        while (left < right) 
        {
            int mid = left + (right - left) / 2;

            if (a.get(mid) > a.get(right))
                right = mid;
            else
                left = mid + 1;
        }

        return a.get(left);
    }
}