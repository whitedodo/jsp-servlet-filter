package com.example.website.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.website.db.SqlMapSessionFactory;
import com.example.website.vo.AddressDTO;

public class AddressDAOImpl implements AddressDAO {

	private SqlSessionFactory factory = 
			SqlMapSessionFactory.getSqlSessionFactory();
	
	private final String mapper = "com.example.website.db.mappers.addressMapper";
	
	@Override
	public AddressDTO selectAddress(int num) {
		
		SqlSession session = factory.openSession();
		AddressDTO dto = session.selectOne( mapper + ".selectAddress", num);
		session.close();
		
		return dto;
	}

}
