package com.sinochem.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JsonUtil {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 将传入的Map对象封装成Json字符串
	 * @return String
	 * @throws JSONException 
	 */
	public static String jsonStr(Map<String,String> map) throws JSONException{
		JSONObject jsonobj=new JSONObject();  
		Set<String> keys = map.keySet();
		if(keys!=null){
			Iterator<String> iterator = keys.iterator();
			while(iterator.hasNext()){
				String key = iterator.next();
				String value = map.get(key);
//				System.out.println(key+"\t"+value);
				jsonobj.put(key, value);
			}
		}
		return jsonobj.toString();
	}
	
	public static <T> T toObject(String json, Class<T> classes)
		      throws JsonParseException, JsonMappingException, IOException {
		    return objectMapper.readValue(json, classes);
		  }
	
}
