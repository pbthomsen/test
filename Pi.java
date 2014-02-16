// Program til beregning af Pi
// Pi med 76 decimalers nøjagtighed: 
// π ≈ 3.1415 9265 3589 7932 3846 2643 3832 7950 2884 1971 6939 9375 1058 2097 4944 5923 0781 6406 2862 
// (fra http://3.141592653589793238462643383279502884197169399375105820974944592.no/million.html)

public class Pi 
{
	static int N = 100000;

	public static void main (String args[])
	{
		double A, B;
		double a, b;
		double o, p;

		for (int i = 1; i < N; i++)
		{
			// Vinkel A
			A = 2 * Math.PI / i;

			// Vinkel B  ( A + 2 * B = Pi = 180 grader)
			B = (Math.PI - A) / 2;

			// side b
			b = 1;

			// side a (sin(A) / a = sin(B) / b)
			a = b * Math.sin (A) / Math.sin (B);

			// Omkreds af i-kant
			o = i * a;

			// Pi-estimat
			p = o / 2;

			System.out.println (String.format("%3d %3.16f", i, p));
		}		
	}
}
