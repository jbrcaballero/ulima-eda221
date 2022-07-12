def guardar_datos(diccionario, nombre_archivo):
    archivo = open(nombre_archivo, "w")
    for clave in diccionario.keys():
        valor = diccionario[clave]
        cadena = str(clave) + "," + str(valor) + "\n"
        archivo.write(cadena)
    archivo.close()

if __name__ == "__main__":
    diccionario = {"nombre": "Carlos", "apellido": "Saravia", "edad": 20}
    guardar_datos(diccionario, "data/diccionario.txt")
