import 'package:hello_world/hello_world.dart' as hello_world;

void main(List<String> arguments) 
{
  int primerNumero = 10;
  double segundoNumero = 5.75;
  String texto = 
  """
Esto es un texto
Tiene los saltos de linea
automaticos
Fin
  """;
  List<String> coches= new List();

  coches.add("Mercedes Benz");
  coches.add("Ferrari");
  coches.add("Audi");
  coches.add("Porsche");

  print(segundoNumero + primerNumero);
  print(texto);

  // LISTA //
  // Añadir elemento a la lista
  coches.add("Vento");
  // Eliminar elemento de la lista
  coches.remove("Ferrari");
  // Editar elemento
  coches[coches.indexOf("Porsche")] = "Tesla";
  // Mostrar elementos de la lista
  coches.forEach((coche)=> print('Indice: ${coches.indexOf(coche)} valor: $coche'));
  // Obtener tamaño de la lista
  print('El tamaño de la lista es: ${coches.length}');
  // Validar si existe elemento en la lista
  print(coches.contains("Tesla"));

  // MAPS //
  Map map = {
    1: 'mi valor',
    2: 'otro valor',
    3: 'final'
  };

  Map map2 = new Map();
  map2[1] = 'Primer valor';
  map2[2] = 'Segundo valor';
  map2[3] = 'Tercer valor';

    
}
