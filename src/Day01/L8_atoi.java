package Day01;

public class L8_atoi {

	public static void main(String[] args) {
		String s="  -42";
		System.out.println(myAtoi(s));
	}
	public  static int myAtoi(String str) {
        if(str.equals("")||str.equals("+")||str.equals("-")){
            return 0;
        }
        String result="";
        int n=0;
        System.out.println(str.charAt(n));
        while(n<str.length()&&str.charAt(n)==' '){
            n++;
        }
        if(n>=str.length()){
            return 0;
        }
        boolean findNum=false;
        boolean keep=true;

        for(int i=n;i<str.length();i++){
            if(keep){             
                if(findNum&&(!isInt(str.charAt(i)))){
                    keep=false;
                    break;
                }
                if(isInt(str.charAt(i))){
                    findNum=true;
                }
            }else{
                break;
            }
            result+=str.charAt(i);
        }
        System.out.println(result);
        if((!isInt(result.charAt(0)))&&(!ifSym(result.charAt(0)))){
            return 0;
        }  
        if(result.length()>2&&(!isInt(result.charAt(1)))){
            return 0;
        }
        int symb=1;
        int ans=0;

        if(ifSym(result.charAt(0))){
            symb=isSym(result.charAt(0)) ;
            ans = cal(result,1,symb);
        }else{
            ans =cal(result, 0,symb);
        }
        return ans;        
    }
    public  static boolean isInt(char c){
        if(c>='0'&&c<='9'){
            return true;
        }else{
            return false;
        }
    }
    public  static boolean ifSym(char c){
        if(c=='+'|| c=='-'){
            return true;
        }else{
            return false;
        }
    }
    public  static int isSym(char c){
        if(c=='+'){
            return 1;
        }else if(c=='-'){
            return -1;
        }else{
            return 0;
        }
    }
    public static int cal(String s,int start,int flag){
        long ans=0;
        boolean oneTimeFlag=true;
        for(int i=start;i<s.length();i++){
            ans=ans*10+flag*Integer.parseInt(String.valueOf(s.charAt(i)));//Integer.parseInt(String.valueOf(s.charAt(i)));
            if(ans>=Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(ans<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)ans;
        
    }
}

