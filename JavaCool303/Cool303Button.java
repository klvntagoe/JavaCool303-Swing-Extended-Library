/**<h1>Cool 303 Button</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Button.java
 * Purpose: Source Code for Cool303Button abstract class
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public abstract class Cool303Button extends JButton {
	
	/** FIELDS */
	private Cool303Theme theme;
	
	
	/** CONSTRUCTOR 
	 * @param title: String
	 * @param theme: Cool303Theme
	 * */
	public Cool303Button(String title, Cool303Theme theme) {
		super(title);
		this.theme = theme;
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(size);
		setContentAreaFilled(false);
	}
	
	
	
	/** OBJECT API */
	
	
	/** Get Theme method
	 * @return  Returns an objects theme
	 * */
	public Cool303Theme getTheme() {	return this.theme;	}
	
	
	
	/** Add Cool303Button method
	 * @return Returns a String of the theme name
	 * */
	public String getThemeName() {	return this.theme.toString();	}
	
	
}
