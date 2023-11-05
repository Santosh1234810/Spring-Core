package com.model;

public class Laptop {
	
	private int lapId;
	private String lapName;
	
	private Laptop() {
		super();
	}

	public Laptop(int lapId, String lapName) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + "]";
	}
	
	
}
