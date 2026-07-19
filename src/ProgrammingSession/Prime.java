package ProgrammingSession;

public class Prime {
	
	int num;
	
	public Prime(int num) {
		
		this.num=num;
		
	}
	
	public void prime() {
		int flag;
		for(int i=2;i<num;i++) {
			flag = 0;
			for(int j=2;j<i;j++) {
				
				if(i%j == 0) {
					flag = 1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}

}
