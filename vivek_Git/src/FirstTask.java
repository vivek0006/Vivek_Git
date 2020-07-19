 class Test {
	int firstVar;
	int secondVar;
	Test(int firstVar,int secondVar)
	{
		this.firstVar=firstVar;
		this.secondVar=secondVar;
	}
	public  int printLargest()
	{
		if(this.firstVar>this.secondVar)
			return this.firstVar;
		else
			return this.secondVar;
	}
}
public class FirstTask
{
	
public static void main(String args[])
{
	Test f1=new Test(100,200);
	System.out.println(f1.printLargest()+" is largest ");
}

}
