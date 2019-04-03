import java.io.*;
// import java.io.File;

public class Main {
	public static void main(String[] args) {
		// Membuat File
		try{
			new File("Latihan.txt").createNewFile();			
		}catch(Exception e){}

		// Mendeteksi File
		File cek_myFile;
		cek_myFile = new File("Latihan.txt");
		if(cek_myFile.exists()){
			System.out.println("File ada");
		} else {
			System.out.println("File tidak ada");
		}

		// Menulis file
		File tulis_myFile;
		tulis_myFile = new File("Latihan.txt");
		try{
			OutputStream fs = new FileOutputStream(tulis_myFile);

			String s = "Ini adalah File Latihan";

			byte b[] = new byte[s.length()];
			int i;
			for(i=0; i<s.length(); i++){
				b[i] = (byte)s.charAt(i);
			}
			fs.write(b,0,s.length());
			fs.close();
		}catch(Exception e){}

		// Membaca File
		File baca_myFile;
		baca_myFile = new File("Latihan.txt");
		try{
			InputStream fs = new FileInputStream(baca_myFile);
			byte b[] = new byte[100];
			fs.read(b);
			String str = new String(b,0,b.length);

			System.out.println("Isi File "+str);
			fs.close();
		}catch(Exception e){}
/*
		// Menghapus File
		File hapus_myFile = new File("Latihan.txt");
		hapus_myFile.delete();

		// Membuat Direktori
		new File("/home/lolihunter/Java/My Work/Project File/Folder buatan").mkdir();

		// Menghapus Direktori
		new File("/home/lolihunter/Java/My Work/Project File/Folder buatan").delete();		
*/
	}
}