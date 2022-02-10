Algoritmo pregunta2
	// Serie 2 4  -6  -8  10  12  -14   -16
	Definir n Como Entero
	Leer n
	
	signo = -1
	
	Para cont = 1 Hasta n
		si cont % 2 <> 0
			signo = signo * (-1)
		FinSi
		val = cont * signo * 2
	FinPara
	
	Escribir val
	
FinAlgoritmo
