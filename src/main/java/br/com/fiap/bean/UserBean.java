package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.fiap.dao.UserDao;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {

private User user = new User();
	
	public void save() {
		System.out.println(this.user);
		new UserDao().insert(user);
	}
	
	public List<User> getUsers(){
		return new UserDao().list();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
