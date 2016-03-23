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
		baseLayout.putConstraint(SpringLayout.NORTH, plPaper, 0, SpringLayout.NORTH, plRock);
		baseLayout.putConstraint(SpringLayout.WEST, plRock, 174, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, plRock, -10, SpringLayout.SOUTH, this);
		plScissor = new JButton("Scissor");
		baseLayout.putConstraint(SpringLayout.NORTH, plScissor, 0, SpringLayout.NORTH, plRock);
		baseLayout.putConstraint(SpringLayout.EAST, plScissor, -46, SpringLayout.EAST, this);
		rpsTextField = new JTextField("Results");
		baseLayout.putConstraint(SpringLayout.NORTH, rpsTextField, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rpsTextField, -89, SpringLayout.EAST, plRock);
		baseLayout.putConstraint(SpringLayout.SOUTH, rpsTextField, 155, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rpsTextField, 24, SpringLayout.EAST, plRock);
		winLabel = new JLabel("Wins: " + plWin);
		baseLayout.putConstraint(SpringLayout.SOUTH, winLabel, -19, SpringLayout.NORTH, plPaper);
		baseLayout.putConstraint(SpringLayout.EAST, winLabel, 0, SpringLayout.EAST, plPaper);
		loseLabel = new JLabel("Loses: " + plLose);
		baseLayout.putConstraint(SpringLayout.NORTH, loseLabel, 0, SpringLayout.NORTH, winLabel);
		baseLayout.putConstraint(SpringLayout.EAST, loseLabel, -52, SpringLayout.EAST, this);
		tieLabel = new JLabel("Ties: " + plTie);
		baseLayout.putConstraint(SpringLayout.NORTH, tieLabel, 0, SpringLayout.NORTH, winLabel);
		baseLayout.putConstraint(SpringLayout.EAST, tieLabel, 0, SpringLayout.EAST, plRock);
		userChoice = new JLabel("");
		plWin = 0;
		plLose = 0;
		plTie = 0;
		
		setupPanel();
		setupLayout();
		setupListeners();
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
				
				if(baseController.cpuChoice.equals("Rock") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plWin++;
				}
				
				if(baseController.cpuChoice.equals("Scissors") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plLose++;
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
				
				if(baseController.cpuChoice.equals("Rock") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plLose++;
				}
				
				if(baseController.cpuChoice.equals("Scissors") == true)
				{
					rpsTextField.setText(baseController.cpuChoice);
					plWin++;
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
