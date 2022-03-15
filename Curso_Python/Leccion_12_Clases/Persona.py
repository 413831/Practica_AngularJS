class Persona:
    # constructor
    # método double underscore o dunder
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad} años')


# nota: se pueden crear atributos de clase de forma dinamica
Persona.telefono = 143243242

persona1 = Persona('Pepito','Gonzalez',28)
# persona1.mostrar_detalle()
Persona.mostrar_detalle(persona1)
print(persona1.telefono)

persona2 = Persona('Carmen','Sandiego', 45)
# persona2.mostrar_detalle()
Persona.mostrar_detalle(persona2)
print(persona2.telefono)



