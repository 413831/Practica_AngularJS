import tkinter as tk
from tkinter import ttk, messagebox

# Window
ventana = tk.Tk()
ventana.geometry('300x130')
ventana.title('Login')
ventana.resizable(0,0)

# Configuracion del Grid
ventana.columnconfigure(0,weight=1)
ventana.columnconfigure(1,weight=3)
ventana.rowconfigure(0,weight=1)
ventana.rowconfigure(1,weight=2)
ventana.rowconfigure(2,weight=4)


# Labels
etiqueta_usuario = tk.Label(text='Usuario:')
etiqueta_usuario.grid(row=0,column=0,sticky=tk.E,padx=5, pady= 5)

etiqueta_password = tk.Label(text='Password:')
etiqueta_password.grid(row=1,column=0,sticky=tk.E, padx=5, pady= 5)

# Entries
valor_usuario = tk.StringVar()
input_usuario = ttk.Entry(ventana,width=20, textvariable=valor_usuario)
input_usuario.grid(row=0,column=1, sticky=tk.W, padx=5, pady= 5)

valor_password = tk.StringVar()
input_password = ttk.Entry(ventana,width=20, textvariable=valor_password, show='*')
input_password.grid(row=1,column=1, sticky=tk.W, padx=5, pady= 5)

# Handlers
def iniciar_sesion():
    messagebox.showinfo('Datos Login', f'Usuario: {valor_usuario.get()}, Password: {valor_password.get()}')

# Button
boton_login = ttk.Button(ventana, text='Login', command=iniciar_sesion)
boton_login.grid(row=2, column=0 ,columnspan=2)

# Ejecutar la ventana
ventana.mainloop()