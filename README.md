# ANTLR Class Scheduling

## Members

1. Leo Lambarita Nadeak / 13515041

2. Verena Severina / 13515047

3. Holy Lovenia / 13515113

4. Agus Gunawan / 13515143

## Implemented Use Cases

![Use Case Diagram](UseCaseDiagram.png)

1. Define class room configuration

```CONFIGURE: R7602 WITH CAPACITY=75, FACILITIES=INFOCUS-1, FACILITIES=WHITEBOARD-2```

2. Define class requirement

```REQUIREMENT: IF4071 K1 WITH CAPACITY=55, FACILITIES=INFOCUS-1, FACILITIES=WHITEBOARD-1, GROUP=GAIB```

3. Define lecturer availability

```LECTURER: MLK-AVAILABILITY_DAYTIME=MONDAY-13:00, AVAILABILITY_DAYTIME=MONDAY-14:00, GROUP=GAIB```

4. Define schedule preference and constraint

```PREFER: COOCCUR LECTURES = IF4150 K1, IF4150 K2, IF4150 K3```

```CONSTRAINT: SEPARATE LECTURES = IF4091 K2, IF4071 K1```

5. Schedule

```SCHEDULE```


## Full example

### Input Example
```
CONFIGURE: R7602 WITH CAPACITY=20
CONFIGURE: R7603 WITH CAPACITY=30, FACILITIES=INFOCUS-5
CONFIGURE: R7604 WITH CAPACITY=50, FACILITIES=INFOCUS-5, FACILITIES=TABLE-5
REQUIREMENT: IF4061 K2 WITH CAPACITY=20, GROUP=BASDAT
REQUIREMENT: IF4062 K2 WITH CAPACITY=30, FACILITIES=INFOCUS-5, GROUP=GAIB
REQUIREMENT: IF4063 K2 WITH CAPACITY=50, FACILITIES=TABLE-5, FACILITIES=INFOCUS-5, GROUP=GAIB
LECTURER: FNA-AVAILABILITY_DAY=WEDNESDAY, GROUP=BASDAT
LECTURER: MLK-AVAILABILITY_DAY=MONDAY, AVAILABILITY_DAY=TUESDAY, AVAILABILITY_DAYTIME=WEDNESDAY-13:00, GROUP=GAIB
PREFER: COOCCUR LECTURES = IF4061 K2, IF4063 K2
SCHEDULE
EXIT
```
### Ouput Example
```
SCHEDULE
MONDAY (07:00-08:00)
1. IF4061 K2 / FNA / R7602
2. IF4063 K2 / MLK / R7604

TUESDAY (07:00-08:00)
1. IF4062 K2 / MLK / R7603
```

See directory `test` for more input-output examples.