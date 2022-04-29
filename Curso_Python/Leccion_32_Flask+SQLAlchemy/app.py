from flask import Flask
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

# Configuración de la bd
USER_DB = 'postgres'
PASS_DB = 'admin'
URL_DB = 'localhost'
NAME_DB = 'sap_flask_db'
FULL_URL_DB = f'postgresql://{USER_DB}:{PASS_DB}@{URL_DB}/{NAME_DB}'

app.config['SQLALCHEMY_DATABASE_URI'] = FULL_URL_DB
# Se desactiva el tracking para mejorar performance (opcional)
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

# Inicialización del objeto db de sqlalchemy
db = SQLAlchemy(app)


