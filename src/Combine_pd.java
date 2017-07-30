import java.util.*;

public class Combine_pd
{
	static Arrange_pd arr=new Arrange_pd();
	public static void combine(String chs[]){  
		if(chs.length == 0) return ;  

		Stack<String> stack = new Stack<String>();  
		for(int i = 4; i <= chs.length; i++){  
			   combine(chs, 0, i, stack);  
		}  
	}  
//从字符数组中第begin个字符开始挑选number个字符加入stack中  
	public static String[] combine(String []chs, int begin, int number, Stack<String> stack){  
		if(number == 0){  
	//System.out.println(stack.toString()); 
			String s[]=new String[number];
			s= stack.toArray(s);
	//System.out.println(s);
		    arr.permutation(s,0);
	 
		}
		
		if(begin == chs.length){  
			return null; 
		}  
		stack.push(chs[begin]);  
		combine(chs, begin + 1, number - 1, stack);  
		stack.pop();  
		combine(chs, begin + 1, number, stack);  
		return null;
	}  
	
		
	
}
