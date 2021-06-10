package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Person;
import model.PersonContainer;

import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CustomerUI extends JDialog implements ActionListener{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			WindowEvent windowClosing = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
			
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.setLayout(null);
			
			
			JLabel nameLabel = new JLabel("Name");
			nameLabel.setBounds(10,20,80,25);
			panel.add(nameLabel);
			
			JTextField nameText = new JTextField(20);
			nameText.setBounds(100,20,165,25);
			panel.add(nameText);
			
			JLabel addressLabel = new JLabel("Address");
			addressLabel.setBounds(10,50,80,25);
			panel.add(addressLabel);
			
			JTextField addressText = new JTextField(20);
			addressText.setBounds(100,50,165,25);
			panel.add(addressText);
			
			JLabel postalCodeLabel = new JLabel("Postalcode");
			postalCodeLabel.setBounds(10,80,80,25);
			panel.add(postalCodeLabel);
			
			JTextField postalText = new JTextField(20);
			postalText.setBounds(100,80,165,25);
			panel.add(postalText);
			
			JLabel cityLabel = new JLabel("City");
			cityLabel.setBounds(10,110,80,25);
			panel.add(cityLabel);
			
			JTextField cityText = new JTextField(20);
			cityText.setBounds(100,110,165,25);
			panel.add(cityText);
			
			JLabel phoneNumberLabel = new JLabel("Phonenumber");
			phoneNumberLabel.setBounds(10,140,80,25);
			panel.add(phoneNumberLabel);
			
			JTextField phoneNumberText = new JTextField(20);
			phoneNumberText.setBounds(100,140,165,25);
			panel.add(phoneNumberText);
			
			JLabel volapykLabel = new JLabel("Volapyk"); //personInfo?
			volapykLabel.setBounds(10,170,80,25);
			panel.add(volapykLabel);
			
			JTextField volaPykText = new JTextField(20);
			volaPykText.setBounds(100,170,165,25);
			panel.add(volaPykText);
			

			JButton registerButton = new JButton("Register");
			registerButton.setBounds(10, 220, 90, 25);
			registerButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Person person = new Person(nameText.getText(), addressText.getText(), Integer.parseInt(postalText.getText()), cityText.getText(), phoneNumberText.getText(), volaPykText.getText());
					PersonContainer personContainer = PersonContainer.getInstance();
					personContainer.addPerson(person);
					frame.dispatchEvent(windowClosing);
				}
				
			});
			
			panel.add(registerButton);
			
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(120, 220, 90, 25);
			cancelButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispatchEvent(windowClosing);
				}
				
			});
			panel.add(cancelButton);
			
			

			frame.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CustomerUI() {
		getContentPane().setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
