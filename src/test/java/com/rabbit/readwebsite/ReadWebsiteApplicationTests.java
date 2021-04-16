package com.rabbit.readwebsite;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
class ReadWebsiteApplicationTests {
@Autowired
	DataSource dataSource;
	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from user");
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3));
		}

//		while(resultSet.next()){
//			System.out.println(resultSet.getString(0)+resultSet.getString(1));
//		}
	}

}
