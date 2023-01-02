
import random

if __name__ == '__main__':

    aleatorio = random.randrange(100)
    numero = 0
    print("***********************************");
    print("**    Bienvenido al programa     **");
    print("**   Adivina el numero oculto    **");
    print("***********************************");


    while numero != aleatorio:
        print("¿Cual crees que es numero secreto? :")
        numero = int(input())
        if numero == aleatorio:
            print(f" Genial has ACERTADO, el numero secreto es: {numero}")
        else :
            if aleatorio < numero:
                print(" Pista ==> El valor secreto es Menor")
            else:
                print(" Pista ==> El valor secreto es Mayor")