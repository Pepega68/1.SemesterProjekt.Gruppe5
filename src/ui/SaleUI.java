package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.PersonController;
import control.ProductController;
import control.SaleController;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class SaleUI extends JFrame {
	
    private SaleController saleController;
    private PersonController personController;
    private ProductController productController;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleUI frame = new SaleUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SaleUI() {
		
        personController = new PersonController();
        productController = new ProductController();
        saleController = new SaleController(productController, personController);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 456, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Tilf\u00F8j produkt");
		btnNewButton_1.setBounds(10, 57, 119, 23);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addProduct();
			}
		});
		
		JButton btnNewButton = new JButton("Nyt salg");
		btnNewButton.setBounds(10, 11, 82, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createSale();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Produktets stregkode");
		lblNewLabel_1.setBounds(139, 43, 130, 14);
		contentPane.add(lblNewLabel_1);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 58, 130, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Antal");
		lblNewLabel.setBounds(139, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(139, 102, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Afslut salget");
		btnNewButton_2.setBounds(10, 158, 119, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				endSale();
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Kunde tlf. nummer");
		lblNewLabel_2.setBounds(139, 145, 110, 14);
		contentPane.add(lblNewLabel_2);
		contentPane.add(btnNewButton_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 159, 130, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JList list = new JList();
		list.setBounds(279, 42, 151, 139);
		contentPane.add(list);
		
		JLabel lblNewLabel_3 = new JLabel("Aktuel Kurv");
		lblNewLabel_3.setBounds(283, 25, 82, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	private void createSale() {
		saleController.createSale();
	}
	
	private void addProduct() {
		Integer barcode;
		Integer quantity;
		barcode = Integer.parseInt(textField_1.getText());
		quantity = Integer.parseInt(textField.getText());
		saleController.findProductByBarcode(barcode, quantity);
	}
	
	private void endSale() {
		//Integer phoneNumber;
		//Integer phoneNumber = Integer.parseInt(textField_2.getText());
		saleController.endSale(textField_2.getText());
	}
}
