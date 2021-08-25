package Distance;

import java.util.*;

public class Assign {
	public void nearestFarm(List <Farmer> farmers, List <Asset> assets)
	{
		for(Asset asset : assets) {
			Farmer nearestFarmer= null;
			double minDist = Double.MAX_VALUE;
			for(Farmer farmer : farmers)
			{
			double dist = Math.sqrt(Math.pow(asset.getAdd1().getLatitude() - farmer.getAdd2().getLatitude(),2 )	+
					Math.pow(asset.getAdd1().getLongitude() - farmer.getAdd2().getLongitude(),2 ));
			if(dist < minDist)
			{
				minDist = dist;
				nearestFarmer = farmer;
				
			}
			}
			asset.setOwner(nearestFarmer);
		}
	}

}
