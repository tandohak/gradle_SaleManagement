package kr.or.dgit.gradle_SaleManagement.utill;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSession {
	private static SqlSessionFactory sqlSession;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSession == null) {
			try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml");) {
				sqlSession = new SqlSessionFactoryBuilder().build(is);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSession;
	}

	public static SqlSession openSession() {
		return sqlSession.openSession();
	}
}
