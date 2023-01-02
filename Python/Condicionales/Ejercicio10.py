
# Calcular el año bisiesto

if __name__ == '__main__':
    print("Introduce un Año a calcular:")
    anno = int(input())

    if anno % 400 == 0 :
        print(f"El año {anno} : es Bisiesto")
    elif (anno % 4 == 0 and anno % 100 != 0):
        print(f"El año {anno} : es Bisiesto")
    else:
        print(f"El año {anno} : No es Bisiesto")