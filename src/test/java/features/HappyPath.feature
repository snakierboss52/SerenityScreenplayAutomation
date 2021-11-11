#language: es
Característica: crear diferentes ordenes desde Autogestion
  Como usuario quiero crear ordenes con diferentes platos desde Autogestion

   Esquema del escenario:
    Dado El empleado de robinfood se loguee con las credenciales en Autogestion
    Cuando El usuario se loguee con su <numeroTelefono> seleccione su plato y finalice la orden
    Entonces El usuario creo la orden correctamente
    Ejemplos:
     | numeroTelefono |
     | 3005302178     |

