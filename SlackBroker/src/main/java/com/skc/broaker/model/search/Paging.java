package com.skc.broaker.model.search;

import java.io.Serializable;

class Paging implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String total;
	private String count;
	private String page;
	private String pages;
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
	 * @return the count
	 */
	public String getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(String count) {
		this.count = count;
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
	 * @return the pages
	 */
	public String getPages() {
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paging [total=" + total + ", count=" + count + ", page=" + page + ", pages=" + pages + "]";
	}
}
