/**
 * 
 */
package com.skc.broaker.model.search;

import java.io.Serializable;

/**
 * @author sitakant
 *
 */
class Pagination implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String per_page;
	private String last;
	private String page;
	private String total_count;
	private String first;
	private String page_count;
	/**
	 * @return the per_page
	 */
	public String getPer_page() {
		return per_page;
	}
	/**
	 * @param per_page the per_page to set
	 */
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}
	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}
	/**
	 * @return the total_count
	 */
	public String getTotal_count() {
		return total_count;
	}
	/**
	 * @param total_count the total_count to set
	 */
	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}
	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * @return the page_count
	 */
	public String getPage_count() {
		return page_count;
	}
	/**
	 * @param page_count the page_count to set
	 */
	public void setPage_count(String page_count) {
		this.page_count = page_count;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pagination [per_page=" + per_page + ", last=" + last + ", page=" + page + ", total_count=" + total_count
				+ ", first=" + first + ", page_count=" + page_count + "]";
	}
	
	
}
