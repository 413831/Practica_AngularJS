from flask import Flask, request, render_template

app = Flask(__name__)

# ** NOTAS DE CONFIGURACIÓN **
# export FLASK_APP=app.py
# export FLASK_EVN=development
# nota: en Windows se reemplaza export por set

# http://localhost:5000/
@app.route('/')
def inicio():
    app.logger.info(f'Entramos al path {request.path}')
    return 'Hola Mundo desde Flask'

@app.route('/saludar/<nombre>')
def saludar(nombre):
    return f'Saludos {nombre.upper()}'

@app.route('/edad/<int:edad>')
def mostrar_edad(edad):
    return f'Tu edad es: {edad + 5}'

@app.route('/mostrar/<nombre>', methods=['GET','POST'])
def mostrar_nombre(nombre):
    return render_template('mostrar.html', nombre=nombre)

