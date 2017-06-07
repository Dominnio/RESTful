# RESTful
Server application

0) Kroki wstępne

Zbudować aplikację bazującą na szablonie Dynamic Web Project.
Ze strony https://jersey.github.io/download.html pobrać plik ZIP Jersey JAX-RS 2.X RI bundle.
Do katalogu WebContent/WEB-INF/lib skopiować pliki biblioteki Jersey. Dodać je do ścieżki budowy aplikacji.
Pobrać spakowany plik z projektem. Do testowania projektu konieczne jest uruchomienie serwera np. Glassfish.

1) Przykładowy import projektu

Projekt można zaimportować do Eclipse w następujący sposób :
File -> Open Projects from File System... -> Archive.
Po wybraniu projektu wcisnąć Finish.
W 'Project Explorer' powinnien pojawić się projekt o nazwie 'RESTful'.

2) Testowanie funkcjonalności

Należy uruchomić projekt na serwerze. 
(Kliknąć na projekt -> Run As -> Run on Server -> ...)
</br></br>
Natępnie można uruchomić klasę 'test.java' jako aplikację Javową.
(Kliknąć na klase -> Run As -> Java Application)
W odpowiedzi w konsoli powinniśmy otrzymać dane po unmarshallingu struktury XML zwróconej przez stronę.
</br></br>
Można również w przeglądarce podać ścieżkę np. http://localhost:8080/RESTful/student.
Powinniśmy otrzymać odpowiedź w formie xml.
