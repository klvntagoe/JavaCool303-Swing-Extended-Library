/**<h1>Cool 303 Pastel Theme</h1>
 * @author Kelvin Tagoe
 * File Name: Pastel.java
 * Purpose: Source Code for the Pastel theme class, extending the Cool303Theme abstract class
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Pastel extends Cool303Theme {
	
	/** CONSTRUCTOR */
	public Pastel() {
		super("Pastel");
		setColor1( new Color(255, 189, 189) );	//Pale Red
		setColor2( new Color(201, 201, 255) );	//Very Pale Blue
		setColor3( new Color(225, 247, 213) );	//Very Pale Cyan + Lime Green
		
	}
	
}
