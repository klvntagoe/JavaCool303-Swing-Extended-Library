/**<h1>Cool 303 Box</h1>
 * @author Kelvin Tagoe
 * File Name: Cool303Box.java
 * Purpose: Source Code for Cool0303Box object
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import org.omg.CORBA.DynAnyPackage.Invalid;

public abstract class Cool303Box extends JPanel {
	
	/** FIELDS */
	private Cool303Theme theme;
	private String title;
	
	
	
	/** CONSTRUCTOR 1
	 * @param theme: Cool303Theme
	 * */
	public Cool303Box(Cool303Theme theme) {
		super();
		this.setLayout( new FlowLayout() );
		this.theme = theme;
	}
	
	
	/** CONSTRUCTOR 2
	 * @param title: String
	 * @param theme: Cool303Theme
	 * */
	public Cool303Box(String title, Cool303Theme theme) {
		super();
		this.theme = theme;
		this.title = title;
		this.setLayout( new FlowLayout() );
		TitledBorder border = new TitledBorder(title);
	    border.setTitleJustification(TitledBorder.LEFT);
	    border.setTitlePosition(TitledBorder.TOP);
	    super.setBorder(border);

	}
	
	
	
	/** OBJECT API */
	
	
	/** Get Title method
	 *  @return Returns the Box's title
	 * */
	public String getTitle() {	return this.title;	}
	
	
	
	/** Get Theme method
	 * @return  Returns an objects theme
	 * */
	public Cool303Theme getTheme() {	return this.theme;	}
	
	
	
	/** Add Cool303Button method
	 * @return a String of the theme name
	 * */
	public String getThemeName() {	return this.theme.toString();	}
	
	
	
	/** Adds a Cool303Button object to a list of objects to be displayed
	 * @param button: Cool303Button
	 * */
	public void addButton(Cool303Button button) {
		String objectTheme = button.getThemeName();
		String thisTheme = this.theme.toString();
		if (  objectTheme.equals( thisTheme )  ) this.add(button);
		else throw new IllegalArgumentException("Invalid Cool 303 theme");
	}

}
