# Progetto TCP

##  Descrizione
Questo progetto implementa un sistema di comunicazione in Java tramite socket TCP.  
Il client invia messaggi al server, il server li riceve e risponde con un messaggio di conferma. 
La comunicazione continua finché il client invia la parola "fine", che termina la connessione.

# Struttura del progetto

Il progetto è composto da quattro classi:

- Client.java 
- MainClient.java 
- Server.java 
- MainServer.java


# Funzionamento

## Avvio del server
Il server:

1. Si avvia sulla porta 12345
2. Attende la connessione di un client
3. Riceve messaggi
4. Invia risposta: "Ricevuto: <messaggio>"
5. Chiude la connessione quando riceve "fine"
6. Torna in attesa di un nuovo client

## Avvio del client
Il client:

1. Si connette a localhost:12345
2. Permette all’utente di scrivere messaggi da tastiera
3. Invia il messaggio al server
4. Mostra la risposta del server
5. Termina quando l’utente scrive "fine"

#  Protocollo di comunicazione

- Trasporto: TCP
- Messaggio di terminazione: fine

#  Come eseguire il progetto

## Avvio server

Server avviato
In attesa client...

## Avvio client 

Client connesso
Inserisci messaggio:

# Esempio di esecuzione

Client:

Inserisci messaggio: Ciao
Server Ricevuto: Ciao
Inserisci messaggio: prova
Server Ricevuto: prova
Inserisci messaggio: fine


Server:

Server avviato
In attesa client...
Client connesso
Ricevuto: Ciao
Ricevuto: prova
Connessione chiusa
In attesa client...

# Concetti utilizzati

- Socket TCP  
- Comunicazione di rete  
- Cicli di ascolto server  
- Gestione eccezioni (try–catch)  

# Possibili miglioramenti

- Gestione di più client (thread)  
- Interfaccia grafica  
- Chat bidirezionale continua  
- Log su file  
- Timeout connessione  


# 
Progetto svolto a scuola da un ragazzo di quinto superiore nelle ore di tpsit. Per la creazione sono stati utili i consigli dati dalla prof. Ciuchetti il prof. Amendola
