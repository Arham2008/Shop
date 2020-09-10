package men;

public class MenCasting {
     // casting
	
		
		int mySuite=1000;
		float newSuite=(int)mySuite;
		
		long myShoes=2499666;
		double newShoes=(long)myShoes;
		
		float tie =12.99f;
		byte newTie=(byte)tie;
		
		public static void main(String[] args) {
			MenCasting xl =new MenCasting();
			
		System.out.println(xl.newSuite);
		
		System.out.println(xl.newShoes);
		
		System.out.println(xl.newTie);
	
		}
}
