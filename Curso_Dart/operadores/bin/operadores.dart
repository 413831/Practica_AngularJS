import 'package:operadores/operadores.dart' as operadores;

void main(List<String> arguments) {
  // Operadores aritméticos
  int suma = 8 + 9;
  int resta = 15 - 3;
  int multiplicacion = 3 * 6;
  double division = 25 / 3;

  print(suma);
  print(resta);
  print(multiplicacion);
  print(division);

  // Operadores relacionales y de igualdad
  print(2 != 2);
  print(1 == 2);
  print(2 > 3);
  print(2 < 3);
  print(2 <= 3);
  print(2 >= 3);

  // Operadores lógicos
  // AND
  print(2 == 2 && 2 > 3);
  // OR
  print(2 == 2 || 2 > 3);
}
