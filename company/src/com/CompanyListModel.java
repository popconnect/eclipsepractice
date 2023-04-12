package com;

import java.util.ArrayList;

import javax.swing.AbstractListModel;





public class CompanyListModel extends AbstractListModel<String> {
private ArrayList<CompanyTO> items;
	
	public CompanyListModel(String strEname) {
		// TODO Auto-generated constructor stub
		CompanyDAO dao = new CompanyDAO();
		this.items = dao.searchCompany(strEname);
	}
	
	

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		CompanyTO to = items.get(index);
		String address = String.format("[%s] %s %s %s %s %s",
		                                to.getEmpno(),to.getDeptno() , to.getEname(),
		                                to.getSal(), to.getHiredate(), to.getMgr());
		return address;
	}

}
