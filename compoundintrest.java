import java.lang.Math;
public class compoundintrest
{
	float compoundinterest(float p,int r,int t)
	{
		float x,res;
		double y;
		x=(1+r/100);
		y=Math.pow(x,t);
		res=(float) (p*y);
		
		return res;
	}

}
