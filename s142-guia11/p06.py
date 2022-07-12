def obtener_promedios(nombre_entrada):
    diccionario = {}
    #Abrimos archivo de entrada
    arc_entrada = open(nombre_entrada)
    #Recorremos archivo
    for linea in arc_entrada:
        #Analizamos cada linea
        lista_datos = linea.split(",")
        #Obtenemos el nombre
        nombre = lista_datos[0]
        suma_alu = 0
        #Procesamos las notas
        for i in range(1, len(lista_datos)):
            nota = int(lista_datos[i])
            #Corregir valores erroneos de notas
            if(nota < 0 or nota > 20):
                nota = 0
            suma_alu = suma_alu + nota
        
        promedio_alu = suma_alu / (len(lista_datos) - 1)
        diccionario[nombre] =  promedio_alu

    arc_entrada.close()
    return diccionario

def obtener_promedio_general(dic_notas):
    lista_notas = list(dic_notas.values())
    suma = 0
    for i in range(len(lista_notas)):
        suma = suma + lista_notas[i]
    
    promedio = suma / len(lista_notas)
    return promedio

def obtener_nota_maxima(dic_notas):
    maximo = 0
    nombre_maximo = ""
    for nombre_alumno in dic_notas.keys():
        prom_alu = dic_notas[nombre_alumno]
        if(prom_alu > maximo):
            maximo = prom_alu
            nombre_maximo = nombre_alumno
    return (nombre_maximo, maximo)

def obtener_nota_minima(dic_notas):
    minimo = 20
    nombre_minimo = ""
    for nombre_alumno in dic_notas.keys():
        prom_alu = dic_notas[nombre_alumno]
        if(prom_alu < minimo):
            minimo = prom_alu
            nombre_minimo = nombre_alumno
    return (nombre_minimo, minimo)

def porcentaje_mayores(dic_notas, valor):
    lista_nombres = list(dic_notas.keys())
    contador = 0
    total = len(lista_nombres)
    for nombre_alumno in lista_nombres:
        prom_alu = dic_notas[nombre_alumno]
        if(prom_alu >= valor):
            contador = contador + 1
    
    porcentaje = (contador / total) * 100
    return porcentaje

def obtener_reporte(nombre_archivo_entrada, nombre_archivo_salida):
    archivo_salida = open(nombre_archivo_salida, "w")
    notas = obtener_promedios(nombre_archivo_entrada)
    promedio = obtener_promedio_general(notas)
    
    archivo_salida.write("Promedio general: " + str(promedio) + "\n")

    tupla_max = obtener_nota_maxima(notas)
    archivo_salida.write("Alumno mayor nota: " + str(tupla_max[0]) + "\n")
    archivo_salida.write("Mayor nota: " + str(tupla_max[1]) + "\n")

    tupla_min = obtener_nota_minima(notas)
    archivo_salida.write("Alumno menor nota: " + str(tupla_min[0]) + "\n")
    archivo_salida.write("Menor nota: " + str(tupla_min[1]) + "\n")

    porc_aprobados = porcentaje_mayores(notas, 11)
    archivo_salida.write("Porcentaje aprobados: " + str(porc_aprobados) + "\n")
    porc_mayor_prom =  porcentaje_mayores(notas, promedio)
    archivo_salida.write("Porcentaje con nota >= prom: " + str(porc_mayor_prom) + "\n")
    archivo_salida.close()
    
if __name__ == "__main__":
     obtener_reporte("data/lista.csv", "data/resumen.txt") 