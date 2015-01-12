package konzolniInterfaceZaIksOks;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IksOksGUI {
	
	static JButton[] buttons = new JButton[9];

	public static void main(String[] args) {
		
		//U main funkciji kreiramo frame i panel, zatim na panel "nalijepimo" sve dugmiæe
		
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		ButtonHandler handler = new ButtonHandler();
		for (int i=0; i<9; i++)
		{
			buttons[i] = new JButton();
			buttons[i].addActionListener(handler);
			panel.add(buttons[i]);
		}
		window.add(panel);
		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//ButtonHandler za dugmiæe
	
	public static class ButtonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[0])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[0].setText("X");
					}
					else
					{
						buttons[0].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(0, 0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[1])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[1].setText("X");
					}
					else
					{
						buttons[1].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(0, 1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[2])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[2].setText("X");
					}
					else
					{
						buttons[2].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(0, 2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[3])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[3].setText("X");
					}
					else
					{
						buttons[3].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(1, 0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[4])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[4].setText("X");
					}
					else
					{
						buttons[4].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(1, 1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[5])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[5].setText("X");
					}
					else
					{
						buttons[5].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(1, 2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[6])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[6].setText("X");
					}
					else
					{
						buttons[6].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(2, 0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[7])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[7].setText("X");
					}
					else
					{
						buttons[7].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(2, 1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if (e.getSource() == buttons[8])
			{
				try {
					if (iksOksLogika.Igrica.getIgrac() == -1)
					{
						buttons[8].setText("X");
					}
					else
					{
						buttons[8].setText("O");
					}
					iksOksLogika.Igrica.odigrajPotez(2, 2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		
		
	}
	
}


