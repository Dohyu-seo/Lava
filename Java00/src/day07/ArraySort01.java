package day07;


/*
 	예제]
 		로또 한 게임을 만들어서 배열에 담고
 		낮은 번호부터 정렬해서
 		담긴 데이터를 출력해보자.
 		
 		로또 한 게임은
 			1~ 45까지의 숫자가  6ro vlfdygkek.
 */
import java.util.*;
import javax.swing.*;
public class ArraySort01 {

	public static void main(String[] args) {
		// 할일
		
		// 1. 정수 6개가 저장될 배열을 만든다.
		int[] lotto = new int[6];
		loop:
		for(int i = 0; i< lotto.length; i++) {
			// 2. 배열에 랜덤하게 정수를 만들어서
			int no = (int)(Math.random()*(45 - 1+1)+1);
			
			// 3. 이전에 만들어진 같은 번호가 있는지 체크하고
			for(int j = 0; j < i; j++) {// for j : 현재 확인된 인덱스 이전까지 확인하고 추출해야 하니까 i까지만 검색한다.
				//↑ 0(j)<0(i);에 조건이 false이기 떄문에 첫 반복문에는 for j를 실행하지 않는다 
				if(lotto[j] == no){ // 이제까지 발생된 번호와 같은 번호면...
					//continue; 는 for i++로 가기때문에 증감식으로 가, 회차를 건너 뛰게된다.
					i--; // 회차가 넘어가지 않도록 i를 감소시키고
					continue loop; // 바깥쪽에 있는 for문을 반복시키도록 라벨을 사용함.
				}
			}
			// 이 부분이 실행하는 경우는 위의 반복문이 모두 실행이 된 경우고
			// 그 의미는 같은 번호가 이전에는 없다는 의미이므로
			
			// 4. 각 방에 그 번호를 저장하고
			lotto[i] = no;//각 방에 그 번호를 저장한다.
		}
		// 5. 출력하고
		JOptionPane.showMessageDialog(null,"***당첨번호***\n"+Arrays.toString(lotto));
		// 6. 정렬을 하고 
			//여기서 비교 데이터 중, lotto.length의 마지막배열은 비교대상이 없기 때문에!! -1을 해서 맨 마지막의 바로 이전까지만.
		for(int i = 0; i<lotto.length-1; i++) {
			
			// 꺼낸 데이터 이후부터 맨 마지막까지 하나씩 꺼내서 비교해야합니다.
			for(int j= i+1; j<lotto.length; j++) {// i+1 : 꺼낸 데이터의 다음데이터 부터, j<lotto.length : 맨 마지막 까지 확인
				if(lotto[i] > lotto[j]) {
					//i가 j보다 크다면~, 이 경우는 뒤에서 뽑아온 데이터가 더 작은 경우이므로
					// 현재자리와 데이터를 교체해야합니다, 이 때 현재 자리에 데이터를 교체하는 순간
					// 이전 데이터의 기억은 사라지므로 변수에 그 주소를 기억시켜놓는다.
					int tmp = lotto[i]; //i번째 애를 기억시켜놓고!
					lotto[i] = lotto[j];//i는 j번째 있는 애로 교체해놓고
					lotto[j] = tmp; // j는 다시 tmp(이전의 i값)로 교체한다.
					
				}
				// 내림차순으로 진행할 때에는 !
				/*
				if(lotto[i] < lotto[j]) {
					//i가 j보다 크다면~, 이 경우는 뒤에서 뽑아온 데이터가 더 작은 경우이므로
					// 현재자리와 데이터를 교체해야합니다, 이 때 현재 자리에 데이터를 교체하는 순간
					// 이전 데이터의 기억은 사라지므로 변수에 그 주소를 기억시켜놓는다.
					int tmp = lotto[i]; //i번째 애를 기억시켜놓고!
					lotto[i] = lotto[j];//i는 j번째 있는 애로 교체해놓고
					lotto[j] = tmp; // j는 다시 tmp(이전의 i값)로 교체한다.
					
				}
				*/
			}
		}
		// 7. 출력하고
		JOptionPane.showMessageDialog(null,"### 오름차순 당첨번호 ###\n" +
										Arrays.toString(lotto));
		//html명령어 사용하기.
		JOptionPane.showMessageDialog(null,"<html><b style=\"color: red;\">"+ "### 오름차순 당첨번호 ###<\b></html>\n\t" +
										Arrays.toString(lotto));
	}

}
