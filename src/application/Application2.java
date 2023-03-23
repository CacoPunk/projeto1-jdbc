package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Application2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();
		department  =  departmentDao.findById(1);
		System.out.println(department);
		///department.setName("TESTE");
		//departmentDao.insert(department);
		
		
	}

}
