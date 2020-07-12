package com.PriceData.Service

import java.util.List;

import com.PriceData.model.RetailPojo;

public interface GetDataService {

	public List<RetailPojo> getData(Long Id);
}
