import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class DB{
	private Statement stmt = null; //Koneksi query
	private ResultSet rs = null; //Hasil query
	private Connection conn = null; //Koneksi MySQL dan basis data

	public DB(String ConAddress) throws Exception, SQLException{
		/**
		* Method DB
		* Konstruktor : melakukan koneksi ke MySQL dan basis data
		* Menerima masukan berupa string alamat koneksi ke MySQL dan basis data
		*/

		try{
			// Membuat driver Mysql
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// Membuat koneksi MySQL dan basis data
			conn = DriverManager.getConnection(ConAddress);
			conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);
		}catch(SQLException es){
			// Mengeluarkan pesan error jika koneksi gagal
			throw es;
		}
	}
	public void createQuery(String Query) throws Exception,SQLException{
		/**
		* Method createQuery
		* Mengeksekusi query tanpa mengubah isi data
		* Menerima masukan berupa tring query
		*/
		try{
			stmt = conn.createStatement();
			// Eksekusi query
			rs = stmt.executeQuery(Query);
			if(stmt.execute(Query)){
				// ambil hasil query
				rs = stmt.getResultSet();
			}
		}catch(SQLException es){
			// Eksekusi jika query gagal dieksekusi
			throw es;
		}
	}
	public void createUpdate(String Query)throws Exception,SQLException{
		/**
		* Method createQuery
		* Mengeksekusi query yang mengubah isi data (update,insert,delete)
		* Menerima masukan berupa string query
		*/
		try{
			stmt = conn.createStatement();
			// Eksekusi query
			int hasil = stmt.executeUpdate(Query);
		}catch(SQLException es){
			// Eksepsi jika query gagal dieksekusi
			throw es;
		}
	}
	public ResultSet getResult() throws Exception{
		/** 
		* Method getResult
		* Memberikan hasil query
		*/
		ResultSet Temp = null;
		try{
			return rs;
		}catch(Exception ex){
			// Eksepsi jika hasil tidak dapat dikembalikan
			return Temp;
		}
	}
	public void closeResult() throws SQLException,Exception{
		/**
		* Method closeResult
		* Menutup hubungan dari eksekusi query
		*/
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException sqlEx){
				rs = null;
				throw sqlEx;
			}
		}
		if(stmt != null){
			try{
				stmt.close();
			}catch(SQLException sqlEx){
				stmt = null;
				throw sqlEx;
			}
		}
	}
	public void closeConnection() throws SQLException,Exception{
		/**
		* Method closeConnection
		* Menutup hubungan dengan MySQL dan basis data
		*/
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException sqlEx){
				conn = null;
			}
		}
	}
}
class CobaBDAkses{
	public static void main(String[] args) {
		try{
			DB db = new DB("jdbc:mysql://localhost:3306/kuliah?user=root&password=root");
			db.createQuery("SELECT * FROM MAHASISWA");
			try{
				int i = 1;
				while(db.getResult().next()){
					// Ambil hasil query
					String nim = db.getResult().getString(1);
					String nama = db.getResult().getString(2);
					String tl = db.getResult().getString(3);
					String alamat = db.getResult().getString(4);

					System.out.println("-------------------------------");
					System.out.println("Record ke : "+i);
					System.out.println("NIM  : "+nim);
					System.out.println("Nama : "+nama);
					System.out.println("Tanggal lahir : "+tl);
					if(alamat != null){
						System.out.println("Alamat : "+alamat);
					}else{
						System.out.println("Alamat : null");
					}
					System.out.println("-------------------------------");
					i += 1;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			db.closeResult();
			db.closeConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}