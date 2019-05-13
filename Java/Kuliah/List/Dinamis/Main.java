package kelasListDinamis;

class NilaiMatkul{
	String nim;
	String nama;
	String nilai;

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
	/*--------------------------------------------------------------------------------------*/
}

class Elemen{
	NilaiMatkul kontainer;
	Elemen next;

	Elemen(){
		kontainer = new NilaiMatkul();
	}
	/*--------------------------------------------------------------------------------------*/
	NilaiMatkul getKontainer(){
		return kontainer;
	}
	/*--------------------------------------------------------------------------------------*/
	void setNext(Elemen next){
		this.next = next;
	}
	Elemen getNext(){
		return next;
	}
}

class List{
	private Elemen first;

	List(){
	}
	/*--------------------------------------------------------------------------------------*/
	void setFirst(Elemen first){
		this.first = first;
	}
	/*--------------------------------------------------------------------------------------*/
	Elemen getFirst(){
		return first;
	}
	/*--------------------------------------------------------------------------------------*/
	void createList(){
		first = null;
	}
	/*--------------------------------------------------------------------------------------*/
	int countElemen(){
		int hasil = 0;

		if(first != null){
			/*List tidak kosong*/
			Elemen bantu;

			/*Inisialisasi*/
			bantu = first;

			while(bantu != null){
				/*proses*/
				hasil += 1;

				/*iterasi*/
				bantu = bantu.getNext();
			}
		}
		return hasil;
	}
	/*--------------------------------------------------------------------------------------*/
	void addFirst(String nim,String nama,String nilai){
		Elemen baru;

		baru = new Elemen();
		baru.getKontainer().setNim(nim);
		baru.getKontainer().setNama(nama);
		baru.getKontainer().setNilai(nilai);

		if(first == null){
			/*Jika list kosong*/
			baru.setNext(null);
		}else{
			/*Jika list tidak kosong*/
			baru.setNext(first);
		}
		first = baru;
		baru = null;
	}
	/*--------------------------------------------------------------------------------------*/
	void addAfter(Elemen prev,String nim,String nama,String nilai){
		if(prev != null){
			Elemen baru;
			baru = new Elemen();

			baru.getKontainer().setNim(nim);
			baru.getKontainer().setNama(nama);
			baru.getKontainer().setNilai(nilai);

			if(prev.next == null){
				baru.setNext(null);
			}else{
				baru.setNext(prev.getNext());
			}
			prev.setNext(baru);
			baru = null;
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void addLast(String nim,String nama,String nilai){
		if(first == null){
			/*Jika list adalah list kosong*/
			addFirst(nim,nama,nilai);
		}else{
			/*Jika list tidak kosong*/
			/*Mencari elemen terakhir list*/
			Elemen last = first;

			while(last.getNext() != null){
				/*iterasi*/
				last = last.getNext();
			}
			addAfter(last,nim,nama,nilai);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delFirst(){
		if(first != null){
			/*Jika list bukan list kosong*/
			Elemen hapus = first;

			if(countElemen() == 1){
				first = null;
			}else{
				first = first.getNext();
			}
			hapus.setNext(null);
		}else{
			System.out.println("List kosong");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delAfter(Elemen prev){
		if(prev != null){
			Elemen hapus = prev.getNext();
			if(hapus != null){
				if(hapus.getNext() == null){
					prev.setNext(null);
				}else{
					prev.setNext(hapus.getNext());
				}
				hapus.setNext(null);
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delLast(){
		if(first != null){
			/*Jika list tidak kosong*/
			if(countElemen() == 1){
				/*Jika list teridiri dari satu elemen*/
				delFirst();
			}else{
				/*Mencari elemen terakhir*/
				Elemen last = first;
				Elemen before_last = null;

				while(last.getNext() != null){
					/*iterasi*/
					before_last = last;
					last = last.getNext();
				}
				delAfter(before_last);
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printElemen(){
		if(first != null){
			/*Jika list tidak kosong*/
			/*inisialiasasi*/

			Elemen bantu = first;
			int i = 1;

			while(bantu != null){
				/*proses*/
				System.out.println("Elemen ke : "+i);
				System.out.println("NIM   : "+bantu.kontainer.nim);
				System.out.println("Nama  : "+bantu.kontainer.nama);
				System.out.println("Nilai : "+bantu.kontainer.nilai);
				System.out.println("-----------------------------------");

				/*Iterasi*/
				bantu = bantu.getNext();
				i += 1;
			}
		}else{
			/*Proses jika list kosong*/
			System.out.println("List kosong");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delAll(){
		if(countElemen() != 0){
			int i;
			for(i=countElemen(); i>=1; i++){
				/*Proses menghapus elemen list*/
				delLast();
			}
		}
	}
}

public class Main{
	public static void main(String[] args) {
		List L = new List();

		L.createList();
		L.printElemen();

		System.out.println("========================");
		L.addFirst("131","Rere","A");
		L.addAfter(L.getFirst(),"192","Lopi","E");
		L.addAfter(L.getFirst(),"153","Frea","A");
		L.addLast("175","Pio","B");

		L.printElemen();

		System.out.println("========================");
		L.delLast();
		L.delAfter(L.getFirst());
		L.delFirst();

		L.printElemen();
		System.out.println("========================");
	}
}