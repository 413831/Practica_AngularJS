import 'Player.dart';

class Hunter extends Player
{
  int ammo;

  shoot()
  {
    this.ammo--;
  }

  reload(int ammo)
  {
    this.ammo += ammo;
  }
}