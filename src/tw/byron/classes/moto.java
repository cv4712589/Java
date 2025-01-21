package tw.byron.classes;

public class moto extends Bike {
	private int gear;
	private String color;
	
	public moto() {
		this.color = "black";    //this可不寫
	}
	
	public moto(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void upSpeed() {
		if(gear > 0) {
			speed = speed < 1 ? 1 :speed * 1.9 * gear;
		}
	}
	
	public void upSpeed(double args) {
		if(args > 0 && args < 1) {}
		speed = speed < 1 ? 1 :speed * (1+args) * gear;
	}
	
	
	
	public boolean changeGear(int gear) {
		if(gear >= 0 && gear <=4) {
				this.gear = gear;
				return true;
			}else {
				return false;
			}
	}
	@Override
	public String toString() {
		
		return color + ":" + gear + ":" + speed;
	}
	
}
