/**
 * 
 */
package com.skc.broaker;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

/**
 * @author sitakant
 *
 */
public abstract class CommonSlackSetup {

	@Autowired
	RestTemplate template;
	
	@Value("${slack.common.endpoint}")
	protected String slackEndpoint;
	
	@Value("${slack.common.auth.token}")
	protected String slackToken;
	
	@Value("${slack.common.bot.icon_url}")
	protected String iconUrl;
	
	protected static final String MESSAGE_URL="/chat.postMessage";
	
	
	protected Map<String,Object> postMessage(String url){
		Map<String,Object> response = template.postForObject(url, null, Map.class);
		return response;
	}
	
	
	protected String makeUrl(Map<String,String> mapUrl,String url){
		String result = url+"?";
		for (Entry<String,String> entry : mapUrl.entrySet()) {
			result+="&"+entry.getKey()+"="+entry.getValue();
		}
		return result;
	}
	
}
