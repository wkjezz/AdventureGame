import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Console fluff to set the moooooooood
		System.out.println("An Adventure Begins");
		System.out.println("Generating your adventure...");
		
		//Create the map
		Area vestabule = new Area("Vestabule", "A small dome shamed hexagonal room made of glass, You see a hallway ahead");
		Area hallway = new Area ("Hallway", "A narrow winding path of broken flagstone. The Meme Room is ahead.");
		Area memeRoom = new Area ("Meme Room", "A room filled with memes, many are of Nic Cage. The only way out is the hallway");
		
		//Set the connections of created rooms
		vestabule.setConnection(hallway.getName());
		hallway.setConnection(memeRoom.getName());
		memeRoom.setConnection(hallway.getName());
		
		// Player creation
		Scanner in = new Scanner(System.in);
		System.out.println("An Adventurer Appears! What is your name?");
		String playerName = in.nextLine();
		System.out.println("Welcome to your adventure " + playerName + "!");
		System.out.println("You catch your reflection in a broken shard of mirror, how do you appear?");
		String playerDescription = in.nextLine();;
		System.out.println("An epherial voice speaks. 'I wish my face looked like " + playerDescription +"'");
		System.out.println("You think out loud... 'Was that the voice of Sean Bean?'");
		
		Player myPlayer = new Player(playerName,playerDescription);
		myPlayer.setArea(vestabule.getName());
		
		
		
	}	

}
