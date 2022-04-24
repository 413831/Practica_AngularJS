# Las funciones en python ciudadanos de primera clase
def mayusculas(texto):
    return texto.upper()

# Uso normal de una función
print(mayusculas('Hola'))

# Uso de una función como un objeto
# Asignar la referencia de la función a una variable, sin los paréntesis
variable_funcion = mayusculas
print(f'Función mayusculas: {mayusculas}')
print(f'Variable función: {variable_funcion}')

# Utilizamos la variable función en cualquier momento
print(variable_funcion('Texto'))

# Para demostrar que las funciones son objetos, eliminamos la referencia original
# del mayusculas

# Aun así, se puede utilizar función con la variable_función
print(variable_funcion('Otro texto'))

# Podemos saber el nombre por default que se le asigna a una función
print(f'Nombre por default de la función: {variable_funcion.__name__}')
# print(mayusculas('Nombre por default'))

# Cómo almacenar una función en una estructura de datos (list)
lista_funciones = [mayusculas, variable_funcion, str.upper]
print(lista_funciones)

for funcion in lista_funciones:
    print(funcion, funcion('Saludos desde la función'))

# 0 podemos acceder directamente a la función que deseemos
print(lista_funciones[1]('Saludos desde variable función'))

######################
#

