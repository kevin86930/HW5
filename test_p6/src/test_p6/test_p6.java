package test_p6;

public class test_p6 {
	
		public static void main(String[] args)
		{
			Car car1 ;
			car1 = new Car();

			car1.show();
			}
	}
		class Car
		{
		private int num;
		private double gas;
		
		public Car()
		{
			num=0;
			gas=0.0;
			System.out.println("�Ͳ��F���l");
		}
		public void setCar(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
				
		}
		public void show()
		{
			System.out.println("�����O"+num);
			System.out.println("�T�o�q�O"+num);
				
		}
	}

