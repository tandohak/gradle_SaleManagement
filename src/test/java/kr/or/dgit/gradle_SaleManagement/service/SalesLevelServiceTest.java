package kr.or.dgit.gradle_SaleManagement.service;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.gradle_SaleManagement.dto.SalesLevel;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SalesLevelServiceTest {
	private static SalesLevelService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new SalesLevelService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}
	
	@Test
	public void test1InsertSalesLevel() {
		SalesLevel salesLevel = new SalesLevel("C", 1);
		int res = service.insertSalesLevel(salesLevel);
		System.out.println(res);
		Assert.assertEquals(1, res);		
	}
	
	@Test
	public void test2DeleteSalesLevel() {
		SalesLevel salesLevel = new SalesLevel();
		salesLevel.setSaleLevel("C");
		int res = service.deleteSalesLevel(salesLevel);
		Assert.assertEquals(1, res);		
	}
	

}
