package boksMaci;



public class Main {

	public static void main(String[] args) {
		Fighter f1= new Fighter("Rocky", 5, 25, 55,60);
		Fighter f2=new Fighter("Ivan", 7, 22, 63,0);
		
		Match match=new Match(f1, f2, 50, 80);
		match.run();		
		match.isWin();
		
		
	
	
	}
	

}
