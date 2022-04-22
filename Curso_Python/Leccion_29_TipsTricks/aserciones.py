# Tip. Las aserciones nos pueden ayudar a depurar nuestros programas de errores
# que no nos podemos recuperar

# Ejemplo 1. Revisamos si la división es entre 0
def dividir(a, b):
    # Nos aseguramos que el valor de b no es cero para poder continuar
    assert b != 0, 'División entre cero'
    print(f'Resultado división: {a/b}')

# Ejemplo 2. Realizamos el cálculo del promedio de una lista de calificaciones
def obtener_promedio(calificaciones):
    # Si la lista de calificaciones está vacía no debería continuar el programa
    assert len(calificaciones) != 0, 'Lista'


if __name__ == '__main__':
    # Prueba Ejemplo 1. Division entre cero
    dividir(10, 0)

