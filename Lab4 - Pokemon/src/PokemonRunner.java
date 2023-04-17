import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hp = 200;
		int pp = 50;
		Type t = Type.FIRE;
		List<Attack>  atkL= new ArrayList<>(); 
		atkL.add(new Attack("Flamethrower",5,Type.FIRE,55));
		atkL.add(new Attack("Fire Spin",3,Type.FIRE,35));
		atkL.add(new Attack("Scratch",3,Type.NORMAL,25));
		atkL.add(new Attack("Dig",5,Type.GROUND,55));
		firePokemon Arcanine = new firePokemon(hp,pp,t,atkL,"Arcanine");
		//making arcanine
		int hp2 = 200;
		int pp2 = 50;
		Type t2 = Type.FIGHTING;
		List<Attack> atkL2 = new ArrayList<>();
		atkL2.add(new Attack("Hi Jump Kick",5,Type.FIGHTING,55));
		atkL2.add(new Attack("Rock Throw",3,Type.ROCK,30));
		atkL2.add(new Attack("Skull Bash",5,Type.NORMAL,55));
		atkL2.add(new Attack("Mega Kick",5,Type.NORMAL,55));
		fightingPokemon Hitmonlee = new fightingPokemon(hp2,pp2,t2,atkL2,"Hitmonlee");
		oranBerry item = new oranBerry();
		PPUP item2 = new PPUP();
		HumanPlayer player = new HumanPlayer(Arcanine,item,"Red");
		ComputerPlayer comp = new ComputerPlayer(Hitmonlee,item2,"Blue");
		Scanner in = new Scanner(System.in);
		player.printer();
		comp.printer();
		System.out.println("Red(You) gets first move! Choose: \nMoves 0-3 or 4 for Item " );
		while (player.getPartyMember().getHP() > 0 && comp.getPartyMember().getHP() > 0) {
			if (player.getRan() == true || comp.getRan() == true) {break;}
			int temp = in.nextInt();
			boolean used = false;
			boolean battleover = false;
			if (temp == 4) {
				player.getItem().use(player.getPartyMember());
			}
			else if (temp == 5) {
				player.run();
			}
			else {
				player.getPartyMember().attack(comp.getPartyMember(), temp); 
				}
			if (comp.getPartyMember().getHP() > 0) {comp.randAction(player.getPartyMember());} 
			player.printer();
			comp.printer();
		}
		System.out.println("Battle over! Your winner is....");
		if (comp.getPartyMember().getHP() > 0 || player.getRan() == true){
			System.out.println(comp.getName() + "!");
		}
		else{
			System.out.println(player.getName() + "!");
		}
	}


}
