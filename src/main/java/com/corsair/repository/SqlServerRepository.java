package com.corsair.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SqlServerRepository {

	@Autowired
	@Qualifier("sqlServerJdbcTemplate")
	public JdbcTemplate sqlServerJdbcTemplate;
	
	public void getAccounts() {
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		String sql = "select * from [dbo].[MS1ADet]";
		try {
			listMap = sqlServerJdbcTemplate.queryForList(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Map<String, Object> map : listMap) {
			System.out.println(map.values());
		}
	}
}
