class NilaiMatkul{
	private String nim;
	private String nama;
	private String nilai;

	NilaiMatkul(){
	}
	/*--------------------------------------------------------------------------------------*/
	void setNim(String nim){
		this.nim = nim;
	}
	/*--------------------------------------------------------------------------------------*/
	String getNim(){
		return nim;
	}
	/*--------------------------------------------------------------------------------------*/
	void setNama(String nama){
		this.nama = nama;
	}
	/*--------------------------------------------------------------------------------------*/
	String getNama(){
		return nama;
	}
	/*--------------------------------------------------------------------------------------*/
	void setNilai(String nilai){
		this.nilai = nilai;
	}
	/*--------------------------------------------------------------------------------------*/
	String getNilai(){
		return nilai;
	}
}

class Elemen{
	private NilaiMatkul kontainer;
	private int next;

	Elemen(){
		kontainer = new NilaiMatkul();
	}
	/*--------------------------------------------------------------------------------------*/
	NilaiMatkul getKontainer(){
		return kontainer;
	}
	/*--------------------------------------------------------------------------------------*/
	void setNext(int next){
		this.next = next;
	}
	/*--------------------------------------------------------------------------------------*/
	int getNext(){
		return next;
	}
}

class List{
	private int first;
	private Elemen[] data = new Elemen[10];

	List(){
		for(int i=0; i<10; i++){
			data[i] = new Elemen();
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void setFirst(int first){
		this.first = first;
	}
	/*--------------------------------------------------------------------------------------*/
	int getFirst(){
		return first;
	}
	/*--------------------------------------------------------------------------------------*/
	void createList(){
		first = -1;
		int i;

		for(i=0; i<10; i++){
			/*Proses menginisialisasi isi array*/
			data[i].setNext(-2);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	int countElemen(){
		int hasil = 0;
		if(first != -1){
			/*list tidak kosong*/
			int bantu;

			/*inisialisasi*/
			bantu = first;

			while(bantu != -1){
				/*proses*/
				hasil += 1;

				/*iterasi*/
				bantu = data[bantu].getNext();
			}
		}
		return hasil;
	}
	/*--------------------------------------------------------------------------------------*/
	int emptyElemen(){
		int hasil = -1;

		if(countElemen() < 10){
			boolean ketemu = false;
			int i = 0;

			while((ketemu == false) && (i<10)){
				if(data[i].getNext() == -2){
					hasil = i;
					ketemu = true;
				}else{
					i += 1;
				}
			}
		}
		return hasil;
	}
	/*--------------------------------------------------------------------------------------*/
	void addFirst(String nim,String nama,String nilai){
		if(countElemen() < 10){
			int baru = emptyElemen();

			data[baru].getKontainer().setNim(nim);
			data[baru].getKontainer().setNama(nama);
			data[baru].getKontainer().setNilai(nilai);

			if(first == -1){
				/*jika list kosong*/
				data[baru].setNext(-1);
			}else{
				/*jika list tidak kosong*/
				data[baru].setNext(first);
			}

			first = baru;
		}else{
			/*proses jika array penuh*/
			System.out.println("List Penuh");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void addAfter(int prev,String nim,String nama,String nilai){
		if((countElemen() < 10) && (prev != -1)){
			int baru = emptyElemen();
			data[baru].getKontainer().setNim(nim);
			data[baru].getKontainer().setNama(nama);
			data[baru].getKontainer().setNilai(nilai);

			if(data[prev].getNext() == -1){
				/*Jika prev adalah elemen terakhir*/
				data[baru].setNext(-1);
			}else{
				data[baru].setNext(data[prev].getNext());
			}
			data[prev].setNext(baru);
		}else{
			/*Proses jika array penuh atau prev null*/
			System.out.println("List Penuh!!");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void addLast(String nim,String nama,String nilai){
		if(first == -1){
			/*proses jika list masih kosong*/
			addFirst(nim,nama,nilai);
		}else{
			/*Proses jika list telah berisi elemen*/
			/*Porses mencari indeks elemen terakhir*/
			/*inisialisasi*/
			int last = first;

			while(data[last].getNext() != -1){
				/*iterasi*/
				last = data[last].getNext();
			}
			addAfter(last,nim,nama,nilai);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delFirst(){
		if(first != -1){
			int hapus = first;

			if(countElemen() == 1){
				first = -1;
			}else{
				first = data[first].getNext();
			}

			/*Elemen awal sebelum dikosongkan*/
			data[hapus].setNext(-2);
		}else{
			/*Proses jika list kosong*/
			System.out.println("List Kosong!!");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delAfter(int prev){
		if(prev != -1){
			int hapus = data[prev].getNext();
			if(hapus != -1){
				if(data[hapus].getNext() == -1){
					data[prev].setNext(-1);
				}else{
					data[prev].setNext(data[hapus].getNext());
				}

				/*Pengosongn elemen*/
				data[hapus].setNext(-2);
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delLast(){
		if(first != -1){
			if(countElemen() == 1){
				/*Proses jika list hanya berisi satu elemen*/
				delFirst();
			}else{
				int last = first;
				int before_last = -1;

				while(data[last].getNext() != -1){
					/*iterasi*/
					before_last = last;
					last = data[last].getNext();
				}

				/*Elemen sebelum elemen terakhir menjadi elemen terakhir*/
				delAfter(before_last);
			}
		}else{
			/*proses jika list kosong*/
			System.out.println("List Kosong!!");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printElemen(){
		if(first !=  -1){
			/*inisialisasi*/
			int bantu = first;
			int i = 1;

			while(bantu != -1){
				/*Proses*/
				System.out.println("Elemen ke : "+i);
				System.out.println("NIM   : "+ data[bantu].getKontainer().getNim());
				System.out.println("Nama  : "+ data[bantu].getKontainer().getNama());
				System.out.println("Nilai : "+ data[bantu].getKontainer().getNilai());
				System.out.println("Next  : "+ data[bantu].getNext());
				System.out.println("----------------------------------");
				/*iterasi*/
				bantu = data[bantu].getNext();
				i += 1;
			}
		}else{
			/*Proses jika list kosong*/
			System.out.println("List Kosong!!");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delAll(){
		int i;
		for(i=countElemen(); i>=1; i--){
			/*Proses menghapus elemen list*/
			delLast();
		}
	}
}

public class Main{
	public static void main(String[] args) {
		List L = new List();

		L.createList();
		L.printElemen();

		System.out.println("=============================");

		L.addFirst("141","Nana","A");
		L.addAfter(L.getFirst(),"151","Roro","B");
		L.addLast("195","Poki","E");

		L.printElemen();

		System.out.println("============================="+L.countElemen()+"____"+L.emptyElemen());

		L.delLast();
		L.delAfter(L.getFirst());
		L.delFirst();
		L.printElemen();

		System.out.println("==============================");
	}
}