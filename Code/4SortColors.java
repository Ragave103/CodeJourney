// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.



class Solution {

    public static int[] swap(int []nums,int low,int high)
    {
        int temp = nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
        return nums;

    }
    public void sortColors(int[] nums) {

        int low=0,high=nums.length-1,mid=low;




        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                nums = swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                nums = swap(nums,high,mid);
                high--;
            }

            
        }


        
    }
}
