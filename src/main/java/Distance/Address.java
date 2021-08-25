package Distance;

public class Address {
		
		double longitude;
		double latitude;
		String address;
		
		public Address(double longitude, double latitude, String address) {
			super();
			this.longitude = longitude;
			this.latitude = latitude;
			this.address = address;
		}
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		

	}

