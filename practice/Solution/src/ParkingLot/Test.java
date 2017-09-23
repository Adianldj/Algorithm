package ParkingLot;

import java.util.ArrayList;
import java.util.List;

 class Test {
	 public static void main(String[] args){
	 ParkingLot Lot = new ParkingLot(4 , 10);
	 List<Vehicle> list = new ArrayList<>();
	 for(int i = 0 ; i < 50 ; i++){
		 final Vehicle v = i % 2 == 0 ? new Car() : new Truck();
		 list.add(v);
		 boolean hasSpot = Lot.hasSpot(v);
		 if(i < 40){
			 assert hasSpot;
			 assert Lot.park(v);
		 }else{
			 assert !hasSpot;
			 assert !Lot.park(v);
		 }
		 
	 }
     assert list.size() == 50;
	 int i = 0;
	 for(Vehicle v : list){
		 assert i >= 40 || Lot.leave(v);
		 i++;
	 }
}
 }
