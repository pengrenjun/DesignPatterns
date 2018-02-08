package POJO;

import java.util.Date;

public class TbUser implements Comparable<TbUser> {
	private Long id;

	private String username;

	private String password;

	private String phone;

	private String email;

	private Date created;

	private Date updated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	//实现compareTo,这块的传入是TbUser,不是用object来传值,与equals有区别的,这是要求的
	public int compareTo(TbUser o) {
		// TODO Auto-generated method stub
		if (o.getEmail().equals(email)) {
			return 0;
		}
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof TbUser)) {
			return false;
		}
		TbUser user = (TbUser) obj;
		return user.getEmail().equals(email);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return email.length();
	}

}