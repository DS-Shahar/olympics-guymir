package test;
public class Athlete {
	
	private String name;
	private Grade[] grades; 
	private int count;
	
	public Athlete (String name, int count)
	{
		this.name=name;
		this.grades=new Grade[count];
		this.count=count;
	}
	public Athlete(Athlete t)
	{
		this.name=t.name;
		this.count = t.count;
		this.grades = new Grade[t.grades.length];
		for (int  i =0; i<this.grades.length;i++)
		{
			this.grades[i] = t.grades[i];
		}
	}

	
	
	public Athlete(String name, Grade[] grades, int count)
	{
		this.name=name;
		this.grades=grades;
		this.count=grades.length;
	}
	public boolean addGrade(String apparatus, double score)
	{
		for(int i = 0; i <this.grades.length;i++)
		{
			if (this.grades[i]==null)
			{
				this.grades[i] = new Grade(apparatus, score);
				this.count=count+1;
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteGrade (String apparatus)
	{
		for(int i =0; i<this.grades.length;i++)
		{
			if(this.grades[i].getApparatus().equals(apparatus))
			{
				this.grades[i].setApparatus(null);
				this.count= count-1;
				return true;
			}
		}
		return false;
	}
	public double avarage ()
	{
		double sum = 0;
		for (int i = 0; i<this.grades.length; i++)
		{
			if(this.grades[i]!=null)
			{
			sum=+this.grades[i].getScore();
			}
		}
		return sum/this.count;
	}
	public boolean allGradesAbove (double bar)
	{
		for(int  i = 0 ; i<this.grades.length;i++)
		{
			if (this.grades[i]!=null)
		{
			if(bar>this.grades[i].getScore())
			{
				return false;
			}
		}
		}

		return true;
	}
	public boolean isBetter (Athlete a)
	{
		for (int i = 0; i<this.grades.length; i++)
		{
			for(int  j =0;j<a.grades.length; j++)
			{
				if(this.grades[i].getApparatus().contentEquals(a.grades[j].getApparatus())&& a.grades[j].getScore()>this.grades[i].getScore())
				{
					return false;
				}
			}
		}
		return true;
	}
	

	
	
}
