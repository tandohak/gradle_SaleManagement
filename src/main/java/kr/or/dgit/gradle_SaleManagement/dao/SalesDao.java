package kr.or.dgit.gradle_SaleManagement.dao;

import java.util.List;

import kr.or.dgit.gradle_SaleManagement.dto.Sales;

public interface SalesDao {
	Sales findSalesByCode(String saleCode);
	int insertSales(Sales sales);
	void updateSales(Sales sales);
	void deleteSales(Sales sales);
	List<Sales> findAllSales();
}
