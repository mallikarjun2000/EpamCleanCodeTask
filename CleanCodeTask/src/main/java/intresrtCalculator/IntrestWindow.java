package intresrtCalculator;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class IntrestWindow extends JFrame {
	public IntrestWindow(){
		this.setLayout(new LayoutManager() {
			
			public void removeLayoutComponent(Component comp) {
				// TODO Auto-generated method stub
				
			}
			
			public Dimension preferredLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Dimension minimumLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void layoutContainer(Container parent) {
				// TODO Auto-generated method stub
				
			}
			
			public void addLayoutComponent(String name, Component comp) {
				// TODO Auto-generated method stub
				
			}
		});
		JLabel title  = new JLabel("Intrest Calculator");
		title.setBounds(0,0,200,20);
		final TextField principleF = new TextField("Principle amount");
		principleF.setBounds(0, 30, 200, 20);
		final TextField termF = new TextField("Term years");
		termF.setBounds(0, 60, 200, 20);
		final TextField rateF  = new TextField("Rate of Intrest");
		rateF.setBounds(0, 90, 200, 20);
		final TextField rateN = new TextField("compound unit");
		rateN.setBounds(300, 90, 200, 20);
		add(title);
		add(principleF);
		add(termF);add(rateF);
		add(rateN);
		Button b = new Button("Calculate Simple Intrest");
		b.setBounds(0, 120, 150, 30);
		add(b);
		Button b1 = new Button("Calculate Compund Intrest");
		b1.setBounds(160, 120, 150, 30);
		add(b1);
		final TextField resultSI = new TextField("Simple Intrest");
		add(resultSI);
		resultSI.setBounds(0, 180, 100, 30);
		final TextField resultPI = new TextField("Compund Intrest");
		add(resultPI);
		resultPI.setBounds(160, 180, 100, 30);
		
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SimpleIntrestCalculator simpleintrestcalculator = new SimpleIntrestCalculator
						(Double.parseDouble(principleF.getText()),
								Double.parseDouble(termF.getText()),
								Double.parseDouble(rateF.getText()));
				resultSI.setText(""+simpleintrestcalculator.calculateIntrest());
			}
		});
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CompoundIntrestCalculator compoundintrestcalculator = new CompoundIntrestCalculator
						(Double.parseDouble(principleF.getText()),
								Double.parseDouble(termF.getText()),
								Double.parseDouble(rateF.getText()),
								Double.parseDouble(rateN.getText()));
				resultPI.setText(""+compoundintrestcalculator.calculateIntrest());
			}
		});
	}
	
}
