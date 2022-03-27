import psycopg

conexion = psycopg.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    dbname='test_db'
)

print(conexion)
# Se recupera cursor para comandos SQL
cursor = conexion.cursor()
# Objeto para sentencia
sentencia = 'SELECT * FROM personas'
# Se ejecuta QUERY a table
cursor.execute(sentencia)
# Se recuperan los registros de la QUERY
registro = cursor.fetchall()

print(registro)

# Se cierra conexión a base de datos
cursor.close()
conexion.close()

