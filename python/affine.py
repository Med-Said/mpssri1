# -*- coding: utf-8 -*-
"""
Created on Mon Feb 11 08:46:14 2019

@author: Med Said M'bareck
"""
def prepare(text): #1.1
    i = 0
    li1 = ['à','è','é','ê','î','ô','û','ç']
    li2 = ['A','E','E','E','I','O','U','C']
    for lettre in li1:
       repl = li2[i]
       text = text.replace(lettre,repl)
       i+=1
    text = text.upper()
    return text


def affin(text): #1.2
    cryptedText = ""
    a,b = 17,3
    isEspace = False
    newText = prepare(text)
    for lettre in newText:
        isEspace = False
        if lettre == " ":
            isEspace = True
        x = ord(lettre) - 65    #ecriture 0..26 (x : la position)
        y = (a * x + b) % 26    #algorithm affine
        if not isEspace :
            alphabet = chr(y + 65)  #ecriture normale A..Z 
            cryptedText += alphabet
        else: #pas de chiffrement s'il s'agit d'espace 
            cryptedText += " "    
    return cryptedText

def affich(): #1.3
    message = "Le cryptage par fonction affine est très loin d être sûr"
    print("cles de chiffrement  \n \t\ta : 11\t b : 3")
    print("message d'origine \n\t\t" + message)
    print("message codé\n\t\t" + affin(message))
    
affich()


#déchiffrement (avec connaissance de a & b)

#aMoinUn c'est le modulo inverse du a (1=a*aMoinUn mod 26)

def calculAMoinUn(a):
    for i in range(1,27):
        if((i*a) % 26 == 1):
            return i


#la fonction de dechiffrement est : D(x) = AmoinUn*(x-b) mod m
def affinDecrypt(text):
    decryptedText = ""
    a,b = 17,3
    isEspace = False
    newText = prepare(text)
    for lettre in newText:
        isEspace = False
        if lettre == " ":
            isEspace = True
        x = ord(lettre) - 65    #ecriture 0..26 (x : la position)
        dx = (calculAMoinUn(a) * (x - b)) % 26    #algorithm affine
        if not isEspace :
            alphabet = chr(dx + 65)  #ecriture normale A..Z 
            decryptedText += alphabet
        else: #pas de chiffrement s'il s'agit d'espace 
            decryptedText += " "    
    return decryptedText



#exemple d'execution
    
messageCrypte = "IT LGVYODBT YDG KHQLOJHQ DKKJQT TXO OGTX IHJQ C TOGT XFG"
print("\n\n\nexample de dechiffrement")
print("message cripte \n\t\t" + messageCrypte)
print("message d'origine\n\t\t" + affinDecrypt(messageCrypte))