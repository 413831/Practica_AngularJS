try:
    archivo = open('prueba.txt', 'r', encoding='utf8')
    # leer toda la informacion del archivo
    print(archivo.read())

except Exception as e:
    print(e)
finally:
    archivo.close()