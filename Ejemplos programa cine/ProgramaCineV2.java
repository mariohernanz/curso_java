// Fichero: ProgramaCineV2.java

public class ProgramaCineV2
{
		public static void main(String[] args)
		{
			{
				int numCompadres = 0;
				System.out.println ("Version 2 Programa cine");
				while (numCompadres <= 5)
				{
					System.out.println ("Numero compadres " + numCompadres);	
					
					numCompadres = numCompadres +1;
				}
			}
			
		
			{
				numCompadres = 0;
				do{	
					System.out.println ("Numero compadres " + numCompadres);	
					
					numCompadres = numCompadres +1;
					
				}while (numCompadres <= 5);
			}
			{
				System.out.println ("Intentando hacer lo mismo con FOR");
				
				for (numCompadres = 0; numCompadres <= 5; numCompadres ++);
				{
					System.out.println ("Numero compadres " + numCompadres);	
				}
			}
			
		
		}
}