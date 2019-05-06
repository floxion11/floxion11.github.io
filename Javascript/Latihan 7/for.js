var jmlAngkot = 10;
var angkotBeroperasi = 9;

for (var noAngkot = 1; noAngkot <= angkotBeroperasi; noAngkot++){
	console.log('Angkot No. '+noAngkot+' beroperasi dengan baik')
}

for (var noAngkot = angkotBeroperasi + 1; noAngkot <= jmlAngkot; noAngkot++){
	console.log('Angkot No. '+noAngkot+' tidak beroperasi');
}