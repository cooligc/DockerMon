package com.skc.broaker;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.skc.broaker.model.search.Matches;
import com.skc.broaker.model.search.SearchMessage;

@Component
public class SlackPollScheduler extends CommonSlackSetup{

	private static final String START_STRING = "(.start_*?)";
	private static final String STOP_STRING = "(.stop_*?)";
	private static final String RESTART_STRING = "(.restart_*?)";
	
	
	@Autowired
	private SlackRequestRepository repository;
	
	@Scheduled(fixedDelay=5000)
	public void slackPoll(){
		
		Map<String,String> urlMap = new HashMap<>();
		urlMap.put("token", slackToken);
		urlMap.put("query", STOP_STRING);
		
		String url = makeUrl(urlMap, slackEndpoint+SEARCH_MSG_URL);
		SearchMessage message = super.getMessage(url);
		persistData(message, "STOP");
		
		System.out.println(message);
		
	}
	
	void persistData(SearchMessage message,String status){
		SlackRequestEntity requestEntity = new SlackRequestEntity();
		
		for (Matches match : message.getMessages().getMatches()) {
		}
	}
	
}
