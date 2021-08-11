while True:
    try:
        n = 0
        m = -1

        AlumnosOriginales = []
        AlumnosDiarios = []
        while n <= 0 or n > 50:
            n = int(input())
            for i in range(n):

                VerificarTamao=input().split()
                while len(VerificarTamao[0])<0 or len(VerificarTamao[0])>20:
                    VerificarTamao=input().split()

                AlumnosOriginales.append(VerificarTamao)

        while m < 0 or m > n:
            m = int(input())
            firmaDiferente=0
            for i in range(m):
                AlumnosDiarios = input().split()
                for alumno in AlumnosOriginales:
                    if alumno[0]==AlumnosDiarios[0]:
                        if not alumno[1]==AlumnosDiarios[1]:
                            firmaDiferente+=1
                
                if not firmaDiferente==0:
                    print("",firmaDiferente)
    except EOFError:
        break