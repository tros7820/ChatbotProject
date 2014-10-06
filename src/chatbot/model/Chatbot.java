package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private String contentArea;
	// "/**" allows for documentation

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total
	 * chats to 0.
	 * 
	 * @param name
	 *            The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentArea = "";
		// this. means talk to the current class
		
		memeList = new ArrayList<String>();
	}

	/**
	 * Gets the currents name of the Chatbot.
	 * 
	 * @return The current name of this Chatbot in a string.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Gets the number of chats for this Chatbot and returns that value.
	 * 
	 * @return The current number of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * Sets the name of Chatbot
	 * 
	 * @param name
	 *            The new name of the Chatbot
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
		numberOfChats++;
	}

	/**
	 * Fills the contents of the memeList with internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u mad bro");
		memeList.add("come at me bro");
		memeList.add("i cri evrytim");
		memeList.add("Like a Sir");
		memeList.add("ಠ_ಠ");
		memeList.add("Aliens...");
		memeList.add("Bish Please!");
		memeList.add("That's not what your mom said!");
		memeList.add("Challenge accepted.");
		memeList.add("me gusta");
		memeList.add("Pfffffffffftttttttccchhhhhccchhhccccchhhhhccccccccchhhhhhchchhchchchchchhhhhhcccchhhch");
		memeList.add("Hail stan");
	}

	/**
	 * Processes the supplied text from the user to provide a message from the
	 * Chatbot.
	 * 
	 * @param userText
	 *            The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrimentChats();

		int randomChoice = (int) (Math.random() * 3);

		if (randomChoice == 0)
		{
			// Use stirngLengthChecker here
		}
		else if (randomChoice == 1)
		{
			// Use contentChecker here
		}
		else
		{
			if (memeChecker(userText))
			{
				processedText = "hey, you found a meme: " + userText;
				processedText += "isn't that cool.";
			}
			else
			{
				processedText = "Boooooring! That wasn't a meme.";
			}
		}

		return processedText;
	}

	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		if (input.length() >= 20)
		{
			isTooLong = true;
		}
		return isTooLong;
	}

	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}
		return hasMyContent;
	}

	/**
	 * Checks to see if the supplied user text matches any on the memes in the
	 * Chatbot's meme list.
	 * 
	 * @param currentText
	 *            The user supplied text.
	 * @return Whether the String matched any of the built in memes.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		for (int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if (memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		return isAMeme;
	}

	// Method inside a method is bad! do not do put a method inside a method!!!
	/**
	 * Checks if the conditions are right to quit the chatbot using a boolean,
	 * if false app will not close, if true app will close.
	 * 
	 * @param input
	 *            quits the app if "goodbye" is the input.
	 * @return Returns okToQuit.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("goodbye"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}

}
