# -*- coding: utf-8 -*-

def leer_archivo(nombre_archivo, n):
    archivo = open(nombre_archivo)
    MAX_LINEAS = 11
    contador = 0
    for linea in archivo:
        if(contador == n or contador == MAX_LINEAS):
            break
        print(linea, end = "")
        contador = contador + 1
    archivo.close()
        
if __name__ == "__main__":
    leer_archivo("data/datos_p01.txt", 3)