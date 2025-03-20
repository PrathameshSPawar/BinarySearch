class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=1000000000;
        //int mid=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isValid(mid,piles,h))
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean isValid(int k,int arr[],int h)
    {
        long banana_speed=0;
        for(int n:arr)
        {
            banana_speed+=n/k;
            if(n%k!=0)
            {
                banana_speed++;
            }
        }

        return banana_speed<=h;
    }
}
