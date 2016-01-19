#RMI Vigenère Cypher Breaker Application

Java application to implement a cryptanalytic distributed system for breaking Vigenère
cyphers.

Java rmi api and Apache Tomcat servlet used.

##RMI Package

Application for encrypting and decrypting text.

Vigenere class encrypts text.

KeyEnumerator class cracks cypher text.

QuadgramMap class creates a map that relates n-grams to integers.

VigenereBreaker class is a remote interface.

VigenereBreakerImpl class implements VigenereBreaker.

Server class creates rmi server with VigenereBreaker object.

******************************************************************
##Craker Package

Client class uses rmi to listening in port 1099 for object that is bound to rmi registry.

CrackerHandler class creates serverlet for client.

*****************************************************************
##To run this app.....

Copy the cracker archive into your apache server webapps folder and let it create the web folder. Startup apache tomcat server.

Run the server class in RMI package.

Run the client class in Cracker package.

Go to *http://localhost:8080/cracker*

