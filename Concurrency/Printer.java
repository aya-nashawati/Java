����   9 4  Printer  java/lang/Thread <init> (Ljava/lang/String;)V Code
  	   LineNumberTable LocalVariableTable this 	LPrinter; str Ljava/lang/String; run ()V	    java/lang/System   out Ljava/io/PrintStream;
     getName ()Ljava/lang/String;
    java/io/PrintStream    print
 " $ # java/lang/Math % & random ()D@�@     
  * + , sleep (J)V . java/lang/InterruptedException i I StackMapTable 
SourceFile Printer.java                 >     *+� �    
   
                                �     )<�  � *� � � ! 'k��� )� M�
���     -  
       	          	 (         )      & / 0  1    � X -   2    3