# BiciPalma

Este proyecto funciona de la siguiente manera:

-Primero de todo, necesitamos una tarjeta de usuario para poder identificar al cliente.
-También es necesario una estación donde se encontrarán todos los anclajes para meter y sacar bicis.
-Y finalmente necesitamos las bicis para que los clientes pueden obtener su servicio.

## Estación

En la estación tendremos un número de anclajes y cada uno de estos anclajes tendrá una posición en un array (usaremos array porque sabemos que el número de anclajes no cambiará).
Cada anclaje podrá tener una bici anclada, en caso de tenerla, y en caso de no tener, será posible anclar una.

## Tarjeta de Usuario

La tarjeta de usuario será la identificación del cliente que querrá anclar o obtener una bici. En caso de no haber bicis, el cliente que quiera obtener una, no le será posible.
Y en el caso de que un cliente quiera anclar una bici y todos los anclajes estén llenos, tampoco le será posible.

## Bicicleta

La única función de las bicicletas es que si están ancladas los clientes puedan llevarselas y al volver a la estación poder anclarla.
