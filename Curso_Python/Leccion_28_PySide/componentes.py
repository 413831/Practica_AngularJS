from PySide6.QtCore import Qt
from PySide6.QtGui import QPixmap
from PySide6.QtWidgets import QMainWindow, QLabel, QApplication, QCheckBox, QComboBox


class Componentes(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Componentes')
        # self.setFixedSize(500, 600)

        # Creamos un nuevo combo box (drop down list)
        combobox = QComboBox()
        # Agregamos elementos
        combobox.addItem('Uno')
        combobox.addItems(['Dos','Tres'])
        # Monitoreamos el cambio de elemento seleccionado, tanto de índice como de texto
        combobox.currentIndexChanged.connect(self.cambio_indice)
        combobox.currentTextChanged.connect(self.cambio_texto)

        self.setCentralWidget(combobox)


        # Creamos un nuevo checkbox
        # checkbox = QCheckBox('Este es un checkbox')
        # # Activamos el tercer estado
        # # Tenemos 3 estados (0-Apagado, 1-Sin estado, 2-Seleccionado)
        # checkbox.setTristate(True)
        #
        # # Conectar la señal de cambio de componente
        # checkbox.stateChanged.connect(self.mostrar_estado)
        # # Publicamos este componentes
        # self.setCentralWidget(checkbox)


        # Creamos un componente de tipo etiqueta (Label)
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

    def cambio_indice(self, nuevo_indice):
        print(f'Nuevo índice seleccionado: {nuevo_indice}')


    def cambio_texto(self, nuevo_texto):
        print(f'Nuevo texto: {nuevo_texto}')


if __name__ == '__main__':
    app = QApplication()
    ventana = Componentes()
    ventana.show()
    app.exec()