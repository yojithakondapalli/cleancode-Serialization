
public class constructioncost 
{
float costofconstruction(int a,float area)
{
	float cost=0;
	if(a==1)
	{
	 cost = 1200*area;
	}
	else if(a==2)
	{
	    cost=1500*area;
	    
	}
	else if(a==3)
	{
	    cost=1800*area;
	}
	else if(a==4)
	{
	    cost=2700*area;
	}
	 return cost;
}
}
