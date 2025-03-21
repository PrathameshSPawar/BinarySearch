import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("\nEnter the Count of ArrayEle & K: ");
		Scanner pp=new Scanner(System.in);
		int n=pp.nextInt(),k=pp.nextInt();
		System.out.print("\nEnter Element one by one: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=pp.nextInt();
		}
		
		Arrays.sort(arr);
		int left=1,right=arr[n-1],ans=0;
		while(left<=right)
		{
		    int mid=left+(right-left)/2;
		    int required=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%mid==0)
		        {
		            required+=(arr[i]/mid)-1;
		        }else{
		            required+=(arr[i]/mid);
		        }
		    }
		    if(required<=k)
		    {
		        ans=mid;
		        right=mid-1;
		    }else{
		        left=mid+1;
		    }
		}
		System.out.println(ans);
	}
}
