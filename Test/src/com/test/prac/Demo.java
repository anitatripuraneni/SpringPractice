package com.test.prac;

 class SD{
	public int gearratio = 8;
	public String accelarete() {
		return "acc";
	}
}

class Demo extends SD {
	public int gearratio = 9;
	public String accelarete() {
		return "acc 1";
	}
	public static void main(String[] args) {
		SD d = new Demo();
		System.out.println(d.accelarete() +"  "+ d.gearratio);
	}
}
