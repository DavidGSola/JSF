JSF
===

Simulador básico de un vehículo utilizando Java Server Faces desarrollado para las prácticas de la asignatura DSBCS del Máster de Ingeniería Informática de la Universidad de Granada.

## Proyecto
El proyecto tiene dos partes:

1. Una interfaz Java desarrollada con JavaSwing que lanza una petición a través de una serie de filtros (siguiendo el patrón de diseño Interceptor). Finalmente, el último filtro abre en un navegador web la URL donde se encuentre el componente de JSF desplegado.
2. Un componente desarrollado con JSF. Es un simulador muy básico de un coche con dos botones: encender/apagar y acelerar. Gracias a JSF se puede manipular la página HTML modificando algunas aspectos visuales del componente.
