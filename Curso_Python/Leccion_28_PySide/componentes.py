from PySide6.QtCore import Qt
from PySide6.QtGui import QPixmap
from PySide6.QtWidgets import QMainWindow, QLabel, QApplication, QCheckBox, QComboBox, QListWidget


class Componentes(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Componentes')
        # self.setFixedSize(500, 600)

        # ** Componente QListWidget se parece al combobox
        lista = QListWidget()
        # Agregamos elementos
        lista.addItem('Uno')
        lista.addItems(['Dos','Tres'])
        # Monitoreamos el cambio del elemento seleccionado, tanto el elemento con el texto
        lista.currentItemChanged.connect(self.cambio_elemento)
        lista.currentTextChanged.connect(self.cambio_texto)

        # Publicamos este componente
        self.setCentralWidget(lista)

        # ** Creamos un nuevo combo box (drop down list) **
        # combobox = QComboBox()
        # # Agregamos elementos
        # combobox.addItem('Uno')
        # combobox.addItems(['Dos','Tres'])
        # # ** Monitoreamos el cambio de elemento seleccionado, tanto de índice como de texto **
        # combobox.currentIndexChanged.connect(self.cambio_indice)
        # combobox.currentTextChanged.connect(self.cambio_texto)
        # # Hacemos editable el combobox
        # combobox.setEditable(True)

        # ** Especificamos la política de inserción **
        # No permite agregar nuevos elementos
        # combobox.setInsertPolicy(QComboBox.NoInsert)
        # Agregar al inicio de nuestro combobox
        # combobox.setInsertPolicy(QComboBox.InsertAtTop)
        # Modifica el elemento actual
        # combobox.setInsertPolicy(QComboBox.InsertAtCurrent)
        # Insertar al final
        # combobox.setInsertPolicy(QComboBox.InsertAtBottom)
        # Insertar antes del elemento actual
        # combobox.setInsertPolicy(QComboBox.InsertBeforeCurrent)
        # Insertar despues del elemento actual
        # combobox.setInsertPolicy(QComboBox.InsertAfterCurrent)
        # Insertar alfabeticamente
        # combobox.setInsertPolicy(QComboBox.InsertAlphabetically)

        # Limitamos cuantos elementos agregamos al combobox
        # combobox.setMaxCount(6)

        # Publicamos este componente
        # self.setCentralWidget(combobox)


        # ** Creamos un nuevo checkbox **
        # checkbox = QCheckBox('Este es un checkbox')
        # # Activamos el tercer estado
        # # Tenemos 3 estados (0-Apagado, 1-Sin estado, 2-Seleccionado)
        # checkbox.setTristate(True)
        #
        # # Conectar la señal de cambio de componente
        # checkbox.stateChanged.connect(self.mostrar_estado)
        # # Publicamos este componentes
        # self.setCentralWidget(checkbox)


        # ** Creamos un componente de tipo etiqueta (Label) **
        # etiqueta = QLabel('Hola')
        # etiqueta.setPixmap(QPixmap('layla.jpg'))
        # etiqueta.setScaledContents(True)

        # Modificamos el valor inicial
        # etiqueta.setText('Saludos')
        # Modificamos la fuente
        # fuente = etiqueta.font()
        # fuente.setPointSize(25)
        # etiqueta.setFont(fuente)
        # # Modificar la alineación de la etiqueta
        # # etiqueta.setAlignment(Qt.AlignCenter)
        # etiqueta.setAlignment(Qt.AlignHCenter | Qt.AlignVCenter)

        # Publicamos este componente
        # self.setCentralWidget(etiqueta)

    def mostrar_estado(self, estado):
        print('Estado checkbox:',estado)
        # Trabajamos con las constantes
        if estado == Qt.Checked:
            print('Checkbox encendido')
        elif estado == Qt.PartiallyChecked:
            print('Checkbox sin estado o parcialmente seleccionado')
        elif estado == Qt.Unchecked:
            print('Checkbox apagado')
        else:
            print('Checkbox con estado inválido')


    def cambio_elemento(self, nuevo_elemento):
        print(f'Nuevo elemento seleccionado: {nuevo_elemento.text()}')

    def cambio_indice(self, nuevo_indice):
        print(f'Nuevo índice seleccionado: {nuevo_indice}')

    def cambio_texto(self, nuevo_texto):
        print(f'Nuevo texto: {nuevo_texto}')


if __name__ == '__main__':
    app = QApplication()
    ventana = Componentes()
    ventana.show()
    app.exec()