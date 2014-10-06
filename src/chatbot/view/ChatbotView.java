package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	
	private ChatbotAppController baseController;
	
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Displays the supplied String parameter to the user via popup and returns the user response to the controller.
	 * @param input The supplied text to be displayed.
	 *  The user input.
	 * @return 
	 */
	
	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, input);
		
		return output;
	}
	
	/**
	 * Displays the supplied input via popup window.
	 * @param input The text to be displayed.
	 */
	
	public void diplayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
