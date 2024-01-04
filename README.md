# APRENDIZAJE AUTOMÁTICO: Resultados partidos de futbol LaLiga
Ángel Castillo Ortega

### EJECUCIÓN

1. Creación del archivo .jar

```SHELL
make jar
```
2. Ejecucuón del archivo .jar

```shell
java -jar aprendizaje.jar 
```

### Realizacion del ejercicio

-Descarga del data.set (.csv) en: *[https://www.kaggle.com/datasets](https://www.kaggle.com/datasets)*.

-Personalización de los datos del fichero con los más relevantes para realizar el aprendizaje de la Inteligencia Artificial.

-Introducción de un nuevo fichero dentro de la aplicación WEKA y obtención del fichero .arff que necesita el código para su funcionamiento.

-Creación del modelo desde WEKA ,el más preciso J48(ID3) para este aprendizaje.

-Creación de un fichero .arff para realizar el test y buscar el pronostico de resultados de los  partidos con los equipos y goles en primeras partes de los encuentros.

Realizaremos el aprendizaje cogiendo dátos de partidas de la primera división de futbol español sobre quien gana la partida conociendo los goles en las primeras partes de los dos equipos que componen el encuentro, y el programa nos dará la estimación mas aproximada posible sobre cual es el resultado final esperado.

- [ ] Equipo Local
- [ ] Equipo Visitante
- [ ] Goles en primera parte del equipo local
- [ ] Goles en primera parte del equipo visitante
- [ ] Resultado final del encuentro

En el archivo test actual se encuentra un pronostico de que pasará en un Barsa-Madrid donde el resultado de la primera parte es: {(0,0),(1,0),(2,0)}

Dentro de weka los datos quedarían así para realizar las diferentes comprobaciones:

```shell

=== Run information ===

Scheme:       weka.classifiers.trees.J48 -C 0.25 -M 2
Relation:     LaLiga-Matches-csv
Instances:    10883
Attributes:   5
              HomeTeam
              AwayTeam
              HTHG
              HTAG
              FTR
Test mode:    10-fold cross-validation
```

## SOLUCIONES DISTINTOS ALGORITMOS


#### J48 (ID30)

```shell

J48 pruned tree
------------------

HTHG <= 0
|   HTAG <= 0
|   |   AwayTeam = Valencia: H (173.0/113.0)
|   |   AwayTeam = Albacete: H (19.0/8.0)
|   |   AwayTeam = Santander: D (95.0/49.0)
|   |   AwayTeam = Sociedad: D (146.0/91.0)
|   |   AwayTeam = Compostela: A (19.0/11.0)
|   |   AwayTeam = Salamanca: H (22.0/6.0)
|   |   AwayTeam = Betis: D (164.31/98.31)
|   |   AwayTeam = Tenerife: H (34.0/17.0)
|   |   AwayTeam = Barcelona: A (138.0/79.0)
|   |   AwayTeam = Real Madrid: A (145.0/77.0)
|   |   AwayTeam = Oviedo: D (32.0/17.0)
|   |   AwayTeam = Sevilla
|   |   |   HomeTeam = La Coruna: A (4.0/2.0)
|   |   |   HomeTeam = Sp Gijon: H (1.0)
|   |   |   HomeTeam = Ath Bilbao: H (7.0/4.0)
|   |   |   HomeTeam = Ath Madrid: D (4.0/2.0)
|   |   |   HomeTeam = Celta: H (7.0/4.0)
|   |   |   HomeTeam = Espanol: H (7.0/4.0)
|   |   |   HomeTeam = Merida: H (0.0)
|   |   |   HomeTeam = Sevilla: H (0.0)
|   |   |   HomeTeam = Valladolid: A (6.0/3.0)
|   |   |   HomeTeam = Vallecano: D (6.0/3.0)
|   |   |   HomeTeam = Zaragoza: A (4.0/2.0)
|   |   |   HomeTeam = Albacete: H (0.0)
|   |   |   HomeTeam = Barcelona: H (8.0/1.0)
|   |   |   HomeTeam = Betis: D (9.0/3.0)
|   |   |   HomeTeam = Real Madrid: H (3.0)
|   |   |   HomeTeam = Compostela: D (1.0)
|   |   |   HomeTeam = Oviedo: H (1.0)
|   |   |   HomeTeam = Salamanca: H (0.0)
|   |   |   HomeTeam = Santander: D (3.0)
|   |   |   HomeTeam = Sociedad: H (7.0/4.0)
|   |   |   HomeTeam = Tenerife: H (0.0)
|   |   |   HomeTeam = Valencia: H (11.0/6.0)
|   |   |   HomeTeam = Hercules: H (1.0)
|   |   |   HomeTeam = Logrones: H (0.0)
|   |   |   HomeTeam = Extremadura: H (0.0)
|   |   |   HomeTeam = Mallorca: D (5.0/2.0)
|   |   |   HomeTeam = Alaves: H (5.0/3.0)
|   |   |   HomeTeam = Villareal: H (0.0)
|   |   |   HomeTeam = Malaga: H (5.0/3.0)
|   |   |   HomeTeam = Numancia: H (2.0/1.0)
|   |   |   HomeTeam = Las Palmas: H (2.0/1.0)
|   |   |   HomeTeam = Osasuna: D (9.0/3.0)
|   |   |   HomeTeam = Villarreal: D (7.0/3.0)
|   |   |   HomeTeam = Recreativo: D (1.0)
|   |   |   HomeTeam = Murcia: D (1.0)
|   |   |   HomeTeam = Getafe: H (9.0/6.0)
|   |   |   HomeTeam = Levante: D (4.0/2.0)
|   |   |   HomeTeam = Cadiz: A (3.0)
|   |   |   HomeTeam = Gimnastic: H (1.0)
|   |   |   HomeTeam = Almeria: A (4.0/1.0)
|   |   |   HomeTeam = Xerez: H (0.0)
|   |   |   HomeTeam = Granada: H (2.0/1.0)
|   |   |   HomeTeam = Elche: H (3.0/2.0)
|   |   |   HomeTeam = Eibar: A (1.0)
|   |   |   HomeTeam = Cordoba: H (0.0)
|   |   |   HomeTeam = Leganes: H (0.0)
|   |   |   HomeTeam = Girona: H (2.0/1.0)
|   |   |   HomeTeam = Huesca: A (1.0)
|   |   AwayTeam = Merida: D (11.0/5.0)
|   |   AwayTeam = Zaragoza: D (92.0/50.0)
|   |   AwayTeam = Ath Bilbao: D (168.0/89.0)
|   |   AwayTeam = La Coruna: D (126.31/63.31)
|   |   AwayTeam = Vallecano: H (74.0/45.0)
|   |   AwayTeam = Celta: H (149.0/83.0)
|   |   AwayTeam = Ath Madrid: A (160.0/99.0)
|   |   AwayTeam = Sp Gijon: H (57.0/29.0)
|   |   AwayTeam = Espanol: D (157.0/93.0)
|   |   AwayTeam = Valladolid: H (119.0/70.0)
|   |   AwayTeam = Extremadura: D (18.0/6.0)
|   |   AwayTeam = Logrones: H (3.0/1.0)
|   |   AwayTeam = Hercules: H (8.0/5.0)
|   |   AwayTeam = Mallorca: H (102.0/57.0)
|   |   AwayTeam = Villareal: H (4.0/2.0)
|   |   AwayTeam = Alaves: H (74.0/42.0)
|   |   AwayTeam = Malaga: H (105.0/58.0)
|   |   AwayTeam = Numancia: H (24.0/7.0)
|   |   AwayTeam = Villarreal: D (134.0/79.0)
|   |   AwayTeam = Osasuna: H (135.0/70.0)
|   |   AwayTeam = Las Palmas: H (28.0/6.0)
|   |   AwayTeam = Recreativo: H (30.0/14.0)
|   |   AwayTeam = Murcia: H (15.0/6.0)
|   |   AwayTeam = Levante: H (95.0/47.0)
|   |   AwayTeam = Getafe: D (110.0/59.0)
|   |   AwayTeam = Cadiz: D (27.0/16.0)
|   |   AwayTeam = Gimnastic: H (9.0/5.0)
|   |   AwayTeam = Almeria: H (31.0/13.0)
|   |   AwayTeam = Xerez: D (8.0/3.0)
|   |   AwayTeam = Granada: H (46.0/18.0)
|   |   AwayTeam = Elche: H (25.0/11.0)
|   |   AwayTeam = Cordoba: D (5.0/2.0)
|   |   AwayTeam = Eibar: H (42.0/22.0)
|   |   AwayTeam = Leganes: H (30.0/16.0)
|   |   AwayTeam = Girona: H (18.0/11.0)
|   |   AwayTeam = Huesca: H (12.0/5.0)
|   HTAG > 0: A (2096.39/667.19)
HTHG > 0
|   HTAG <= 0: H (3306.61/617.3)
|   HTAG > 0
|   |   HTAG <= 1: H (1661.31/809.15)
|   |   HTAG > 1: A (423.08/193.04)

Number of Leaves  : 	99

Size of the tree : 	105


Time taken to build model: 0.13 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances        6643               61.0402 %
Incorrectly Classified Instances      4240               38.9598 %
Kappa statistic                          0.3622
Mean absolute error                      0.3362
Root mean squared error                  0.4124
Relative absolute error                 79.1604 %
Root relative squared error             89.488  %
Total Number of Instances            10883     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0,816    0,393    0,651      0,816    0,724      0,429    0,787     0,734     H
                 0,629    0,147    0,614      0,629    0,621      0,478    0,804     0,573     A
                 0,210    0,101    0,416      0,210    0,279      0,142    0,638     0,355     D
Weighted Avg.    0,610    0,252    0,581      0,610    0,583      0,369    0,753     0,594     

=== Confusion Matrix ===

    a    b    c   <-- classified as
 4205  463  486 |    a = H
  759 1853  336 |    b = A
 1495  701  585 |    c = D

```




#### Decision Stump

```shell

Classifications

HTHG <= 0.5 : A
HTHG > 0.5 : H
HTHG is missing : H

Class distributions

HTHG <= 0.5
H	A	D	
0.275723911855764	0.413585867783646	0.3106902203605901	
HTHG > 0.5
H	A	D	
0.675139146567718	0.125417439703154	0.19944341372912802	
HTHG is missing
H	A	D	
0.5	0.5	0.0	


Time taken to build model: 0.01 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances        5910               54.3049 %
Incorrectly Classified Instances      4973               45.6951 %
Kappa statistic                          0.2732
Mean absolute error                      0.3823
Root mean squared error                  0.4373
Relative absolute error                 90.0151 %
Root relative squared error             94.8982 %
Total Number of Instances            10883     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0,706    0,306    0,675      0,706    0,690      0,400    0,692     0,625     H
                 0,770    0,406    0,414      0,770    0,538      0,324    0,674     0,385     A
                 0,000    0,000    ?          0,000    ?          ?        0,563     0,288     D
Weighted Avg.    0,543    0,255    ?          0,543    ?          ?        0,654     0,474     

=== Confusion Matrix ===

    a    b    c   <-- classified as
 3639 1515    0 |    a = H
  677 2271    0 |    b = A
 1075 1706    0 |    c = D

´´´



#### Random Forest

```shell

RandomForest

Bagging with 100 iterations and base learner

weka.classifiers.trees.RandomTree -K 0 -M 1.0 -V 0.001 -S 1 -do-not-check-capabilities

Time taken to build model: 1.4 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances        5914               54.3416 %
Incorrectly Classified Instances      4969               45.6584 %
Kappa statistic                          0.2719
Mean absolute error                      0.3321
Root mean squared error                  0.452 
Relative absolute error                 78.1915 %
Root relative squared error             98.0878 %
Total Number of Instances            10883     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0,708    0,351    0,645      0,708    0,675      0,357    0,752     0,735     H
                 0,515    0,166    0,535      0,515    0,525      0,353    0,759     0,554     A
                 0,269    0,202    0,313      0,269    0,289      0,070    0,590     0,306     D
Weighted Avg.    0,543    0,263    0,530      0,543    0,536      0,282    0,712     0,576     

=== Confusion Matrix ===

    a    b    c   <-- classified as
 3649  566  939 |    a = H
  729 1518  701 |    b = A
 1282  752  747 |    c = D
```




#### REPTree

```shell

REPTree
============

HTHG < 0.5
|   HTAG < 0.5
|   |   AwayTeam = Valencia
|   |   |   HomeTeam = La Coruna : H (3/1) [1/1]
|   |   |   HomeTeam = Sp Gijon : A (1/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : A (6/3) [1/1]
|   |   |   HomeTeam = Ath Madrid : H (5/3) [0/0]
|   |   |   HomeTeam = Celta : D (2/0) [1/1]
|   |   |   HomeTeam = Espanol : A (3/1) [6/3]
|   |   |   HomeTeam = Merida : H (1/0) [1/1]
|   |   |   HomeTeam = Sevilla : H (8/4) [2/0]
|   |   |   HomeTeam = Valladolid : D (8/5) [2/0]
|   |   |   HomeTeam = Vallecano : H (3/1) [1/1]
|   |   |   HomeTeam = Zaragoza : A (1/0) [2/0]
|   |   |   HomeTeam = Albacete : A (1/0) [0/0]
|   |   |   HomeTeam = Barcelona : H (3/1) [1/0]
|   |   |   HomeTeam = Betis : H (5/2) [2/1]
|   |   |   HomeTeam = Real Madrid : H (4/2) [4/1]
|   |   |   HomeTeam = Compostela : A (0/0) [1/0]
|   |   |   HomeTeam = Oviedo : D (3/1) [1/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : H (6/4) [1/0]
|   |   |   HomeTeam = Sociedad : D (9/4) [1/1]
|   |   |   HomeTeam = Tenerife : H (2/1) [1/1]
|   |   |   HomeTeam = Valencia : H (0/0) [0/0]
|   |   |   HomeTeam = Hercules : A (1/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (0/0) [1/0]
|   |   |   HomeTeam = Mallorca : H (4/3) [1/0]
|   |   |   HomeTeam = Alaves : A (4/2) [1/1]
|   |   |   HomeTeam = Villareal : H (1/0) [0/0]
|   |   |   HomeTeam = Malaga : A (3/2) [1/0]
|   |   |   HomeTeam = Numancia : A (2/1) [0/0]
|   |   |   HomeTeam = Las Palmas : H (0/0) [0/0]
|   |   |   HomeTeam = Osasuna : D (5/3) [4/2]
|   |   |   HomeTeam = Villarreal : D (4/2) [3/2]
|   |   |   HomeTeam = Recreativo : D (1/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : H (6/3) [2/1]
|   |   |   HomeTeam = Levante : H (2/0) [3/2]
|   |   |   HomeTeam = Cadiz : A (2/1) [0/0]
|   |   |   HomeTeam = Gimnastic : D (1/0) [0/0]
|   |   |   HomeTeam = Almeria : A (3/1) [1/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : A (2/2) [3/0]
|   |   |   HomeTeam = Elche : H (1/0) [1/1]
|   |   |   HomeTeam = Eibar : H (2/0) [1/1]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : A (0/0) [1/0]
|   |   |   HomeTeam = Girona : H (1/0) [1/1]
|   |   |   HomeTeam = Huesca : D (1/0) [0/0]
|   |   AwayTeam = Albacete : H (14/8) [5/0]
|   |   AwayTeam = Santander : D (67/38) [28/11]
|   |   AwayTeam = Sociedad : D (95/61) [51/30]
|   |   AwayTeam = Compostela : A (11/7) [8/4]
|   |   AwayTeam = Salamanca : H (16/3) [6/3]
|   |   AwayTeam = Betis : D (106.31/64.31) [58/34]
|   |   AwayTeam = Tenerife : H (23/14) [11/3]
|   |   AwayTeam = Barcelona
|   |   |   HomeTeam = La Coruna : H (2/1) [3/0]
|   |   |   HomeTeam = Sp Gijon : D (0/0) [1/0]
|   |   |   HomeTeam = Ath Bilbao : D (4/2) [5/3]
|   |   |   HomeTeam = Ath Madrid : A (5/3) [4/1]
|   |   |   HomeTeam = Celta : H (4/2) [2/1]
|   |   |   HomeTeam = Espanol : D (6/2) [2/1]
|   |   |   HomeTeam = Merida : A (0/0) [2/1]
|   |   |   HomeTeam = Sevilla : A (2/1) [3/2]
|   |   |   HomeTeam = Valladolid : A (2/0) [1/1]
|   |   |   HomeTeam = Vallecano : H (1/0) [0/0]
|   |   |   HomeTeam = Zaragoza : A (3/1) [1/1]
|   |   |   HomeTeam = Albacete : A (1/0) [0/0]
|   |   |   HomeTeam = Barcelona : A (0/0) [0/0]
|   |   |   HomeTeam = Betis : A (5/1) [2/1]
|   |   |   HomeTeam = Real Madrid : A (2/1) [2/1]
|   |   |   HomeTeam = Compostela : A (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : H (0/0) [2/1]
|   |   |   HomeTeam = Salamanca : A (0/0) [0/0]
|   |   |   HomeTeam = Santander : A (4/3) [1/0]
|   |   |   HomeTeam = Sociedad : D (3/1) [1/0]
|   |   |   HomeTeam = Tenerife : A (0/0) [0/0]
|   |   |   HomeTeam = Valencia : A (7/4) [3/1]
|   |   |   HomeTeam = Hercules : A (0/0) [0/0]
|   |   |   HomeTeam = Logrones : A (0/0) [1/0]
|   |   |   HomeTeam = Extremadura : A (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : A (1/1) [2/0]
|   |   |   HomeTeam = Alaves : A (3/1) [2/1]
|   |   |   HomeTeam = Villareal : A (0/0) [0/0]
|   |   |   HomeTeam = Malaga : D (4/0) [1/0]
|   |   |   HomeTeam = Numancia : A (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : A (1/0) [1/1]
|   |   |   HomeTeam = Osasuna : D (5/1) [2/0]
|   |   |   HomeTeam = Villarreal : A (7/4) [2/0]
|   |   |   HomeTeam = Recreativo : A (0/0) [1/0]
|   |   |   HomeTeam = Murcia : A (0/0) [0/0]
|   |   |   HomeTeam = Getafe : D (5/2) [3/1]
|   |   |   HomeTeam = Levante : A (1/0) [1/0]
|   |   |   HomeTeam = Cadiz : A (2/1) [0/0]
|   |   |   HomeTeam = Gimnastic : A (0/0) [0/0]
|   |   |   HomeTeam = Almeria : A (1/0) [0/0]
|   |   |   HomeTeam = Xerez : A (1/0) [0/0]
|   |   |   HomeTeam = Granada : D (1/0) [0/0]
|   |   |   HomeTeam = Elche : D (0/0) [1/0]
|   |   |   HomeTeam = Eibar : A (0/0) [1/0]
|   |   |   HomeTeam = Cordoba : A (0/0) [0/0]
|   |   |   HomeTeam = Leganes : A (0/0) [0/0]
|   |   |   HomeTeam = Girona : A (0/0) [1/0]
|   |   |   HomeTeam = Huesca : D (1/0) [0/0]
|   |   AwayTeam = Real Madrid : A (115/61) [30/16]
|   |   AwayTeam = Oviedo
|   |   |   HomeTeam = La Coruna : D (0/0) [0/0]
|   |   |   HomeTeam = Sp Gijon : D (1/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : H (0/0) [1/0]
|   |   |   HomeTeam = Ath Madrid : D (1/0) [0/0]
|   |   |   HomeTeam = Celta : H (2/0) [1/0]
|   |   |   HomeTeam = Espanol : H (1/1) [1/0]
|   |   |   HomeTeam = Merida : D (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : D (0/0) [0/0]
|   |   |   HomeTeam = Valladolid : H (3/1) [0/0]
|   |   |   HomeTeam = Vallecano : D (0/0) [0/0]
|   |   |   HomeTeam = Zaragoza : D (0/0) [0/0]
|   |   |   HomeTeam = Albacete : A (1/0) [0/0]
|   |   |   HomeTeam = Barcelona : A (2/1) [0/0]
|   |   |   HomeTeam = Betis : D (0/0) [0/0]
|   |   |   HomeTeam = Real Madrid : D (0/0) [0/0]
|   |   |   HomeTeam = Compostela : D (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : D (0/0) [0/0]
|   |   |   HomeTeam = Salamanca : A (2/1) [1/0]
|   |   |   HomeTeam = Santander : D (0/0) [4/1]
|   |   |   HomeTeam = Sociedad : H (2/1) [0/0]
|   |   |   HomeTeam = Tenerife : D (0/0) [0/0]
|   |   |   HomeTeam = Valencia : H (0/0) [1/0]
|   |   |   HomeTeam = Hercules : D (0/0) [0/0]
|   |   |   HomeTeam = Logrones : D (1/0) [0/0]
|   |   |   HomeTeam = Extremadura : D (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : D (2/0) [1/0]
|   |   |   HomeTeam = Alaves : D (0/0) [0/0]
|   |   |   HomeTeam = Villareal : D (1/0) [0/0]
|   |   |   HomeTeam = Malaga : D (0/0) [0/0]
|   |   |   HomeTeam = Numancia : H (1/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (1/0) [0/0]
|   |   |   HomeTeam = Osasuna : D (1/0) [0/0]
|   |   |   HomeTeam = Villarreal : D (0/0) [0/0]
|   |   |   HomeTeam = Recreativo : D (0/0) [0/0]
|   |   |   HomeTeam = Murcia : D (0/0) [0/0]
|   |   |   HomeTeam = Getafe : D (0/0) [0/0]
|   |   |   HomeTeam = Levante : D (0/0) [0/0]
|   |   |   HomeTeam = Cadiz : D (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : D (0/0) [0/0]
|   |   |   HomeTeam = Almeria : D (0/0) [0/0]
|   |   |   HomeTeam = Xerez : D (0/0) [0/0]
|   |   |   HomeTeam = Granada : D (0/0) [0/0]
|   |   |   HomeTeam = Elche : D (0/0) [0/0]
|   |   |   HomeTeam = Eibar : D (0/0) [0/0]
|   |   |   HomeTeam = Cordoba : D (0/0) [0/0]
|   |   |   HomeTeam = Leganes : D (0/0) [0/0]
|   |   |   HomeTeam = Girona : D (0/0) [0/0]
|   |   |   HomeTeam = Huesca : D (0/0) [0/0]
|   |   AwayTeam = Sevilla
|   |   |   HomeTeam = La Coruna : A (2/1) [2/1]
|   |   |   HomeTeam = Sp Gijon : H (1/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : H (7/4) [0/0]
|   |   |   HomeTeam = Ath Madrid : D (3/2) [1/0]
|   |   |   HomeTeam = Celta : H (4/3) [3/1]
|   |   |   HomeTeam = Espanol : H (5/3) [2/1]
|   |   |   HomeTeam = Merida : H (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (0/0) [0/0]
|   |   |   HomeTeam = Valladolid : A (3/2) [3/1]
|   |   |   HomeTeam = Vallecano : D (4/1) [2/2]
|   |   |   HomeTeam = Zaragoza : A (1/1) [3/1]
|   |   |   HomeTeam = Albacete : H (0/0) [0/0]
|   |   |   HomeTeam = Barcelona : H (3/0) [5/1]
|   |   |   HomeTeam = Betis : D (7/3) [2/0]
|   |   |   HomeTeam = Real Madrid : H (1/0) [2/0]
|   |   |   HomeTeam = Compostela : D (0/0) [1/0]
|   |   |   HomeTeam = Oviedo : H (1/0) [0/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : D (3/0) [0/0]
|   |   |   HomeTeam = Sociedad : H (6/4) [1/0]
|   |   |   HomeTeam = Tenerife : H (0/0) [0/0]
|   |   |   HomeTeam = Valencia : H (6/3) [5/3]
|   |   |   HomeTeam = Hercules : H (0/0) [1/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : D (4/1) [1/1]
|   |   |   HomeTeam = Alaves : H (5/3) [0/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (3/3) [2/0]
|   |   |   HomeTeam = Numancia : H (1/0) [1/1]
|   |   |   HomeTeam = Las Palmas : H (1/1) [1/0]
|   |   |   HomeTeam = Osasuna : D (8/3) [1/0]
|   |   |   HomeTeam = Villarreal : D (6/2) [1/1]
|   |   |   HomeTeam = Recreativo : D (1/0) [0/0]
|   |   |   HomeTeam = Murcia : D (1/0) [0/0]
|   |   |   HomeTeam = Getafe : H (8/6) [1/0]
|   |   |   HomeTeam = Levante : D (2/1) [2/1]
|   |   |   HomeTeam = Cadiz : A (2/0) [1/0]
|   |   |   HomeTeam = Gimnastic : H (1/0) [0/0]
|   |   |   HomeTeam = Almeria : A (3/1) [1/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : H (2/1) [0/0]
|   |   |   HomeTeam = Elche : H (3/2) [0/0]
|   |   |   HomeTeam = Eibar : A (0/0) [1/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : H (0/0) [0/0]
|   |   |   HomeTeam = Girona : H (1/0) [1/1]
|   |   |   HomeTeam = Huesca : A (1/0) [0/0]
|   |   AwayTeam = Merida : D (6/3) [5/2]
|   |   AwayTeam = Zaragoza : D (53/30) [39/20]
|   |   AwayTeam = Ath Bilbao : D (114/63) [54/26]
|   |   AwayTeam = La Coruna : D (77.31/42.31) [49/21]
|   |   AwayTeam = Vallecano
|   |   |   HomeTeam = La Coruna : D (2/1) [1/0]
|   |   |   HomeTeam = Sp Gijon : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : H (5/2) [1/1]
|   |   |   HomeTeam = Ath Madrid : H (2/0) [1/1]
|   |   |   HomeTeam = Celta : H (2/1) [0/0]
|   |   |   HomeTeam = Espanol : D (2/0) [0/0]
|   |   |   HomeTeam = Merida : A (1/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (1/0) [2/1]
|   |   |   HomeTeam = Valladolid : H (3/2) [0/0]
|   |   |   HomeTeam = Vallecano : H (0/0) [0/0]
|   |   |   HomeTeam = Zaragoza : H (0/0) [0/0]
|   |   |   HomeTeam = Albacete : H (0/0) [0/0]
|   |   |   HomeTeam = Barcelona : D (2/1) [1/0]
|   |   |   HomeTeam = Betis : H (2/0) [3/2]
|   |   |   HomeTeam = Real Madrid : D (0/0) [1/0]
|   |   |   HomeTeam = Compostela : H (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : A (1/0) [0/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : A (2/1) [0/0]
|   |   |   HomeTeam = Sociedad : H (1/0) [2/1]
|   |   |   HomeTeam = Tenerife : A (1/0) [1/1]
|   |   |   HomeTeam = Valencia : H (0/0) [2/1]
|   |   |   HomeTeam = Hercules : H (0/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (1/0) [0/0]
|   |   |   HomeTeam = Mallorca : H (1/0) [2/1]
|   |   |   HomeTeam = Alaves : A (3/1) [1/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : D (0/0) [2/0]
|   |   |   HomeTeam = Numancia : H (0/0) [1/0]
|   |   |   HomeTeam = Las Palmas : A (0/0) [1/0]
|   |   |   HomeTeam = Osasuna : H (1/0) [3/1]
|   |   |   HomeTeam = Villarreal : A (0/0) [2/1]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : D (1/0) [2/1]
|   |   |   HomeTeam = Levante : H (0/0) [2/1]
|   |   |   HomeTeam = Cadiz : H (2/1) [1/0]
|   |   |   HomeTeam = Gimnastic : H (0/0) [0/0]
|   |   |   HomeTeam = Almeria : A (1/0) [1/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : A (2/0) [1/0]
|   |   |   HomeTeam = Elche : H (1/0) [0/0]
|   |   |   HomeTeam = Eibar : H (0/0) [0/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : H (0/0) [0/0]
|   |   |   HomeTeam = Girona : H (0/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Celta
|   |   |   HomeTeam = La Coruna : A (5/2) [0/0]
|   |   |   HomeTeam = Sp Gijon : H (4/3) [1/0]
|   |   |   HomeTeam = Ath Bilbao : D (6/3) [1/0]
|   |   |   HomeTeam = Ath Madrid : H (2/0) [4/3]
|   |   |   HomeTeam = Celta : H (0/0) [0/0]
|   |   |   HomeTeam = Espanol : H (11/5) [1/1]
|   |   |   HomeTeam = Merida : H (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : A (4/2) [3/2]
|   |   |   HomeTeam = Valladolid : D (3/1) [2/1]
|   |   |   HomeTeam = Vallecano : H (3/2) [1/0]
|   |   |   HomeTeam = Zaragoza : H (5/3) [2/1]
|   |   |   HomeTeam = Albacete : H (1/0) [0/0]
|   |   |   HomeTeam = Barcelona : A (0/0) [1/0]
|   |   |   HomeTeam = Betis : H (5/3) [3/2]
|   |   |   HomeTeam = Real Madrid : H (2/0) [2/0]
|   |   |   HomeTeam = Compostela : D (0/0) [1/0]
|   |   |   HomeTeam = Oviedo : H (1/0) [0/0]
|   |   |   HomeTeam = Salamanca : A (1/0) [0/0]
|   |   |   HomeTeam = Santander : H (3/1) [1/0]
|   |   |   HomeTeam = Sociedad : H (5/1) [1/1]
|   |   |   HomeTeam = Tenerife : A (1/0) [1/1]
|   |   |   HomeTeam = Valencia : H (5/2) [3/1]
|   |   |   HomeTeam = Hercules : H (0/0) [0/0]
|   |   |   HomeTeam = Logrones : A (0/0) [1/0]
|   |   |   HomeTeam = Extremadura : H (2/1) [0/0]
|   |   |   HomeTeam = Mallorca : H (5/1) [2/1]
|   |   |   HomeTeam = Alaves : H (4/2) [1/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : A (1/0) [0/0]
|   |   |   HomeTeam = Numancia : H (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (1/1) [1/0]
|   |   |   HomeTeam = Osasuna : D (4/1) [2/2]
|   |   |   HomeTeam = Villarreal : H (4/2) [3/1]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : A (2/1) [1/0]
|   |   |   HomeTeam = Levante : A (1/0) [2/1]
|   |   |   HomeTeam = Cadiz : D (2/1) [1/0]
|   |   |   HomeTeam = Gimnastic : A (1/0) [0/0]
|   |   |   HomeTeam = Almeria : H (0/0) [0/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : D (1/0) [2/0]
|   |   |   HomeTeam = Elche : H (3/1) [0/0]
|   |   |   HomeTeam = Eibar : H (2/1) [1/0]
|   |   |   HomeTeam = Cordoba : D (0/0) [1/0]
|   |   |   HomeTeam = Leganes : H (2/1) [0/0]
|   |   |   HomeTeam = Girona : A (1/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Ath Madrid : A (105/65) [55/34]
|   |   AwayTeam = Sp Gijon
|   |   |   HomeTeam = La Coruna : D (1/0) [0/0]
|   |   |   HomeTeam = Sp Gijon : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : A (2/1) [0/0]
|   |   |   HomeTeam = Ath Madrid : H (1/0) [1/0]
|   |   |   HomeTeam = Celta : H (3/1) [0/0]
|   |   |   HomeTeam = Espanol : H (3/1) [2/2]
|   |   |   HomeTeam = Merida : H (1/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (3/1) [1/0]
|   |   |   HomeTeam = Valladolid : H (3/1) [0/0]
|   |   |   HomeTeam = Vallecano : A (1/0) [0/0]
|   |   |   HomeTeam = Zaragoza : D (0/0) [1/0]
|   |   |   HomeTeam = Albacete : H (0/0) [0/0]
|   |   |   HomeTeam = Barcelona : H (1/0) [0/0]
|   |   |   HomeTeam = Betis : D (1/0) [2/1]
|   |   |   HomeTeam = Real Madrid : H (2/1) [1/0]
|   |   |   HomeTeam = Compostela : H (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : H (2/1) [0/0]
|   |   |   HomeTeam = Salamanca : H (1/0) [0/0]
|   |   |   HomeTeam = Santander : H (0/0) [1/0]
|   |   |   HomeTeam = Sociedad : H (1/0) [1/1]
|   |   |   HomeTeam = Tenerife : H (1/0) [0/0]
|   |   |   HomeTeam = Valencia : D (2/1) [2/1]
|   |   |   HomeTeam = Hercules : D (1/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : A (1/0) [0/0]
|   |   |   HomeTeam = Mallorca : H (0/0) [0/0]
|   |   |   HomeTeam = Alaves : D (0/0) [1/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (1/0) [0/0]
|   |   |   HomeTeam = Numancia : H (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (1/0) [0/0]
|   |   |   HomeTeam = Osasuna : H (2/0) [0/0]
|   |   |   HomeTeam = Villarreal : H (1/0) [0/0]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : D (0/0) [1/0]
|   |   |   HomeTeam = Levante : D (1/0) [1/0]
|   |   |   HomeTeam = Cadiz : H (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : H (0/0) [0/0]
|   |   |   HomeTeam = Almeria : H (0/0) [0/0]
|   |   |   HomeTeam = Xerez : D (0/0) [1/0]
|   |   |   HomeTeam = Granada : H (0/0) [2/1]
|   |   |   HomeTeam = Elche : H (0/0) [0/0]
|   |   |   HomeTeam = Eibar : H (1/0) [0/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : A (1/0) [0/0]
|   |   |   HomeTeam = Girona : H (0/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Espanol : D (104/59) [53/34]
|   |   AwayTeam = Valladolid : H (82/48) [37/22]
|   |   AwayTeam = Extremadura : D (11/5) [7/1]
|   |   AwayTeam = Logrones : H (1/1) [2/0]
|   |   AwayTeam = Hercules : H (7/4) [1/1]
|   |   AwayTeam = Mallorca : H (60/33) [42/24]
|   |   AwayTeam = Villareal : H (3/2) [1/0]
|   |   AwayTeam = Alaves : H (54/30) [20/12]
|   |   AwayTeam = Malaga
|   |   |   HomeTeam = La Coruna : H (3/0) [3/0]
|   |   |   HomeTeam = Sp Gijon : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : D (5/2) [1/1]
|   |   |   HomeTeam = Ath Madrid : H (3/1) [0/0]
|   |   |   HomeTeam = Celta : H (3/2) [2/1]
|   |   |   HomeTeam = Espanol : H (3/2) [2/1]
|   |   |   HomeTeam = Merida : H (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : A (8/4) [0/0]
|   |   |   HomeTeam = Valladolid : D (3/0) [0/0]
|   |   |   HomeTeam = Vallecano : H (0/0) [0/0]
|   |   |   HomeTeam = Zaragoza : D (2/1) [2/1]
|   |   |   HomeTeam = Albacete : A (1/0) [1/0]
|   |   |   HomeTeam = Barcelona : H (2/1) [2/0]
|   |   |   HomeTeam = Betis : D (4/1) [1/1]
|   |   |   HomeTeam = Real Madrid : H (2/0) [2/1]
|   |   |   HomeTeam = Compostela : H (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : H (0/0) [0/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : A (1/0) [0/0]
|   |   |   HomeTeam = Sociedad : D (3/1) [1/0]
|   |   |   HomeTeam = Tenerife : H (1/0) [0/0]
|   |   |   HomeTeam = Valencia : H (3/2) [1/0]
|   |   |   HomeTeam = Hercules : H (0/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : H (3/1) [1/1]
|   |   |   HomeTeam = Alaves : H (2/0) [1/1]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (0/0) [0/0]
|   |   |   HomeTeam = Numancia : H (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (3/2) [1/0]
|   |   |   HomeTeam = Osasuna : D (1/0) [4/2]
|   |   |   HomeTeam = Villarreal : H (3/1) [2/0]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : H (1/0) [3/1]
|   |   |   HomeTeam = Levante : H (2/1) [0/0]
|   |   |   HomeTeam = Cadiz : H (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : H (0/0) [0/0]
|   |   |   HomeTeam = Almeria : H (3/2) [1/0]
|   |   |   HomeTeam = Xerez : D (1/0) [0/0]
|   |   |   HomeTeam = Granada : H (5/2) [0/0]
|   |   |   HomeTeam = Elche : H (0/0) [0/0]
|   |   |   HomeTeam = Eibar : H (1/0) [0/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : H (2/1) [0/0]
|   |   |   HomeTeam = Girona : H (0/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Numancia
|   |   |   HomeTeam = La Coruna : H (2/1) [0/0]
|   |   |   HomeTeam = Sp Gijon : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Madrid : H (1/0) [1/0]
|   |   |   HomeTeam = Celta : D (1/0) [1/0]
|   |   |   HomeTeam = Espanol : H (0/0) [1/0]
|   |   |   HomeTeam = Merida : H (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (1/0) [1/0]
|   |   |   HomeTeam = Valladolid : H (1/0) [1/1]
|   |   |   HomeTeam = Vallecano : D (1/0) [0/0]
|   |   |   HomeTeam = Zaragoza : H (1/0) [0/0]
|   |   |   HomeTeam = Albacete : H (0/0) [0/0]
|   |   |   HomeTeam = Barcelona : H (2/0) [1/1]
|   |   |   HomeTeam = Betis : H (0/0) [0/0]
|   |   |   HomeTeam = Real Madrid : H (1/0) [0/0]
|   |   |   HomeTeam = Compostela : H (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : H (1/0) [0/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : H (1/0) [0/0]
|   |   |   HomeTeam = Sociedad : H (0/0) [0/0]
|   |   |   HomeTeam = Tenerife : H (0/0) [0/0]
|   |   |   HomeTeam = Valencia : H (0/0) [0/0]
|   |   |   HomeTeam = Hercules : H (0/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : H (0/0) [0/0]
|   |   |   HomeTeam = Alaves : H (0/0) [0/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (1/0) [0/0]
|   |   |   HomeTeam = Numancia : H (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (0/0) [0/0]
|   |   |   HomeTeam = Osasuna : H (1/0) [1/0]
|   |   |   HomeTeam = Villarreal : D (0/0) [1/0]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : H (1/0) [0/0]
|   |   |   HomeTeam = Levante : H (0/0) [0/0]
|   |   |   HomeTeam = Cadiz : H (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : H (0/0) [0/0]
|   |   |   HomeTeam = Almeria : H (0/0) [0/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : H (0/0) [0/0]
|   |   |   HomeTeam = Elche : H (0/0) [0/0]
|   |   |   HomeTeam = Eibar : H (0/0) [0/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : H (0/0) [0/0]
|   |   |   HomeTeam = Girona : H (0/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Villarreal : D (91/54) [43/25]
|   |   AwayTeam = Osasuna : H (85/51) [50/19]
|   |   AwayTeam = Las Palmas : H (19/4) [9/2]
|   |   AwayTeam = Recreativo : H (20/8) [10/6]
|   |   AwayTeam = Murcia
|   |   |   HomeTeam = La Coruna : H (0/0) [0/0]
|   |   |   HomeTeam = Sp Gijon : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : H (0/0) [0/0]
|   |   |   HomeTeam = Ath Madrid : D (1/0) [1/0]
|   |   |   HomeTeam = Celta : H (0/0) [0/0]
|   |   |   HomeTeam = Espanol : H (2/1) [0/0]
|   |   |   HomeTeam = Merida : H (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (0/0) [1/0]
|   |   |   HomeTeam = Valladolid : D (1/0) [0/0]
|   |   |   HomeTeam = Vallecano : H (0/0) [0/0]
|   |   |   HomeTeam = Zaragoza : H (0/0) [0/0]
|   |   |   HomeTeam = Albacete : H (0/0) [0/0]
|   |   |   HomeTeam = Barcelona : H (0/0) [0/0]
|   |   |   HomeTeam = Betis : D (1/0) [0/0]
|   |   |   HomeTeam = Real Madrid : H (1/0) [0/0]
|   |   |   HomeTeam = Compostela : H (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : H (0/0) [0/0]
|   |   |   HomeTeam = Salamanca : H (0/0) [0/0]
|   |   |   HomeTeam = Santander : H (0/0) [0/0]
|   |   |   HomeTeam = Sociedad : H (1/0) [0/0]
|   |   |   HomeTeam = Tenerife : H (0/0) [0/0]
|   |   |   HomeTeam = Valencia : H (0/0) [1/0]
|   |   |   HomeTeam = Hercules : H (0/0) [0/0]
|   |   |   HomeTeam = Logrones : H (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : H (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : H (0/0) [0/0]
|   |   |   HomeTeam = Alaves : H (0/0) [0/0]
|   |   |   HomeTeam = Villareal : H (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (1/0) [0/0]
|   |   |   HomeTeam = Numancia : H (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : H (0/0) [0/0]
|   |   |   HomeTeam = Osasuna : H (0/0) [0/0]
|   |   |   HomeTeam = Villarreal : H (2/0) [0/0]
|   |   |   HomeTeam = Recreativo : H (0/0) [0/0]
|   |   |   HomeTeam = Murcia : H (0/0) [0/0]
|   |   |   HomeTeam = Getafe : H (1/0) [0/0]
|   |   |   HomeTeam = Levante : D (1/0) [0/0]
|   |   |   HomeTeam = Cadiz : H (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : H (0/0) [0/0]
|   |   |   HomeTeam = Almeria : H (0/0) [0/0]
|   |   |   HomeTeam = Xerez : H (0/0) [0/0]
|   |   |   HomeTeam = Granada : H (0/0) [0/0]
|   |   |   HomeTeam = Elche : H (0/0) [0/0]
|   |   |   HomeTeam = Eibar : H (0/0) [0/0]
|   |   |   HomeTeam = Cordoba : H (0/0) [0/0]
|   |   |   HomeTeam = Leganes : H (0/0) [0/0]
|   |   |   HomeTeam = Girona : H (0/0) [0/0]
|   |   |   HomeTeam = Huesca : H (0/0) [0/0]
|   |   AwayTeam = Levante : H (65/30) [30/17]
|   |   AwayTeam = Getafe
|   |   |   HomeTeam = La Coruna : H (3/1) [0/0]
|   |   |   HomeTeam = Sp Gijon : D (0/0) [0/0]
|   |   |   HomeTeam = Ath Bilbao : D (4/1) [2/1]
|   |   |   HomeTeam = Ath Madrid : A (2/1) [0/0]
|   |   |   HomeTeam = Celta : H (2/1) [0/0]
|   |   |   HomeTeam = Espanol : H (7/4) [3/1]
|   |   |   HomeTeam = Merida : D (0/0) [0/0]
|   |   |   HomeTeam = Sevilla : H (5/3) [0/0]
|   |   |   HomeTeam = Valladolid : D (3/0) [2/2]
|   |   |   HomeTeam = Vallecano : A (2/1) [0/0]
|   |   |   HomeTeam = Zaragoza : A (2/1) [0/0]
|   |   |   HomeTeam = Albacete : D (0/0) [1/0]
|   |   |   HomeTeam = Barcelona : D (2/0) [0/0]
|   |   |   HomeTeam = Betis : H (2/0) [3/3]
|   |   |   HomeTeam = Real Madrid : H (3/1) [3/0]
|   |   |   HomeTeam = Compostela : D (0/0) [0/0]
|   |   |   HomeTeam = Oviedo : D (0/0) [0/0]
|   |   |   HomeTeam = Salamanca : D (0/0) [0/0]
|   |   |   HomeTeam = Santander : D (0/0) [0/0]
|   |   |   HomeTeam = Sociedad : D (6/1) [0/0]
|   |   |   HomeTeam = Tenerife : D (0/0) [0/0]
|   |   |   HomeTeam = Valencia : D (3/1) [0/0]
|   |   |   HomeTeam = Hercules : D (0/0) [1/0]
|   |   |   HomeTeam = Logrones : D (0/0) [0/0]
|   |   |   HomeTeam = Extremadura : D (0/0) [0/0]
|   |   |   HomeTeam = Mallorca : D (2/1) [2/1]
|   |   |   HomeTeam = Alaves : D (3/1) [1/0]
|   |   |   HomeTeam = Villareal : D (0/0) [0/0]
|   |   |   HomeTeam = Malaga : H (3/1) [1/0]
|   |   |   HomeTeam = Numancia : D (0/0) [0/0]
|   |   |   HomeTeam = Las Palmas : A (0/0) [1/0]
|   |   |   HomeTeam = Osasuna : D (6/3) [2/0]
|   |   |   HomeTeam = Villarreal : H (3/0) [1/1]
|   |   |   HomeTeam = Recreativo : D (0/0) [1/0]
|   |   |   HomeTeam = Murcia : A (1/0) [0/0]
|   |   |   HomeTeam = Getafe : D (0/0) [0/0]
|   |   |   HomeTeam = Levante : D (6/2) [3/0]
|   |   |   HomeTeam = Cadiz : D (0/0) [0/0]
|   |   |   HomeTeam = Gimnastic : D (0/0) [0/0]
|   |   |   HomeTeam = Almeria : H (2/0) [0/0]
|   |   |   HomeTeam = Xerez : A (1/0) [0/0]
|   |   |   HomeTeam = Granada : A (1/1) [1/0]
|   |   |   HomeTeam = Elche : A (2/0) [1/1]
|   |   |   HomeTeam = Eibar : A (1/1) [1/0]
|   |   |   HomeTeam = Cordoba : A (0/0) [1/0]
|   |   |   HomeTeam = Leganes : D (0/0) [0/0]
|   |   |   HomeTeam = Girona : D (1/0) [0/0]
|   |   |   HomeTeam = Huesca : D (1/0) [0/0]
|   |   AwayTeam = Cadiz : D (17/11) [10/5]
|   |   AwayTeam = Gimnastic : H (8/5) [1/0]
|   |   AwayTeam = Almeria : H (25/11) [6/2]
|   |   AwayTeam = Xerez : D (6/2) [2/1]
|   |   AwayTeam = Granada : H (32/13) [14/5]
|   |   AwayTeam = Elche : H (15/8) [10/3]
|   |   AwayTeam = Cordoba : D (4/2) [1/0]
|   |   AwayTeam = Eibar : H (31/16) [11/6]
|   |   AwayTeam = Leganes : H (18/11) [12/5]
|   |   AwayTeam = Girona : H (12/9) [6/2]
|   |   AwayTeam = Huesca : H (7/3) [5/2]
|   HTAG >= 0.5 : A (1362.38/435.19) [734/232]
HTHG >= 0.5 : H (3614/1173.5) [1777/578]

Size of the tree : 581

Time taken to build model: 0.07 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances        6471               59.4597 %
Incorrectly Classified Instances      4412               40.5403 %
Kappa statistic                          0.3399
Mean absolute error                      0.3395
Root mean squared error                  0.4274
Relative absolute error                 79.9457 %
Root relative squared error             92.7392 %
Total Number of Instances            10883     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0,793    0,388    0,648      0,793    0,713      0,409    0,771     0,704     H
                 0,577    0,141    0,603      0,577    0,590      0,442    0,774     0,543     A
                 0,247    0,132    0,390      0,247    0,302      0,136    0,614     0,335     D
Weighted Avg.    0,595    0,256    0,570      0,595    0,575      0,348    0,732     0,566     

=== Confusion Matrix ===

    a    b    c   <-- classified as
 4085  442  627 |    a = H
  803 1700  445 |    b = A
 1419  676  686 |    c = D

´´´


