/**
 * MineSweeper button class
 * The description of MineButton index:
 * 		Number 0~9 means clicked: 0~8 the number of mines around it, 9 is mine(clicked).
 * 		Number 10~19 means not clicked: 10~19 the number of mines, 19 is mine(not clicked). 
 * 		Number 20 or more means the button is flagged.
 */
import java.awt.*;
import javax.swing.*;

class MineButton extends JButton
{
	public int id=10;    //Initialized to 10, which means no mine around it
	public MineButton()
	{
		setMargin(new Insets(0,0,0,0));
	}
}

