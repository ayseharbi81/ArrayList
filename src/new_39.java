import java.lang.invoke.CallSite;
import java.util.ArrayList;

public class new_39 {

	public static void main(String[] args) {
		
		ArrayList<Object> Liste = new ArrayList<>();
		
		Liste.add(5);
		Liste.add("osman");
		Liste.add(0.5);
		Liste.add(0.54f);
		Liste.add('C');
		Liste.add(true);
		
		System.out.println(Liste);
		System.out.println(Liste.get(2).equals(0.5));
		System.out.println(Liste.toString());
		System.out.println(Liste.contains('C'));
		System.out.println(Liste.get(3));
		System.out.println(Liste.indexOf("osman"));
		System.out.println(Liste.lastIndexOf(true));
		
		// foreach döngüsü ile array'den arraylist yapılır
		ArrayList<Integer> Dizi = new ArrayList<>();
		int[] dizi = {12, 13, 14, 15, 16, 17, 18, 19};

		for (Integer each : dizi) {

                    Dizi.add(each);

		}
		
		System.out.println("\n" + Dizi);
		
		Liste.set(5, false);
		System.out.println("\n" + Liste);

	}
	

}
