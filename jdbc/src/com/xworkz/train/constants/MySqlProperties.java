package com.xworkz.train.constants;

public enum MySqlProperties {
USERNAME("jdbc:mysql://localhost:3306/train"),
URL("root"),
SECRET("2ka17cv405@94");

	
private String value;

private MySqlProperties(String Value) {
	this.value=value;
}
	public String getName() {
		return value;
	}
}
