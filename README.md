# Librería de Problemáticas Location

Este repositorio contiene el **modelo** en común para el uso a través de los servicios backend de **IPAU**.

## Descripción

Este modelo representa una problemática creada por el usuario utilizando utilizando la aplicación **IPAU**. Esta problemática tendrá los siguiente atributos:
- descripcion: texto que el usuario agrega sobre la problemática
- latitud: latitud de la problemática en el mapa
- longitud: longitud de la problemática en el mapa
- problematica2: referencia a la problemática nivel 2 que el usuario determina
- problematica3: referencia a la problemática nivel 3 que el usuario determina
- cantVecesMarcada: varios usuarios puede localizar la misma problemática más de una vez, por cada vez que sea marcada se incrementa este contador.
- observacionUser: detalle de la problemática

## Uso
Para poder usar esta librería se deberá agregar la siguiente dependencia en el archivo `pom`correspondiente:

```xml
<dependency>
	<groupId>com.app.ipau.problematicalocation</groupId>
	<artifactId>services-ipau-commons-problematica-location</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```