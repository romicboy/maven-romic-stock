package com.romic.maven.data;

import java.util.ArrayList;
import java.util.List;

import com.romic.maven.entity.StockEntity;

public class Data {
	
	private static String time = "2016-05-13";

	public static List<StockEntity> createStockEntityData() {
		List<StockEntity> list = new ArrayList<StockEntity>();
		list.add(new StockEntity("浪潮软件", 	"600756", 26.44D, Data.time));
		list.add(new StockEntity("巨星科技", 	"002444", 18.08D, Data.time));
		list.add(new StockEntity("強生控股", 	"600662", 11.48D, Data.time));
		list.add(new StockEntity("锦江股份", 	"600754", 38.31D, Data.time));
		list.add(new StockEntity("威创股份", 	"002308", 14.10D, Data.time));
		list.add(new StockEntity("中国卫星", 	"600118", 30.52D, Data.time));
		list.add(new StockEntity("水晶光电", 	"002273", 31.16D, Data.time));
		list.add(new StockEntity("苏宁云商", 	"002024", 10.28D, Data.time));
		list.add(new StockEntity("比亚迪", 	"002594", 59.17D, Data.time));
		list.add(new StockEntity("中恒电气", 	"002364", 26.00D, Data.time));
		list.add(new StockEntity("万马股份", 	"002276", 18.88D, Data.time));
		return list;
	}
	
	public static List<StockEntity> getStockEntityData() {
		List<StockEntity> list = new ArrayList<StockEntity>();
		list.add(new StockEntity("浪潮软件", 	"600756"));
		list.add(new StockEntity("巨星科技", 	"002444"));
		list.add(new StockEntity("強生控股", 	"600662"));
		list.add(new StockEntity("锦江股份", 	"600754"));
		list.add(new StockEntity("威创股份", 	"002308"));
		list.add(new StockEntity("中国卫星", 	"600118"));
		list.add(new StockEntity("水晶光电", 	"002273"));
		list.add(new StockEntity("苏宁云商", 	"002024"));
		list.add(new StockEntity("比亚迪", 	"002594"));
		list.add(new StockEntity("中恒电气", 	"002364"));
		list.add(new StockEntity("万马股份", 	"002276"));
		return list;
	}
}
