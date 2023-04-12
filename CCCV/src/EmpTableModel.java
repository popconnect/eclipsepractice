import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class EmpTableModel extends AbstractTableModel {
	
	private ArrayList<EmpTO> items;
	private String[] columnNames = new String[] {
			"empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"
		};
	
	public EmpTableModel() {
		// TODO Auto-generated constructor stub
		EmpDAO dao = new EmpDAO();
		items = dao.listEmp();

	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String result = "";
		
		EmpTO to = items.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			result = to.getEmpno();
			break;
		
		case 1:
			result = to.getEname();
			break;
		
		case 2:
			result = to.getJob();
			break;
		
		case 3:
			result = to.getMgr();
			break;
		
		case 4:
			result = to.getHiredate();
			break;
		
		case 5:
			result = to.getSal();
			break;
		
		case 6:
			result = to.getComm();
			break;
		
		default:
			result = to.getDeptno();
			
		}
		return result;
	}

}
