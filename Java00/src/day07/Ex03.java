package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		//ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ �迭�� ������
		String name[] = new String[1] ;
		String tel[] = new String[1] ;
		String mail[] = new String[1] ;
		
//		�̸� �Է��ϸ� �� �̸� �迭�� ��ȭ��ȣ ������  �ְ� ���
		//�����͸� ���� �迭�� �����
		String tmp[][] = new String[3][];
		tmp[0] = name;
		tmp[1] = tel;
		tmp[2] = mail;
		
		int idx = -1;
		
		
		for(int i = 0; i<tmp.length; i++) {
			
			for(int j =0; j<name.length; j++) {
				String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
			tmp[j][i] = str;
			idx = i;
			j++;
			String hp = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ���.");
			tmp[j][i] = hp;
			idx = i;
			j++;
			String email = JOptionPane.showInputDialog("�̸����� �Է��ϼ���.");
			tmp[j][i] = email;
			idx = i;
			
			/*
				}
				for(int j =0; j<name.length; j++) {
				String hp = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ���.");
				tmp[j][i] = hp;
			}
					for(int j =0; j<name.length; j++) {
					String email = JOptionPane.showInputDialog("�̸����� �Է��ϼ���.");
					tmp[j][i] = email;
		}
			break;*/
			}break;
	}
		
		String msg;
		if(idx != -1) {
			msg = "name : "+tmp[0][idx]+"\ntel : " + tmp[1][idx]+"\nmail"+tmp[2][idx];
		JOptionPane.showMessageDialog(null,msg);
		}
		
		
		
		/*
		//���ڿ� �Է¹��� �غ��ϰ�
		String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");		
		//�ε��� ����� ���� ������ֱ�, -1�� ���� �־� 0�� �ڸ����ִ� �Ͱ� ȥ������ �ʵ��� �Ѵ�.
		int idx = -1;
		//�Է¹��� ���ڿ��� �迭�ȿ� �̸��� �´��� ���ϱ�
		for(int i =0; i<name.length; i++) {
			if(name[i].equals(str)) {
				//idx�� i�� �־ �ش� �ε����� ����� �� �ֵ��� �ϰ� �� �ε����� �Ŀ� 
				// ���� �ε����� �ִ� ��ĩ���� ã�� �� ����.(��ȭ��ȣ�� �̸���)
				idx = i;
				//��ĩ���� ã������ ���߱�.
				break;
			}//if��
		}//for��
		//���� ���⼭ �ε����� ã�� ������ ��� �޼����� ������ش�
		// �� ������ idx�� i�� ���� �ʾ� -1�� �� �ۿ��ϰ� �ȴ�.
		String msg = "�������� �ʴ� �̸��Դϴ�.";
		//���ǹ����� �ε��� ��ﰪ�� idx�� Ȱ���� �����͸� ������� �� �ִ� ���ǹ��� �����.
		if(idx !=-1) {
			//������ ������� String msg�� if���ǹ��� ���� �������� ����Ѵ�.
			msg = "name :"+name[idx]+ "\ntel"+tel[idx]+"\nmail"+mail[idx];
			
		}//if�� 2��°
		JOptionPane.showMessageDialog(null, msg);*/
	}

}
