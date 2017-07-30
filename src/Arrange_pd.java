import java.io.*;

public class Arrange_pd
{
	Read_gesture rg=new Read_gesture();
	Get_sha sha=new Get_sha();
	String testNum="";
    public void permutation(String[] cs, int index)
	{

		

		if (index == cs.length) 
		{ 
			testNum = "";
			for (String temp:cs)
			{
				testNum = testNum + temp;
			}

			
			//System.out.println(s);

			if (rg.readgest.equals(sha.sha1code(testNum)))
			{
				if(rg.statement==false)
                         new Main().Found_d(testNum);
                         rg.statement = true;//防止重复打印
				}     
		}
		//System.out.println(new String);



//运算，不关心

		for (int i = index; i < cs.length; i++)
		{

			swap(cs, index, i);

			permutation(cs, index + 1);

			swap(cs, index, i); // 再次交换，保持原状

		}

	}



	private void swap(String[] cs, int index, int target)
	{

		String tmp = cs[index];

		cs[index] = cs[target];

		cs[target] = tmp;

	}


}

