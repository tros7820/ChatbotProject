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
		
		sampleButton = new JButton("click on me please! XD");
		sampleField = new JTextField(25);
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(baseLayout);;
		
		this.add(sampleButton);
		this.add(sampleField);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 43, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 397, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -24, SpringLayout.SOUTH, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -10, SpringLayout.EAST, this);
		
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 30, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + ":O Whaaaaaaaat?!");
			}
		});
	}
}
