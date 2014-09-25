package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	// when you type /** it allows for documentation
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
	
	public String getName()
	{
		return name;
	}
	
	public int getNumberOfChats ()
	{
		return numberOfChats;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void incrimentChats()
	{
		numberOfChats ++;
	}
	
	//Method inside a method is bad! do not do this!!!
	
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
