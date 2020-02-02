
public class TryItOut {
	public static void main(String[] args){
		
		int[] workEvaluation= {1,2,3,4,5};
		int yearsWithCompany=4;
		
		for(int i=1; i< workEvaluation.length ;i++) {
			
			if(workEvaluation[i]>3 && yearsWithCompany>2) {
				System.out.println("Work Evaluation score is "+ workEvaluation[i] + " give a raise");
			}
		}
			
			
			
		
	}	
}
