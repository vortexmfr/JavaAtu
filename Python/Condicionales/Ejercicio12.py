import math

if __name__ == '__main__':

    print(f"Introduce el Numero de Alumnos:")
    alumnos = int(input())

    if alumnos >= 100:
        print(f"El precio por alumno: 65 Euros")
    elif (alumnos >= 50 and alumnos < 100):
        print(f"El precio por alumno:70 Euros")
    elif (alumnos >= 30 and alumnos < 50):
        print(f"El precio por alumno: 95 Euros")
    elif (alumnos < 30):
        print(f"El precio por alumno: {4000 / alumnos} Euros")
    else:
        print("Error")

    print(f"El pago a la empresa de autobuses {math.ceil(alumnos/30)*4000}")