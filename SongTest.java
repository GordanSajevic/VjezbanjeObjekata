package lab19;

public class SongTest {

	/**
	 * Funkcija traži unos atributa jednog objekta i vraća taj objekat
	 * @return s
	 */
	
	public static Song unos()
	{
		Song s = new Song();
		System.out.println("Unesite naziv pjesme: ");
		s.title = TextIO.getlnString();
		System.out.println("Unesite naziv izvođača: ");
		s.artist = TextIO.getlnString();
		System.out.println("Unesite dužinu trajanja pjesme( u sekundama): ");
		s.length = TextIO.getlnInt();
		return s;
	}

	/**
	 * Funkcija prima dužinu trajanja pjesama i vraća ukupnu dužinu
	 * @param length1
	 * @param length2
	 * @param length3
	 * @return length
	 */
	
	public static int trajanjePjesama(int length1, int length2, int length3) 
	{
		int length = length1 + length2 + length3;
		return length;
	}
	
	/**
	 * Funkcija pronalazi najdužu pjesmu i vraća objekat te pjesme
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return s1 || s2 || s2
	 */
	
	public static Song pronadjiNajduzuPjesmu(Song s1, Song s2, Song s3) {
		if (s1.length > s2.length && s1.length > s3.length)
		{
			return s1;
		}
		else if (s2.length > s1.length && s2.length > s3.length)
		{
			return s2;
		}
		return s3;
	}

	
	public static void main(String[] args) {
		Song s1 = unos();
		Song s2 = unos();
		Song s3 = unos();
		System.out.println("Ukupno trajanje liste: " + trajanjePjesama(s1.length, s2.length, s3.length));
		Song najduza = pronadjiNajduzuPjesmu(s1, s2, s3);
		System.out.println("Najduža pjesma je: " + najduza.artist + " - " + najduza.title + "(" + najduza.length + ")");
	}

	

}
