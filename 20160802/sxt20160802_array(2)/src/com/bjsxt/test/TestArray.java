package com.bjsxt.test;

public class TestArray {
	public static void main(String[] args) {
		GirlFriend[] girlFriend = new GirlFriend[9];
		girlFriend[0] = new GirlFriend("����");
		girlFriend[1] = new GirlFriend("����");
		girlFriend[2] = new GirlFriend("����");
		for (int i = 0; i < girlFriend.length; i++) {
			System.out.println(girlFriend[i].getName());
		}
	}
}

class GirlFriend {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GirlFriend(String name) {
		this.name = name;
	}

}
