package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	private JButton sampleButton;
	private JButton memeButton;
	private JTextField sampleField;
	private JTextField SampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	/**
	 * This is the Panel, it contains the buttons and displays the springLayout
	 * @param baseController
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleField = new JTextField(25);
		chatArea = new JTextArea(10, 24);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 0, SpringLayout.EAST, chatPane);
		
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 35, SpringLayout.NORTH, this);
		
		sampleButton = new JButton("click on me please! XD");
		chatPane.setColumnHeaderView(sampleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 466, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -6, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, 0, SpringLayout.EAST, sampleField);
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEnabled(false);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(baseLayout);;
		this.add(sampleField);
		this.add(chatPane);
		
		memeButton = new JButton("Give me a meme!!!");
		baseLayout.putConstraint(SpringLayout.WEST, memeButton, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, memeButton, -2, SpringLayout.NORTH, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, memeButton, 198, SpringLayout.WEST, chatPane);
		add(memeButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -24, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 30, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				chatArea.append(userTypedText);
				chatArea.append(chatbotResponse);
			}
		});
	}
	
	public void displayTextToUser(String input)
	{
		chatArea.append( input + "\n");
	}
}
