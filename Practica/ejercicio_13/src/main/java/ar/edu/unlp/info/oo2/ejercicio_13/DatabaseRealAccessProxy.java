package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{

	private boolean isLogged;
	private String password;
	private DatabaseAccess realDataBase;
	
	public DatabaseRealAccessProxy(DatabaseAccess database, String password) {
		this.isLogged = false;
		this.realDataBase = database;
		this.password = password;
	}
	
	public void login(String password) {
		if(password.equals(this.password)) {
			this.isLogged = true;
			System.out.println("La autenticacion fue exitosa");
		}
		else {
			System.out.println("Autenticacion fallida");
		}
	}
	
	public void logout() {
		this.isLogged = false;
	}
	
	@Override
	public int insertNewRow(List<String> rowData) {
		if (isLogged) {
			return this.realDataBase.insertNewRow(rowData); 
		}
		return -0;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged) {
			return this.realDataBase.getSearchResults(queryString); 
		}
		return null;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void setRealDataBase(DatabaseAccess realDataBase) {
		this.realDataBase = realDataBase;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
}
