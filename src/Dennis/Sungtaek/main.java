package Dennis.Sungtaek;

import java.util.Scanner;

/*
 �ֹε�Ϲ�ȣ�� �Է����� ��, '-' Ȥ�� '\\s'�� ���Ͽ� �ֹι�ȣ ���ڸ�, ���ڸ��� �����Ͽ�
 ���ڸ��� ����Ѵ�.
 �ֹι�ȣ�� String���� ó���߱� ������, ���ڰ� �Էµ� ��츦 �������� �ʴµ� �̴� ���� �������.
 */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String residentNum;
		Scanner sc = new Scanner(System.in).useDelimiter("\\s|-");
						//'\\s'�� ���� ����, Ȥ�� '-'�� ���ؼ� �ֹι�ȣ ���ڸ��� �����Ѵ�.

		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");

		residentNum = sc.next();

		System.out.println(residentNum);	


	}

}
 