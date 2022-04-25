package com.mk.erp.dfr.dto;

public class MailDTO {

	private static final long serialVersionUID = 1L;

	private String mailTo[];

	private String mailCc[];

	private String mailFrom;

	private String subject;

	private String message;

	private String personal;

	private String attachment;

	private String header;

	public String[] getMailTo() {
		return mailTo;
	}

	public void setMailTo(String[] mailTo) {
		this.mailTo = mailTo;
	}

	public String[] getMailCc() {
		return mailCc;
	}

	public void setMailCc(String[] mailCc) {
		this.mailCc = mailCc;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}
}
