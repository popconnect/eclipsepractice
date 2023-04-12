package zipcodemodel;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import model.ZipcodeDAO;
import model.ZipcodeTO;

public class dongComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> dongs ;
	
	public dongComboBoxModel() {
		// TODO Auto-generated constructor stub
		dongs = new ArrayList<>();
		
		ZipcodeTO to = new ZipcodeTO();
		to.setDong("동");
		dongs.add(to);
	}
	
	public dongComboBoxModel(String strSido, String strGugun) {
		ZipcodeDAO dao = new ZipcodeDAO();
		System.out.println(strSido);
		System.out.println(strGugun);
		dongs = dao.listDong(strSido, strGugun);
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return dongs.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = dongs.get(index);
		return to.getDong();
	}
}
