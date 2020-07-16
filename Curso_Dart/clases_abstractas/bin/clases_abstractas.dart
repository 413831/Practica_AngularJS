import 'package:clases_abstractas/clases_abstractas.dart' as clases_abstractas;

import 'models/Hunter.dart';

void main(List<String> arguments) {
  Hunter player1 = new Hunter();

  try
  {
    player1.shoot();
  }
  catch(e)
  {
    print('Not enough ammo');
  }
}
