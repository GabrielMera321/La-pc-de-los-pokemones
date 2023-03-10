# La-pc-de-los-pokemones

![image](https://user-images.githubusercontent.com/105569564/223562895-d5e3dfbd-7889-4703-bc38-dea32dcb1e1e.png)

## ¡Bienvenidos!
Este proyecto consiste en el desarrollo de un aplicativo en Java que emula el sistema de almacenamiento de Pokémon de un entrenador. Este sistema permite que el entrenador pueda almacenar hasta 6 Pokémon en su bolsillo y el resto de sus Pokémon en una PC con 3 cajas diferentes. El entrenador puede transferir sus Pokémon entre el bolsillo y la PC, así como también capturar nuevos Pokémon y liberar a los que ya tiene. Todo esto ha sido solicitado por el gran profesor oak.

![image](https://user-images.githubusercontent.com/105569564/223566421-558b9c66-1d98-4edb-a3e2-18c1589fa719.png)


## Requerimientos

- Un aplicativo cliente el cual hara las veces del almacenamiento del entrenador, con un maximo de 6 pokemons, puede inciar con los 6 o puede iniciar con ninguno

- El entrenador puede conectarse a su pc (servidor) y transferir criaturas entre su almacenamiento y el pc, y seleccionar en que caja desea guardarlos.

- La pc no tiene interfaz grafica, todo se muestra en GUI del cliente, pero ambos sistemas si pueden tener consola para registro de errores y depuración del sistema

- La pc debe poder recibir hasta 4 conexiones diferentes simultaneas, sin que estas se choquen entre si.

- Los datos de los pokemon son sus estadisticas base, un mote, su nivel, y 4 ataques aleatorios, por facilidad del ejercicio, no tienen que ser necesariamente del mismo tipo que el pokemon.

- El uso de sockets, hilos, y versionamiento de codigo es obligatorio.

- El entrenador puede capturar un nuevo pokemon, es decir puede digitar la información de un pokemon X nuevo y guardarlo en su bolsito si tiene espacio o en el pc si no lo tiene.

- El entrenador puede solicitar la liberación de una de sus criaturas, lo que hara que desaparesca de todos los sistemas.

- OPCIONAL GUI amigable e intuitiva con el usuario, control de excepciones para cada posible situación anomala.

## Instalación

1. Clonar el repositorio a su máquina local utilizando el comando: 

    git clone https://github.com/nombre-usuario/repo.git

2. Abrir Eclipse e importar el proyecto como un proyecto Maven existente.

![image](https://user-images.githubusercontent.com/105569564/223564633-f78dd4ab-a4b9-4fa3-afc2-a51e5fbfb89f.png)

3. Configurar los puertos de conexión en el archivo config.properties en ambos proyectos (cliente y servidor).
4. Ejecutar el servidor primero, utilizando la clase ServerMain.
5. Ejecutar uno o más clientes utilizando la clase ClientMain.
6. Utilizar la interfaz de usuario para interactuar con el sistema de almacenamiento de Pokemon.

# Uso
Una vez que se haya iniciado el cliente y el servidor, se puede comenzar a utilizar el aplicativo. La interfaz de usuario es amigable e intuitiva, lo que facilita la navegación del usuario.

El entrenador puede almacenar hasta 6 Pokémon en su bolsillo y el resto en la PC, que tiene 3 cajas diferentes. El entrenador puede transferir sus Pokémon entre el bolsillo y la PC y seleccionar en qué caja guardarlos. También puede capturar nuevos Pokémon y liberar a los que ya tiene.

Los datos de los Pokémon son sus estadísticas base, un mote, su nivel y 4 ataques aleatorios.

El aplicativo permite hasta 4 conexiones diferentes simultáneas, sin que estas se choquen entre sí.

# Licencia 

La licencia que esta utilizando este proyecto es la GNU General Public License v3.0

# Autores
Este proyecto ha sido desarrollado por el equipo de ingenieros de sistemas de la universidad el bosque:

- #### Gabriel Mera
- #### Juan Felipe Valero
- #### Santiago Reina

# Tecnologías utilizadas

Este proyecto ha sido desarrollado utilizando las siguientes tecnologías:

- Java
- Eclipse
- Git hub

# Diagrama de clases
![image](C:\Users\Santiago Reina\Downloads\Diagrama en blanco (3).png)

# Javadoc
Se ha generado el Javadoc completo del proyecto, que puede ser accedido desde el archivo index.html en la carpeta javadoc.

## Contacto
Si tiene alguna pregunta o problema con el aplicativo, por favor, contáctenos a través del correo electrónico gmera@unbosque.edu.co, sreinap@unbosque.edu.co

## ¡Gracias por utilizar nuestro aplicativo!

![image](https://user-images.githubusercontent.com/105569564/223567149-c7edb9d2-ecf2-4296-af61-22dc76ba784f.png)

