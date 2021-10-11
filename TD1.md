# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Les cases cochées ajoutent des fichers dans le repository. Selon la case, un fichier README.md, .gitignore, ou un fichier de licence sera crée.

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    $ git config --global user.name "Romain GICQUIAUD--ROUSSET"
    $ git config --global user.email romaingicquiaud@yahoo.fr
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    $ git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    $ git commit -m "Ajout des classes Main et Fraction"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    public class Main
	{
		public static void main(String[] args){

			Fraction stringTest = new Fraction(10,5);
			System.out.println(stringTest.toString());
		}
	}
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    $ git add *.java
	$ git commit -m "Adding constructor + test in main"
	$ git push
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Markdown
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    $ git pull
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    *.class
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    git rm *.config
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    *.config
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Pour configurer l'accès pas clés SSH, il faut commencer par créer une clé via :
    ```bash
    $ ssh-keygen -t ed25519 -C "adresse_mail@github.com"
    ```
    une fois la clé crée, on la récupère et on peut l'envoyer sur git pour la valider dans "Settings" puis "SSH and GPG keys"

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Linux debian, bash
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    $ man
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        $ ls -lS    -> -l donne la liste (et la taille) et -S trie les fichiers par taille (+ gros en haut)
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        $ wc -l Main.java
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        $ grep -F uneVariable Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        $ grep -F uneVariable *.java
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
		$ find -name README.md
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        $ diff file1.txt file2.txt
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        Ssh (client) est un programme qui permet de se connecter à des machines distantes pour y exectuer des commandes.
        Ssh permet aussi d'avoir une communication chiffrée entres les machines. 
    * `screen`/`tmux`
        > screen et tmux sont des multiplexeurs, c'est à dire qu'ils permettent de séparer une fenêtre shell en plusieurs.
    * `curl`/[HTTPie](https://httpie.org/)
        > Curl et HTTPie permettent de transfèrer des données vers des serveurs ou bien de télécharger des données depuis des serveurs.
    * [jq](https://stedolan.github.io/jq/)
        > jq permet de manipuler les JSON via différents filtres.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > IntelliJ
    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > En bas a gauche de l'IDE.
1. Comment choisir le JDK à utiliser dans un projet ?
    > Pour choisir un JDK on regarde d'abord la compatibilité avec les librairies que l'on va utiliser, et ensuite on choisit la version la plus stable dans les versions les plus récentes.
1. Comment préciser la version Java des sources dans un projet ?
    > On met une entête @version xxx.xxx.xxx
1. Comment ajouter une bibliothèque externe dans un projet ?
    > File -> Project structure -> Modules -> Dependencies -< (+) -> Library -> inclure la librairie
1. Comment reformater un fichier source Java ?
    > Ctrl + Alt + Shift + L
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Ctrl + B
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Ctrl + Alt + S
1. Comment renommer une classe dans l'ensemble du projet ?
    > Shift + F6
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > En haut a droite "nom_du_fichier" -> edit configuration -> environment variables
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Utilisation du debogeur (petit icone insecte)
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Les tests unitaires son assez important en java et permettent de bien tester et d'implementer ces tests.
