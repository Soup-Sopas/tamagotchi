# :star2: Proyecto Tamagochi en Java :star2:

Este proyecto consiste en una versión sencilla de un Tamagochi virtual, desarrollado en Java. El programa permite interactuar con tu Tamagochi: alimentarlo, hacerlo jugar, dejarlo dormir y moverse por diferentes lugares.

---

## :bulb: Descripción General

Al ejecutar la aplicación, se te pedirá que asignes un nombre a tu Tamagochi. A partir de ahí, podrás realizar distintas acciones según el lugar en el que te encuentres:

- **Sala**: Jugar, ir a la cocina, ir al dormitorio, ir al patio o salir del juego.
- **Dormitorio**: Dormir, ir a la sala o salir del juego.
- **Cocina**: Dar de comer, ir a la sala o salir.
- **Patio**: Jugar, entrar a la casa, ir a la piscina o salir.
- **Piscina**: Jugar, salir de la piscina o salir del juego.

El estado de tu Tamagochi se rige por tres factores principales:

- **Energía (energy)**
- **Hambre (hunger)**
- **Felicidad (happiness)**

Cada vez que realices acciones como jugar, dormir o comer, se modificarán estos valores. Además, cada cierto número de turnos, el estado del Tamagochi disminuirá para simular el paso del tiempo.

---

## :file_folder: Archivos Principales

### 1. Main.java
- Contiene el método principal (`main`), punto de entrada del programa.
- Solicita el nombre del Tamagochi, instancia las clases `Tamagochi` y `Environment`, y llama al método `game()` para iniciar la interacción por consola.

### 2. Environment.java
- Gestiona el ciclo principal del juego.
- Recibe un objeto de tipo `Tamagochi` y un objeto de tipo `Places` para saber dónde se encuentra el personaje.
- Contiene la lógica para leer las opciones elegidas por el usuario y actualizar el estado del Tamagochi o la ubicación en función de las acciones realizadas.

### 3. Tamagochi.java
- Representa a la mascota virtual.  
- Contiene un objeto de la clase `State`, que gestiona los valores de energía, hambre y felicidad.
- Define métodos para:
  - Jugar con el Tamagochi (`playWithTamagochi`)
  - Hacer que el Tamagochi duerma (`sleepTamaochi`)
  - Alimentar al Tamagochi (`giveFood`)
- Muestra representaciones ASCII para las acciones de comer, dormir, jugar o cuando está cansado.

### 4. State.java
- Administra los valores internos del Tamagochi (energía, hambre, felicidad).
- Provee métodos para mostrar el estado y disminuir estos valores al pasar ciertos turnos.

### 5. Places.java
- Define una matriz de lugares disponibles (Sala, Dormitorio, Cocina, Patio, Piscina).
- Permite moverse de un lugar a otro usando la posición (coordenadas en la matriz).
- Muestra el menú de opciones según el lugar actual.

---

## :wrench Uso Básico

1. **Elige el nombre** para tu Tamagochi.  
2. **Observa el menú de opciones** según el lugar en el que te encuentres (Sala, Dormitorio, Cocina, Patio o Piscina).  
3. **Selecciona la acción** que quieras realizar:
   - **Jugar**  
   - **Dormir**  
   - **Alimentar**  
   - **Moverte de un lugar a otro**  
   - **Salir**  

4. El **estado** de tu Tamagochi (energía, hambre, felicidad)** se muestra continuamente. Debes procurar mantenerlos en niveles adecuados.  
5. **Cada 5 turnos**, los valores de energía, hambre y felicidad disminuirán para simular el paso del tiempo.

## Personalización

- Puedes modificar los valores iniciales de **energía**, **hambre** y **felicidad** en la clase `State`.  
- Puedes cambiar la lógica de movimiento o los lugares en la clase `Places`.  
- Puedes añadir nuevas acciones para el Tamagochi dentro de la clase `Tamagochi`.  

