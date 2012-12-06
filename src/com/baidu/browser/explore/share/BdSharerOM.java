/** 
 * Filename:    ShareContent.java 
 * Description:  
 * Copyright:   Baidu MIC Copyright(c)2011 
 * @author:     gong.haiping 
 * @version:    1.0 
 * Create at:   2011-7-1 ����05:39:55 
 * 
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2011-7-1   gong.haiping      1.0         1.0 Version 
 */
package com.baidu.browser.explore.share;

/**
 * ����������
 */
public class BdSharerOM {

	/**
	 * �ı�����
	 */
	public static final int TYPE_TEXT = 1;

	/**
	 * ������������
	 */
	public static final int TYPE_STREAM = 2;

	/**
	 * ��������
	 */
	private int mContentType;

	/**
	 * ����
	 */
	private String mContent;

	/**
	 * ��������·��
	 */
	private String mPath;

	/**
	 * ��������1
	 */
	private String mExtra1;

	/**
	 * ��������2
	 */
	private String mExtra2;

	/**
	 * @return the contentType
	 */
	public int getContentType() {
		return mContentType;
	}

	/**
	 * @param contentType
	 *            the contentType to set
	 */
	public void setContentType(int contentType) {
		this.mContentType = contentType;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return mContent;
	}

	/**
	 * @param aContent the content to set
	 */
	public void setContent(String aContent) {
		mContent = aContent;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return mPath;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.mPath = path;
	}

	/**
	 * @return the extra1
	 */
	public String getExtra1() {
		return mExtra1;
	}

	/**
	 * @param extra1
	 *            the extra1 to set
	 */
	public void setExtra1(String extra1) {
		this.mExtra1 = extra1;
	}

	/**
	 * @return the extra2
	 */
	public String getExtra2() {
		return mExtra2;
	}

	/**
	 * @param extra2
	 *            the extra2 to set
	 */
	public void setExtra2(String extra2) {
		this.mExtra2 = extra2;
	}

}