package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;
import java.awt.Font;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	private JButton enterButton;
	private JButton memeButton;
	private JTextField sampleField;
	private JTextField SampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	private JLabel lblNewLabel;
	/**
	 * This is the Panel, it contains the buttons and displays the springLayout
	 * @param baseController
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleField = new JTextField(25);
		sampleField.setForeground(Color.BLACK);
		sampleField.setBackground(new Color(0, 250, 154));
		chatArea = new JTextArea(12, 40);
		chatArea.setForeground(Color.BLACK);
		chatArea.setBackground(new Color(0, 250, 154));
		chatPane = new JScrollPane(chatArea);
		lblNewLabel = new JLabel("   Chatbot");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 700, SpringLayout.WEST, this);
		memeButton = new JButton("Meme!");
		enterButton = new JButton("Enter");
		
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setLayout(baseLayout);;
		this.add(sampleField);
		this.add(chatPane);
		this.add(lblNewLabel);
		this.add(memeButton);
		this.add(enterButton);
		
		
		memeButton.setBackground(new Color(0, 250, 154));
		enterButton.setForeground(new Color(0, 0, 0));
		enterButton.setBackground(new Color(0, 250, 154));
		lblNewLabel.setForeground(new Color(0, 250, 154));
		lblNewLabel.setFont(new Font("Lindsey", Font.BOLD, 60));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setOpaque(true);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, enterButton, 6, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enterButton, -6, SpringLayout.NORTH, memeButton);
		baseLayout.putConstraint(SpringLayout.EAST, enterButton, 0, SpringLayout.EAST, memeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -24, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 90, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, -58, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 0, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, memeButton, 6, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, memeButton, 0, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, memeButton, -47, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		enterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				chatArea.append(userTypedText + "\n");
				chatArea.append(chatbotResponse);
			}
		});
	}
	
	public void displayTextToUser(String input)
	{
		chatArea.append( input + "\n");
	}
}
