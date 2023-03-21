
public class Capitalization {
	public static void main(String[] args) {
		
		/*
		 * if(args.length != 1) { System.out.println("1개 이상을 입력하여 주십시오"); } else {
		 * String[] names = args[0].split(" ");
		 * 
		 * for(int i=0; i<names.length; i++) { names[i] = names[i].substring(0,
		 * 1).toUpperCase() + names[i].substring(1); }
		 * System.out.println(String.join(" ", names)); }
		 */
		
		Util u = new Util(args[0]);
		System.out.println(u.capitalizeName());
	}
}
