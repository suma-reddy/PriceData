package com.PriceData.Service;

import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<RestResponse,long> {

	String findPriceById(long id);
}
