package Dennis.Sungtaek;

import java.util.Scanner;

/*
 주민등록번호를 입력했을 때, '-' 혹은 '\\s'를 통하여 주민번호 앞자리, 뒷자리를 구분하여
 앞자리만 출력한다.
 주민번호를 String으로 처리했기 때문에, 문자가 입력된 경우를 배제하지 않는데 이는 추후 변경토록.
 */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String residentNum;
		Scanner sc = new Scanner(System.in).useDelimiter("\\s|-");
						//'\\s'를 통해 공백, 혹은 '-'를 통해서 주민번호 앞자리를 구분한다.

		System.out.println("주민번호를 입력하세요.");

		residentNum = sc.next();

		System.out.println(residentNum);	


	}

}
 