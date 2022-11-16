package yn.util;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author	: y0ng94
 * @version	: 1.0
 */
public class JsonUtil {
	
	public static List<Map<String, Object>> listMapToJsonObject(String jsonObject) throws JsonMappingException, JsonProcessingException {
		return new ObjectMapper().readValue(jsonObject, new TypeReference<List<Map<String, Object>>>() {});
	}
	
	public static Map<String, Object> mapToObject(Object object) {
		return new ObjectMapper().convertValue(object, new TypeReference<Map<String, Object>>() {});
	}
}
