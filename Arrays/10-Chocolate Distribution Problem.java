class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(n==0 || m==0){
            return 0;
        }
        Collections.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=a.get(i+m-1)-a.get(i);
            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;
    }
}