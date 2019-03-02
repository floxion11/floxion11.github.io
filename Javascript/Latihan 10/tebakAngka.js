var kesempatan = 1, ulang = true;
var cetak = Math.floor(Math.random() * 10);
while (ulang == true && kesempatan <= 3) {
	// User memasukan angka
		var p;
		p = prompt('Masukan angka 0 - 10. \nKamu memiliki 3x kesempatan');
		if (p == null) {
			ulang = false;
		}

	// Cetak Angka
		if(p == cetak) {
			alert('Hasil Benar\nPilihanmu : '+p+' dan Komputer : '+cetak);
			kesempatan = 10;
		} else if (p < cetak) {
			alert("Pilihanmu 'RENDAH'");
		} else {
			alert("Pilihanmu 'TINGGI'");
		}
		kesempatan += 1;
}
alert('Kamu kalah, Komputer memilih : '+cetak);