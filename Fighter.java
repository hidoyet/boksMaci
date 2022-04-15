package boksMaci;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	
	
	public Fighter(String name, int damage, int health, int weight,int dodge) {
		
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge=dodge;
	}
	int hit(Fighter foe) {
		
		System.out.println(this.name+" caný "+this.health+" "+foe.name+" caný "+foe.health);

		System.out.println(this.name+" "+foe.name+"'a vurdu "+this.damage+" "+foe.name+"'in caný azaldý");
		if(foe.isDodge()) {
			System.out.println(foe.name+" vuruþu bloke etti");			
					
		}
		
		if(foe.health-this.damage<0) {
			return 0;
		}
		System.out.print(foe.name+"'in caný "+(foe.health-this.damage)+" "+this.name+"'in caný "+(this.health-foe.damage));
		System.out.println();

		return foe.health-this.damage;
	}
	boolean isDodge() {
		double random=Math.random()*100;
		if(random>=dodge) {
			return true;
		}
		return false;
	}
	int whoStarts() {
		return ((int)(Math.random()*2));
	}
	
	
}
