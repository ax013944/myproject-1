package com.java2.object;

public class Customer implements Destroyable{
int amount;
 float discount = 0.05f;
 
public Customer(int amount){
	this.amount =amount;
	this.discount=discount;
	
	
}
public void print() {
	int total =(int)(amount*(1-discount));
	System.out.println(amount+"\t"+total);
}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}

}
