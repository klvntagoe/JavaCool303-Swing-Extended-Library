/**<h1>Summer Button</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Button.java
 * Purpose: Source Code for a SummerButton object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class SummerButton extends Cool303Button {
	
	/** FIELDS */
	private Shape rectangle;
	
	
	
	/** CONSTRUCTOR 
	 * @param title: String
	 * */
	public SummerButton(String title) {
		super(title, new Summer() );
	}
	
	
	
	/** OBJECT API */
	
	
	/** Paints the object a given color when displayed
	 * */
	protected void paintComponent(Graphics g) {
		g.setColor( this.getTheme().getColor2() );
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	    super.paintComponent(g);
	}
	
	
	
	/** Paints the border of the object a given color when displayed
	 * */
	protected void paintBorder(Graphics g) {
		g.setColor( this.getTheme().getColor3() );
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	
}
