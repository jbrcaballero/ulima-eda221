def obtener_diccionario(nombre_archivo):
    diccionario = {}
    #Leer archivo
    archivo = open(nombre_archivo)
    #Recorrer el archivo
    for linea in archivo:
        #Obtenemos una lista con los datos de la linea
        lista_datos = linea.split()
        #Distinguimos entre clave y valor
        clave = lista_datos[0]
        valor = lista_datos[1]
        #Agregamos al diccionario
        diccionario[clave] = valor
    archivo.close()
    return diccionario

if __name__ == "__main__":
    dicc = obtener_diccionario("data/valores.txt")
    print(dicc)