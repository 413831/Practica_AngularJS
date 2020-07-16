import 'package:sentencias/sentencias.dart' as sentencias;
import 'dart:io';
import 'dart:convert';

void main(List<String> arguments) 
{
  int playerLife = 100;
  final totalLife = 100;
  final enemyAttack = 50;

  playerLife -= enemyAttack;

  // IF
  print('---------------------');
  if(playerLife <= 0)
  {
    print('Ha muerto');
  }  
  else if(playerLife < totalLife && playerLife > 0)
  {
    print('Ha sido herido: le queda $playerLife');
  }
  else
  {
    print('No ha sido herido');
  }

  // SWITCH
  print('---------------------');
  var productoElegido = 'Hamburguesa simple';

  switch(productoElegido)
  {
    case 'Hamburguesa simple':
      print('Se envía pedido de Hamburguesa simple');
      break;
    case 'Hamburguesa doble':
      print('Se envía pedido de Hamburguesa doble');
      break;
    case 'Hamburguesa completa':
      print('Se envía pedido de Hamburguesa completa');
      break;
    case 'Hamburguesa super':
      print('Se envía pedido de Hamburguesa super');
      break;
    case 'Hamburguesa pollo':
      print('Se envía pedido de Hamburguesa pollo');
      break;
    
  }

  // FOR
  print('---------------------');
  var listaDeCompras = ['cerveza','snacks','yogurt','cereales'];

  for(var producto in listaDeCompras)
  {
    print(producto);
  }

  // WHILE
  print('---------------------');
  var numero = 0;

  while(numero < listaDeCompras.length)
  {
    print(listaDeCompras[numero]);
    numero++;
  }

  // ASSERT 
  // Levanta una excepción en el caso de que no se cumpla la condicion del assert
  print('---------------------');
  var texto = "";
  assert(texto != null);
  
  

}
