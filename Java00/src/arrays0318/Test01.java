package arrays0318;

public class Test01 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
        arr[1][0] = 4;
		arr[1][1] = 5;
        arr[1][2] = 6;
        // ���̸� �����ִ� ��
        System.out.println("arr.length : "+arr.length);
        System.out.println("arr[0].length : "+arr[0].length);
        System.out.println("arr[1].length : "+ arr[1].length);
        
        for(int i = 0; i < arr.length; i++) { // 2ȸ �ݺ� arr������ �迭��ŭ �ݺ���
        	for(int j = 0; j<arr[i].length; j++) { // 3ȸ �ݺ�, arr[]�ȿ� []��ŭ �ݺ���.
        		System.out.println("["+i+"] ["+j+"] : "+ arr[i][j]);
        	}
        }
	}

}
