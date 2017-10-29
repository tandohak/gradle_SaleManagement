package kr.or.dgit.gradle_SaleManagement.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.gradle_SaleManagement.dao.SalesLevelDao;
import kr.or.dgit.gradle_SaleManagement.dto.SalesLevel;
import kr.or.dgit.gradle_SaleManagement.utill.MyBatisSqlSession;

public class SalesLevelService {
	private static final String nameSpace = "kr.or.dgit.gradle_SaleManagement.dao.SalesLevelDao.";

	public int insertSalesLevel(SalesLevel salesLevel) {
		try (SqlSession sqlSession = MyBatisSqlSession.getSqlSessionFactory().openSession();) {
			SalesLevelDao salesLevelDao = sqlSession.getMapper(SalesLevelDao.class);
			int res = salesLevelDao.insertSalesLevel(salesLevel);
			sqlSession.commit();
			return res;
		}
	}


	public int deleteSalesLevel(SalesLevel salesLevel) {
		try (SqlSession sqlSession = MyBatisSqlSession.openSession()) {
			int res = sqlSession.delete(nameSpace + "deleteSalesLevel", salesLevel);
			sqlSession.commit();
			return res;
		}
	}

}
