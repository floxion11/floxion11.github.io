var jmlAngkot = 10;
var angkotBeroperasi = 6;

for (var noAngkot = 1; noAngkot <= 10; noAngkot++){
	if (noAngkot <= angkotBeroperasi) {
		console.log('Angkot No. '+noAngkot+' beroperasi dengan baik');
	}
	else {
		console.log('Angkot No. '+noAngkot+' tidak beroperasi dengan baik');
	}
}