package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	// "/**"  allows for documentation
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		//this. means talk to the current class
	}
	
	/**
	 * Gets the currents name og the Chatbot.
	 * @return The current name of this Chatbot in a string.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gets the number of chats for this Chatbot and returns that value.
	 * @return The current number of chats.
	 */
	public int getNumberOfChats ()
	{
		return numberOfChats;
	}
	
	/**
	 *Sets the name of Chatbot
	 * @param name The new name of the Chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Counts up by one for every input and response.
	 */
	public void incrimentChats()
	{
		numberOfChats ++;
	}
	
	//Method inside a method is bad! do not do this!!!
	/**
	 * Checks if the conditions are right to quit the chatbot using a boolean, if false app will not close, if true app will close.
	 * @param input quits the app if "goodbye" is the input.
	 * @return Returns okToQuit.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equals("goodbye"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
	
}
