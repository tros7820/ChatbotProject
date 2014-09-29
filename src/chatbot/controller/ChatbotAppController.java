package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;
	//Must make constructor to instantiate your objects, also allowing you to refer to other classes.
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Really Stupid Bot");
	}
	
	/**
	 * Allows other objects access to the notSoCleverBot.
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	/**
	 *  Starts the Chatbot Application
	 */
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in yout name.");

		while(!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatbotConversations(message);	
		}
		
	}
	
	/**
	 * Quits the Chatbot Application
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
