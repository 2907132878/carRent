package cn.edu.qdu.carRent;

import java.util.Scanner;

public class CarSystem {

	String[] carType = { "别克商务", "宝马550i", "别克林荫大道" };
	int[] busType = { 10, 32 };
	Moto[] moto;
	Scanner input = new Scanner(System.in);

	public void welcome() {
		System.out.println("***********************");
		System.out.println("**欢迎来到汽车租赁系统**");
		System.out.println("***********************");
	}

	public void askRentDays() {
		System.out.println("请输入需要租车的数量：");
		int count = input.nextInt();
		moto = new Moto[count];
		int[] days = new int[count];
		for (int i = 0; i < moto.length; i++) {
			System.out.println("请选择第"+(i+1)+"辆车");
			System.out.println("请输入租赁天数：");
			days[i] = input.nextInt();
			System.out.println("请选择车的类别：1：轿车，2：客车");
			int sel = input.nextInt();

			if (sel == 1) {
				System.out.println("请选择车型：1，别克商务，2：宝马550i,3:别克林荫大道");
				sel = input.nextInt();
				moto[i] = new Car(carType[sel - 1]);
				moto[i].calcRent(days[i]);
			} else {
				System.out.println("请选择座位数：1：<=16座，2：>16座");
				sel = input.nextInt();
				moto[i] = new Bus(busType[sel - 1]);
				moto[i].calcRent(days[i]);

			}
		}
		show(days);
	}

	public void show(int days[]) {
		System.out.println("您选择的车信息如下：");
		double totalRent = 0;
		for (int i = 0; i < moto.length; i++) {
			if (moto[i] instanceof Car) {
				System.out.println("车型\t" + "车牌号\t" + "租用天数\t" + "日租金\t" + "总租金");
				System.out.println(((Car) moto[i]).getCarType() + "\t" + moto[i].getCarNum() + "\t" + days[i] + "\t"
						+ moto[i].getDayRent() + "\t" + moto[i].calcRent(days[i]));
			} else {
				System.out.println("车型\t" + "车牌号\t" + "租用天数\t" + "日租金\t" + "总租金");
				System.out.println(((Bus) moto[i]).getSeatCount() + "\t" + moto[i].getCarNum() + "\t" + days[i] + "\t"
						+ moto[i].getDayRent() + "\t" + moto[i].calcRent(days[i]));

			}
			totalRent += moto[i].calcRent(days[i]);
		}
		System.out.println("总租金为：" + totalRent);
	}
}
