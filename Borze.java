import java.io.*;
public class Borze {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '.') {
				output += "0";
			}else if (input.charAt(i) == '-') {
				if(input.charAt(i+1) == '.') {
					output+= "1";
					i++;
				}else {
					output += "2";
					i++;
				}
			}
		}
		System.out.println(output);

	}

}
