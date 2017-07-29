package com.romic.maven.dao;

import com.romic.maven.entity.StockEntity;

public interface StockDao {

	public int create(StockEntity stockEntity);
	
	public StockEntity getOne(String number);
	
	public StockEntity getMaxOne(String number);
	
	public StockEntity getMinOne(String number);
	
	public int remove(StockEntity stockEntity);
	
	public int update(StockEntity stockEntity);

}
