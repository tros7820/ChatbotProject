package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		//The reference to baseController,, is how you send information to the rest of our code.
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
