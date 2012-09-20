package com.jyd.util;

import java.io.Serializable;

/**
 * ��ҳBEAN
 * @author ������
 */
public class Page implements Serializable {
	private static final long serialVersionUID = 3399356362602014679L;
	/**
	 * ҳ����ʾ��
	 */
	private int pageSize = 20;
	/**��ǰҳ**/
	private long pageNo=1;
	/**
	 * ��ʼ����
	 */
	private long start=0;
	/**
	 * ���ݼ�
	 */
	private Object data=null;
	/**
	 * ��ҳ��ʼҳ��
	 */
	private long startPage=0;
	/**
	 * ��ҳ��ʾ����
	 */
	private long pageShowcount=10; 
	/**
	 * ��������Ŀ
	 */
	private long totalCount;
	/**��ҳ��*/
	private long totalPageCount;
	public Page() {
	}

	/**
	 * ʵ����
	 * @param long start ��ʼ
	 * @param long totalSize ����
	 * @param long pageNo
	 * @param int pageSize
	 * @param Object data
	 */
	public Page( long totalSize,long pageNo, int pageSize, Object data) {
		this.pageSize = pageSize;
		this.start = (pageNo-1)*pageSize;
		this.totalCount = totalSize;
		this.data = data;
		this.pageNo=pageNo;
//		this.startPage=(this.pageNo/this.pageShowcount)*this.pageShowcount;
		long i=this.pageNo %this.pageShowcount;
		this.startPage=i==0?this.pageNo-9:this.pageNo-i+1;
		if (totalCount % pageSize == 0)
			this.totalPageCount= totalCount / pageSize;
		else
			this.totalPageCount= totalCount / pageSize + 1;
	}
	
	public long getTotalPageCount() {
		return this.totalPageCount;
	}
	
	public void setTotalPageCount(long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getStartPage() {
		return startPage;
	}

	public void setStartPage(long startPage) {
		this.startPage = startPage;
	}

	public long getPageShowcount() {
		return pageShowcount;
	}

	public void setPageShowcount(long pageShowcount) {
		this.pageShowcount = pageShowcount;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public static int getStartOfPage(int pageNo, int pageSize) {
		return (pageNo-1)*pageSize;
	}
}