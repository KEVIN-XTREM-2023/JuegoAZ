# Juego A-Z



<center>

<img src="https://cdn.icon-icons.com/icons2/2181/PNG/512/education_school_blocks_building_study_learn_letters_icon_133456.png" alt="VB." width="200">
</center>

Se  basa en implemente una aplicación para jugar “De la A a la Z”. El juego comienza con el registro de los 
jugadores. No se permitirá iniciar el juego sin antes haber registrado el conjunto de jugadores. El juego 
tendrá un apartado de configuración que permitirá indicar si se quiere que el orden de juego sea 
establecido por la aplicación o si se tendrá en cuenta el orden con que se registró a los jugadores y el 
tiempo que tendrá cada jugador para jugar. 
Cuando se da inicio al juego (a través de una opción de la aplicación), se mostrará el nombre del 
jugador a quien le corresponde jugar y la letra del abecedario que corresponda desde la ‘A’ (en la 
primera ocasión en que participe un jugador) hasta la ‘Z’, continuando, si fuera el caso, nuevamente 
por la ‘A’ y así sucesivamente.
Si el usuario no alcanza a ingresar una palabra, el turno pasará automáticamente al próximo jugador, y
el jugador que no pudo ingresar el término quedará fuera del juego. Si el jugador ingresa un término, 
el resto de los jugadores deberá llegar a un acuerdo de si la palabra ingresada es válida o no y uno de 
los “jugadores evaluadores” indicará a la aplicación si la palabra es válida o no. Si se considera que la 
palabra no es válida, el jugador que la introdujo pierde. Caso contrario, se mantiene en el juego. El 
juego termina cuando pierde uno de los dos últimos jugadores participantes. 
En ese momento la aplicación genera, automáticamente, un reporte indicando quién es el ganador del 
juego y el listado de participantes en orden decreciente según el momento en que cada uno de ellos 
salió del juego (quien sale primero quedará al final del listado).

Este sistema fue desarrollado como proyecto de fin de semestre para la materia de Estructura de datos, en la Universidad Técnica de Ambato.

Este proyecto se uso estructuras dinámicas (nodos, pilas, colas, arboles, grafos, listas, vectores, matrices). 

### nodos
    Un nodo es una unidad básica que contiene datos y al menos una referencia o enlace a otro nodo. Los nodos se utilizan para construir diversas estructuras, como listas, árboles y grafos.

### colas
    Una cola es una estructura de datos que sigue el principio FIFO (First In, First Out), lo que significa que el primer elemento en entrar es el primero en salir. Se pueden agregar elementos al final de la cola y eliminarlos del frente.
### arboles
    Un árbol es una estructura de datos jerárquica compuesta por nodos. Cada nodo tiene un valor y cero o más nodos hijos, que a su vez forman subárboles. La parte superior del árbol se llama la raíz, y los nodos sin hijos se llaman hojas.
### grafos
    Un grafo es una colección de nodos (o vértices) y aristas (o arcos) que conectan pares de nodos. Los grafos pueden ser dirigidos (las aristas tienen una dirección) o no dirigidos. Se utilizan para modelar relaciones entre entidades.

### listas
    Una lista es una estructura de datos que almacena elementos en secuencia. Puede ser una lista enlazada, donde cada elemento tiene una referencia al siguiente, o una lista contigua (como un array), donde los elementos están almacenados en ubicaciones de memoria contiguas.


## Software Utilizado
En este proyecto, se utilizó NetBeans IDE, otras opciones de herramientas serian:

- Eclipse para el editor 
- Visual Studio Code para el editor 
- IntelliJ IDEA para el editor 
- Visual Studio para el editor 
- Grafos, mallas en vez de usar nodos y ArrayList

## Lenguaje de Programación
<center>

<img src="https://cdn.icon-icons.com/icons2/2415/PNG/512/java_original_wordmark_logo_icon_146459.png" alt="VB." width="200">
</center>




El sistema fue implementado en Java.



## Version Utilizada
Java la version 8 porque es la mas estable que existe.

## Instalación de Java

1. Descarga de JDK (Java Development Kit):

- Visita la página de descargas de Oracle JDK: Oracle JDK Downloads.
- Selecciona la versión de JDK que deseas descargar. A menudo, se recomienda la versión más reciente. Haz clic en "JDK Download".
2. Acepta los Términos de Uso:

- En la página de descargas, acepta los términos de uso y elige la versión adecuada para tu sistema operativo (Windows, macOS, o Linux).
3. Descarga e Instala:

- Descarga el instalador y ejecútalo.
- Sigue las instrucciones del instalador para completar la instalación. Asegúrate de marcar la opción para agregar el JDK al PATH del sistema.
4. Verifica la Instalación:

- Abre una nueva ventana de terminal o símbolo del sistema.
- Ejecuta el comando java -version y javac -version para verificar que Java se ha instalado correctamente.

## Anexos
### Menu Principal
![Login.](https://github.com/Kevin-Saquinga/ImagenesGit/blob/juegoAz/MENU.png?raw=true)


### Ingreso Jugador
![Login.](https://github.com/Kevin-Saquinga/ImagenesGit/blob/juegoAz/ingresarjugadores.png?raw=true)


### Ejecución  
![Login.](https://github.com/Kevin-Saquinga/ImagenesGit/blob/juegoAz/ejecucion.png?raw=true)
