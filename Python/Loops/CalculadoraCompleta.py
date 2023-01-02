

if __name__ == '__main__':

    def suma (val1, val2):
        print(f"La suma es: {val1+val2}")

    def resta (val1, val2):
            print(f"La suma es: {val1-val2}")

    def multiplicacion (val1, val2):
        print(f"La suma es: {val1*val2}")

    def division(val1, val2):
        print(f"La suma es: {val1 / val2}")

    def potencia(val1, val2):
        pot = 1
        if val2 >= 0:
            while val2 > 0 :
                pot = pot *val1
                val2 = val2 -1
            print(f"La Potencia es: {pot}")
        else:
            while(val2 < 0):
                pot = pot * (val1*-1)
                val2 = val2 + 1
            print(f"La Potencia es : { 1.0 / (pot * -1)}")


option = 10
while (option != 0):
        print("0 -Saliendo del programa...")
        print("1 -Sumar")
        print("2 -Restar")
        print("3 -Multiplicar")
        print("4 -Dividir")
        print("5 -Potencia")

        option = int(input())

        if (option > 0 & option < 6):
            print("Introduce valor 1 :")
            numero1 = int(input())
            print("Introduce valor 2 :")
            numero2 = int(input())

        if option == 1:
            suma(numero1,numero2)
        elif option == 2:
            resta(numero1,numero2)
        elif option == 3:
            multiplicacion(numero1, numero2)
        elif option == 4:
            division(numero1, numero2)
        elif option == 5:
            potencia(numero1, numero2)
        else:
            print("Opcion no valida")
