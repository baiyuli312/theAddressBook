package com.tjrac.contact.pojo;

public class Contact {
	/*
	 * 姓名 contactName
	 * 性别 contactSex
	 * 移动电话 contactMobilePhone
	 * 固定电话 contactFicedPhone
	 * 电子邮箱 contactEmail
	 * QQ contactQQ
	 * 所在单位 contactUnit
	 * 住址 contactAddress
	 * 联系人所属分组 contactGrouping
	 */
	private Integer contactId;
	private String contactName;	
	private String contactSex;
	private String contactMobilePhone;
	private String contactFicedPhone;
	private String contactEmail;
	private String contactQQ;
	private String contactUnit;
	private String contactAddress;
	private String contactGrouping;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactSex() {
		return contactSex;
	}
	public void setContactSex(String contactSex) {
		this.contactSex = contactSex;
	}
	public String getContactMobilePhone() {
		return contactMobilePhone;
	}
	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}
	public String getContactFicedPhone() {
		return contactFicedPhone;
	}
	public void setContactFicedPhone(String contactFicedPhone) {
		this.contactFicedPhone = contactFicedPhone;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactQQ() {
		return contactQQ;
	}
	public void setContactQQ(String contactQQ) {
		this.contactQQ = contactQQ;
	}
	public String getContactUnit() {
		return contactUnit;
	}
	public void setContactUnit(String contactUnit) {
		this.contactUnit = contactUnit;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getContactGrouping() {
		return contactGrouping;
	}
	public void setContactGrouping(String contactGrouping) {
		this.contactGrouping = contactGrouping;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactSex=" + contactSex + ", contactMobilePhone="
				+ contactMobilePhone + ", contactFicedPhone=" + contactFicedPhone + ", contactEmail=" + contactEmail
				+ ", contactQQ=" + contactQQ + ", contactUnit=" + contactUnit + ", contactAddress=" + contactAddress
				+ ", contactGrouping=" + contactGrouping + "]";
	}
	
	
}
