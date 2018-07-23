/**<h1>Cool 303 Summer Theme</h1>
 * @author Kelvin Tagoe
 * File Name: Summer.java
 * Purpose: Source Code for the Summer theme class, extending the Cool303Theme abstract class
 * Inputs: None
 * Outputs: None
 * */

package JavaCool303;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Summer extends Cool303Theme {
	
	/** CONSTRUCTOR */
	public Summer() {
		super("Summer");
		setColor1( new Color(252, 145, 58) );	//Orange
		setColor2( new Color(249, 214, 46) );	//Yellow
		setColor3( new Color (255, 78, 80) );	//Red
	}
	
}
