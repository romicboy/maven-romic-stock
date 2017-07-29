package com.romic.maven.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.romic.maven.dao.StockDao;
import com.romic.maven.db.DBHelper;
import com.romic.maven.entity.StockEntity;
import com.romic.maven.main.DateUtil;

public class StockDaoImpl implements StockDao {

	private DBHelper dbhelper = null;
	
	public int create(StockEntity stockEntity) {
		StockEntity info = this.getOneByTime(stockEntity.getNumber(), stockEntity.getTime());
		if (info != null) return 0;
		String sql = "INSERT INTO t_stock VALUES(null,?,?,?,?)";
		int executeUpdate = 0;
		try {
			dbhelper = new DBHelper(sql);
			PreparedStatement ps = dbhelper.pst;// 创建DBHelper对象
			ps.setString(1, stockEntity.getName());
			ps.setString(2, stockEntity.getNumber());
			ps.setDouble(3, stockEntity.getPrice());
			ps.setInt(4, stockEntity.getTime());
			executeUpdate = ps.executeUpdate();
//			System.out.println(ps);
		} catch (SQLException e) {
//			e.printStackTrace();
		}
		return executeUpdate;
	}
	
	public StockEntity getOneByTime(String number, String time) {
		return getOneByTime(number, DateUtil.getTimeStemp(time));
	}
	
	public StockEntity getOneByTime(String number, int time) {
		String sql = "SELECT * FROM t_stock WHERE number=? AND time=? LIMIT 1";  
		StockEntity stockEntity = null;
		try {
			dbhelper = new DBHelper(sql);
			PreparedStatement ps = dbhelper.pst;// 创建DBHelper对象
			ps.setString(1, number);
			ps.setInt(2, time);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {  
				stockEntity = new StockEntity();
				stockEntity.setId(rs.getInt("id"));  
				stockEntity.setName(rs.getString("name"));  
				stockEntity.setPrice(rs.getDouble("price"));  
				stockEntity.setTime(rs.getInt("time"));  
	        }
//			System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stockEntity;
	}

	public StockEntity getMaxOne(String number) {
		String sql = "SELECT * FROM t_stock WHERE number=? ORDER BY price DESC LIMIT 1";  
		StockEntity stockEntity = null;
		try {
			dbhelper = new DBHelper(sql);
			PreparedStatement ps = dbhelper.pst;// 创建DBHelper对象
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {  
				stockEntity = new StockEntity();
				stockEntity.setId(rs.getInt("id"));  
				stockEntity.setName(rs.getString("name"));  
				stockEntity.setPrice(rs.getDouble("price"));  
				stockEntity.setTime(rs.getInt("time"));  
	        }
//			System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stockEntity;
	}

	public StockEntity getMinOne(String number) {
		String sql = "SELECT * FROM t_stock WHERE number=? ORDER BY price ASC LIMIT 1";  
		StockEntity stockEntity = null;
		try {
			dbhelper = new DBHelper(sql);
			PreparedStatement ps = dbhelper.pst;// 创建DBHelper对象
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {  
				stockEntity = new StockEntity();
				stockEntity.setId(rs.getInt("id"));  
				stockEntity.setName(rs.getString("name"));  
				stockEntity.setPrice(rs.getDouble("price"));  
				stockEntity.setTime(rs.getInt("time"));  
	        }
//			System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stockEntity;
	}

	public StockEntity getOne(String number) {
		String sql = "SELECT * FROM t_stock WHERE number=? ORDER BY time DESC LIMIT 1";  
		StockEntity stockEntity = null;
		try {
			dbhelper = new DBHelper(sql);
			PreparedStatement ps = dbhelper.pst;// 创建DBHelper对象
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {  
				stockEntity = new StockEntity();
				stockEntity.setId(rs.getInt("id"));  
				stockEntity.setName(rs.getString("name"));  
				stockEntity.setPrice(rs.getDouble("price"));  
				stockEntity.setTime(rs.getInt("time"));  
	        }
//			System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stockEntity;
	}

	public int remove(StockEntity stockEntity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(StockEntity stockEntity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void finalize() throws Throwable {
		dbhelper.close();
		super.finalize();
	}

}
