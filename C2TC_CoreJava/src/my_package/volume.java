package my_package;
class volume
{
	volume(int s)
	{
		int vc=s*s*s;
		System.out.println("volume of the cuube" +vc);
	}
	volume(double r)
	{
		double vs=(4/3.0)*3.15*r*r*r;
		System.out.println("volume of the cuube" +vs);
	}
	volume(int l,int b,int h) {
		int vcd=l*b*h;
		System.out.println("volume of the cuube" +vcd);
	}
}
