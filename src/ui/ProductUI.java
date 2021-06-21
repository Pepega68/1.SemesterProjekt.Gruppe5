package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Person;
import model.PersonContainer;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import java.awt.Label;
import javax.swing.JMenu;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ProductUI extends JDialog implements ActionListener {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
	 
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			WindowEvent windowClosing = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
	
			frame.setSize(400, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.setLayout(null);
			
		
			JLabel ProductLabel = new JLabel("Product");
			ProductLabel.setBounds(10,20,80,25);
			panel.add(ProductLabel);
			
			JTextField ProductText = new JTextField(20);
			ProductText.setBounds(100,20,165,25);
			panel.add(ProductText);
			
			JLabel ProductIDLabel = new JLabel("ProductID");
			ProductIDLabel.setBounds(10,50,80,25);
			panel.add(ProductIDLabel);
			
			JTextField ProductIDText = new JTextField(20);
			ProductIDText.setBounds(100,50,165,25);
			panel.add(ProductIDText);
			
			JLabel prodInfLabel = new JLabel("productInfo");
			prodInfLabel.setBounds(10,80,80,25);
			panel.add(prodInfLabel);
			
			JTextField prodInfText = new JTextField(20);
			prodInfText.setBounds(100,80,165,25);
			panel.add(prodInfText);
			
			JLabel prodcatLabel = new JLabel("productcategory");
			prodcatLabel.setBounds(10,110,80,25);
			panel.add(prodcatLabel); 
			
			JTextField prodcatText = new JTextField(20);
			prodInfText.setBounds(100,80,165,25);
			panel.add(prodcatText);
		 
	JButton Addprbutton = new JButton("Add product"); 
	Addprbutton.setBounds(10, 220, 90, 25); 
	Addprbutton.addActionListener(new ActionListener() {

		@Override 
		public void actionPerformed(ActionEvent e) {                                                                          //fiks city text fix phonenumhumber. 
			product product = new product(ProductText.getText(), ProductIDText.getText(), Integer.parseInt(ProductIDText.getText()), prodcatLabel.getText();
			PersonContainer personContainer = PersonContainer.getInstance();
			personContainer.addproduct(productID);
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
	public ProductUI() {
		getContentPane().setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

		


	private static JPanel JPanel() {
		// TODO Auto-generated method stub
		return null;
	}}

