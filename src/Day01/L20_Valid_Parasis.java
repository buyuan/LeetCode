package Day01;
import java.util.LinkedList;
public class L20_Valid_Parasis {

	public static void main(String[] args) {
		String s="(";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
        char[] chs=s.toCharArray();
        char[] stack=new char[s.length()];
        char r=' ';
        String couple="";
        int top=-1;
        for(char c:chs){
            if(c=='('||c=='{'||c=='['){
            	top++;
                stack[top]=c;      
            }else if(c==')'||c=='}'||c==']'){
            	if(top<0){
            		return false;
            	}
                r= stack[top];
                top--;
                couple=String.valueOf(r)+String.valueOf(c);
                if(!compareS(couple)){
                    return false;
                }
            }
        }
        if(top<0){
        	return true;
        }else{
        	return false;
        }
        
    }
    public static boolean compareS(String s){
        char l=s.charAt(0);
        char r=s.charAt(1);
        if( (l=='('&& r==')')||
            (l=='['&& r==']')||
            (l=='{'&& r=='}')
          ){return true;           
        }else{
            return false;
        }
    }

}
