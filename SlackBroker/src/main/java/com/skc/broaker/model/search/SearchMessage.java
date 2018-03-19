/**
 * 
 */
package com.skc.broaker.model.search;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author sitakant
 *
 */
public class SearchMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String query;
	private String ok;
	private Messages messages;
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
	/**
	 * @return the ok
	 */
	public String getOk() {
		return ok;
	}
	/**
	 * @param ok the ok to set
	 */
	public void setOk(String ok) {
		this.ok = ok;
	}
	/**
	 * @return the messages
	 */
	public Messages getMessages() {
		return messages;
	}
	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchMessage [query=" + query + ", ok=" + ok + ", messages=" + messages + "]";
	}
	
}
