package com.PriceData.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class RestResponse {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="new Price")
	private String newPrice;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the newPrice
	 */
	public String getNewPrice() {
		return newPrice;
	}

	/**
	 * @param newPrice the newPrice to set
	 */
	public void setNewPrice(String newPrice) {
		this.newPrice = newPrice;
	}
}
