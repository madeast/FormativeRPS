package rps.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import rps.controller.RPSController;

public class RPSPanel extends JPanel
{
	private RPSController baseController;
	private JButton plRock;
	private JButton plPaper;
	private JButton plScissor;
	private JTextField rpsTextField;
	private SpringLayout baseLayout;
	private JLabel winLabel;
	private JLabel tieLabel;
	private JLabel loseLabel;
	private JLabel userChoice;
	private int plWin;
	private int plLose;
	private int plTie;

	

	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		plPaper = new JButton("Paper");
		plRock = new JButton("Rock");
		plScissor = new JButton("Scissor");
		rpsTextField = new JTextField("Results");
		winLabel = new JLabel("Wins: " + plWin);
		loseLabel = new JLabel("Loses: " + plLose);
		tieLabel = new JLabel("Ties: " + plTie);
		userChoice = new JLabel("");
		plWin = 0;
		plLose = 0;
		plTie = 0;
		
		setupPanel();
		setupLayout();
		setupRPSPane();
		setupListeners();
	}
	
	private void setupRPSPane()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(plRock);
		this.add(plPaper);
		this.add(plScissor);
		this.add(rpsTextField);
		this.add(winLabel);
		this.add(loseLabel);
		this.add(tieLabel);
		this.add(userChoice);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		plRock.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				userChoice.setText("Rock"); 
				
				if(baseController.cpuChoice.equals(userChoice) == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plTie++;
				}
			}
		});
		
		plPaper.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				userChoice.setText("Paper");
				
				if(baseController.cpuChoice.equals(userChoice) == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plTie++;
				}
				
				if(baseController.cpuChoice.equals("Paper") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plLose++;
				}
			}
		});
		
		plScissor.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				userChoice.setText("Scissor");
				
				if(baseController.cpuChoice.equals(userChoice) == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plTie++;
				}
				
				if(baseController.cpuChoice.equals("Rock") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plWin++;
				}
				
				if(baseController.cpuChoice.equals("Paper") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plLose++;
				}
				
			}
		});
	}
	
	public RPSController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(RPSController baseController)
	{
		this.baseController = baseController;
	}

	public JButton getPlRock()
	{
		return plRock;
	}

	public void setPlRock(JButton plRock)
	{
		this.plRock = plRock;
	}

	public JButton getPlPaper()
	{
		return plPaper;
	}

	public void setPlPaper(JButton plPaper)
	{
		this.plPaper = plPaper;
	}

	public JButton getPlScissor()
	{
		return plScissor;
	}

	public void setPlScissor(JButton plScissor)
	{
		this.plScissor = plScissor;
	}

	public JTextField getRpsTextField()
	{
		return rpsTextField;
	}

	public void setRpsTextField(JTextField rpsTextField)
	{
		this.rpsTextField = rpsTextField;
	}

	public SpringLayout getBaseLayout()
	{
		return baseLayout;
	}

	public void setBaseLayout(SpringLayout baseLayout)
	{
		this.baseLayout = baseLayout;
	}

	public JLabel getWinLabel()
	{
		return winLabel;
	}

	public void setWinLabel(JLabel winLabel)
	{
		this.winLabel = winLabel;
	}

	public JLabel getTieLabel()
	{
		return tieLabel;
	}

	public void setTieLabel(JLabel tieLabel)
	{
		this.tieLabel = tieLabel;
	}

	public JLabel getLoseLabel()
	{
		return loseLabel;
	}

	public void setLoseLabel(JLabel loseLabel)
	{
		this.loseLabel = loseLabel;
	}

	public int getPlWin()
	{
		return plWin;
	}

	public void setPlWin(int plWin)
	{
		this.plWin = plWin;
	}

	public int getPlLose()
	{
		return plLose;
	}

	public void setPlLose(int plLose)
	{
		this.plLose = plLose;
	}

	public int getPlTie()
	{
		return plTie;
	}

	public void setPlTie(int plTie)
	{
		this.plTie = plTie;
	}
	
}
