package com.yedam.prj.commom;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	//싱글톤
	private static SqlSessionFactory sqlSessionFactory;	//돌려줄값
	
	private DataSource() {};		//외부에서 생성하지 못하도록 미리 생성자를 만들기
	
	public static SqlSessionFactory getInstance() {		//Instance를 이용해서 가져갈 수 있도록
		String resource = "config/mybatis-config.xml";
		//InputStream inputStream;
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}

}//DAO
