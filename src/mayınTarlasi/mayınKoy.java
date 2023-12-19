package mayınTarlasi;

import java.util.Random;

public class mayınKoy {
	Random random =new Random();
	int mayın_satır;
	int mayın_sutun;
	
	public mayınKoy(String mayın[][]) {
		
		
		for(int i=0;i<4;i++)
		{
			
			mayın_satır=random.nextInt(4);
			mayın_sutun=random.nextInt(4);
			if(mayın[mayın_satır][mayın_sutun].equals("X"))
			{
				i--;
				
			}
			else
			mayın[mayın_satır][mayın_sutun]="X";
		}
		
		
	}
	

}
