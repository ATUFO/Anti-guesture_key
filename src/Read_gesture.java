
import java.io.*;
public class Read_gesture
{
	public static String readgest;
	public static boolean statement=false;
	public static void Read_gesture(){
	String path="/storage/external/gesture.key";

		try
		{
			readgest=Get_sha.format(Get_sha.readFile(path));
		}
		catch (IOException e)
		{}
	}
	
}
