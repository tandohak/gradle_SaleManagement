package kr.or.dgit.gradle_SaleManagement.dao;

import java.util.List;

import kr.or.dgit.gradle_SaleManagement.dto.SalesLevel;

public interface SalesLevelDao {
	SalesLevel selectBySalesLevel(String saleLevel);
	int insertSalesLevel(SalesLevel salesLevel);
	int deleteSalesLevel(SalesLevel salesLevel);
	int updateSalesLevel(SalesLevel salesLevel);
	List<SalesLevel> findAllLevel();
}
