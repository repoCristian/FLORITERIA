#language:es
Característica: cart

  Antecedentes:
    Dado que el usuario abre un sitio web

  #Esquema del escenario: este adiciona dos productos al carrito
   # Cuando el adiciona productos al carrito
    #  | primerProducto   | segundoProducto   |
     # | <primerProducto> | <segundoProducto> |
    #Entonces el deberia ver los productos


    #Ejemplos:
     # | primerProducto | segundoProducto |
      #| MDF 0001       | MDF 00010       |

   # Escenario: adiciona y borra un producto del carrito
    #Cuando el adiciona un producto de cumpleanios para eliminarlo
    #Entonces el deberia ver el carrito vacio

  Escenario: adiciona el ultimo producto del carrito
  Cuando el adiciona el ultimo producto de nuevos productos
  Entonces el deberia ver un producto en el carrito