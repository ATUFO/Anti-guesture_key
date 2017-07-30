
public class Run_pd extends Thread
{

	@Override
	public void run()
	{

		String a[]=new String[]{"00","01","02","03","04","05","06","07","08"};
		new Read_gesture().Read_gesture();
		Combine_pd.combine(a);
		// TODO: Implement this method
		super.run();
	}
			

			}
