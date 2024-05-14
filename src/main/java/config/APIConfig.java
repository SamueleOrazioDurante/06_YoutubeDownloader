package config;

public class APIConfig {
	
	static private String apiKey = "rLQLrgrl1YYwuS9pRKTQo05NCZ19HO0P0yR7l69v82Q8il83m0";
	static private String host = "http://localhost:8080";
	static private String baseURL = host+"/06_YoutubeAPI";
	static private String baseApplicationURL = host+"/06_YoutubeDownloader";
    
    public static String getApiKey() {
    	return apiKey;
    }
    
    public static String getBaseURL() {
    	return baseURL;
    }
    
    public static String getBaseApplicationURL() {
    	return baseApplicationURL;
    }
    
    public static String addAPIKey(String url) {
    	return url+"?API-Key="+apiKey;
    }
}