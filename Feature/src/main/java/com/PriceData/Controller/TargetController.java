package com.PriceData.Controller

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PriceData.Service.GetDataService;
import com.PriceData.Service.TestRepo;
import com.PriceData.model.RetailPojo;

@RestController
@RequestMapping(value= {"desktop/target"})
public class TargetController {
	
	@Autowired
	GetDataService getDataService;
	
	@Autowired
	TestRepo testRepo;

	@GetMapping(value= {"/products/{Id}"},produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RetailPojo>> getRetailData(@PathVariable(value="id")){
		
		return new ResponseEntity<List<RetailPojo>>(getDataService.getData(id));
	}
	
	@PutMapping(value= {"products/{Id}"},consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<void> void updatePrice(@Validated @RequestBody RetailPojo cc,@PathVariable(value="id")){
			
		Optional<RestResponse> rs=testRepo.findPriceById(id);
		rs.get().setNewPrice(cc.getNewPrice());
		testRepo.save(rs.get());
		return new ResponseEntity<>();
		}
		
	}
}
