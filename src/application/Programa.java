package application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDao.createVendedorDao();
		
		System.out.println("TESTE 1: Vendedor findbyid =================");
		Vendedor vendedor = vendedorDao.findById(3);
		
		System.out.println(vendedor);
	}

}
