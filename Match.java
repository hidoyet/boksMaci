package boksMaci;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
			
	}

	
	void run() {
		if(isCheck()) {
			if(f1.whoStarts()<=1) {
				while(f1.health>0&&f2.health>0) {
					System.out.println("***** YENi ROUND*****");				
					
					f2.health=f1.hit(f2);
					if(f1.health<=0) {
					break;
					}
					//System.out.println(f1.health);
					if(f2.health<=0) {
					break;
					}
					f1.health=f2.hit(f1);
					{
					f2.health=f1.hit(f2);
					if(f1.health<=0) {
					break;
					}
					//System.out.println(f2.health);
					if(f1.health<=0) {
					break;
					}
					f2.health=f1.hit(f2);
				
					}	}		
			
			}else {
				while(f1.health>0&&f2.health>0) {
					System.out.println("***** YENi ROUND*****");				
					
					f2.health=f1.hit(f2);
					if(f1.health<=0) {
					break;
					}
					//System.out.println(f1.health);
					if(f2.health<=0) {
					break;
					}
					f1.health=f2.hit(f1);
					{
					f2.health=f1.hit(f2);
					if(f1.health<=0) {
					break;
					}
					//System.out.println(f2.health);
					if(f1.health<=0) {
					break;
					}
					f2.health=f1.hit(f2);
				
					}	}		
			
			}	
		}
		
			else {
			System.out.println("Sporcularýn sikleti uyuþmadýðý için maç yapýlamaz");
		}
	}
	
	boolean isCheck() {
		return (f1.weight>=minWeight&&f1.weight<=maxWeight)&&(f2.weight>=minWeight&&f2.weight<=maxWeight);
		
	}
	
	boolean isWin() {
		if(f1.health==0) {
			System.out.println(f2.name+" maçý kazandý.");
			return true;
		}
		
		if(f2.health==0) {
			System.out.println(f1.name+" maçý kazandý.");
			return true;
			
		}
		return false;
		
	}
	int whoStarts() {
		return ((int)Math.random()*2);
	}
	
	
	
}
