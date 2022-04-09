# Profundizando en Set
# Un set es una colección de elementos únicos y es mutable
# Los elementos de un set deben ser inmutables
conjunto = {'Juan','True',2,18.0}

# set vacío correcto
conjunto = set()

# Mutable
conjunto.add('Juan')
print(conjunto)

# Contiene valores únicos
conjunto.add('Juan')
print(conjunto)

# Crear un set a partir de un iterable
conjunto = set([4,5,7,8,4])
print(conjunto)

# Podemos agregar más elementos o incluso otro set
conjunto2 = {100,200,300,300}
conjunto.update(conjunto2)
print(conjunto)
conjunto.update([20,30,40,40])
print(conjunto)

# Copiar un set (copia poco profunda, solo se copian las referencias)
conjunto_copia = conjunto.copy()
print(conjunto_copia)
# Verificar igualdad
print(f'Es igual en contenido? {conjunto == conjunto_copia}')
print(f'Es la misma referencia? {conjunto is conjunto_copia}')

# Operaciones de conjuntos con set :)
# Personas con distintas características
pelo_negro = {'Juan','Karla','Pepito','Maria'}
pelo_rubio = {'Kevin','Laura','Marcos'}
ojos_cafe = {'Karla','Laura','Juan'}
menores_30 = {'Juan','Karla','Maria'}

# Todos los elementos con ojos color cafe y pelo rubio (Union)
print(ojos_cafe.union(pelo_rubio))
# Invertir el orden con el mismo resultado (conmutativa)
print(pelo_rubio.union(ojos_cafe))






