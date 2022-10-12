package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
String shapeType;

int redComponent, greenComponent, blueComponent;

boolean isFilled;

double  x, y, halfWidth, halfHeigh;
	
shapeType = in.next();
redComponent = in.nextInt();
greenComponent = in.nextInt();
blueComponent = in.nextInt();
isFilled = in.nextBoolean();
x = in.nextDouble();
y = in.nextDouble();
halfWidth = in.nextDouble();
halfHeigh = in.nextDouble();

		Color ourcolor = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(ourcolor);
		if (isFilled == true) {
			StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);	
			}
		else {
			StdDraw.rectangle(x, y, halfWidth, halfHeigh);	
		}
		
		}
}
