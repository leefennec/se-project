class FlowEx17 { // 2~9�ܱ��� �������� ����ϴ� ���α׷�

	public static void main(String[] args) { 

		for(int i=2 ; i<=9 ; i++) {
		System.out.println();
		System.out.println("  ������ \'"+i+"\'�� �Դϴ�.");
		System.out.println();	
			for(int j=1 ; j<=9 ; j++)						// ������ 2��,3��,.. ���
				System.out.println("\t"+i+"x"+j+" = "+i*j); // �� �������� 1~9���� ���
		} 

	}
}