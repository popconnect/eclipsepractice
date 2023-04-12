package obs;

import javax.swing.AbstractListModel;

import java.util.ArrayList;

public class ZipcodeListModel2 extends AbstractListModel<String> {
	
	private ArrayList<ZipcodeTO> items;
	
	public ZipcodeListModel2(String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		this.items = dao.searchZipcode(strDong);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = items.get(index);
		String address = String.format("[%s] %s %s %s %s %s",
		                                to.getZipcode(),  to.getSido(), to.getGugun(),
		                                to.getDong(), to.getRi(), to.getBunji());
		return address;
	}

}
