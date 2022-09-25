package ödev;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		//Sık kullanılan fonksiyonlar:
		

		/*System.out.println("Eleman sayisi :" + mesaj.length());
		System.out.println("5. eleman :" + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		// mesaj.getChars(srcBegin:0, srcEnd:4,karakterler,dstBegin:0);
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));*/
		
		//replace:Bazı karakterleri değiştirmek için kullanılır.Örn:İngilizce karakterleri türkçeye çevirmek gibi,boşlukların arasına çizgi bırakmak gibi vb.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		//Substring:Bir metnin içerisinden parça almaya yarar.
		
		
		//Split:Bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar. 
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//toLowerCase:harfleri küçük yazdırır.
		//toUpperCase:harfleri büyük yazdırır.
		//trim:Boşlukları kırpmaya yarar.
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}

}
