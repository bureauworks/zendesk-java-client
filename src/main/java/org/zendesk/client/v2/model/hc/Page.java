package org.zendesk.client.v2.model.hc;

import java.util.List;

public class Page<T> {

	private Long count;
	private String nextPage;
	private List<T> data;
	
	public Page(String nextPage, Long count, List<T> data) {
		this.nextPage = nextPage;
		this.count = count;
		this.data = data;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}

	public String getNextPage() {
		return nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
