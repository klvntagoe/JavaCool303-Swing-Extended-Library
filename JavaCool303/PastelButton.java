/**<h1>Pastel Button</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Button.java
 * Purpose: Source Code for a PastelButton object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class PastelButton extends Cool303Button {

	/** FIELDS */
	private Shape circle;
	
	
	
	/** CONSTRUCTOR 
	 * @param title: String
	 * */
	public PastelButton(String title) {
		super(title, new Pastel() );
	}

	
	
	/** OBJECT API */
	
	
	/** Paints the object a given color when displayed
	 * */
	protected void paintComponent(Graphics g) {
		g.setColor( this.getTheme().getColor2() );
		g.fillOval(0, 0, getSize().width-1, getSize().height-1);
	    super.paintComponent(g);
	}
	
	
	
	/** Paints the border of the object a given color when displayed
	 * */
	protected void paintBorder(Graphics g) {
		g.setColor( this.getTheme().getColor3() );
	    g.drawOval(0, 0, getSize().width-1, getSize().height-1);
	}
	
}
