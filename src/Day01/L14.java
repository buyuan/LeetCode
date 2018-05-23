package Day01;

public class L14 {

	public static void main(String[] args) {
		String[] strs={"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if (strs.length==0) {
        	return "";
        }
        for(int i=0;i<len;i++){
            if(strs[i].length()==0){
                return "";
            }
        }
        int shortest_len=strs[0].length();
        for(int i=0;i<len-1;i++){
             if(shortest_len>strs[i+1].length()){
                 shortest_len=strs[i+1].length();
             }
        }
        String result="";
        char general=' ';
        boolean flag=true;
        for(int i=0;i<shortest_len;i++){
            general=strs[0].charAt(i);
            for(int j=1;j<len;j++){
                if(general!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
               result+=String.valueOf(general);
             }
        }
        return result;
    }

}
