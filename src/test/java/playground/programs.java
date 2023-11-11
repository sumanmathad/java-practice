package playground;

import java.util.Arrays;

public class programs {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFloorCeil(new int[]{2, 3, 4,4, 7, 8, 10},11)));
    }

    private static int[] findFloorCeil(int[] nums, int x) {

        int[]ans ={x,x};

        int left=0,right=nums.length-1;
        while(left<=right){
            int mid= left+((right-left)/2);
            if(nums[mid]==x){
                //System.out.println(Arrays.toString(ans));
                return(ans);
            } else if (nums[mid]<x) {
                left=mid+1;
            }
            else right=mid-1;
        }
        ans[0]=nums[right]; ans[1]=nums[left];
        return ans ;
    }


}
