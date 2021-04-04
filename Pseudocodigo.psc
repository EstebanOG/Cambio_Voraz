Funcion x <- devolverCambio ( monto, costoMonedas )
	tamanio = 8
	Dimension  x[tamanio]
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		x[i]=0
	Fin Para
	
	act = 0
	j = tamanio - 1
	
	Mientras act <> monto Hacer
		Mientras (costoMonedas[j]>(monto - act) & j>0) Hacer
			j = j - 1
		Fin Mientras
		
		x[j] = (monto - act)/costoMonedas[j]
		act = act + costoMonedas[j] * x[j]
	Fin Mientras
Fin Funcion

Algoritmo inicio
	Dimension costoMonedas[8]
	costoMonedas[1] = 1
	costoMonedas[2] = 2
	costoMonedas[3] = 5
	costoMonedas[4] = 10
	costoMonedas[5] = 20
	costoMonedas[6] = 50
	costoMonedas[7] = 100
	costoMonedas[8] = 200
	Escribir "Introduzca el monto a devolver: "
	Definir  monto Como Real
	Leer monto 
	monto = monto * 100
	Dimension solucion[8]
	solucion = devolverCambio(monto, costoMonedas)
	numMonedas = 0
	Para i<-1 Hasta 8 Con Paso 1 Hacer
		Si solucion[i] <> 0 Entonces
			Escribir "Valor: " , costoMonedas[i]/100 ," Euros", " Número de monedas:" , solucion[i]
			numMonedas = numMonedas + solucion[i]
		SiNo
			
		Fin Si
	Fin Para
	Escribir "Número de monedas total:", numMonedas
FinAlgoritmo


