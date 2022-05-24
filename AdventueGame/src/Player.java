/**
 * Plauer object with a state containing the health value, attack value and
 * current area value.
 * 
 * @author jjbishop
 * @version development(1)
 */
public class Player {
	int health;
	int attack;
	String name;
	String description;
	String area;

	/**
	 * Constructor for a player object
	 * 
	 * @param aHealth  Integer health value
	 * @param anAttack Integer attack value
	 * @param anArea   String Current area
	 */

	public Player(String aName, String aDescription) {
		name = aName;
		description = aDescription;
		health = 100;
		attack = 10;
		area = "";
	}

	/**
	 * Current health
	 * 
	 * @return Integer of current health value
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Current attack value
	 * 
	 * @return Integer of current attack value
	 */

	public int getAttack() {
		return attack;
	}

	/**
	 * Current area
	 * 
	 * @return String of the area of the player
	 */

	public String getArea() {
		return area;
	}

	/**
	 * Adjust health
	 * 
	 * @param aHealth Set health value
	 */
	public void setHealth(int aHealth) {
		health = aHealth;
	}

	/**
	 * Adjust attack
	 * 
	 * @param anAttack Set attack value
	 */

	public void setAttack(int anAttack) {
		attack = anAttack;
	}

	/**
	 * Set a new location
	 * 
	 * @param anArea Set the area for the Player
	 */

	public void setArea(String anArea) {
		area = anArea;
	}

	/**
	 * Java's not so useful answer to a C++ deconstructor
	 */

	protected void finalize() {

	}

}
