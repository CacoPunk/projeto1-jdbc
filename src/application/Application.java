package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("== Teste 1: FindByID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n== Teste 2: FindByID ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n== Teste 2: FindByID ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
	}

}
