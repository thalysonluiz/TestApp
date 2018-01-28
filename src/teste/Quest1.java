package teste;

public class Quest1 {
	
	public static void main(String[] args) {
		int A[] = {3, 1, 5, 2, 0, 4, 6};
		//int A[] = {5, 4, 0, 3, 1, 6, 2};
		
		int n = 7, i = 1;
		boolean tem = false;
		int S[] = new int[n];
		
		S[0] = A[0];
		
		while(i < n){
			for(int j = 0; j < i; j++){
				if(A[S[i-1]] == S[j]){
					tem = true;
					break;
				}
			}
			if(!tem){
				S[i] = A[S[i-1]];
				i++;
			}
			else{
				break;
			}
		}
		
		System.out.print("Qtde elementos: "+i+" [");
		for(int x = 0; x < i; x++){
			
			if(x == i-1){
				System.out.print(S[x]+"]");
			}
			else{
				System.out.print(S[x]+", ");
			}
		}
	}
	

}
