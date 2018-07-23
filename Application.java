/**<h1>Application</h1>
 * @author Kelvin Tagoe
 * File Name: Application.java
 * Purpose: Source Code for a JavaCool303 package tester application
 * Inputs: None
 * Outputs: None
 * */

import JavaCool303.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Summer and Pastel Demo");
		mainFrame.setSize(1200, 600);
		mainFrame.setLayout( new GridLayout(1,2) );
		SummerDemo(mainFrame);
		PastelDemo(mainFrame);
	}
	
	
	
	public static void SummerDemo(JFrame mainFrame) {
		Cool303Root root = new Cool303Root( new Summer() );
		Cool303Box[] boxes = new SummerBox[4];
		for (int i = 0; i < 4; i++) {
			boxes[i] = new SummerBox( Integer.toString(i+1) );
			boxes[i].setPreferredSize(new Dimension(500, 100));
			boxes[i].setLayout( new GridLayout(1,5) );
			for (int j = 1; j <= 5; j++) {
				Cool303Button b = new SummerButton(j+(i*5)+"");
				b.setPreferredSize( new Dimension(20,20) );
				b.addActionListener( 
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								System.out.println("Summer Demo: You clicked on button " + ( (JButton) e.getSource()).getText() );
							}
						}
				);
				boxes[i].addButton( b );
			}
			boxes[i].setBackground( Color.BLUE );
			root.addBox(boxes[i]);
		}
		mainFrame.add(root);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	
	
	public static void PastelDemo(JFrame mainFrame) {
		Cool303Root root = new Cool303Root( new Pastel() );
		Cool303Box[] boxes = new PastelBox[4];
		for (int i = 0; i < 4; i++) {
			boxes[i] = new PastelBox( Integer.toString(i+1) );
			boxes[i].setPreferredSize(new Dimension(500, 100));
			boxes[i].setLayout( new GridLayout(1,5) );
			for (int j = 1; j <= 5; j++) {
				Cool303Button b = new PastelButton(j+(i*5)+"");
				b.setPreferredSize( new Dimension(20,20) );
				b.addActionListener( 
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								System.out.println("Pastel Demo: You clicked on button " + ( (JButton) e.getSource()).getText() );
							}
						}
				);
				boxes[i].addButton( b );
			}
			root.addBox(boxes[i]);
		}
		mainFrame.add(root);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
}
