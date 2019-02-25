# -*- coding: utf-8 -*-
"""
Created on Mon Feb  4 08:53:15 2019

@author: Med Said M'bareck
"""

#1
minuscules = ['a','b','c','d','e','f','g','h','i'
              ,'j','k','l','m','n','o','p','q','r'
              ,'s','t','u','v','w','x','y','z']

majuscules = ['A','B','C','D','E','F','G','H','I'
              ,'J','K','L','M','N','O','P','Q','R',
              'S','T','U','V','W','X','Y','Z']


#2
def convert(text):
    return text.upper()


#5
def swap(char,offset):
    d = majuscules.index(char)
    c = (d + offset) % 26
    return majuscules[c]


#3
def cesar(text, offset):
    newText = ""
    tmaj = text.upper()
    for c in tmaj:
        newText +=  swap(c,offset)
    return newText



#4 : nous avons mis cette partie en commentaire car il existe un deuxieme main (ligne 86)
    
"""
def main():
    text = input("text : ")
    
    offset = int(input("k :"))
    
    message = cesar(text,offset)
    print(message)
    

#execution
if __name__ == "__main__":
   main()     

"""


#6 - le programme de dechiffrement.
   
def swapDecrypt(char, offset):
    d = majuscules.index(char)
    c = (d - offset) % 26
    return majuscules[c]


def cesarDecrypt(text, offset):
    newText = ""
    tmaj = text.upper()
    for c in tmaj:
        newText +=  swapDecrypt(c,offset)
    return newText



#partie B

#1 : nous utiliserons une boucle qui testera toutes les cles possible (1..26)
def deciphered(text):
    for i in range(1, 27):
        print(cesarDecrypt(text,i))


#2 main principal

def main():
    text = input("text à decripé : ")
    deciphered(text)

if __name__ == "__main__":
   main() 