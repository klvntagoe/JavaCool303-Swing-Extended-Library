/**<h1>Cool 303 Theme</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Theme.java
 * Purpose: Source Code for Cool303Theme abstract class
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;


import java.util.*;
import java.awt.*;
import javax.swing.*;

public abstract class Cool303Theme {
	
	/** FIELDS
	 * Name: Theme name
	 * Color 1: Box color
	 * Color 2: Button color
	 * Color 3: Border color
	 * */
	private String name;
	private Color color1;
	private Color color2;
	private Color color3;
	
	
	
	/** CONSTRUCTOR 
	 * 	@param name: String
	 * */
	public Cool303Theme(String name) {
		this.name = name;
	}
	
	
	
	/** OBJECT API */
	
	
	/** toString method
	 *  @return the theme's name
	 * */
	@Override
	public String toString() {	return this.name;	}
	
	
	
	/** Get Color 1 method
	 *  @return the theme's second color
	 * */
	public Color getColor1() {	return this.color1;	}
	
	
	
	/** Get Color 2 method
	 *  @return the theme's main color
	 * */
	public Color getColor2() {	return this.color2;	}
	
	
	
	/** Get Color 3 method
	 *  @return the theme's third color
	 * */
	public Color getColor3() {	return this.color3;	}
	
	
	
	/** Set Color 1 method
	 *  @param c: Color
	 * */
	public void setColor1( Color c) {	this.color1 = c;	}
	
	
	
	/** Set Color 2 method
	 *  @param c: Color
	 * */
	public void setColor2( Color c) {	this.color2 = c;	}
	
	
	
	/** Set Color 3 method
	 *  @param c: Color
	 * */
	public void setColor3( Color c) {	this.color3 = c;	}
	
}