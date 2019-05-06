// Math PI
	var pi = Math.PI;
	document.getElementById('pi').innerHTML = pi;

// Math round (pembulatan bilangan terdekat)
	var round = Math.round(4.3);
	document.getElementById('round').innerHTML = round;

// Math Pow
	var pow = Math.pow(2,8);
	document.getElementById('pow').innerHTML = pow;

// Math sqrt
	var sqrt = Math.sqrt(64);
	document.getElementById('sqrt').innerHTML = sqrt;

// Math abs
	var abs = Math.abs(-3.1);
	document.getElementById('abs').innerHTML = abs;

// Math ceil
	var ceil = Math.ceil(4.6);
	document.getElementById('ceil').innerHTML = ceil;

// Math floor 
	var floor = Math.floor(4.6);
	document.getElementById('floor').innerHTML = floor;

// Math sin
	var sin = Math.sin(90 * Math.PI/180);
	document.getElementById('sin').innerHTML = sin;

// Math cos
	var cos = Math.cos(0 * Math.PI/180);
	document.getElementById('cos').innerHTML = cos;

// Math min max
	var numbersMin = Math.min(0, 32, -12, 54);
		document.getElementById('min').innerHTML = "Min: "+numbersMin;
	var numbersMax = Math.max(0, 32, -12, 54);
		document.getElementById('max').innerHTML = "Max: "+numbersMax;

// Math random
	var random = Math.random();
		document.getElementById('random').innerHTML = random;