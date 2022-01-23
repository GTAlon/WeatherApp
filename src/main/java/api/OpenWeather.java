package api;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;


public class OpenWeather {
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }
	
	public static JSONObject readJson() throws IOException,JSONException {
		URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Paris&appid=c2b3e98a47c3c5a55a84becc1cd21525&units=metric");

		 InputStream is = url.openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		    
	
	}
	
	public static void main(String[] args) throws IOException, JSONException {
	    JSONObject json = readJson();
	    System.out.println(json.toString());
	    System.out.println(json.get("main"));
	    System.out.println(json.getJSONObject("main").getFloat("temp"));
	  }
}
