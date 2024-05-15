![Logo](https://upload.wikimedia.org/wikipedia/commons/e/ef/Youtube_logo.png)

# 📝 Youtube Downloader

This project was developed following an assignment given to us by Prof. **** ******. It was developed individually using the theoretical topic covered on *Web Services*, therefore SOAP and REST type APIs, and the use of TailwindCSS.

## 📕 Manuale

### 🗄️ Server

Prima di procedere è necessario avere installato sul proprio dispositivo Tomcat, oltre ovviamente una versione di Java superiore a Java 8 (nell'esempio dimostrativo viene utilizzato il JDK22). Il metodo più semplice per averli è accedere a questo sito [XAMPP](https://www.apachefriends.org/download.html), successivamente scaricare ed installare l`ultima versione. Una volta fatto tutto ciò aprire il pannello di controllo di XAMPP e abilitare la sezione "Tomcat" come nello screenshot seguente.

<img src="https://github.com/SamOraDur/05_ToDoList/blob/main/doc/img/xampp.png" height="400" width="800">

Procedere con il deploy delle applicazioni tramite tomcat, importando i file "06_YoutubeDownloader.war" (ritrovabile nella sezione release) e "06_YoutubeAPI" (ritrovabile nella sezione release di questa [pagina](https://github.com/SamOraDur/06_YoutubeAPI) ) , e procedendo con l'avvio delle applicazioni.

<img src="https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/img/tomcat.png" height="400" width="800">

A questo punto andare sulla pagina [localhost](http://localhost:8080/06_YoutubeDownloader) e procedere con l'utilizzo dell'applicazione!

#### 🗣️ Utilizzo

Sarà possibile effettuare una ricerca dei video di nostro interesse.

<img src="https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/img/search.png" height="400" width="800">

E ritrovarsi un`elenco di 20 video

<img src="https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/img/searched.png" height="400" width="800">

Una volta cliccata un`immagine del video che si vuole scaricare si potrà scegliere tra i formati MP3 e MP4. Infine premere il pulsante download.

<img src="https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/img/format.png" height="400" width="800">

## 🧑 Autore

- Durante -> [@SamOraDur](https://www.github.com/SamOraDur) 

## ✍️ Documentazione

- [Presentazione](https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/YTDownloaderPresentazione.pptx)
- [Guida al deploy (pdf) ](https://github.com/SamOraDur/06_YoutubeDownloader/blob/main/doc/Manuale.pdf)
