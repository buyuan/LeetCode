package Day01;

public class Q8 {
	public static void main(String[] args){
		
		Solution S = new Solution();
		int ss=S.myAtoi("9223372036854775808");
		System.out.println(ss);
		
	}
}	
	class Solution {
	    public int myAtoi(String str) {
	        long result = 0;
	        boolean b = false;
	        str = str.trim();       //删除起始和结尾的空格
	        char[] chars = str.toCharArray();
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == '-') {
	                b = true;
	            }else if (chars[i] == '+') {
	            } else if (chars[i] > 47 && chars[i] < 58) {
	                result = result * 10 + chars[i] - 48;
	            }else {
	                break;
	            }
	            i++;
	            for (; i <chars.length ; i++) {
	                if (chars[i] > 47 && chars[i] < 58){
	                    result = result * 10 + chars[i] - 48;
	                    if (result > Integer.MAX_VALUE) {
	                        break;
	                    }
	                } else {
	                    break;
	                }
	            }
	            break;
	        }
	        if (b) {
	            result = -result;
	        }
	        if (result > Integer.MAX_VALUE) {
	            return Integer.MAX_VALUE;
	        } else if(result < Integer.MIN_VALUE){
	            return Integer.MIN_VALUE;
	        }
	        return (int) result;
	    }
	}

