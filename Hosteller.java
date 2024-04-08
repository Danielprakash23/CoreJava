package com.kit.admission;

import java.security.DomainCombiner;
import java.util.Dictionary;
import java.util.Hashtable;

public class Hosteller extends Students {
	private int roomNumber;
	private char blockName;
	private String roomType;
	
	public Hosteller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee ,int roomNumber,char blockName,String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		// TODO Auto-generated constructor stub
		this.blockName=blockName;
		this.roomNumber=roomNumber;
		this.roomType=roomType;
		
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public double calculateTotalFee() {
		double hostelfee = super.getCollegeFee();
		Dictionary<String,double[]> dict = new Hashtable<>();
		double[] a = {60000.0,8000.0};
		double[] b = {50000.0,5000.0};
		double[] c = {40000.0,2500.0};
		dict.put("A",a);
		dict .put("B",b);
		dict.put("C",c);
	    System.out.println(dict);
	    
	    double[] val = dict.get(Character.toString(this.blockName));
	    System.out.println(val[0]+""+val[1]);
	    if(this.roomType.equals("AC")) {
	    	
	    }
		
		
		return 0.0;
	}
	
	

}
