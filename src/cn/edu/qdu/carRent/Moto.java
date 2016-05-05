package cn.edu.qdu.carRent;

public abstract class Moto {
	private String carNum;
	private double dayRent;

	public double calcRent(int days) {
		return dayRent * days;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public double getDayRent() {
		return dayRent;
	}

	public void setDayRent(double dayRent) {
		this.dayRent = dayRent;
	}

}
