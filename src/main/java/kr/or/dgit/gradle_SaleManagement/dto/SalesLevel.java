package kr.or.dgit.gradle_SaleManagement.dto;

public class SalesLevel {
	private String saleLevel;
	private Integer saleDisrate;
	
	public SalesLevel() {}

	public SalesLevel(String saleLevel, Integer saleDisrate) {
		super();
		this.saleLevel = saleLevel;
		this.saleDisrate = saleDisrate;
	}

	public String getSaleLevel() {
		return saleLevel;
	}

	public void setSaleLevel(String saleLevel) {
		this.saleLevel = saleLevel;
	}

	public Integer getSaleDisrate() {
		return saleDisrate;
	}

	public void setSaleDisrate(Integer saleDisrate) {
		this.saleDisrate = saleDisrate;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", saleLevel, saleDisrate);
	}

	
	
}
