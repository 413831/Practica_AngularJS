import os

class CatalogoPeliculas:
    ruta_archivo = 'peliculas.txt'

    def __init__(self):
        pass

    @staticmethod
    def agregar_peliculas(Pelicula):
        pass

    @staticmethod
    def listar_peliculas():
        pass

    @staticmethod
    def eliminar():
        os.remove(CatalogoPeliculas.ruta_archivo)
