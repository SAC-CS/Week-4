public class triangle {

	public static void main(String[] args ) 
			  
		   {
		      int row; 
		      int column; 
		      int space; 

		      
		      for ( row = 1; row <= 10; row++ )
		      {
		         for ( column = 1; column <= row; column++ )
		            System.out.print( "*" );

		         System.out.println();
		      } 

		      System.out.println();

		      
		      for ( row = 10; row >= 1; row-- )
		      {
		         for ( column = 1; column <= row; column++ )
		            System.out.print( "*" );

		         System.out.println();
		      } 

		      System.out.println();

		      
		      for ( row = 10; row >= 1; row-- )
		      {
		         for ( space = 10; space > row; space-- )
		            System.out.print( " " );

		         for ( column = 1; column <= row; column++ )
		            System.out.print( "*" );

		         System.out.println();
		      } 

		      System.out.println();

		      
		      for ( row = 10; row >= 1; row-- ) {

		         for ( space = 1; space < row; space++ )
		            System.out.print( " " );

		         for ( column = 10; column >= row; column-- )
		            System.out.print( "*" );

		         System.out.println();
		      } 
		} 
}

// Good job
