/**<h1>Summer Box</h1>
 * @author Kelvin Tagoe
 * File Name: SummerBox.java
 * Purpose: Source Code for a SummerBox object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SummerBox extends Cool303Box {

	/** FIELDS */
	private Shape rectangle;
	
	
	
	/** CONSTRUCTOR 1 */
	public SummerBox() {
		super( new Summer() );
	}
	
	
	
	/** CONSTRUCTOR 2 
	 *  @param title: String
	 * */
	public SummerBox(String title) {
		super( title, new Summer() );
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
