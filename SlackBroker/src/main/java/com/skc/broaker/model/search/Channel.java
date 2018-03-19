package com.skc.broaker.model.search;

import java.io.Serializable;
import java.util.Arrays;

class Channel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] pending_shared;
	private String is_org_shared;
	private String id;
	private String is_ext_shared;
	private String is_pending_ext_shared;
	private String is_mpim;
	private String name;
	private String is_private;
	private String is_shared;
	/**
	 * @return the pending_shared
	 */
	public String[] getPending_shared() {
		return pending_shared;
	}
	/**
	 * @param pending_shared the pending_shared to set
	 */
	public void setPending_shared(String[] pending_shared) {
		this.pending_shared = pending_shared;
	}
	/**
	 * @return the is_org_shared
	 */
	public String getIs_org_shared() {
		return is_org_shared;
	}
	/**
	 * @param is_org_shared the is_org_shared to set
	 */
	public void setIs_org_shared(String is_org_shared) {
		this.is_org_shared = is_org_shared;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the is_ext_shared
	 */
	public String getIs_ext_shared() {
		return is_ext_shared;
	}
	/**
	 * @param is_ext_shared the is_ext_shared to set
	 */
	public void setIs_ext_shared(String is_ext_shared) {
		this.is_ext_shared = is_ext_shared;
	}
	/**
	 * @return the is_pending_ext_shared
	 */
	public String getIs_pending_ext_shared() {
		return is_pending_ext_shared;
	}
	/**
	 * @param is_pending_ext_shared the is_pending_ext_shared to set
	 */
	public void setIs_pending_ext_shared(String is_pending_ext_shared) {
		this.is_pending_ext_shared = is_pending_ext_shared;
	}
	/**
	 * @return the is_mpim
	 */
	public String getIs_mpim() {
		return is_mpim;
	}
	/**
	 * @param is_mpim the is_mpim to set
	 */
	public void setIs_mpim(String is_mpim) {
		this.is_mpim = is_mpim;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the is_private
	 */
	public String getIs_private() {
		return is_private;
	}
	/**
	 * @param is_private the is_private to set
	 */
	public void setIs_private(String is_private) {
		this.is_private = is_private;
	}
	/**
	 * @return the is_shared
	 */
	public String getIs_shared() {
		return is_shared;
	}
	/**
	 * @param is_shared the is_shared to set
	 */
	public void setIs_shared(String is_shared) {
		this.is_shared = is_shared;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Channel [pending_shared=" + Arrays.toString(pending_shared) + ", is_org_shared=" + is_org_shared
				+ ", id=" + id + ", is_ext_shared=" + is_ext_shared + ", is_pending_ext_shared=" + is_pending_ext_shared
				+ ", is_mpim=" + is_mpim + ", name=" + name + ", is_private=" + is_private + ", is_shared=" + is_shared
				+ "]";
	}
	
	
}