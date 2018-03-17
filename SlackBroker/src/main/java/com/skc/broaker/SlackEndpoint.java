/**
 * 
 */
package com.skc.broaker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sitakant
 *
 */
@RestController
@RequestMapping("/v1/messages")
public class SlackEndpoint extends CommonSlackSetup{

	@PostMapping
	public Map<String,Object> postMessage(@RequestBody SlackRequest request){
		Map<String,String> urlMap = new HashMap<>();
		urlMap.put("token", slackToken);
		urlMap.put("channel", request.getChannel());
		urlMap.put("text", request.getMessage());
		urlMap.put("username", "AUTO_BOT");
		urlMap.put("icon_url", iconUrl);
		
		String url = makeUrl(urlMap, slackEndpoint+MESSAGE_URL);
		Map<String,Object> responseMap = super.postMessage(url);
		return responseMap;
	}
	
	
}
