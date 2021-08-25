package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class FarmAssetTest {

	@Test
	public void test() {
		
		List<Asset> assets = new ArrayList<Asset>();
		List<Farmer> farmers = new ArrayList<Farmer>();
		
		farmers.add(new Farmer(1, new Address(0,1,"aaabc"),"fam1"));
		
		farmers.add(new Farmer(2, new Address(0,2,"aaabd"),"fam2"));

		farmers.add(new Farmer(3, new Address(0,3,"aaabe"),"fam3"));

		farmers.add(new Farmer(4, new Address(0 ,4,"aaabf"),"fam4"));

		farmers.add(new Farmer(5, new Address(0,5,"aaabf"),"fam5"));

		
		
		
		assets.add(new Asset(1, new Address(0,1,"Bangalore"),10));
		
		assets.add(new Asset(2, new Address(0,2,"Ban"),10));
		
		assets.add(new Asset(3, new Address(0,3,"Bangalore"),10));
		
		assets.add(new Asset(4, new Address(0,4,"Bangalore"),10));
		
		assets.add(new Asset(5, new Address(0,5,"Bangalore"),10));
		
		assets.add(new Asset(6, new Address(0,6,"Bangalore"),10));
		
		assets.add(new Asset(7, new Address(0,7,"Bangalore"),10));
		
		assets.add(new Asset(8, new Address(0,8,"Bangalore"),10));
		
		assets.add(new Asset(9, new Address(0,9,"Bangalore"),10));
		
		assets.add(new Asset(10, new Address(0,10,"Bangalore"),10));
		
		Assign assign = new Assign();
		assign.nearestFarm(farmers,assets);
		
		assertEquals(farmers.get(0).getID(), assets.get(0).getOwner().getID());
		
		
		

}
}