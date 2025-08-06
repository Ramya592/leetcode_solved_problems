class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            int a=i+1;
            if((nums[i]<target || nums[i]==target)&&(nums[i]>target || nums[i]==target)){
                index=i;
                break;
            }
            if(a<nums.length){
                if((nums[i]<target || nums[i]==target)&&(nums[a]>target || nums[a]==target)){
                    index=a;
                }
            }
            if(target>nums[nums.length-1]){
                index=nums.length;
            }
        }
        return index;
    }
}

