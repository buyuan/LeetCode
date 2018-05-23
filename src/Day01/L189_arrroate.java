package Day01;

public class L189_arrroate {

	public static void main(String[] args) {
		int[] nums={1,2,3,4,5,6,7}; 
		int k=1;
        int[] newNums=new int[nums.length];
        int newIndex=0;
        for(int i=0;i<nums.length;i++){
            newIndex=(i+k)%nums.length;
            newNums[newIndex]=nums[i];
        }
        for(int i:nums){
        	System.out.print(i+",");
        }
        System.out.println();
        nums=newNums;	
        for(int i:nums){
        	System.out.print(i+",");
        }

	}
    public static void rotate(int[] nums, int k) {
        int[] newNums=new int[nums.length];
        int newIndex=0;
        for(int i=0;i<nums.length;i++){
            newIndex=(i+k)%nums.length;
            newNums[newIndex]=nums[i];
        }
        nums=newNums;
    }

}
