package pattern_printing;

public class PQRST_Pattern {
	
	static int row =7;
	static int col=5;
	
	public static void main(String[] args) {
		
		getE(); System.out.println();
		getP(); System.out.println();
		getQ();System.out.println();
		getR();System.out.println();
		getS(); System.out.println();
		getT();
	}
	
	public static void getE()
  {
    for(int i=0; i<7; i++)
    {
      for(int j=0; j<5; j++)
      {
        if(i==0 & j==0| i==0 & j==1 | i==0&j==2 | i==0 & j==3| i==0 & j==4 | i==1 & j==0
						| i==2 & j==0| i==3 & j==0 | i==3 & j==1 | i==3 & j==2| i==3 & j==3 | i==4&j==0
						|i==5 & j==0| i==6 & j==0 | i==6&j==1 | i==6 & j==2 | i==6&j==3 | i==6 & j==4)
				System.out.print("*"+" ");
			}
			System.out.println();
		}System.out.print("");	
	}
	
	public static void  getP()
  {
    for(int i=0; i<=row; i++)
    {
      for(int j=0; j<=col; j++) 
      {
        if(i==0&&j==0||i==0&&j==1||i==0&&j==2||i==0&&j==3|| i==1&&j==0||i==1&&j==5||i==2&&j==0||i==2&&j==5||
           i==3&&j==0||i==3&&j==3||	i==3&&j==1||j==2&&i==3||j==0&&i==4||j==0&&i==5||i==6&&j==0)
							System.out.print("*"+"");
				else
					System.out.print(" ");
			}
					System.out.println( );
		}	
	}
	
	public static void getQ()
  {
    for(int i=1;i<=row;i++)
    {
			for(int j=1;j<=col;j++)
      {
		if(i==1&&j==2||i==1&&j==3||i==2&&j==1||i==3&&j==1|| i==4&&j==1||i==5&&j==1||j==1&&i==6||i==7&&j==2||
		   i==7&&j==2||i==7&&j==3||	j==4&&i==6||j==4&&i==5||j==4&&i==3||j==4&&i==2||i==5&&j==3||i==7&&j==5||i==4&&j==4)
      
      System.out.print("*"+"");
		else
			System.out.print(" ");
			}
			System.out.println( );
		}
	}
	
	public static void  getR()
  {
    for(int i=0; i<=row; i++)
    {
			for(int j=0; j<=col; j++)
      {
        if(i==0&&j==0||i==0&&j==1||i==0&&j==2||i==0&&j==3|| i==1&&j==0||i==1&&j==5||i==2&&j==0||i==2&&j==5||i==3&&j==0||
           i==3&&j==3||	i==3&&j==1||j==2&&i==3||j==2&&i==4 ||j==0&&i==4||j==0&&i==5||j==3&&i==5||i==6&&j==0||i==6&&j==5)
          System.out.print("*"+"");
				else
					System.out.print(" ");
			}
					System.out.println( );
		}	
	}
	
	public static void  getS()
  {
    for(int i=0; i<=row; i++)
    {
      for(int j=0; j<=col; j++)
      {
        if(i==0&&j==1||i==0&&j==2||i==0&&j==3|| i==1&&j==0||i==1&&j==5||i==2&&j==0||i==3&&j==1||
           i==3&&j==3||	i==3&&j==2||i==4&&j==5 ||i==5&&j==0||i==5&&j==4||i==6&&j==1||i==6&&j==2||i==6&&j==3)
          System.out.print("*"+"");
				else
					System.out.print(" ");
			}
					System.out.println( );
		}	
	}
	
	public static void  getT() {
    
    for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
        if(i==0&&j==0||i==0&&j==1||i==0&&j==2||i==0&&j==3||i==0&&j==4|| i==1&&j==2||i==2&&j==2||i==3&&j==2||i==4&&j==2||
           i==5&&j==2||i==6&&j==2)
          System.out.print("*"+"");
				else
					System.out.print(" ");
			}
					System.out.println( );
		}	
	}
}
