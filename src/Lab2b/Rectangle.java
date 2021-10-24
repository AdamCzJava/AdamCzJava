package Lab2b;

public class Rectangle {
	//lenght and width are accessible to all methods in this class
	private double lenght;
	private double width;
	
	//default constructor method 
	public Rectangle ()
	{
		setlenght(1);
		setwidth(1);
	}
		//constructor method 2
		public Rectangle (double lon, double wid) 
		{
			lenght = lon;
			width = wid;
		}//set method for lenght
		public void setlenght (double lon) 
		{
			if (lenght > 0.0 && lenght <= 40.0)
				lenght = lon;
		}//set method for width
		public void setwidth (double wid)
		{
			if (width > 0.0 && width <= 40.0)
				width = wid;
		}//toString method
		public String toString()
		{
		      return "Length = " + lenght + "\nWidth = " + width;
		}//get method for Area
		public double getArea () 
		{
			return lenght * width;
		}//get method for Perimeter
		public double getPerimeter ()
		{
			return 2 * ( lenght * width);
		}//method to print Rectangle 
		public char printRectangle()
		{
			
		int i,j;
		
		String w ="*";
		
		double z = (width -2) ;//empty area within rectangle
		
		while(z > 0  ) {
			 w = w + " ";
			 z--;
		}
		w = w + "*";
	
			for(i = 1; i <= lenght; i++)
			{	
				for(j = 1; j <= width; j++)
				{
					if(i ==1 || i == (lenght))
					{
						System.out.print("*");
					}
					else
					{	
						System.out.print(w);
						break;
					}
				}
				System.out.print("\n"); 
			}
			return 0;
		}
	}//end class
	