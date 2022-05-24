/**
 * Area object with a state containing the name, description and previous area
 * name
 * 
 * @author jjbishop
 * @version development(1)
 */
public class Area {
	String name;
	String description;
	String connection;

	/**
	 * Constructor for area class
	 * 
	 * @param aName        Current area name
	 * @param aDescription Current area description
	 */
	public Area(String aName, String aDescription) {
		name = aName;
		description = aDescription;
		connection = "";
	}
	/**
	 * Set the room to which this one connects
	 * @param aConnection Connecting room name
	 */
	public void setConnection(String aConnection) {
		connection = aConnection;
	}
	
	/**
	 * Get the current area name
	 * @return String of the current area name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the area name and description
	 * 
	 * @return String of the area name
	 * @return String of the area description
	 */

	public String look() {
		return description;
	}

	/**
	 * Java's not so useful answer to a C++ deconstructor
	 */

	protected void finalize() {

	}

}
