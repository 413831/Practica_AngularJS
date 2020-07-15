import 'package:variables/variables.dart' as variables;

void main(List<String> arguments) {
  // Var o dynamic, ambas infieren el tipo según el valor pero dynamic puede cambiar de tipo luego
  String leon = 'Leon';
  var elefante = 'Elefante';
  dynamic jirafa = 'Jirafa';

  jirafa = 12345;
  // elefante = 12345; NO se puede

  // Final, se espera la misma asisnación en su ciclo de vida
  final double velocidadJugador = 5.5;

  // Const, valor que no varía
  const double inteligencia = 1.2;

}
