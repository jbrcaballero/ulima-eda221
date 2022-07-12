def copiar(nombre_origen, nombre_destino):
    arc_origen = open(nombre_origen)
    arc_destino = open(nombre_destino, "w")

    for linea in arc_origen:
        arc_destino.write(linea)
    
    arc_destino.close()
    arc_origen.close()

if __name__ == "__main__":
    copiar("data/archivo1.txt", "data/archivo1_copia.txt")