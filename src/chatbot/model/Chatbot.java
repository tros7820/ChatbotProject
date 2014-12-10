package chatbot.model;

import java.util.ArrayList;

/**
 * Model class for the Chatbot project
 * 
 * @author tros7820
 */

public class Chatbot
{
	
	/**
	 * The name of the Chatbot.
	 */
	private String name;
	/**
	 * The programmer specified content area. Used in the contentChecker(String)
	 */
	private int numberOfChats;
	/**
	 * The current number of chats in the Chatbot has participated in.
	 */
	private ArrayList<String> memeList;
	/**
	 * The list of AOTs that are used in the Chatbot. Used in the
	 */
	private ArrayList<String> AOTList;
	/**
	 * A list of input from the user to be used with the program.
	 */
	private ArrayList<String> userInputList;

	private User myUser;

	// "/**" allows for documentation

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * 
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		myUser = new User();
		userInputList = new ArrayList<String>();
		AOTList = new ArrayList<String>();
		// this. means talk to the current class

		memeList = new ArrayList<String>();
		fillTheMemeList();
		fillTheAOTList();
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

	private void fillTheAOTList()
	{
		AOTList.add("Attack On Tinan");
		AOTList.add("Titans");
		AOTList.add("Eren Yeager");
		AOTList.add("3D maneuvering gear");
		AOTList.add("Mikasa Ackerman");
		AOTList.add("Armin Arlert");
		AOTList.add("Captain Levi");
		AOTList.add("Reiner Braun");
		AOTList.add("Bertolt Hoover");
		AOTList.add("Annie Leonhart");
		AOTList.add("Jean Kirstein");
		AOTList.add("Marco Bott");
		AOTList.add("Connie Springer");
		AOTList.add("Sasha Blouse");
		AOTList.add("Krista Lenz");
		AOTList.add("Ymir");
		AOTList.add("Thomas Wagner");
		AOTList.add("Female Titan");
		AOTList.add("Colossal Titan");
		AOTList.add("Armored Titan");
		AOTList.add("Military Police");
		AOTList.add("Survey Corps");
		AOTList.add("104th Trainees Squad");
		AOTList.add("Trost Distric");
		AOTList.add("Stohess District");
		AOTList.add("Stohess District");
		AOTList.add("Shiganshina District");
		AOTList.add("Walls");
		AOTList.add("Wall Sina");
		AOTList.add("Wall Rose");
		AOTList.add("Wall Maria");
	}

	/**
	 * Processes the supplied text from the user to provide a message from the Chatbot.
	 *
	 * @param The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";

		if (userText != null)
		{
			if (numberOfChats < 5)
			{
				processedText = introChat(userText);
			}
			else
			{
				processedText = randomChat(userText);
			}

		}
		incrimentChats();
		return processedText;
	}

	private String introChat(String userText)
	{
		String processedText = "";
		// Save userText to the chatUser's appropriate fields.
		// For items that are not Strings you will need the wrapper
		// like Inteer.parseInt(userText) to save as an int
		// or Boolean.parseBoolean(userText) to save as a boolean
		if (numberOfChats == 0)
		{
			myUser.setUserName(userText);
			processedText = "Hello " + myUser.getUserName() + " What is your age?";
		}
		else if (numberOfChats == 1)
		{
			int age = Integer.parseInt(userText);
			myUser.setAge(age);
			processedText = "You're really " + myUser.getAge() + " years old?" + " That's awesome! " + myUser.getUserName();
			processedText += "\nWhat is your favorite movie? ";
		}

		else if (numberOfChats == 2)
		{
			myUser.setFavoriteMovie(userText);
			processedText = "I love" + myUser.getFavoriteMovie() + "!" + " It's one of my favorites!";
			processedText += "Do you have a vavorit movie?";

		}
		else if (numberOfChats == 3)
		{
			boolean isPierced = Boolean.parseBoolean(userText);
			myUser.setIsPierced(isPierced);
			processedText = "So it's" + myUser.getIsPierced() + " that you are pierced!" + " Personally it's impossible to pierce me...";
			processedText += "Do you hav any piercings?";
		}
		else
		{
			boolean isTattood = Boolean.parseBoolean(userText);
			myUser.setIsTattooed(isTattood);
			processedText = "I knew it! It's " + myUser.getIsTattooed() + " that you have tattoos!";
			processedText += "Do you have any tatoos?";
		}
		return processedText;
	}

	private String randomChat(String userText)
	{
		String processedText = "";
		int randomChoice = (int) (Math.random() * 6);

		if (randomChoice == 0)
		{
			if (stringLengthChecker(userText))
			{
				processedText = "Try typing something shorter, I'm not interested in your novel...";
			}
			else
			{
				processedText = "Details please! There has very little meaning.";
			}
		}
		else if (randomChoice == 1)
		{
			if (contentChecker(userText))
			{
				processedText = "I love attack on Titan! When do you think the new season will be released?";
			}
			else
			{
				processedText = "Uhm, do you want to talk about Attack on Titan?";
			}
		}
		else if (randomChoice == 2)
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
		else if (randomChoice == 3)
		{
			// User based talking
		}
		else if (randomChoice == 4)
		{
			// UserInputList add
			userInputList.add(0, userText);
			processedText = "Thanks for the input, " + myUser.getUserName();
		}
		else
		{
			// UserInputChecker
		}

		return processedText;
	}

	/**
	 * Checks the length of the the string and determines whether or not it is too long.
	 * 
	 * @param input
	 * @return
	 */
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;

		if (userInputList.size() > 0)
		{
			for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if (input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}

		return matchesInput;
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

	/**
	 * Checks for AOT content and determines whether or not there is any.
	 * 
	 * @param input
	 * @return
	 */
	private boolean contentChecker(String input)
	{
		boolean hasAOTContent = false;
		for (String currentAOT : AOTList)
		{
			if (currentAOT.equalsIgnoreCase(input))
			{
				hasAOTContent = true;
			}
		}
		return hasAOTContent;
	}

	/**
	 * Checks to see if the supplied user text matches any on the memes in the Chatbot's meme list.
	 * 
	 * @param currentText The user supplied text.
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
		/*
		 * for (int loopCount = 0; loopCount < memeList.size(); loopCount++) { if (memeList.get(loopCount).equalsIgnoreCase(currentText)) { isAMeme = true; } }
		 */
		return isAMeme;
	}

	// Method inside a method is bad! do not do put a method inside a method!!!
	/**
	 * Checks if the conditions are right to quit the chatbot using a boolean, if false app will not close, if true app will close.
	 * 
	 * @param input quits the app if "goodbye" is the input.
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