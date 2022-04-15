import tkinter as tk
from tkinter import ttk

ventana = tk.Tk()
ventana.geometry('600x400')
ventana.title('Componentes')

# show -> configura el caracter a mostrar por cada caracter
# state -> configura el estado del input
# width -> es la cantidad de caracteres que ocupa la caja de texto
# justify -> alinceación horizontal del texto

# Definimos una variable que podremos modificar posteriormente (set), leer (get)
entrada_var1 = tk.StringVar(value='Valor por default')
entrada1 = ttk.Entry(ventana,width=30, textvariable=entrada_var1)
entrada1.grid(row=0,column=0)
# insert agrega un texto por defecto
# entrada1.insert(0, 'Introduce una cadena')
# entrada1.insert(tk.END, '.')
# entrada1.config(state='readonly')


# Label - Etiqueta
etiqueta1 = tk.Label(ventana, text='Aqui se mostrará el contenido de la caja de texto')
etiqueta1.grid(row=1, column=0, columnspan=2)

# Handler del botón
def enviar():
    # Recuperamos la información a partir de la variable asociada con la caja de texto
    boton1.config(text=entrada_var1.get())
    # Modificación utilizamos la variable de texto y el método set
    entrada_var1.set('Ingrese un texto')
    # Modificamos el texto de lalbel
    etiqueta1.config(text=entrada_var1.get())

    # print(entrada1.get())
    # boton1.config(text=entrada1.get())
    # Eliminar el contenido
    # entrada1.delete(0, tk.END)
    # Seleccionar el texto de la caja
    # entrada1.select_range(0, tk.END)
    # Para hacer efectiva la selección del texto
    # entrada1.focus()


# Creamos un botón
boton1 = ttk.Button(ventana, text='Enviar', command=enviar)
boton1.grid(row=0,column=1)


ventana.mainloop()