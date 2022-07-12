def grabar_reporte(nombre_entrada, nombre_salida):
    #Abrimos archivo de entrada
    arc_entrada = open(nombre_entrada)
    
    #Variables para obtener maximo y minimo
    maximo = 0
    nombre_maximo = ""
    minimo = 20
    nombre_minimo = ""

    #Contadores y acumuladores
    cantidad_aprobados = 0
    suma_general = 0

    #Utilizaremos la lista para contar los alumnos con notas > promedio
    lista_notas = []

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
            #Incrementamos la suma de notas del alumno
            suma_alu = suma_alu + nota
        
        #Obtenemos el promedio del alumno
        promedio_alu = suma_alu / (len(lista_datos) - 1)
        
        #Agregamos el promedio obtenido a la lista de notas
        lista_notas.append(promedio_alu)
        #Incrementamos el promedio general
        suma_general = suma_general + promedio_alu

        #Actualizar valor maximo
        if(promedio_alu > maximo):
            maximo = promedio_alu
            nombre_maximo = nombre

        #Actualizar valor minimo        
        if(promedio_alu < minimo):
            minimo = promedio_alu
            nombre_minimo = nombre

        #Verificamos si contabilizamos como aprobado
        if(promedio_alu >= 11):
            cantidad_aprobados = cantidad_aprobados + 1
    
    #Cerramos el archivo de entrada (ya lo procesamos)
    arc_entrada.close()

    #Calculamos promedio general y porcentaje de aprobados
    promedio_general = suma_general / len(lista_notas)
    porcentaje_aprobados = cantidad_aprobados / len(lista_notas) * 100

    #Obtenemos la cantidad de alumnos con notas > promedio
    cant_mayor_prom = 0
    for i in range(len(lista_notas)):
        if(lista_notas[i] > promedio_general):
            cant_mayor_prom = cant_mayor_prom + 1
    #Calculamos el porcentaje correpondiente
    porc_mayor_prom = cant_mayor_prom / len(lista_notas) * 100

    

    #Escribir reporte
    archivo_salida = open(nombre_salida, "w")

    archivo_salida.write("Promedio general: " + str(promedio_general) + "\n")

    archivo_salida.write("Alumno mayor nota: " + str(nombre_maximo) + "\n")
    archivo_salida.write("Mayor nota: " + str(maximo) + "\n")

    archivo_salida.write("Alumno menor nota: " + str(nombre_minimo) + "\n")
    archivo_salida.write("Menor nota: " + str(minimo) + "\n")

    archivo_salida.write("Porcentaje aprobados: " + str(porcentaje_aprobados) + "\n")
    archivo_salida.write("Porcentaje con nota > prom: " + str(porc_mayor_prom) + "\n")
    
    archivo_salida.close()


if __name__ == "__main__":
    grabar_reporte("data/lista.csv", "data/resumen.txt")