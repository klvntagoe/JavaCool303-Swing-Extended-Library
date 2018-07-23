/**<h1>Pastel Box</h1>
 * @author Kelvin Tagoe
 * File Name: PastelBox.java
 * Purpose: Source Code for a PastelBox object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PastelBox extends Cool303Box {

	/** FIELDS */
	private Shape rectangle;
	
	
	
	/** CONSTRUCTOR 1 */
	public PastelBox() {
		super( new Pastel() );
	}
	
	
	
	/** CONSTRUCTOR 2 
	 * @param title: String
	 * */
	public PastelBox(String title) {
		super( title, new Pastel() );
	}

	
	
	/** OBJECT API */
	
	
	/** Paints the object a given color when displayed
	 * */
	protected void paintComponent(Graphics g) {
		g.setColor( this.getTheme().getColor1() );
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	
	
	
//	/** Paints the border of the object a given color when displayed
//	 * */
//	protected void paintBorder(Graphics g) {
//		g.setColor( this.getTheme().getColor3() );
//		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
//	}

}
