package cn.edu.qdu.carRent;

public class Bus extends Moto {
	private int seatCount;

	public Bus(int seatCount) {
		super();
		this.seatCount = seatCount;
	}

	public double calcRent(int days) {
		if (seatCount >= 16) {
			setCarNum("123");
			setDayRent(800);
		} else {
			setCarNum("123");
			setDayRent(1500);

		}
		return super.calcRent(days);
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}
