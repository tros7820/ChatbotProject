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
	 *  Starts the Chatbot Application
	 */
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Would you like to continue?");
		if(notSoCleverBot.quitChecker(message))
		{
			quit();
		}
		JOptionPane.showMessageDialog(null, "We are not done yet...");
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
