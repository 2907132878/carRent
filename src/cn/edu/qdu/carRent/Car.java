package cn.edu.qdu.carRent;

import java.util.Scanner;

public class Car extends Moto {
	private String carType;

	public Car(String carType) {
		this.carType = carType;
	}

	public double calcRent(int days) {

		if (carType.equals("别克商务")) {
			setCarNum("123");
			setDayRent(600);
		} else if (carType.equals("宝马550i")) {
			setCarNum("123");
			setDayRent(500);
		} else {
			setCarNum("123");
			setDayRent(300);
		}
		return super.calcRent(days);
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

}
