- [Folder Structure](#folder-structure)
  - [Packages in `src`](#packages-in-src)
- [Funktionale Programmierung](#funktionale-programmierung)
  - [Anonyme Klassen](#anonyme-klassen)
  - [Lambda Ausdrücke](#lambda-ausdrücke)
  - [Generics](#generics)
  - [Vordefinierte Funktionen](#vordefinierte-funktionen)
  - [Streams](#streams)
  - [HashMap, Map](#hashmap-map)
  - [Rekursion](#rekursion)

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### Packages in `src`

- `lambda`: Lambda Audrücke und Anonyme Klasen
- `generika`: Generics
- `vordefiniert`: Vordefinierte Funktionen
- `kapitel3`: Rekursion u. HashMap bzw. Map
- `rekursion`: Rekursion Teil 2
- `stroeme`: Streams
- `kapitel7`: Streams Teil 2
- `s163`: Widgets und Streams Teil 3
  - Aufgabe A-F in `FamilienFerien.java`
- `pruefung_t1`: Prüfung Teil 1
- `schlusstest`: Schlussprüfung

## Funktionale Programmierung
Funktionale Programmierung ist ein Programmierparadigma, bei dem der Fokus auf der Verwendung von Funktionen liegt, die als Grundbausteine zur Problemlösung dienen.  
Im Gegensatz zu imperativen Programmierparadigmen, bei denen Anweisungen ausgeführt werden, um den Zustand des Programms zu ändern, werden bei der funktionalen Programmierung Funktionen genutzt, um Daten zu transformieren und zu manipulieren.  
Typische Merkmale der funktionalen Programmierung sind die Verwendung von Funktionen als First-Class-Objekte, die Vermeidung von Seiteneffekten und die Immutabilität (Unveränderbarkeit) von Daten.  
Keine Seiteneffekte bei Methoden und Rechnungsresultate sollen nicht in Variablen gespeichert werden sondern jedes mal neu gerechnet.

### Anonyme Klassen

Anonyme Klassen überschreiben ein Funktionales Interface/Schnittstelle (muss eine Methode haben).  
In der anonymen Klasse gibt man die Logik an.

### Lambda Ausdrücke

Lambda Ausdrücke sind kurz gesagt eine vereinfachte Form von anonymen Klassen. Sie verwenden auch ein Funktionales Interface. Der Syntax ist jedoch um einiges einfacher/verständlicher.

### Generics

Auch in Java leitet jeder Datentyp von einem Objekt ab. Generelle Datentypen bei welchen der Datentyp erst bei Deklaration definiert wird. Nach Konvention wird Generic mit T und R angegeben.

### Vordefinierte Funktionen

In Java gibt es auch einige vordefinierte Funktionen, welche verwendet werden können, indem man sie mit einem Lambda Ausdruck überschreibt. Hier gibt es einige Funktionen wie:  
- `Function` (DoubleFunction) - Rückgabewerte und Eingabewert - apply Methode
- `Consumer` - Nimmt nur Eingabewert kein Rückgabewert - accept Methode
- `Supplier` - Gibt Rückgabewert aus - get Methode
- `Operator` (Generic: BinaryOperator, Real: DoubleBinaryOperator/StringOperator) - Nimmt mehrere Eingabewerte an und gibt Rückgabewert - apply Methode
- `Predicate` - Nimmt Eingabewert an und Boolean zurück, wird meistens für Filtering verwendet z.B. Kontrolliere ob String mit A anfängt - test Methode

Bei den meisten vordefinierten Java Funktionen können wir entweder einen spezifischen Datentyp oder einen Generic angeben.

### Streams

Wird verwendet, um Listen und Arrays auszulesen, auszufiltern und zu formatieren. Mit Streams können wir zum Beispiel sagen, dass wir nur die Einträge aus einer Liste wollen, wo der Name mit A anfängt, und dass wir diese sortiert nach Namen und mit nur Namen ausgeben wollen.  
Dies können wir alles in einem Befehl tun. Streams sind ähnlich wie LINQ Befehle in C#. Streams können wir auch gut mit anderen Funktionen verbinden, wie z.B. Predicate.  
Hier könnten wir in dem Predicate eine Bedingung aufstellen (z.B. Name muss mit M anfangen) und dann mit einem Stream jeden Namen aus einer Liste ausgeben, der mit M anfängt.

### HashMap, Map

In Java gibt es auch sogenannte HashMaps, in Java Map genannt.  
Diese Maps haben immer zwei Felder, die aus verschiedenen Datentypen oder auch Generics bestehen. Das erste Feld repräsentiert immer den Index.  
Das heisst, der Wert im Index muss immer eindeutig sein. Wenn wir versuchen, in eine Map nochmals einen Wert mit dem gleichen Index zu überschreiben, wird der erste Eintrag überschrieben.  
Hashmaps sind sogenannte `Key-Value` Speicherorte. Wie schon erwähnt, ist das erste Feld der Key und das zweite repräsentiert den Value. Als Beispiel für eine Map habe ich ein Programm namens `Primzahl2` im Package kapitel3, wo wir Primzahlen in einer Map speichern.  
Maps gibt es auch in C# unter dem Namen `Dictionary`. HashMaps haben auch keine feste Reihenfolge der Elemente.

### Rekursion

Die Rekursion in der Programmierung ist ein Konzept, wobei sich eine Methode immer wieder selbst aufruft, um etwas wie eine Berechnung durchzuführen.
