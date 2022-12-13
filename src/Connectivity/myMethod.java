package Connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Connectivity.CP;
import Connectivity.getName;
import Frame.HomePage;
import net.proteanit.sql.DbUtils;

public class myMethod {

	public static Boolean StaffLogin(getName data) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			
			Connection con = CP.ceateC();
			
			String q = "select Name from staff where ID = ?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, data.getStaffID());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				f = true;
			}else {
				JOptionPane.showMessageDialog(null, "Invalid Login !");
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

//	public static void availabledata() {
//		// TODO Auto-generated method stub
//		try {
//			Connection con = CP.ceateC();
//			
//			String q = "select * from menue";
//			
//			PreparedStatement pstmt = con.prepareStatement(q);
//			ResultSet rs = pstmt.executeQuery();
//			HomePage.table.setModel(DbUtils.resultSetToTableModel(rs));
//			System.out.println("Menue showed...");
//			
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//	}

	
	public static boolean additem1() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 1";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remitem1() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 1";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	
	public static boolean remitem2() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 2";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	
	
	public static boolean remitem3() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 3";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remitem4() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 4";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	
	public static boolean remitem5() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 5";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	
	
	public static boolean remitem6() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 6";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remitem7() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 7";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remitem8() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 8";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remitem9() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 9";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean remitem10() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from addmethod where Quantity = 10";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
//	public static boolean addcode1() {
//		// TODO Auto-generated method stub
//			
//		boolean f = false;
//		
//			try {
//				
//				Connection con = CP.ceateC();
//				
//				String q = "insert into addmethod (CustomerCode) select FoodOrdered, Code, Price from menue where Code = 1";
//				
//				PreparedStatement pstmt = con.prepareStatement(q);
////				pstmt.setString(1, add.getOrderCode());
//				
//				pstmt.executeUpdate();
//				f = true;
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		return f;
//	}
	
	public static boolean additem2() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 2";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem3() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 3";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem4() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 4";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem5() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 5";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem6() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 6";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem7() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 7";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem8() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 8";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem9() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 9";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean additem10() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into addmethod (Name,Quantity,Price) select FoodOrdered, Code, Price from menue where Code = 10";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static void pendingdata() {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.ceateC();
			
			String q = "select * from addmethod";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			ResultSet rs = pstmt.executeQuery();
			HomePage.Pendingtable.setModel(DbUtils.resultSetToTableModel(rs));
			System.out.println("addData");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public static boolean insert(getName data) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			
			Connection con = CP.ceateC();
			
			String q = "insert into menue values(?,?,?);";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, data.getName());
			pstmt.setString(2, data.getPrice());
			pstmt.setString(3, data.getCode());
			
			pstmt.executeUpdate();
			f = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public static boolean adddeli1() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 1";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli1() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 1";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli2() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 2";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli2() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 2";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli3() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 3";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli3() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 3";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli4() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 4";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli4() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 4";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli5() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 5";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli5() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 5";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli6() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 6";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli6() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 6";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli7() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 7";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli7() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 7";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli8() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 8";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli8() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 8";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli9() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 9";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli9() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 9";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	public static boolean adddeli10() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod where Quantity = 10";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	public static boolean remdeli10() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "delete from deli where code = 10";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Deli data removed");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
	
	
	public static void deliverydata() {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.ceateC();
			
			String q = "select * from deli";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			ResultSet rs = pstmt.executeQuery();
			HomePage.table_3.setModel(DbUtils.resultSetToTableModel(rs));
			System.out.println("deliverd data added");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public static boolean insertDeli() {
		// TODO Auto-generated method stub
			
		boolean f = false;
		
			try {
				
				Connection con = CP.ceateC();
				
				String q = "insert into deli (FooName,code) select Name, Quantity from addmethod";
				
				PreparedStatement pstmt = con.prepareStatement(q);
//				pstmt.setString(1, add.getOrderCode());
				
				pstmt.executeUpdate();
				System.out.println("Inserted to deli");
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return f;
	}
	
//	public static boolean addrec() {
//		// TODO Auto-generated method stub
//			
//		boolean f = false;
//		
//			try {
//				
//				Connection con = CP.ceateC();
//				
//				String q = "insert into rec(Food,code) select FooName, code from deli";
//				
//				PreparedStatement pstmt = con.prepareStatement(q);
////				pstmt.setString(1, add.getOrderCode());
//				
//				pstmt.executeUpdate();
//				System.out.println("Added to records...");
//				f = true;
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		return f;
//	}
	
	
	
//	public static void deleadd() {
//		// TODO Auto-generated method stub
//		try {
//			Connection con = CP.ceateC();
//			
//			String q = "delete from addmethod";
//			
//			PreparedStatement pstmt = con.prepareStatement(q);
//			ResultSet rs = pstmt.executeQuery();
//			HomePage.table_3.setModel(DbUtils.resultSetToTableModel(rs));
//			System.out.println("deliverd data added");
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//	}
	
	
	
}
