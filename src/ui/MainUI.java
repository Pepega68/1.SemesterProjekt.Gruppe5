package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI extends JFrame {
	
	private SaleUI saleUI;
	private CustomerUI customerUI;
	private ProductUI productUI;

	private JFrame myFrame;
	private JDialog myDialog;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. Nice comment dude
	 */
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Customers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerUI();
			}
		});
		
		btnNewButton.setBounds(335, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Products");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productUI();
			}
		});
		
		btnNewButton_1.setBounds(335, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sale Terminal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saleUI();
			}
		});
		btnNewButton_2.setBounds(230, 11, 95, 23);
		contentPane.add(btnNewButton_2);
	}
	
	private void customerUI() {
		myDialog = new CustomerUI();
		myDialog.setVisible(true);
	}
	
	private void productUI() {
		myDialog = new ProductUI();
		myDialog.setVisible(true);
	}
	
	private void saleUI() {
		myFrame = new SaleUI();
		myFrame.setVisible(true);
	}
}
