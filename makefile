CC=javac

SinglyLinkedList:
		$(CC) structures/SinglyLinkedListApp.java

BinaryTree:
		$(CC) structures/BinaryTreeApp.java

Graph:
		$(CC) structures/GraphApp.java

all:
		$(CC) -Xlint:unchecked *.java structures/*.java
