package SwordToOffer;


/**
 * 
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @author Mr.X
 *
 */

public class colina002 {
	public static void main(String args[]) {
		
		//Scanner sca = new Scanner(System.in);
		
		//String sb = sca.next();
		
		StringBuffer str = new StringBuffer("we are happy");
		
		System.out.println(replacement(str));
	}

	public static String replacement(StringBuffer str) {
		
		int space = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                space ++;
            }
        }
        
        int oldlength = str.length(); // 原字符串长度   
        int newlength = oldlength + space * 2; // 新字符串长度
        
        str.setLength(newlength);  
        int oldindex = oldlength - 1;  // 原长度下标  
        int newindex = newlength - 1;  // 新长度下标  
        
        for (int i = oldindex; i >= 0; i--) {  
            if (str.charAt(i) == ' ') {    
                str.setCharAt(newindex--, '0');  
                str.setCharAt(newindex--, '2');  
                str.setCharAt(newindex--, '%');  
            } else {  
                str.setCharAt(newindex--, str.charAt(i));  
            }  
        }  
        
        return str.toString(); 
	}
}
