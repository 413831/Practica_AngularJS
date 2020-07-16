import 'package:clases/clases.dart' as clases;
import 'models/product.dart';

void main(List<String> arguments) {
  // Objeto -> clase
  // Inicialización de nuestro objeto
  // Product salchichas = new Product();
  // salchichas.name = "Salchiwenas";
  // salchichas.description = "Salchichas precocidas";
  // salchichas.price = 15;

  Product salchichas = new Product("Salchiwenas", "Salchichas precocidas", 15);
  Product cereales = new Product("Smarties", "Cereales azucarados", 30);
  Product leche = new Product("Milky", "Leche pasteurizada", 10);

  List<Product> lista = [salchichas, cereales, leche];
  lista.forEach( (product) => {
    print("name: ${product.name} - description: ${product.description} - price: ${product.price}")
  });


}
