#encryption
        
def cryptS(p,k):
    res = ""
    list1 = list()
    for c in p:
        list1.append(ord(c)-65)#transformer la chaine sous une adaptable (0-25)
    for i in list1:
        i= (i + k) % 26 + 65 #appliquer l'argorithme de sezar puis ajouter 65 pour revenier au for mat initial
        res += str(chr(i)) #concatener les lettres chiffrees
    return res #retourner le message chiffre


d = input("le mot a chiffre : ")
d = d.upper()
print(cryptS(d,3))


def dCryptS(c,k):
    res = ""
    list1 = list()
    for p in c:
        list1.append(ord(p)-65)#transformer la chaine sous une adaptable (0-25)
    for i in list1:
        i= (i - k) % 26 + 65 #appliquer l'argorithme de sezar puis ajouter 65 pour revenier au for mat initial
        res += str(chr(i)) #concatener les lettres chiffrees
    return res #retourner le message dechiffre

print(dCryptS("PHG",3))