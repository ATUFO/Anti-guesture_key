import java.util.*;
import java.io.*;
import org.apache.http.*;

public class Main
{  public static long start= System.currentTimeMillis();
	public static Run_pd run;
	public static void main(String[] args)
	{//String ac[]=new int[100];
		//sha s=new sha();
	//String o=sha.ith(0)+sha.ith(1)+sha.ith(2)+sha.ith(3);
		//System.out.println(sha.getSha1("\0x00\0x01\0x02\0x03"));
		
		//sha s=new sha();
		//
		//System.out.println(s.sha1code("00010203"
		 run =  new Run_pd();
	     run.start();
		
		}
		
	
		public static void Found_d(String password){
			System.out.println("图案锁密码是"+password);
			long end= System.currentTimeMillis();
			System.out.println("总耗时"+(end-Main.start)/1000.00000+"s"+"\n       Design by TAOFU");

			
		}
		
		
}
