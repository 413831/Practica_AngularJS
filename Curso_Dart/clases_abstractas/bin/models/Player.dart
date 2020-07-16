import 'Character.dart';
import 'IPlayable.dart';

class Player extends Character implements IPlayable
{
  @override
  void damage() {
    // TODO: implement damage
  }

  @override
  void atacar() {
    print('El personaje ataca ${this.attackDamage}');
  }

  @override
  void mover() {
    print('El personaje camina un paso');
  }

  @override
  void saltar() {
    print('El personaje salta');
  }
  
}