package application;

import java.sql.Date;
import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		Department obj = new Department(1, "books");
		System.out.println(obj);
		Seller seller = new Seller(1, "paulo", "pr@pr.com", new Date(0), 2500.00, obj);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
