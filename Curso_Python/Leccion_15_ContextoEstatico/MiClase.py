class MiClase:
    # Variable estática
    variable_clase = 'Valor variable Clase'

    def __init__(self, variable):
        self.variable_instancia = variable

    # Métodos estáticos
    # No acceden a variables de instancia
    @staticmethod
    def metodoEstatico():
        print(MiClase.variable_clase)


miClase = MiClase('Valor variable instancia')
print(miClase.variable_instancia)
print(miClase.variable_clase)

# Creacion de variable estática en tiempo de ejecución
MiClase.variable_clase2 = 'Valor variable de clase 2'

miClase2 = MiClase('Otro valor de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)
print(miClase2.variable_clase2)
print(MiClase.variable_clase2)

