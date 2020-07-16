import 'package:funciones/funciones.dart' as funciones;

void main(List<String> arguments) 
{
  String saludo = saludar('Pepito');

  print(saludo);

  caminar(5);
  saltar();
  print('Usted ha hecho ${atacar()} de daño');
}


/**
 * Funcion que saluda a alguien
 */
String saludar(String nombre)
{
  return "Buenas tardes $nombre";
}

/**
 * Funcion que saluda a alguien
 */
void caminar(int pasos)
{
  print('Se han caminado $pasos pasos');
}

/**
 * Funcion que saluda a alguien
 */
void saltar()
{
  print('Se saltó un poco');
}

/**
 * Funcion que saluda a alguien
 */
int atacar()
{
  return 50;
}

