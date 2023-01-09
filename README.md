Localisation des restaurants :
Ce projet a pour but de mettre en place une application web permettant de localiser les restaurants selon la ville , la zone , la serie et la specialite .
Il utilise Spring boot dans back end , reactjs cote front end (web)  et la gestion de la base de données avec le SGBD Mysql.

Fonctionnalités partie web : (administrateur)

1- Gestion des villes
2- Gestion des zones
3- Gestion des spécialités
4- Gestion des séries
5- Affichage de la liste des restaurants
6- Validation des restaurants (Ajouter champ etat dans pharmacie : etat = 0 : en attente de validation ; etat = 1 : validée ; etat = 2 : refusé)
7- Statistiques ( Affichage du nombre des restaurants par ville et zone)
Fonctionnalités partie  proprietaire:

1- Inscription
2- Création de restaurant
3- Visualisation de l’état du restaurant
4- L’Ajout des photos de restaurant
Fonctionnalités partie internaute :

1- La recherche d’ un restaurant par ville, zone, spécialité ou série
2- Affichage des restaurants avec possibilité de parcourir les photos
3- Visualisation des restaurants dans une Map
4- Visualisation la position de l’utilisateur dans la map et mentionner les restaurants les plus proche
5- Affichage de l’itinéraire vers un restaurant
Mise en place du projet
Pour mettre en place ce projet, vous aurez besoin des éléments suivants :

Un serveur d'application Java (comme Tomcat)
Un SGBD (comme MySQL)
Un éditeur de code (comme Eclipse)
Le driver JDBC de votre SGBD (à télécharger sur le site officiel de votre SGBD)
Le framework Hibernate (à télécharger sur le site officiel ou via Maven)
Déploiement
Pour déployer ce projet sur votre serveur d'application, suivez les étapes suivantes :

Téléchargez le projet (vous trouvez au dessous les liens de la partie web ) sur votre ordinateur
Ouvrez-le dans votre éditeur de code
Configurez la connexion à votre SGBD dans le fichier application.properties pour le back end
Configurer votre adresse ip sur les fichiers pour assurer l’échange des donnée