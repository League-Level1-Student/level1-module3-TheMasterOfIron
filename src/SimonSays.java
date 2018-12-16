/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSays extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Declare a JFrame variable
	int points = 0;
	int randomnum;
	JFrame frame;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private boolean simonSays = false;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. Add the four images that match keyboard keys like this: 
		//images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
		images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "down.jpg");
		images.put(new Integer(KeyEvent.VK_LEFT), "left.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "right.jpg");
		// 3. Use a JOptionPane to tell the user the rules: "Press the matching key when
		// 'Simon says' otherwise press a different key"
		JOptionPane.showMessageDialog(null, "RULES:Press the matching key when simon says to and the Globglogabgalab will sing. If not press a different key and he will sing as well. If you don't listen to him he will have to repeat himself because you weren't listening. He hates people who dont listen.");
		// 4. Call the showImage method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		// 15. Make a points variable to track the score.

		// 16. If the keyCode matches the imageIndex and "Simon says"
		if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 0)) {
			points++;
			tries++;
			speak("I'm the Globglogabgalab \n I love books \n And this basement is a true treasure trove");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 0)) {
			points++;
			tries++;
			speak("I'm the Globglogabgalab \n I love books \n And this basement is a true treasure trove");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 1)) {
			points++;
			tries++;
			speak("I am the Glob-glo-gab-galab \n The shwabble-dabble-wabble-gabble flibba blabba blab \n I'm full of shwibbly glib-a-kind \n I am the yeast of thoughts and minds");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 1)) {
			points++;
			tries++;
			speak("I am the Glob-glo-gab-galab \n The shwabble-dabble-wabble-gabble flibba blabba blab \n I'm full of shwibbly glib-a-kind \n I am the yeast of thoughts and minds");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 2)) {
			points++;
			tries++;
			speak("Shwabble dabble glibble glabble schribble shwap glab \n Dibble dabble shribble shrabble glibbi-glap shwap \n Shwabble dabble glibble glabble shwibble shwap-dap \n Dibble dabble shribble shrabble glibbi-shwap glab");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 2)) {
			points++;
			tries++;
			speak("Shwabble dabble glibble glabble schribble shwap glab \n Dibble dabble shribble shrabble glibbi-glap shwap \n Shwabble dabble glibble glabble shwibble shwap-dap \n Dibble dabble shribble shrabble glibbi-shwap glab");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 3)) {
			points++;
			tries++;
			speak("Oooh, ha ha ha, mmm, splendid \n Simply delicious \n Ooooohm, ha haa ha ha");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 3)) {
			points++;
			tries++;
			speak("Oooh, ha ha ha, mmm, splendid \n Simply delicious \n Ooooohm, ha haa ha ha");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 4)) {
			points++;
			tries++;
			speak("I am the Glob-glo-gab-galab \n The shwabble-dabble-wabble-gabble flibba blabba blab \n I'm full of shwibbly glib-a-kind \n I am the yeast of thoughts and minds");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 4)) {
			points++;
			tries++;
			speak("I am the Glob-glo-gab-galab \n The shwabble-dabble-wabble-gabble flibba blabba blab \n I'm full of shwibbly glib-a-kind \n I am the yeast of thoughts and minds");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 5)) {
			points++;
			tries++;
			speak("Shwabble dabble glibble glabble schribble shwap glab \n Dibble dabble shribble shrabble glibbi-glap shwap \n Shwabble dabble glibble glabble shwibble shwap-dap \n Dibble dabble shribble shrabble glibbi-shwap glab");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 5)) {
			points++;
			tries++;
			speak("Shwabble dabble glibble glabble schribble shwap glab \n Dibble dabble shribble shrabble glibbi-glap shwap \n Shwabble dabble glibble glabble shwibble shwap-dap \n Dibble dabble shribble shrabble glibbi-shwap glab");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 1)&&(points == 6)) {
			points++;
			tries++;
			speak("Ahhh");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 0)&&(points == 6)) {
			points++;
			tries++;
			speak("Ahhh");
		}
		else if ((e.getKeyCode() != imageIndex)&&(randomnum == 1)) {
			tries++;
			speak("Oof");
		}
		else if ((e.getKeyCode() == imageIndex)&&(randomnum == 0)) {
			tries++;
			speak("Oof");
		}
		frame.dispose();
		showImage();
		if ((tries == 7)&&(points == 7)) {
			speak("Your score is " + points + "/7 You listened to the Globglogabgalab he is happy now.");
			JOptionPane.showMessageDialog(null, "Your score is " + points + "/7");
			System.exit(0);
		}
 		
 		else if ((tries == 7)&&(points == 0)) {
 			speak("Your score is " + points + "/7 You didn't listen to the Globglogabgalab at all he hates you now...     \n          Hey are you even awake?");
			JOptionPane.showMessageDialog(null, "Your score is " + points + "/7");
			System.exit(0);
		}
 		
 		else if ((tries == 7)&&(points < 7)) {
 			speak("Your score is " + points + "/7 You didn't listen to everything the Globglogabgalab had to say he is mad now.");
			JOptionPane.showMessageDialog(null   
					, "Your score is " + points + "/7");
			System.exit(0);
		}
			// 17. Increase the value of score
		
			// 18. Use the speak method to tell the user they were correct
		
		// 19. If the keyCode doesn't match the imageIndex and "Simon didn't say..."
		
			// 20.  Increase the value of score
		
			// 21. Use the speak method to tell the user they were correct
		
		// 22. Increment tries by 1
		
		// 25. If tries is greater than 9 (or however many you want)...
		
			// 26. Tell the user their score
		
			// 27. Exit the program

		// 23. Dispose of the frame

		// 24. Call the showImage method to show a new image
	}

	private void showImage() {
		// 5. Initialize your frame to a new JFrame()
		frame = new JFrame();
		// 6. Set the frame to visible
frame.setVisible(true);
		// 7. Uncomment the following line to add a random image to your frame
		//frame.add(getNextRandomImage());
frame.add(getNextRandomImage());
		// 8. Set the name of your frame
frame.setName("Simon Says");
		// 9. Pack the frame
		frame.pack();
		// 10. Set the defaultCloseOperation of your from to JFrame.EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 11. Add a key listener to the frame
frame.addKeyListener(this);
		// 12. Create a new instance of Random
Random randy = new Random();
randomnum = randy.nextInt(2);
		// 13. Use the Random and the speak method to either say 
		// "Simon says press this key" or "Press this key"
if (randomnum == 1) {
	speak("Simon says press this key.");
}
if (randomnum == 0) {
speak("Press this key.");
}
		// 14. Above, set the value of simonSays to true/false appropriately

		
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSays().makeAlbum();
	}
}

/*
 * BONUS!
 * Add a timer :
 * ~~~ where the code starts running ~~~ 
 * timeAtStart = newDate();
 *
 * ~~~ where the code ends ~~~ 
 * Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
