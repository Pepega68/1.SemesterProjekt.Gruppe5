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

import model.Product;
import model.ProductContainer;

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

public class ProductUI extends JDialog {

	/**
	 * Create the dialog.
	 */
	public ProductUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		WindowEvent windowClosing = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		
		frame.setSize(310, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
	
		JLabel productInfoLabel = new JLabel("Product info");
		productInfoLabel.setBounds(10,20,100,25);
		panel.add(productInfoLabel);
		
		JTextField productInfoText = new JTextField(20);
		productInfoText.setBounds(110,20,165,25);
		panel.add(productInfoText);
		
		JLabel productBarcodeLabel = new JLabel("Product barcode");
		productBarcodeLabel.setBounds(10,50,100,25);
		panel.add(productBarcodeLabel);
		
		JTextField productBarcodeText = new JTextField(20);
		productBarcodeText.setBounds(110,50,165,25);
		panel.add(productBarcodeText);
		
		JLabel productIDLabel = new JLabel("Product ID");
		productIDLabel.setBounds(10,80,100,25);
		panel.add(productIDLabel);
		
		JTextField productIDText = new JTextField(20);
		productIDText.setBounds(110,80,165,25);
		panel.add(productIDText);
		
		JLabel productCategoryLabel = new JLabel("Product category");
		productCategoryLabel.setBounds(10,110,100,25);
		panel.add(productCategoryLabel); 
		
		JTextField productCategoryText = new JTextField(20);
		productCategoryText.setBounds(110,110,165,25);
		panel.add(productCategoryText);
		
		JLabel productQuantityLabel = new JLabel("Product quantity");
		productQuantityLabel.setBounds(10,140,110,25);
		panel.add(productQuantityLabel); 
		
		JTextField productQuantityText = new JTextField(20);
		productQuantityText.setBounds(110,140,165,25);
		panel.add(productQuantityText);
	 
		JButton addProductButton = new JButton("Create product"); 
		addProductButton.setBounds(10, 220, 120, 25); 
		addProductButton.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) { 
			Product product = new Product(productInfoText.getText(), Integer.parseInt(productBarcodeText.getText()), Integer.parseInt(productIDText.getText()), productCategoryText.getText());
			ProductContainer productContainer = ProductContainer.getInstance();
			Integer quantity = Integer.parseInt(productQuantityText.getText());
			productContainer.addProduct(product,quantity);
			//frame.dispatchEvent(windowClosing);
			} 
		});

		panel.add(addProductButton);
		
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(135, 220, 90, 25);
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);;

			}
	
		});
		panel.add(cancelButton);
		frame.setVisible(true);
	}
}

