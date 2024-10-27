package kadai_015;

public class CarExec_Chapter15 {
	
	private int gear = 0;
	private int speed = 0;
	
	public CarExec_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange(int afterGear) {
		switch(afterGear) {
		case 1 :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 10;
			break;
		case 2 :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 20;
			break;
		case 3 :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 30;
			break;
		case 4 :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 40;
			break;
		case 5 :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 50;
			break;
		default :
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.speed = 10;
			break;
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
	
}
