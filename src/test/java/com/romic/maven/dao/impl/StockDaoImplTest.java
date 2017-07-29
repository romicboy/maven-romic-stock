package com.romic.maven.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.romic.maven.entity.StockEntity;

public class StockDaoImplTest {

	@Test
	public void testCreate() {
		StockEntity stockEntity = new StockEntity();
		stockEntity.setName("浪潮软件");
		stockEntity.setNumber("600756");
		stockEntity.setPrice(36.01D);
		stockEntity.setTimeString("2016-02-22");
		StockDaoImpl stockDaoImpl = new StockDaoImpl();
		int result = stockDaoImpl.create(stockEntity);
		System.out.println(result);
	}

	@Test
	public void testGetOneByTime() {
		StockDaoImpl stockDaoImpl = new StockDaoImpl();
		StockEntity stockEntity = stockDaoImpl.getOneByTime("600756", "2016-02-22");
		if (null == stockEntity) {
			fail("Not yet implemented");
		}
		System.out.println(stockEntity);
	}
	
	@Test
	public void testGetOneByTimeStemp() {
		StockDaoImpl stockDaoImpl = new StockDaoImpl();
		StockEntity stockEntity = stockDaoImpl.getOneByTime("600756", 1456070400);
		if (null == stockEntity) {
			fail("Not yet implemented");
		}
		System.out.println(stockEntity);
	}

	@Test
	public void testGetMaxOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMinOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
