package shopCatalog;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;



public class Shop extends JFrame {
	JTextField BGnumber,identifireNumber;
	JLabel bgNumberLabel,identifireLabel;
	JButton addProductButton;
	JPanel panel;
	ShopDataManager datamanager;
	
	public Shop(){
		super("Shop Catalog");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,200,600,400);
		
		panel=new AddproductPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50,10,50,50));
		
		add(panel,BorderLayout.NORTH);
		
		setVisible(true);
		
		
	}
	
	class AddproductPanel extends JPanel{
		
		
		
	public AddproductPanel() {
		super();
		bgNumberLabel= new JLabel("Sorozatszám: ");
		identifireLabel= new JLabel("Azonositó: ");
		//nameLabel = new JLabel("Termék: ");
		
		BGnumber = new JTextField(8);
		identifireNumber= new JTextField(10);
		
		addProductButton=new JButton("add");
		
		add(bgNumberLabel);add(BGnumber);
		add(identifireLabel);add(identifireNumber);
		add(addProductButton);
		
		addProductButton.addActionListener(new AddProductAction());
	}
	
	class AddProductAction implements ActionListener {
		
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String getbg= BGnumber.getText();
			String getidentifirenumber= identifireNumber.getText();
			datamanager=new ShopDataManager(getbg,getidentifirenumber);
			
			
			System.out.print("Pushed");
		}
		
		
		
	}
		
		
		
		
	}

	public static void main(String[] args) {
		
		new Shop();
		// TODO Auto-generated method stub

	}

}
