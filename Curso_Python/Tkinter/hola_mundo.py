# GUI - Graphical User Interface
# Tkinter - TK Interface
# Importamos el módulo tkinter
import os
import tkinter as tk

# Creamos un objeto usando la clase TK
ventana = tk.Tk()
# Modificamos el tamaño de la ventana (píxeles)
ventana.geometry('600x400')
# Cambiamos el nombre de la ventana
ventana.title('Nueva Ventana')
# Configuramos el ícono de la aplicación
# ventana.iconbitmap('icono.ico')
if "nt" == os.name:
    ventana.wm_iconbitmap(bitmap = "icono.ico")
else:
    ventana.wm_iconbitmap(bitmap = "@icono.xbm")
# Iniciamos la ventana (esta línea la ejecutamos al final)
# Si la ejecutamos antes, no se muestran los cambios anteriores
ventana.mainloop()



