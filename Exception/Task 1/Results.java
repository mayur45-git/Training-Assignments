package com.yash.exception.Task_1;

public class Results {

	private int java;
	private int python;
	private int salesforce;
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getPython() {
		return python;
	}
	public void setPython(int python) {
		this.python = python;
	}
	public int getSalesforce() {
		return salesforce;
	}
	public void setSalesforce(int salesforce) {
		this.salesforce = salesforce;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Results [java=" + java + ", python=" + python + ", salesforce=" + salesforce + "]";
	}
	
	public void resultmethod() throws ResultException
	{
		double avg=(java+python+salesforce);
		double marks=(avg/300)*100;
		System.out.println("Total marks- "+marks);
		
		if(java<0 || python<0 || salesforce<0)
		
			throw new ResultException("Input cannot be negative...");
			
			if((java<40 && python<40) ||(java<40 && salesforce<40)||(python<40 && salesforce<40))
			{
				throw new ResultException("Result:failed, failed in two subjects");
				
			}
			else if(marks<40)
			{
				System.out.println("Failed Below 40%.");
				throw new ResultException("Fail:Marks is below 40%.");
				
			}
				
			else
			{
				System.out.println("Result:Passs");
			}
		
			
	}
	
	
	
}
