# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

if __name__ == '__main__':
    print("ZONA UBICACIÓN\n" +
            "1 América del Norte\n" +
            "2 América Central\n" +
            "3 América del Sur\n" +
            "4 Europa\n" +
            "5 Asia")
    print("Introduce la zona destino [1-5]")
    destino = input()
    print("Introduce el Peso de la carga (Kgr.):")
    peso = int(input())

    if peso > 5:
        print(f"El peso del envio es: {peso} Excede de los 5 Kg. maximos autorizados")
        print(f"Su envio no puede ser enviado")
    else:
            if destino == "1":
                print(f"El coste del envio es: {24 * peso} ")
            elif destino == "2":
                print(f"El coste del envio es: {20 * peso} ")
            elif destino == "3":
                print(f"El coste del envio es: {21 * peso} ")
            elif destino == "4":
                print(f"El coste del envio es: {10 * peso} ")
            elif destino ==  "5":
                print(f"El coste del envio es: {18 * peso} ")
            else:
                print(f"ERROR: Zona mal especificada")

