package vue;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelCentral extends JPanel
{

	public PanelCentral (Color cl)
	{
		this.setBackground(cl);
		this.setBounds(200, 20, 460, 340);
		this.setLayout(null);
		
		this.setVisible(false);
	}
}
