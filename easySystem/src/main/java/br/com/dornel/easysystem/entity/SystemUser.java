package br.com.dornel.easysystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "USERS")
public class SystemUser extends AbstractPersistable<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 25, unique= true)
	private String userLogin;
	
	@Column(nullable = false, length = 55, unique= true)
	private String userName;
	
	@Column(nullable = false, length = 55)
	private String passWord;
	
	@Column(nullable = false, length = 55)
	private String email;
	
	@Lob
	@Column(nullable = false)
	private byte[] photo;

	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}

	
	public String getUserLogin() {
		return userLogin;
	}
	
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
}
