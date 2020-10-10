package com.gavin.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface ResultSetExtractor {
	
	//��������
	public  Object extractData(ResultSet rs) throws SQLException; 
}
