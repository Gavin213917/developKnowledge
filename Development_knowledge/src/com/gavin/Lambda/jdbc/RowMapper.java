package com.gavin.Lambda.jdbc;

@FunctionalInterface
public  interface RowMapper {
  public abstract Object mapRow(java.sql.ResultSet arg0) throws java.sql.SQLException;
}