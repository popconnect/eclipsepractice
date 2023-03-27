import java.util.Random;
public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//seeding
		Random r1 = new Random(System.currentTimeMillis());
		for(int i=1; i<=5; i++) {
			System.out.println();
			for(int j=1; j<=6; j++) {
				System.out.print((r1.nextInt(45)+1) + " ");
			}
		}
		
	}

}
