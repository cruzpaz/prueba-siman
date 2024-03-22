# prueba-siman

1-crear una base de datos llamada : apimarvel
2-Descargar el repositorio 
3-Si esta configurado el user y password de mysql , modificar los datos en application.properties para que se conecte a mysql de lo contrario user:root password:""
4-Ejecutar el proyecto, se mapearan las tablas automaticamente
5-Probar en cualquier Herramienta para verificar el funcionamiento de las API, en mi caso utilizo Postman, En el anexo de la documentacion se puede ver en capturas de pantalla.

DESCRIPCION DE ARQUITECTURA


Modelo: En este caso los modelos son utilizados para la representacion de datos , Ejemplo Comics, son utilizados para transferir  datos entre la capa controladora y servicio.

Vista: En este caso no hay vistas en una API REST generalmente los datos son devueltos en formato JSON y son consumidos por el cliente.

Controlador: Aqui se maneja las solicitudes HTTP entrantes y llamada de metodos apropiados en la capa de servicio.

Servicio: Un Ejemplo es ComicsService contiene la logica del negociode la aplicacion. En este caso , se encarga de interactuar con la API de marvel para obtener inforacion de los comics, personajes y series.

Principales Librerias Utilizadas:
1- Spring Boot Stater Web
2- Spring Boot Stater Data JPA
3- MYSQL Connector
4- Lombok
5- Commons Codec
6- JSON
7- Spring Boot DevTools
