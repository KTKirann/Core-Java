class Biscuits{
	public static void main (String[] arg)
	{
		System.out.println("running main theme of biscuits");
		
		String goodday="Good day";
		String marie ="Marie gold";
		String unibic =" Unibic";
		String dark= "Dark fantasy";
		String oreo = "oreo";
		String[] biscuits={goodday,marie,unibic,dark,oreo};
		 
		 System.out.println("biscuits in forward driction");
		 for (int i=0;i<biscuits.length;i++)
		 {
			 System.out.println("the element at index "+i+"is:" +biscuits[i]);
		 }
         
		 System.out.println("\n");
		 System.out.println("bisciuts in reverse direction");
		 for(int i=biscuits.length-1;i>=0;i--)
		 {
			 System.out.println("the element at index "+i+"is:" +biscuits[i]);
		 }
	}
}
		