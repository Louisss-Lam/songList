import java.util.ArrayList;
import java.util.List;

public class MockSongs {
	
	public static List<String> getSongStrings() {
		List<String>songs = new ArrayList<>();
		songs.add("somersault");
		songs.add("cassidy");
		songs.add("$10");
		songs.add("havana");
		songs.add("Cassidy");
		songs.add("50 Ways");
		return songs;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSongStrings());
	}

}
