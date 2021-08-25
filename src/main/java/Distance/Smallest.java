package Distance;

import java.util.List;

public class Smallest {
	double minDist = Double.MAX_VALUE;
	public double getDist(double x1, double y1, double x2, double y2)
	{
		
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
	}
	 public double getDist(Address ad1, Address ad2)
	{
		return getDist(ad1.getLatitude(), ad2. getLatitude(), ad1.getLongitude(), ad2.getLongitude());
	}
	
	public double midist(List<Address> addresses)
	
	{
		double mindist= Double.MAX_VALUE;
		Address ad = addresses.get(0);
		for(int i=1;i<addresses.size();i++)
		{
			double dist1= getDist(ad,addresses.get(i));
			if(mindist>dist1)
			{
				mindist=dist1;
			}
			
		}
		return mindist;
	}
		
		public double  getMinDist(double dis)
		{
			if(minDist> dis) minDist = dis;
			return minDist;
			
		}
	

		public double getMinDist()
		{
			return minDist;
			
		}
		public void setMinDist(double minDist)
		{
			this.minDist = minDist;
			
		}
}