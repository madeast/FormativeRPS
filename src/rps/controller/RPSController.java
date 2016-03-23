package rps.controller;

import rps.view.RPSFrame;

public class RPSController
{
	public String plChoice;
	public String plRock;
	public String plPaper;
	public String plScissor;
	public String cpuChoice;
	private RPSFrame baseFrame;
	

	public  RPSController()
	{
		baseFrame = new RPSFrame(this);
		plChoice = "";
		cpuChoice = "";
	}
	
	public void start()
	{
		robotChoice(cpuChoice);
	}
	
	public String robotChoice(String robotPlay)
	{
		int randomInt;
		
		robotPlay = "";
		randomInt = (int) (Math.random() * 3);
		
	
			if(randomInt == 0)
			{
				robotPlay = "Rock";
			}
		
			if(randomInt == 1)
			{
				robotPlay = "Paper";
			}
		
			if(randomInt == 2)
			{
				robotPlay = "Scissor";
			}
			
			return robotPlay;
	}
	
	public String getPlChoice()
	{
		return plChoice;
	}

	public void setPlChoice(String plChoice)
	{
		this.plChoice = plChoice;
	}

	public String getPlRock()
	{
		return plRock;
	}

	public void setPlRock(String plRock)
	{
		this.plRock = plRock;
	}

	public String getPlPaper()
	{
		return plPaper;
	}

	public void setPlPaper(String plPaper)
	{
		this.plPaper = plPaper;
	}

	public String getPlScissor()
	{
		return plScissor;
	}

	public void setPlScissor(String plScissor)
	{
		this.plScissor = plScissor;
	}

	public String getCpuChoice()
	{
		return cpuChoice;
	}

	public void setCpuChoice(String cpuChoice)
	{
		this.cpuChoice = cpuChoice;
	}

	public RPSFrame getBaseFrame()
	{
		return baseFrame;
	}

	public void setBaseFrame(RPSFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}
	
}
