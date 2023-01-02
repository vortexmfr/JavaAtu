# Apuntes Java8

## 1.- Variables

### Entrada valores por teclado

    //Creación de buffer de entrada de datos
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))
    
    //Leer el buffer
    String lectura = buffer.readLine();
    
    //Manejo la excepción de una entrada no válida
    try {
        valor = Integer.parseInt(lectura);
    } catch (NumberFormatException ex) {
        valor= -1;
    }
    

## 2.-Condicionales

## 3.-Loops

    while (expresion) {
        sentencias
    }

    do {
        sentencias
    } while (expresion)

    for (expresion1 ; expresion2 ; expresion3) {
        sentencias
    }

    for ( tipo variable : rango (array) ) {
        sentencias
    }
    
**Ejemplo1**

        for (int i : new Counter(0, 5)) {
            System.out.println(i);
        }
    
**Ejemplo2**


        String[] cars = {
            "Volvo",
            "BMW",
            "Ford",
            "Mazda"
        };
        for (String i: cars) {
            System.out.println(i);
        }
    
## 4.- Arrays



