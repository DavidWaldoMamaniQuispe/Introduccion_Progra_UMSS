Algoritmo pregunta1
	// Paridad par valida
	
	Definir numBinario Como Entero
	Escribir "Introduzca el numero binario"
	Leer numBinario
	
	aux = numBinario
	sum = 0
	
	Mientras aux <> 0
		digito = aux % 10
		sum = sum + digito
		aux = trunc(aux / 10)
	FinMientras
	
	Si sum % 2 = 0
		Escribir 1
	Sino
		Escribir 0
	FinSi
	
FinAlgoritmo
