/**<h1>Cool 303 Root</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Root.java
 * Purpose: Source Code for Cool303Root object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Cool303Root extends JPanel{

	/** FIELDS
	 * Theme: Implemented Root theme
	 * */
	private Cool303Theme theme;
	
	
	
	/** CONSTRUCTOR 
	 * @param theme: Cool303Theme
	 * */
	public Cool303Root(Cool303Theme theme) {
		if ( theme instanceof Summer) {
			this.theme = (Summer) theme;
			super.setBackground( new Color(234, 227, 116) );	//Pale Yellow
			super.setLayout( new FlowLayout() );
			
		}
		else if (theme instanceof Pastel) {
			this.theme = (Pastel) theme;
			super.setBackground( new Color(225, 247, 213) );	//Very Pale Cyan + Lime Green
			super.setLayout( new FlowLayout() );
		}
		else throw new IllegalArgumentException("Invalid input");
	}
	
	
	
	/**OBJECT API*/
		
	
	/** Adds a Cool303Box object to a list of objects to be displayed
	 * @param object: Cool303Box
	 * */
	public void addBox(Cool303Box object) {
		String objectTheme = object.getThemeName();
		String thisTheme = this.theme.toString();
		if (  objectTheme.equals( thisTheme )  ) super.add(object);
		else throw new IllegalArgumentException("Invalid Cool 303 theme");
	}
	
	
	
	/** Adds a Cool303Button object to a list of objects to be displayed
	 * @param object: Cool303Button
	 * */
	public void addButton(Cool303Button object) {
		String objectTheme = object.getThemeName();
		String thisTheme = this.theme.toString();
		if (  objectTheme.equals( thisTheme )  ) super.add(object);
		else throw new IllegalArgumentException("Invalid Cool 303 theme");
	}
	
	
	
	/** Overridden add method - Adds a component to object if the component is of type Cool303Box or Cool303Button
	 * @param c: Component
	 * */
	@Override
	public Component add(Component c) {	
		if (c instanceof Cool303Box ) {
			String objectTheme = ((Cool303Box) c).getThemeName();
			String thisTheme = this.theme.toString();
			if ( objectTheme.equals(thisTheme) ) super.add(c);
			else throw new IllegalArgumentException("Invalid Cool303 Theme");
		}else if(c instanceof Cool303Button) {
			String objectTheme = ((Cool303Button) c).getThemeName();
			String thisTheme = this.theme.toString();
			if ( objectTheme.equals(thisTheme) ) super.add(c);
			else throw new IllegalArgumentException("Invalid Cool303 Theme");
		} else throw new IllegalArgumentException("Invalid Cool303 Object");
		return this;
	}

}
