package pkgCore;

public class Quarterback {
	private double TD;
	private double YDS;
	private double INTER;
	private double COMP;
	private double ATT;

	public Quarterback() {

	}

	public void setTD(int TD) {
		this.TD = TD;
	}

	public void setYDS(double YDS) {
		this.YDS = YDS;
	}

	public void setINTER(double INTER) {
		this.INTER = INTER;
	}

	public void setCOMP(double COMP) {
		this.COMP = COMP;
	}

	public void setATT(double ATT) {
		this.ATT = ATT;
	}

	public double QBrating() {

		double a = ((COMP / ATT) - 0.3) * 5;
		double b = ((YDS / ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INTER / ATT) * 25);

		if (a > 2.375) {
			a = 2.375;
		} else if (a < 0) {
			a = 0;
		}
		if (b > 2.375) {
			b = 2.375;
		}
		if (b < 0) {
			b = 0;
		}
		if (c > 2.375) {
			c = 2.375;
		}
		if (c < 0) {
			c = 0;
		}
		if (d > 2.375) {
			d = 2.375;
		}
		if (d < 0) {
			d = 0;
		}

		return (((a + b + c + d) / 6) * 100);

	}

}
