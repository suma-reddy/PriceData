package com.PriceData.model
public class RetailPojo {

	private Long id;
	
	private String name;
	
	private String currentPrice;
	
	private String newPrice;

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
	 * @return the currentPrice
	 */
	public String getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @param currentPrice the currentPrice to set
	 */
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
}
