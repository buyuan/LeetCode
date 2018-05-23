package Day01;

import java.util.Arrays;

public class DeleteDup {

	public static void main(String[] args) {
		int[] nums={1,1,2};
		removeDuplicates(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}
    public static int removeDuplicates(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums=removeSingle(nums,i);
            }
        }
        return nums.length;
    }
    public static int[] removeSingle(int[] nums,int index){
        if(index==nums.length-1){
            Arrays.copyOf(nums,nums.length-1);
            return nums;
        }
        nums[index]=nums[nums.length-1];
        nums=Arrays.copyOf(nums,nums.length-1);
        for(int i=index;i<nums.length-1;i++){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }   
        return nums;
    }

}
