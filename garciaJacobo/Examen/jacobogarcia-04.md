# Examen Parcial - jacobogarcia-04

**Usuario GitHub:** jacobogarcia-04
**Fecha:** 4 de noviembre de 2025
**Retos tenidos en cuenta:** Reto 003

---

## Instrucciones

A continuación encontrarás fragmentos de código extraídos de tus entregas. Cada fragmento contiene una o más situaciones relacionadas con los conceptos vistos en clase.

Para cada pregunta debes:
1) Identificar a qué se refiere la observación
2) Explicar si es o no un error y por qué
3) Proponer la corrección

Nota: Responde 5 de las 10 preguntas (en función a lo indicado en el examen).


---

## Pregunta 1

Archivo: `Edificio.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/433ad84a2ebe11953d60c14209466d53e95cad22/entregas/garciaJacobo/reto-003/Edificio.java) (Reto 003)

```java
for (int horas = 0; horas <= 24; horas++) {
    // ...
    System.out.println("Son las " + horas + ":00 del dia " + dia);
}
```

¿Qué observas en este código?
## RESPUESTA

En este codigo estoy viendo un blucle for que depende

(**inicializacion**;**condicion salida**;**incremento**)

La *inicializacion*, declaro una variable de tipo entero inicializada en 0.
La *Condicion de salida*, define que el bucle for se va a ejcutar siempre y cuando la variable *horas* sea menor o igual que 24 
La *incremento*, es como va a ir aumentado el numero de horas, que en este caso va subiendo de un 1 en 1.

Este codigo podria causar dudas por que aunque podria ser intuitivo, podriamos declarar una variable final de tipo entero  de HORA_MINIMA por si queremos luego hacer alguna modificacion, en las horas y no habria que cambiar nada dentro del bucle *for*
`final int HORA_MINIMA = 0;`

Lo mismo habria que hacer con 24, declarariamos una variable final de tipo entero y la inicializamos con 24.
`final int HORA_MAXIMA = 24;`

Con esto el bucle for quedaria 
`for(int horas=HORA_MINIMA;horas<=HORAS_MAXIMA;horas++)`




---

## Pregunta 2

Archivo: `Edificio.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/433ad84a2ebe11953d60c14209466d53e95cad22/entregas/garciaJacobo/reto-003/Edificio.java) (Reto 003)

```java
final String VENTANA_CERRADA = ":[ ]:";
final String VENTANA_LUZ_APAGADA = ":[º]:";
final String VENTANA_LUZ_ENCENDIDA = ":[*]:";
```

¿Qué observas en este código?

## RESPUESTA 

En este codigo vemos declaradas 3 variables finales de tipo *String* como son variable finales significa que no van a cambiar. por eso estan nombradas utilizando el SCREAMING_SNAKE_CASE

---

## Pregunta 3

Archivo: `Edificio.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/433ad84a2ebe11953d60c14209466d53e95cad22/entregas/garciaJacobo/reto-003/Edificio.java) (Reto 003)

```java
System.out.print(
    !persianaAbierta ? VENTANA_CERRADA
                     : luzEncencida ? VENTANA_LUZ_ENCENDIDA : VENTANA_LUZ_APAGADA);
```

¿Qué observas en este código?

## RESPUESTA

En este codigo podemos ver un claro ejemplo del uso de un **OPERADOR TERNARIO**

El operador ternario evalua una condicion y si esa condicion es verdadera imprime una cosa y si es falsa imprime otra. veamos con un ejemplo 

En este caso el **OPERADOR TERNARIO** que esta haciendo 

1 !persianaAbierta esta condicion va a dar un resultado **true/false**, lo que logramos con **!** es mientras que la ventana no este abierta va a imprimir **VENTANA_CERRADA**.

2 si la ventana esta abierta es decir  ` persianaAbierta = Math.random() < PROBABILIDAD_PERSIANA_ABIERTA;` si esta es igual a true que va a hacer el ternario, como utiliza !persianaAbierta (mientras que no este abierta imprimo VENTANA_CERRADA), pero si esta abierta que hace entra en otro ternario y evalua ` luzEncencida = Math.random() < PROBABILIDAD_LUZ_ENCENDIDA;` si esto es =true va a imprimir *VENTANA_LUZ_ENCENDIDA*, pero si es false va a imprimir *VENTANA_LUZ_APAGADA*.

Como hemos visto en clase esto se podria hacer en un if que yo pienso que se entenderia mejor para ello y leo linea por linea

1 declaro una variable string ventana
` string=ventana`
2luego hago 
```
if (!persianaAbierta) {
    ventana = VENTANA_CERRADA;
} else if (luzEncencida) {
    ventana = VENTANA_LUZ_ENCENDIDA;
} else {
    ventana = VENTANA_LUZ_APAGADA;
}

System.out.println(ventana);
```
Con este lo leemos de arriba abajo y yo creo que se entiende mejor 




---

## Pregunta 4

Archivo: `Edificio.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/433ad84a2ebe11953d60c14209466d53e95cad22/entregas/garciaJacobo/reto-003/Edificio.java) (Reto 003)

