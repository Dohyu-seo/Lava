package arrays0318;
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
import java.util.Random;  //���� ����Ʈ
import java.util.Scanner;  //�Է� ����Ʈ
 public static void main(String[] args) {
/* Name of the class has to be "Main" only if the class is public. */
class BaseBall
{
  static int strike =0; //��Ʈ����ũ ���� ����
  static int ball = 0; //�� ���� ����
   
  public static void main (String[] args) throws java.lang.Exception
  {
    int computer[] = new int[3]; //��ǻ�Ͱ� ���� ��
    int user[] = new int[3]; //������ ���� ��
     
    Random random = new Random();
     
     
    //���⼭���� ��ǻ�Ͱ� ���� ��
    //�ߺ�����.
    //random.nextInt(10); �̰��� 1~9���̿� ����
     
    //computer 3�߿� 1��°�� 0�̸� ���� �� ����
    while(computer[0] == 0){
      computer[0] = random.nextInt(10);
    }
     
    //computer 3�߿� 1��°�� 2��°�� �ߺ��ǰų�,
    //2��°�� 0�̶�� ���� �� ����
    while(computer[0] == computer[1] || computer[1] == 0){
      computer[1] = random.nextInt(10);
    }
     
    //computer 3�߿� 1��°�� 3��°�� �ߺ��ǰų�,
    //2��°�� 3��°�� �ߺ��ǰų�,
    //3��°�� 0�̶�� ���� �� ����
    while(computer[0] == computer[2] || computer[1] == computer[2] || computer[2] == 0){
      computer[2] = random.nextInt(10);
    }
     
     
     
    //������ ���� ��
     
    //�Է� s ���� ����
    Scanner s= new Scanner(System.in);
     
    while(strike < 3){ //��Ʈ����ũ 3�� �� �� ���� ���� ����
     
      //3�� �ݺ��Ͽ� ���� �Է� ����.
      for(int i = 0; i < user.length; i++){
        System.out.print("\n"+(i+1) + "��° ��: ");
        user[i]=s.nextInt();
         
        //���� 10�̻��̰ų�, 0���ϸ� ���� ���
        while(user[i] >=10 || user[i] <= 0){
          System.out.println("error: 1~9���̿� �Է� �ϼ���.");
          System.out.print(i+1 + "��° ��: ");
          user[i]=s.nextInt();
        }
      }
       
      //���⼭ ��� üũ
       
      //strike, ball üũ 
      for(int i = 0; i< 3; i++){
        for(int j=0; j<3; j++){
           
          //��ǻ�� ���� ����
          //������ ���� ���� ������
          if(computer[i] == user[j]){
            //computer i��°��
            //user j��°�� ������
            //��Ʈ����ũ!
            if(i==j){
              strike+=1;
            }else{  //�ƴϸ� ��!
              ball+=1;
            }
          }
        }
      }
       
      //���� strike, ball �ƹ��� ������ٸ�
      if(strike == 0 && ball==0){
        System.out.println("\n�ƿ�!!\n");
      }else if(strike == 3){ //���� ��Ʈ����ũ 3�����
        System.out.print("\n��Ʈ����ũ!!");
        System.exit(0); //���ѷ��� Ż���Ͽ� ����!
      }else{
        System.out.println("\n"+strike+" ��Ʈ����ũ"+ball+" ��\n");
        strike=0;
        ball=0;
      }
    }
  }
}
 }
