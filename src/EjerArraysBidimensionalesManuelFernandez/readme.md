https://www.markdownguide.org/cheat-sheet/

# Arrays multidemensionales

 	`
    //Declaracion del Array
    String[][] paisCiudadPueblo = new String[4][3][7]

    //Asignacion del Array
    paisCiudad[i][j] = buffer.readLine();

    //Dimensiones del Array
    paisCiudad.length          // [4]
    paisCiudad[0].length       // [3]
    paisCiudad[0][0].length    // [7]

    //Muestro el array
    for (int i = 0 ; i < 4 ; i++ ) {
        j=0;
        System.out.println(" Pais: "+ paisCiudad[i][j]);
        for (j = 0; j < 3; j++) {
            System.out.println(" \t Ciudades : "+ paisCiudad[i][j]);
        }
    }
    `
