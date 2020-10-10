package com.gavin.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface ResultSetExtractor {
	
	//º¯Êý·ºÐÍ
	public  Object extractData(ResultSet rs) throws SQLException; 
}
