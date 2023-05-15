package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	public String getdatafromjson(String key) throws IOException, ParseException
	{
		FileReader rr=new FileReader(Constant.jsonPath);
		JSONParser js=new JSONParser();
		Object obj=js.parse(rr);
		HashMap hp=(HashMap)obj;
		return (String) hp.get(key);
		
	}

	

//	@DataProvider(name="MB")
//	public String[]readjson() throws IOException, ParseException
//				{
//			JSONParser a=new JSONParser();
//			FileReader b=new FileReader(Constant.jsonPath);
//			Object c=a.parse(b);
//			
//			
//			JSONObject d=(JSONObject)c;
//			JSONArray e=(JSONArray)d.get("commondata");
//			
//			String arr[]=new String[e.size()];
//			
//			String URL=(String)e.get(0);
//			String u=(String)e.get(1);
//		String p=(String)e.get(2);			
//			
//			
////			for(int i=0;i<e.size();i++) 
////			{
////				JSONObject ee=(JSONObject)e.get(i);
////			String u=(String)ee.get("username");
////				String p=(String)ee.get("password");
////			arr[i]=u+","+p;
//				
//		//	}
//			return arr;
//		private static Map<String,String> Configmap=new HashMap<>();
//		private Json()
//		{
//			
//		}
//		static {
//			try {
//				FileInputStream file=new FileInputStream(Constant.jsonPath);
//				Configmap=new ObjectMapper().readValue(new File(""), HashMap.class);
//			}
//			catch(FileNotFoundException e)
//			
//			{
//		e.printStackTrace();
//			}
//			catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//	
//		
//				
//      public static void get( key)
//      {
//    	  if(Objects.isNull(key)|| Objects.isNull(Configmap.get(
//      }
//    return Configma
}