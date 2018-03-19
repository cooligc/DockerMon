package com.skc.broaker.model.search;

import java.io.Serializable;
import java.util.Arrays;

public class Messages implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String total;
	private Matches[] matches;
	private Pagination pagination;
	private Paging paging;
	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/**
	 * @return the matches
	 */
	public Matches[] getMatches() {
		return matches;
	}
	/**
	 * @param matches the matches to set
	 */
	public void setMatches(Matches[] matches) {
		this.matches = matches;
	}
	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}
	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	/**
	 * @return the paging
	 */
	public Paging getPaging() {
		return paging;
	}
	/**
	 * @param paging the paging to set
	 */
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Messages [total=" + total + ", matches=" + Arrays.toString(matches) + ", pagination=" + pagination
				+ ", paging=" + paging + "]";
	}
	
	
}
