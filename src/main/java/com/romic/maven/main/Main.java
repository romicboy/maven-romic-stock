package com.romic.maven.main;

import java.util.List;

import com.romic.maven.dao.impl.StockDaoImpl;
import com.romic.maven.data.Data;
import com.romic.maven.entity.StockEntity;

public class Main {
	
	StockDaoImpl stockDaoImpl = new StockDaoImpl();

	public static void main(String[] args) {
		Main main = new Main();
		main.create();
		main.start();
	}

	public void start() {
		List<StockEntity> stockEntityData = Data.getStockEntityData();
		for (StockEntity stockEntity : stockEntityData) {
			StockEntity maxOne = stockDaoImpl.getMaxOne(stockEntity.getNumber());
			StockEntity minOne = stockDaoImpl.getMinOne(stockEntity.getNumber());
			StockEntity newOne = stockDaoImpl.getOne(stockEntity.getNumber());
			this.equalsStockEntity(newOne, maxOne, minOne);
		}
	}
	
	public void create(){
		List<StockEntity> createStockEntityList = Data.createStockEntityData();
		for (StockEntity createStockEntity : createStockEntityList) {
			stockDaoImpl.create(createStockEntity);
		}
	}
	
	public void equalsStockEntity(StockEntity stockEntity, StockEntity maxStockEntity, StockEntity minStockEntity) {
		double maxEqualsPrice = maxStockEntity.equalsPrice(stockEntity);
		double minEqualsPrice = minStockEntity.equalsPrice(stockEntity);
		String point = String.format("%.2f", (maxEqualsPrice + minEqualsPrice));
//		String point2 = String.format("%.2f", (maxEqualsPrice / Math.abs(minEqualsPrice)));
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(stockEntity.getName());
		stringBuffer.append(" ");
		stringBuffer.append(stockEntity.getPrice());
		stringBuffer.append(" ");
		stringBuffer.append(point);
		stringBuffer.append(" ");
		stringBuffer.append(minStockEntity.getPrice());
		stringBuffer.append(" ");
		stringBuffer.append(minEqualsPrice);
		stringBuffer.append(" ");
		stringBuffer.append(maxStockEntity.getPrice());
		stringBuffer.append(" ");
		stringBuffer.append(maxEqualsPrice);
		
		System.out.println(stringBuffer);
	}

}
