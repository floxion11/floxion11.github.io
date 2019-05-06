var tanya = true;
while (tanya) {
	// menangkap pilihan player
	var p = prompt('pilih : gajah, semut, orang');

	// membangkitkan bilangan random
	var comp = Math.random();

	if( comp < 0.34) {
		comp = 'gajah';
	} else if (comp >= 0.34 && comp < 0.67) {
		comp = 'orang';
	} else {
		comp = 'semut';
	}
	console.log(comp);

	// menentukan rules 
	var hasil = '';
	if( p == comp) {
		hasil = 'SERI';
	} else if ( p == 'gajah') {
		hasil = (comp == 'orang') ? 'MENANG':'KALAH';
	} else if ( p == 'orang') {
		hasil = (comp == 'gajah') ? 'KALAH':'MENANG';
	} else if ( p == 'semut') {
		hasil = (comp == 'orang') ? 'KALAH':'MENANG';
	} else {
		hasil = 'memasukan pilihan yang salah!';
	}

	// menampilkan hasil
	alert('Kamu memilih : '+ p +' dan Komputer memilih : '+comp+'\nMaka hasilnya adalah : Kamu '+hasil);

	tanya = confirm('lagi?');
}
alert('Terima kasih sudah bermain');