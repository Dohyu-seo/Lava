package day12;

/*
 	��ӹ޾Ƽ�Overriding Ȱ���ϱ�.
 		�Լ��� ���¿� ������ �ΰ� �����ϱ�
 		��ȯ�� �Լ��̸� �Ű���������Ʈ �� �����ؾ��Ѵ�..
 		
 		
 */
public class SpeedTest {
	
	//�������Լ� �����
	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : " + car.speed);
		 
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println("Mini speed : "+ mini.speed+"m/h");
		
		Lotze lotze = new Lotze();
		lotze.speedUp(); 	// Overriding
		lotze.speedUp(20); 	// Overloading
		System.out.println("Lotze speed : " + lotze.speed);
		
		Car lotze1 = new Lotze();
		// Lotze�� ����ȯ ���� CarŸ���� ���� �� �ִ� ������
		// Car�� �����ִ� ����� �����ִٸ� � Ÿ���̴��� Car�� ���� �� �ִ� (�ڵ� ����ȯ)
		// ��� Car�� ������ִ� Ŭ������ ���� ���� ������ ���Ѵ�.
		
		// Lotze���� �� ����غ���
//		System.out.println("Lotze color : "+ lotze1.color);
//		System.out.println("Lotze color : "+ lotze1.used);
		// Lotze�� ����ϴ°� ��������, Car����  color�� used��� ������ �������� �ʱ� ������, ������ ����.

		System.out.println("Lotze speed : " + lotze1.speed);
		//**������ ���۷��� ������ ������ �Լ��� �ν��Ͻ�����(�� �������� ������ ��)�� ������.**
		
//		Mini mi = (Mini) lotze1;// �Ǳ�s ������ �̷��� ������� �ʴ� �������� �ڵ��� �ؾ��Ѵ�.
		//����� �����ϰ� �Ǵ� ���� : Car���� lotze1�� ������ְ� �ֱ� ������ ����Ŭ�������� ����� ���� ���̴�. , ���� ������ �����̴�.
		
//		Lotze car2 = new Car();
		// ������ ������ ���ڸ�, ����Ŭ������ ������ �� ���� �ݸ� ����Ŭ������ Lotze�� ������ ���� ������ ���� �� ����;
		/*
		Car p = new Lotze();
		Lotze c = (Lotze)p;
		
		System.out.println("Lotze : "+c.speed); // 60
		c.speedUp(); // 40
		System.out.println("Lotze : "+c.speed); // 100 
		*/
		
		Lotze car2 = (Lotze)new Car(); // Lotze�� Car���� ����� �߰��Ǿ���. ��� �����Ͽ� ������ ����� �ȴ�.
//		 ����Ŭ�������� ����Ŭ������ ���� �� ��������ȯ�� �����ϴ�. ������ Lotze�� �ִ� ����� Car�� ���� ������ ������ ����.
		
		// ���࿡ Lotze Ŭ�������� Car�� ����� �ǵ����� �ʰ� ����Ѵٴ� ���� : Overriding�� �ϱ� ������ �����̶�� �� �� �ִ�.
		
		/* Car lotze1 = new Lotze(); ����.  Car�� ���� Ÿ���ΰ�?? 
			� ��ä�� Car�� �����մ� ����� �����ִٸ�, �� Ÿ������ �� �� �ִ�.
			.. class�� ���(�Լ��� ����)�� �����ִٸ� �װ� �ܿ� ���� �� �ִ°� ���ٴ� ���̴�.
			
			�׷��ٸ� class�� �����ϰ� �ִ� �͵��� ���� �ƴϸ� �Լ���� ���ε�.
			� ��ü�� �� class Ÿ���� �ȴٴ� ���� �� class�� �����ִ� ����� �����ϱ� ������
			�� class�� �� �� �ִٴ� ���̴�.
			
			 ��ӹ��� ��ü�� �����ִ� �������  ����ϴ� class�� �����ִ� ����� �����ϱ� ������
			 ����ϴ�  class�� ���� �� �ִٴ� ���̴�.
			 
			  ����&����� �����ִ� : �Լ�
			  ����&�Ӽ����� ������ : ����
			 
			 ��� ]
			 	��ӹ��� class�� ����� ���� ��ü�� ����� ������ ���ǾƷ��� 
			 	Car  : Car��� ����� �����ִ� ��ü��(Mini, Lotze)�� Car��� �θ� �� �ִ�.
			 	�ݸ�, Car�� ��ӹ޾� ������� Mini, Lotze�� Car��� �θ� �� ����.
			 	
			 
			 ������ �ϴ� �Ǽ�
			 ����ϸ� �ű⿡ ������ �� �ִµ�
			 
			 �Լ��� ������ �߰� �� ���, ��ӹ��� Ŭ������ �� ũ�� �ʴ��� ��� ������ ������ �ʴ��� �ϴµ�
			  Ŭ������ ����� ���� �ִ��� �Ȱ����ִ����� ������ �ȴ�.
			 ���� ���� ������ ����� ���� �����ִ� ���� �ȴ�.
		*/
	}
	public static void main(String[] args) {
		//�������Լ� �޸𸮿� �ø���
		new SpeedTest();
	}

}
