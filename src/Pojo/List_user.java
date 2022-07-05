package Pojo;

import java.util.List;

public class List_user {
	private List<Datalist> data;
	public List<Datalist> getData() {
		return data;
	}
	private Supportlist support;
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	
	public void setPage(int page) {
		this.page = page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	
	public Supportlist getSupport() {
		return support;
	}
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
}
