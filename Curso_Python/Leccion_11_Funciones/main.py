# nota:primero debe estar declarada para llamarla
def mi_funcion(nombre, apellido):
    print('saludos desde mi funcion')
    print(f'Nombre: {nombre}, Apellido: {apellido}')

# el tipo de dato de retorno es a modo de guía y opcional
# se pueden definir argumentos por default
def sumar(a = 0, b = 0) -> int:
    return a + b

# argumentos variables
# internamente se genera una tupla del parámetro
def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)

# Llamados

listarNombres('Juan','Pepito','Marta','Hermeneguildo','Iñaki')

# resultado = sumar(5, 3)
# print(resultado)

# resultado = sumar()
# print(resultado)

# mi_funcion('Juan','Perez')
# mi_funcion('Karla','Lara')

