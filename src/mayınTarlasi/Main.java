package mayınTarlasi;
import mayınTarlasi.mayınKontrol;
import mayınTarlasi.mayınKoy;

public class Main {

	

		public static void main(String[] args) 
		{
			String mayın[][]=new String[4][4];
			
			System.out.println("Mayın tarlası oyununa hoşgeldiniz");
			String a[][]=new String[4][4];
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					a[i][j]=" ";
					mayın[i][j]="";
				}
				
			}
			System.out.println("_________________");
			System.out.println("|  "  +" |   " + "|  " + " |   " + "|  ");
			System.out.println("_________________");		
			System.out.println("|  "  +" |   " + "|  " + " |   " + "|  ");
			System.out.println("_________________");
			System.out.println("|  "  +" |   " + "|  " + " |   " + "|  ");
			System.out.println("_________________");
			System.out.println("|  "  +" |   " + "|  " + " |   " + "|  ");
			System.out.println("_________________");
			System.out.println(" ");
			
			
			
			mayınKoy mayınKoy=new mayınKoy(mayın);	
			mayınKontrol mayınKontrol=new mayınKontrol(a,mayın);			 
		
			
			
			
			
			
		}
	}
