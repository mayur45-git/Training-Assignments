package com.yash.exception.Task_1;

public class MainStudent {

	public static void main(String[] args) throws ResultException {
		
		Results rs=new Results();
		rs.setJava(89);
		rs.setPython(-85);
		rs.setSalesforce(64);
		
		Student s=new Student();
		s.setRollno(101);
		s.setSname("Eren Yeager");
		s.setSaddress("Wall Maria");
		s.setSrobj(rs);
		
		System.out.println(s.toString());
		rs.resultmethod();
		
	}
}
