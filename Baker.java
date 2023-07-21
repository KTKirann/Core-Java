class Baker{
	
	static void cooking(String fooditem,String working ,int exp,String name)
	{
		System.out.println("the information about Baker");
		System.out.println("fooditem :"+ fooditem);
		System.out.println("Working :"+working);
		System.out.println("expirience :"+exp);
		System.out.println("Nmae :"+name);
	
		if(fooditem=="maggie")
	{
		System.out.println("the item is valid");
	}
	else
	{
				System.out.println("the item is in-valid");
				
	}
	
	if (working=="shaff")
	{
				System.out.println("the item is valid");
	}
	else{
				System.out.println("the item is in-valid");
	}
	if(exp==3)
	{
				System.out.println("the item is valid");
	}
	else{
				System.out.println("the item is in-valid");
				
	}
	if(name=="arun"){
				System.out.println("the item is valid");
	}
	else{
				System.out.println("the item is in-valid");
	}
	
	
}
}