```java
if (columna == 3) {
    System.out.print(SEPARADOR);
}
// ...
System.out.print("- P" + (PLANTA_MAXIMA + 1 - planta));
```

¿Qué observas en este código?




---

## Pregunta 5

Archivo: `Edificio.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/433ad84a2ebe11953d60c14209466d53e95cad22/entregas/garciaJacobo/reto-003/Edificio.java) (Reto 003)

```java
final String PARTE_DEABJO_DEL_TECHO = "  |    |    |  |####|  |    |    |  ";
final String BORDE_SUPERIOR_TEJADO = "====================================";
// ...
final String BORDE_INFERIOR_3 = " ==================================";
```

¿Qué observas en este código?

---

## Pregunta 6

Archivo: `Reto_002.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/a1c94dab161fa01f72791a65f607892972ee970a/entregas/garciaalonsojacobo/reto-002/Reto_002.java) (Reto 002, líneas 4-10)

```java
int VIDA_GUERRERO = 20;
final int DAÑO_HACHA_GUERRERO = 2;
final double PORCENTAJE_EXITO_GUERRERO = 0.5;

int VIDA_VAMPIRO = 10;
final int DAÑO_MORDIDA_VAMPIRO = 4;
final double PORCENTAJE_EXITO_VAMPRIO = 0.5;
```

**¿Qué errores encuentras en este código?**

## RESPUESTA

En este codigo estamos declarado una variable de tipo entero usando un **SCREAMING_SNAKE_CASE** que es como se nombran las variables finales, haciendola parecer una variable *final*,cuando deberia ser una variable entera que se declara con camelCase entonces deberia ser
` int vidaGuerrero=20`,` int vidaVampiro=10`.

Asi estarian bien nombradas por que luego en el codigo estas variables las vamos a comparar con otras cosas y cuando ves comparar una variable declarada con todo en mayusculas la identificas como final, y una variable final la hacemos que sea constante entonces chocaria a la vista compararlo con otra cosa ya que una variable constante no cambia de estado y siempre va a devolver lo mismo.

---

## Pregunta 7

Archivo: `ClasificacionConductor.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/89993df84aeb49e8207a3ececf2495a405b1d0b2/entregas/garciaalonsojacobo/ejercicios/ClasificacionConductor.java) (Ejercicios, líneas 19-25)

```java
if (edadDelusuario < MENOR_EDAD) {
    System.out.println("Eres menor de edad, " + DENEGADO);
}

if (edadDelusuario >= MENOR_EDAD) {
    if (licenciaConducir == false) {
        System.out.println("No tienes licencia," + DENEGADO);
    }
```

**¿Cómo mejorarías este código?**

---

## Pregunta 8

Archivo: `ClasificacionEdad.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/89993df84aeb49e8207a3ececf2495a405b1d0b2/entregas/garciaalonsojacobo/ejercicios/ClasificacionEdad.java) (Ejercicios, línea 7)

```java
final int PRIERA_INFANCIA = 5;
```

**Identifica y corrige todos los errores en esta línea.**

---

## Pregunta 9

Archivo: `AdivinadorNumeros.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/89993df84aeb49e8207a3ececf2495a405b1d0b2/entregas/garciaalonsojacobo/ejercicios/AdivinadorNumeros.java) (Ejercicios, línea 8)

```java
final int NUMERO_MAXIMO = 100;
final int NUMERO_MINIMO = 1;
Scanner Scanner = new Scanner(System.in);
int numeroPensado = (int) (Math.random() * NUMERO_MAXIMO) + 1;
```

¿Qué observas en este código?

---

## Pregunta 10

Archivo: `CambioDeDinero.java` — [Ver archivo](https://github.com/mmasias/25-26-PRG1/blob/beaba11f535242049bae0eba9f6e0f7348a868bf/entregas/GarciaAlonsoJacobo/reto-001/CambioDeDinero.java) (Reto 001, fragmento)

```java
int cambio = montoEntregado - montoApagar;
int nuevoCambio;

int cantidad = cambio / billete_100;
nuevoCambio = cambio % billete_100;

cantidad = nuevoCambio / billete_50;
nuevoCambio = nuevoCambio % billete_50;

cantidad = nuevoCambio / billete_20;
nuevoCambio = nuevoCambio % billete_20;
```

**Analiza este código:**

a) ¿Qué problema encuentras con las variables?

Las variables  *billete_100*,**billete_50*,*billete_20*deberian ser finales y deberian estar nombradas como BILLETE_100 es decir nombrando con el SCREAMING_SNAKE_CASE ya que siempre van a ser las mismas.

b) Reescribe el fragmento mejorándolo.
int cambio = montoEntregado - montoApagar;
int nuevoCambio;

int cantidad = cambio / BILLETE_100;
nuevoCambio = cambio % BILLETE_100;

cantidad = nuevoCambio / BILLETE_50;
nuevoCambio = nuevoCambio % BILLETE_50;

cantidad = nuevoCambio / BILLETE_20;
nuevoCambio = nuevoCambio % BILLETE_20;
```

c) ¿Cómo nombrarías mejor la variable que representa lo que queda por devolver?

La nombraria como cambioRestante. utilizando un camelCase por que es una variable que va a ir variando 


