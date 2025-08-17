import java.util.ArrayList;
import java.util.List;

public class Cliente { //Client

	public static void main(String[] args) {	
		List<Video> video = new ArrayList<>();
		
		for(int i = 0; i < 1000; i++) {
			VideoProxy p = new VideoProxy("proxy " + i, "docs/proxy " + i);
			video.add(p);
		}		
		video.get(2).reproduzir();
		video.get(799).reproduzir();
		
		System.out.println("Número de instancias: " +  VideoReal.getInstancias());
	}
}
