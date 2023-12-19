package mayınTarlasi;


	
	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class mayınKontrol {
		public int sayac=0;
		int i=0;
		Scanner sc=new Scanner(System.in);

		
		int secim_satir=0;
		int secim_sutun=0;
		
		
		public mayınKontrol(String a[][],String mayın[][]) {
			
			for(int i=0;i<12;i++)
			{
				for(int k=0;k<1;k++)
				{
									
					try {
						System.out.print("Satır numarasını giriniz : ");
						secim_satir=sc.nextInt();
						System.out.print("Sütun numarasını giriniz : ");
						secim_sutun=sc.nextInt();
						
									
					} 
					catch (InputMismatchException e) {
						
						System.out.println("Rakam giriniz");
						sc.nextLine();
						i--;
						break;
					}
				 	 
				 secim_satir--;
				 secim_sutun--;
			
			if(secim_satir<0||secim_sutun<0)
			{
				System.out.println("1 ila 4 arasında bir değer giriniz");
				i--;
				break;
			}
			 
			else if(secim_satir>3||secim_sutun>3)
			{
				System.out.println("1 ila 4 arasında bir değer giriniz");
				i--;
				break;
			}
				 
			else if(a[secim_satir][secim_sutun]!=" ")
				{
					 System.out.println("Farklı değer giriniz");
					 i--;
				}
				
				 
				 
			if(mayın[secim_satir][secim_sutun].equals("X"))
			{
				System.out.println("Bombaya Bastınız");
				for(i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						if(mayın[i][j].equals("X"))
						{
							a[i][j]=mayın[i][j];
						}
						
					}
				}
				System.out.println("_________________");
				System.out.println("| "+a[0][0]+" | "+a[0][1]+" | "+a[0][2]+" | "+a[0][3]+" |");
				System.out.println("_________________");		
				System.out.println("| "+a[1][0]+" | "+a[1][1]+" | "+a[1][2]+" | "+a[1][3]+" |");
				System.out.println("_________________");
				System.out.println("| "+a[2][0]+" | "+a[2][1]+" | "+a[2][2]+" | "+a[2][3]+" |");
				System.out.println("_________________");
				System.out.println("| " +a[3][0]+" | "+a[3][1]+" | "+a[3][2]+" | "+a[3][3]+" |");
				System.out.println("_________________");
				i=13;
				break;
			}
			
			
			
			//köşelerin kontrolü
			else if(secim_satir==0&&secim_sutun==0)
			{
				sayac=0;
				if(mayın[secim_satir][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				 if (mayın[secim_satir+1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir+1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				 a[secim_satir][secim_sutun]=Integer.toString(sayac);
				
			}
			
			
			else if(secim_satir==0&&secim_sutun==3)
			{
				sayac=0;
				if(mayın[0][2].equals("X"))
				{
					sayac++;
				}
				if (mayın[1][2].equals("X"))
				{
					sayac++;
				}
				if(mayın[1][3].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}
			else if(secim_satir==3&&secim_sutun==0)
			{
				sayac=0;
				if(mayın[2][0].equals("X"))
				{
					sayac++;
				}
				if (mayın[2][1].equals("X"))
				{
					sayac++;
				}
				if(mayın[3][1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}
			else if(secim_satir==3&&secim_sutun==3)
			{
				sayac=0;
				if(mayın[3][2].equals("X"))
				{
					sayac++;
				}
				if (mayın[2][2].equals("X"))
				{
					sayac++;
				}
				if(mayın[2][3].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}
			//Köşelerin arasının kontrolü
			else if(secim_satir==0&&secim_sutun==1||secim_satir==0&&secim_sutun==2)
			{
				sayac=0;
				if(mayın[secim_satir][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if (mayın[secim_satir][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}
			else if(secim_satir==1&&secim_sutun==0||secim_satir==2&&secim_sutun==0)
			{
				sayac=0;
				if(mayın[secim_satir-1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				if (mayın[secim_satir+1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir-1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir+1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}	
			else if(secim_satir==3&&secim_sutun==1||secim_satir==3&&secim_sutun==2)
			{
				sayac=0;
				if(mayın[secim_satir][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if (mayın[secim_satir-1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir-1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir-1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}	
			else if(secim_satir==1&&secim_sutun==3||secim_satir==2&&secim_sutun==3)
			{
				sayac=0;
				if(mayın[secim_satir-1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				 if (mayın[secim_satir+1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir-1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				 if(mayın[secim_satir][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}	
			
			//Ortanın Kontrolü
			else if(secim_satir==1&&secim_sutun==1||secim_satir==1&&secim_sutun==2||secim_satir==2&&secim_sutun==1||secim_satir==2&&secim_sutun==2)
			{
				sayac=0;
				if(mayın[secim_satir-1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if (mayın[secim_satir][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun-1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir-1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir-1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				if(mayın[secim_satir+1][secim_sutun+1].equals("X"))
				{
					sayac++;
				}
				a[secim_satir][secim_sutun]=Integer.toString(sayac);
			}
			System.out.println("_________________");
			System.out.println("| "+a[0][0]+" | "+a[0][1]+" | "+a[0][2]+" | "+a[0][3]+" |");
			System.out.println("_________________");		
			System.out.println("| "+a[1][0]+" | "+a[1][1]+" | "+a[1][2]+" | "+a[1][3]+" |");
			System.out.println("_________________");
			System.out.println("| "+a[2][0]+" | "+a[2][1]+" | "+a[2][2]+" | "+a[2][3]+" |");
			System.out.println("_________________");
			System.out.println("| " +a[3][0]+" | "+a[3][1]+" | "+a[3][2]+" | "+a[3][3]+" |");
			System.out.println("_________________");
			System.out.println(" ");
			if(i==11)
			{
				System.out.println("!!!!!!!!!!!!!!!!!!!!Kazandınız!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				for(int y=0;y<4;y++)
				{
					for(int j=0;j<4;j++)
					{
						if(mayın[y][j].equals("X"))
						{
							a[y][j]=mayın[y][j];
						}
						
					}
				}
				System.out.println("_________________");
				System.out.println("| "+a[0][0]+" | "+a[0][1]+" | "+a[0][2]+" | "+a[0][3]+" |");
				System.out.println("_________________");		
				System.out.println("| "+a[1][0]+" | "+a[1][1]+" | "+a[1][2]+" | "+a[1][3]+" |");
				System.out.println("_________________");
				System.out.println("| "+a[2][0]+" | "+a[2][1]+" | "+a[2][2]+" | "+a[2][3]+" |");
				System.out.println("_________________");
				System.out.println("| " +a[3][0]+" | "+a[3][1]+" | "+a[3][2]+" | "+a[3][3]+" |");
				System.out.println("_________________");
				
				}
				}
				
			
					
			}	
		}

}
