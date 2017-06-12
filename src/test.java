import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p = Runtime.getRuntime().exec("ps -ef ");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String s = null;
		while (( s = br.readLine()) != null) {
			System.out.println(s);
		}
		System.out.println("/n");
	}

}
