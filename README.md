# Chat-Application
INTRODUCTION
This is a network – based chat application written in Java and it is launched from the command line. The application consist of two different programs: ChatClient and ChatServer. They both can be started in the command line and are capable to send and receive messages between each other.
HOW DOES IT WORK?
First we have to open two different command lines. You have to navigate to the folder, where the programs are stored. Second step is to compile them. First we compile ChatServer. For Windows users we use the following command: javac ChatServer.java. After that we start the program by typing java ChatServer in the command line.
Second part is to compile the client program, using the command (for Windows users) javac ChatClient. After that we start it by typing java ChatClient in the command line. If everything is OK we will see in a ChatClient command promp a message: “Establishing connection. Please wait..”. And after that another message: “Successfully connected to the server on host (localhost).
On the other command prompt, where the server program is started we should see: “Listening for connection on port 2345”.
If we see all these messages, that means the connection is established and we can send and receive messages between both terminals.
We can type a message in the client command line and it will appear in the server command line. After that we can write a message in the server side and it should be shown in the client side. We can repeat this as long as we wish. When the client decide to interrupt the connection, he/she just has to type “\q” in the command line and to press Enter after that.
