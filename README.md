# Bowling Game Kata

## Introducción

Una partida de bolos (*Bowling Game*) consta de 10 turnos (*Frames*).

En cada turno el jugador tiene dos oportunidades para derribar 10 bolos (*pins*), es decir, puede realizar un
máximo de dos lanzamientos.

La puntuación (*Score*) del turno se calcula sumando el número de bolos derribados durante el turno (un punto 
por bolo) con los bonus correspondientes por plenos y semiplenos.

Se produce un pleno (*Strike*) cuando el jugador derriba todos los bolos en el primer intento de un turno. El
bonus de un pleno es la suma de los bolos derribados en los dos lanzamientos siguientes.

Se produce un semipleno (*Spare*) cuando el jugador derriba en su segundo lanzamiento todos los bolos que 
seguían en pie tras el primero. El bonus de un semipleno es el número de bolos derribados en el siguiente
lanzamiento.

En el turno 10 se puede lanzar un tercer lanzamiento si se produce un pleno o un semipleno.

## Ejemplo de puntuación

| Turno | Lanzamientos | Puntuación |
|-------|--------------|------------|
| 1     | 1, 4         | 5          |
| 2     | 4, 5         | 14         |
| 3     | 6, 4         | 29         |
| 4     | 5, 5         | 49         |
| 5     | 10           | 60         |
| 6     | 0, 1         | 61         |
| 7     | 7, 3         | 77         |
| 8     | 6, 4         | 97         |
| 9     | 10           | 117        |
| 10    | 2, 8, 6      | 133        |

## Requisitos

Escribir una clase `Game` que tenga dos métodos:

* `roll(pins : int)` que se invoca cada vez que se derriban bolos. Recibe como parámetro el número de bolos
  derribados en el lanzamiento.
* `score() : int` que devuelve la puntuación total de la partida.
