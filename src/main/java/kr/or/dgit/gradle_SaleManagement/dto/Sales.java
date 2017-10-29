package kr.or.dgit.gradle_SaleManagement.dto;

public class Sales {
	private String saleCode;
	private String saleName;
	private String saleTel;
	private String salePW;
	private SalesLevel saleLevel;
	
	public Sales() {}

	public Sales(String saleCode) {
		this.saleCode = saleCode;
	}

	public Sales(String saleCode, String saleName, String saleTel, String salePW, SalesLevel saleLevel) {
		super();
		this.saleCode = saleCode;
		this.saleName = saleName;
		this.saleTel = saleTel;
		this.salePW = salePW;
		this.saleLevel = saleLevel;
	}
	
	public String getSaleCode() {
		return saleCode;
	}



	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}



	public String getSaleName() {
		return saleName;
	}



	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}



	public String getSaleTel() {
		return saleTel;
	}



	public void setSaleTel(String saleTel) {
		this.saleTel = saleTel;
	}



	public String getSalePW() {
		return salePW;
	}



	public void setSalePW(String salePW) {
		this.salePW = salePW;
	}



	public SalesLevel getSaleLevel() {
		return saleLevel;
	}



	public void setSaleLevel(SalesLevel saleLevel) {
		this.saleLevel = saleLevel;
	}
	
}
