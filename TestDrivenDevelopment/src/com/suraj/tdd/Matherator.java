package com.suraj.tdd;

public class Matherator implements Adder, Subtracter {

	@Override
	public long subtract(long... operands) {
		
		 long ret=operands[0];
		 
		 for(int i=1;i<operands.length;i++)
		 {
			 ret-=operands[i];
		 }
		
		
		return ret;
	}

	@Override
	public long add(long... operands) {
		
		long ret=operands[0];
		for(int i=1;i<operands.length;i++)
		{
			ret+=operands[i];
		}
		
		return ret;
	}

}
