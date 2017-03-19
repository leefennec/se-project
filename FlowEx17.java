class FlowEx17 { // 2~9단까지 구구단을 출력하는 프로그램

	public static void main(String[] args) { 

		for(int i=2 ; i<=9 ; i++) {
		System.out.println();
		System.out.println("  구구단 \'"+i+"\'단 입니다.");
		System.out.println();	
			for(int j=1 ; j<=9 ; j++)						// 구구단 2단,3단,.. 출력
				System.out.println("\t"+i+"x"+j+" = "+i*j); // 각 구구단의 1~9까지 출력
		} 

	}
}