package Modeles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String args[])
	{
		/*
		 * On aura une Liste qui contiendra toutes les lettres avec leur �quivalent en morse � partir d'un fichier txt [s�parateur]
		 * Ensuite on ouvre le fichier, on recup�re le tableau des mots [Tableau de string][fait]
		 * 	-> Boucle sur chaque mot
		 * 		->Chaque mot est d�compos� en lettre [soit dans la classe lettre soit dans la classe mot][� def]
		 * 		->Ensuite chaque lettre fait appel � une fonction de conversion qui renvoie soit le code morse soit l'inverse [classes lettre et code barre]
		 * 		->Le resultat est enrengistr� dans un tableau qui ensuite est affich� sur l'interface graphique
		 * 
		 */
		Fichier f0 = new Fichier("C:\\\\Users\\\\leduc41u\\\\eclipse-workspace\\\\projetjava_algo\\\\src\\\\Texte\\\\mot.txt");
		f0.LectureFichier();
		f0.FichierToTableauMots();

		
	
	
	CodeMorse c0 = new CodeMorse(".-");
	Lettre l0 = new Lettre("a",".-");

	c0.ConversionCodeToLettre();

	}

}
