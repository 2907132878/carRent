package cn.edu.qdu.carRent;

import java.util.Scanner;

public class CarSystem {

	String[] carType = { "�������", "����550i", "���������" };
	int[] busType = { 10, 32 };
	Moto[] moto;
	Scanner input = new Scanner(System.in);

	public void welcome() {
		System.out.println("***********************");
		System.out.println("**��ӭ������������ϵͳ**");
		System.out.println("***********************");
	}

	public void askRentDays() {
		System.out.println("��������Ҫ�⳵��������");
		int count = input.nextInt();
		moto = new Moto[count];
		int[] days = new int[count];
		for (int i = 0; i < moto.length; i++) {
			System.out.println("��ѡ���"+(i+1)+"����");
			System.out.println("����������������");
			days[i] = input.nextInt();
			System.out.println("��ѡ�񳵵����1���γ���2���ͳ�");
			int sel = input.nextInt();

			if (sel == 1) {
				System.out.println("��ѡ���ͣ�1���������2������550i,3:���������");
				sel = input.nextInt();
				moto[i] = new Car(carType[sel - 1]);
				moto[i].calcRent(days[i]);
			} else {
				System.out.println("��ѡ����λ����1��<=16����2��>16��");
				sel = input.nextInt();
				moto[i] = new Bus(busType[sel - 1]);
				moto[i].calcRent(days[i]);

			}
		}
		show(days);
	}

	public void show(int days[]) {
		System.out.println("��ѡ��ĳ���Ϣ���£�");
		double totalRent = 0;
		for (int i = 0; i < moto.length; i++) {
			if (moto[i] instanceof Car) {
				System.out.println("����\t" + "���ƺ�\t" + "��������\t" + "�����\t" + "�����");
				System.out.println(((Car) moto[i]).getCarType() + "\t" + moto[i].getCarNum() + "\t" + days[i] + "\t"
						+ moto[i].getDayRent() + "\t" + moto[i].calcRent(days[i]));
			} else {
				System.out.println("����\t" + "���ƺ�\t" + "��������\t" + "�����\t" + "�����");
				System.out.println(((Bus) moto[i]).getSeatCount() + "\t" + moto[i].getCarNum() + "\t" + days[i] + "\t"
						+ moto[i].getDayRent() + "\t" + moto[i].calcRent(days[i]));

			}
			totalRent += moto[i].calcRent(days[i]);
		}
		System.out.println("�����Ϊ��" + totalRent);
	}
}
