package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;


/**
 * Application Controller for the Chatbot String manipulation project. Responsible for controlling the View and Model Packages.
 * 
 * @author tros7820
 * @version 1.3 10/1/14
 */
public class ChatbotAppController
{
	/**
	 * The GUI view for the application.
	 */
	private ChatbotView appView;
	/**
	 * The Chatbot Model instance.
	 */
	private Chatbot notSoCleverBot;
	/**
	 * The startup message for out chatbot application.
	 */
	private String startMessage;
	/**
	 * GUI frame for the application.
	 */
	private ChatbotFrame baseFrame;

	// Must make constructor to instantiate your objects, also allowing you to refer to other classes.
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
		notSoCleverBot = new Chatbot("Really Stupid Bot");
		startMessage = "Welcome to the " + notSoCleverBot.getName() + "Chatbot, type in your name.";
	}

	/**
	 * Allows other objects access to the notSoCleverBot.
	 * 
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}

	/**
	 * Starts the Chatbot Application
	 */
	public void start()
	{
		ChatbotPanel myAppPanel = (ChatbotPanel) baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//((ChatbotPanel) baseframe.getContentPane()).displayTextToUser(statrMessage);

	}
	/**
	 * Transimits info from the view package to the Chatbot.
	 * @param userInput
	 * @return
	 */
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		
		return respondText;
	}

	/**
	 * Quits the Chatbot Application with a message to the user that the application is closing.
	 */
	private void quit()
	{
		appView.diplayInformation("Goodbye, forever... >:(");
		System.exit(0);
	}
}
