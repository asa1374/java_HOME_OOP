package oop_car;

public class CarServiceImpl implements CarService{
	@Override
	public CarBean info(String color, String gearType, int door) {
		CarBean bean = new CarBean();
		bean.setColor(color);
		bean.setDoor(door);
		bean.setGearType(gearType);
		return bean;
	}

}
