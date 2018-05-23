package Day01;

public class L9 {

	public static void main(String[] args) {
		isPalindrome(1000030001);

	}
    public static boolean isPalindrome(int x) {
        String s = x+"";
        char[] cs=s.toCharArray();
        int j=cs.length-1;
        boolean flag=true;
        for(int i=0;i<cs.length/2;i++){
            if(cs[i]!=cs[j]){
                flag=false;
            }
            j--;
        }
        return flag;
    }

}
