package com.PriceData.Service

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.PriceData.model.RetailPojo;

@Service
public class GetDataServiceImpl implements GetDataService  {
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired 
	TestRepo testRepo;

	String getUrl="https://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";

	@Override
	public List<RetailPojo> getData(Long Id) {

		List<RetailPojo> ls=null;
		
		try {
			
			ResponseEntity<RetailPojo> getResp=rest.exchange(getUrl,HttpMethod.GET,RetailPojo.class,true);
			
			 ls=(List<RetailPojo>) getResp.getBody();
			if(ls!=null) {
				for(int i=0;i<ls.size();i++) {
					
					ls.get(i).setNewPrice(testRepo.findPriceById(ls.get(i).getId()));
				}
			}
		}
		catch(Exception ex) {
			//do nothing
		}
		return ls;
	}
}
