package day14;

/**
 *	�� Ŭ������ JButton�� �̺�Ʈ ó���� �� �� ����ϴ� ���� ���� Ŭ������ ������ ������ Ŭ����
 *	@author ������
 *	@since	2020.03.26
 *	@version v.1.0
 *	@see
 *			JFrame, JPanel, JButton(<-Swing Ŭ������), ActionListener(�������̽�)
 *
 *			2020.03.26 Ŭ���� ����		-		����� ������		-	Ŭ���� ����		
 */
import java.awt.*;	// ���翡 ���� �Ǿ�����.
import java.awt.event.*; // ������ ��Ű���� �ҷ��� �� �����Ƿ� event��� ������ ���� �ҷ��ݴϴ�.
import javax.swing.*;

public class ColorWin {
	/*
	 * �ڹٿ��� GUI�� ���� �� �ִ� ������ �����ϰ� �ִµ� javax.swing ��Ű���� java.awt ��Ű���̴�.
	 * 
	 * �� Ŭ���������� Windows�� â�� ������ִ� JFrame �� ����ؼ� â�� ����� ���ο� JPanel�� �̿��ؼ� ä�� �� JPanel��
	 * ������ �����ϰ� JButton�� ����� �ο��� ����~.
	 */
	// ��������- if, �ܺο��� �ش� �����͸� ��ü�� �� ���������� ������ ������ �ֱ� ������ ������ �����ϴ�.
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;

	// JPanel�� Ŭ������ ��, JPanel�� ���� �����Ű�°� ��Ʈ�Դϴ�.

	public ColorWin() {
		// ���� �ʱ�ȭ
		// frame ��ü�� ������ְ�
		frame = new JFrame(); // ==> new ��Ű�� setVisible�� ������Ѿ� ȭ���� ��ϴ�.

		// frame â�� x ��ư ���� �� ���α׷��� �����ϴ� ��� �ο��غ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame.EXIT_ON_CLOSE�� JFrame�� �����ִ� ������� �ϳ��̰� ����� ���ǰ� �Ǿ��ִ�.

		// Ÿ��Ʋ �����ϱ�
		frame.setTitle("�ƹ��͵� �ƴմϴ�");

		// JPanel 1 �����ϱ� (CENTER)
		pan1 = new JPanel();
		// JPanel 1���� ���� �����ϱ�
		pan1.setBackground(Color.PINK);

		// JPanel 2 �����ϱ� (SOUTH)
		pan2 = new JPanel();
		// JPanel 2 ���� ���� �����ϱ�
		pan2.setBackground(Color.PINK);

		// JButton ����� �ʱ�ȭ �ϱ�
		cBtn = new JButton("Color"); // �÷��� ������ ��ư
		eBtn = new JButton("EXIT"); // ������ ��ư
		tBtn = new JButton("Title");

		// �̺�Ʈ ��ü ����� = �̺�Ʈ �Լ� ���� , this< ���� �������� ��ü �ڱ��ڽ�.
		TitleEvt evt1 = new TitleEvt(this);
		// Ŭ���� ��ü�� �Ѱ��ָ鼭 �����ϱ� ���ϹǷ� new�� ��Ű�� �ʰ� this�� ����ؼ� ���� ��ü�� ������ �� �ְ� �����.

		/*
		 * TitleEvt evt2 = new TitleEvt(new ColorWin()); ���� ����Ǵ� ��ü�� �����ϰ� ���ο� ��ü�� �ٽ�
		 * �����. > ColorWin�Լ����� ColorWin �Լ��� �θ��� ��.... ����!
		 */

		// TitleEvt �Լ��� tBtn�� �ο��Ѵ�.
		tBtn.addActionListener(evt1);
		
		
		//eBtn�� �̺�Ʈ �߰��ϱ�( EXIT ) ������ �ݱ�
								// ������ִ� Ŭ������ ȣ���ؼ� �� ���ο� �������̵� ���ش�.
		eBtn.addActionListener(new ActionListener() {
			// ����(�͸�) ���� Ŭ���� �����!!
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
								//interface : ActionListener;
		cBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �� �Լ��� Į���ư�� Ŭ���Ǹ� ����Ǵ� �Լ���
				// Į�� �����ϰ� ���� JPanel�� ������ ��������ִ� �Լ��̴�.
				
				// 1. ���� Į�� �����ϰ� �����.
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// 2. Į���� ������Ҵ� ��������� Į�� ������
				Color color = new Color(red, green, blue);
				
				// 3. ������� Į�� pan1, pan2�� ���� ���̴�. ( pan���� �÷��� �����߱� ������..)
				pan1.setBackground(color);
				pan2.setBackground(color);
				
				
			}
		});
		// JButton�� ��ư �߰��ϱ�.
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);// < ��ư���� �� JOptionpane �����
		// JPanel�� JFrame �ȿ� �����ؼ� �ֱ� --> BorederLayout.��ġ;
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);

		frame.setSize(500, 500); // JFrame�� ����� ���ϴ� �κ��Դϴ�. �ȼ����� �Դϴ�.
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ColorWin();
	}

}

// ��ư ���� �� ���� �� Ŭ������ new �Ǿ� �����ϴ� �̺�Ʈ �߻�Ŭ����.
// ���� ����ǰ� �ִ� ��ü�� �� �̺�Ʈ�� �޾Ƽ� ����Ǿ�� �Ѵ�.
class TitleEvt implements ActionListener {
	// ColorWin�� new ��Ű�� �ȉ´�. ������ �ּҸ� �� ����� �Ǳ� �����̴�.
	ColorWin main;

	// �⺻ �������Լ�.
	public TitleEvt() {
	}

	// new ��Ű�� �ʱ����� �����ε� �ؼ� main�� ä���.
	public TitleEvt(ColorWin main) {
		this.main = main;
	}

	@Override
	// API�� Interface ActionListener -> actionPerformed�� �׸񿡼� ������
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ�� �߻����� �� e �� �ڵ����� ȣ�����ִ� �Լ�. 

		// ���� Ÿ���� �Է� �޴´�.
		/*
		 * String title = JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���!");
		 * main.frame.setTitle(title);
		 */
		main.frame.setTitle(JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���!"));
		// ColorWin�� ������ main�� JFrame.�� ������ frame���� Title�� �����Ѵ�. ����?? �Է¹��� ������..
	}

}