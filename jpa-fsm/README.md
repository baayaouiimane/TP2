
# jpa-fsm
Tout d’abord on a commencé par créer un projet nommé jpa-fsm et on a choisi les différentes dépendances dont on aura besoin pour travailler, par la suite on a créé un package nommé entities ce dernier contient une classe Role  contenant les attributs  et une association ManyToMany ci-dessous:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1e828b5a-bb53-4055-ac1a-eb4d710b81d4)
Ainsi qu’à l’intérieur de ce package on la classe User qui comporte les différents attributs qui apparaissent dans la capture d’écran :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/228e3a34-6b96-4416-9e14-9f7962a87e55)
En faisant un enchainement dans notre travail on a créé un autre package dont son nom repositories comportant deux interfaces la première est : RoleRepositories qui contienne une méthode  qui cherche le rôle de l’utilisateur par son roleName.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f1283510-6b01-4bf8-9073-d7670d15d812)
Et la deuxieme interface est :UserRepository,cette dernière contient la méthode qui retourne un user par son username.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/31f4486c-0d7e-4717-b181-7af0f974006c)
Ensuite on a réalisé une création d’un autre package nommé :service contenant une interface  dont son nom UserService qui contient une méthode qui ajoute  un utilisateur et un rôle et une méthode qui cherche l’utilisateur par son userName et le rôle de l’utilisateur par son roleName par la suite  on a une méthode qui permet d’ajouter un utilisateur a un rôle.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/98f5d219-7c23-490a-b6cd-da56245ff1a3)
Ainsi que ce package contient aussi  une classe: UserServiceImpl qui contiennent l’implémentation des différents méthodes dont on a besoin de faire les différents injections  et dépendances comme il est présenté ci-dessous dans les captures d’écrans.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1828a16c-bc86-42c7-a723-0267aedb422e)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/21093eef-c1b0-4b30-a0c0-7625e5070d7f)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/11dbae97-967b-4ac2-a242-bf7636adeb78)
Et puis pour savoir ci tout ça marche bien on aura besoin de spécifier la base de donnée et par la suite on est censé d’utiliser le jdbc  et le numéro de port. Tout ça s’effectue dans  application.properties.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/cebafca1-74db-4360-9993-587c7babf080)
Par la suite on exécute l’application pour voir si tous marche bien : l’application est démarrée et  on va regarder :localhost:8083/h2-console
![image](https://github.com/baayaouiimane/TP2/assets/167249908/979cd3e4-aae8-43bf-9d96-d23bfd379d61)
En cliquant sur le bouton connect  on peut voir les différentes tables :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/7602e575-2b0c-4659-9268-78cb04455cc0)
Et on aura comme résultat :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/bcc01fa6-d8f2-4361-994d-0325c2b03eb7)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8023a5a3-d71c-4519-8664-553aa748981c)
Le résultat est le suivant :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/19e4ea73-9484-4888-af5b-6a0d5bd24704)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/242792eb-ef74-4dcf-b312-0b70d96a5892)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/52276d47-415f-4abc-9b0f-4b32058d0874)
Apres on a ajouté dans l’interface UserService une méthode  nommée authenticate qui va retourner le user :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1f8f273a-95b3-4559-b220-1235dbbf9d00)
Ensuite on va redéfinir  la méthode quand vient de citer dans la classe UserServiceImpl :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ec45253e-bc43-4d51-bd3c-c8b5ab0f456c)
Pour tester cette méthode on a utilisé try et catch comme il est présenté ci-dessous :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/befacc9c-fa1c-4a14-9712-2215b6fd50e2)
Pour savoir que ceci marche bien voici le résultat :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/5d655bb8-8296-4aa1-804e-65dc2a2a901e)
Par la suite on va basculer vers la base de donnée mysql, il faut juste  effectuer des changements dans le fichier pom.xml : c’est à dire mettre en commentaire  la base h2 et ajouter la dépendance mysql-connector-java, comme il est présenté ci-dessous :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/709bc3bc-dfd7-46b8-bd98-a736873b766a)
Et aussi faut changer dans le fichier application.properties :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6d8bf3df-23c8-4402-9068-74804889d0ec)
Par la suite on démarre xampp et on démarre l’application  et on remarque que sur mysql  existe quelques exceptions  car   quand il essaye de créer la base de donnée create table bein  il a trouvé un champ appelé desc qui représente un mot clé qui n’admet pas dans la structure de la base de donnée. Pour résoudre ce problème on doit  modifier  dans la classe Role en ajoutant une instruction :
@Column(name= ‘DESCRIPTION ‘) comme il est présenté dans la capture d’écran ci-dessous. 
![image](https://github.com/baayaouiimane/TP2/assets/167249908/a9b64991-e5e0-4ffb-829b-2d0063b672a6)
Ensuite en exécutant le code on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/cf419689-6334-4de7-b3a6-d53ecc895a59)
Et par la suite on va consulter la base de donnée:users_db
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ca262bbd-cdca-47c4-a420-6c056e0f7729)
On a la table role:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/5c42496b-1140-4a59-af37-000e96a5e2ee)
Et la table role_users:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/308b3cc6-148d-4c78-a0e9-9ba3f2e22886)
Et la table users:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1cc0951a-d42f-4753-9425-97f10331f3be)
Ensuite on va ajouter un petit controle pour consulter les utilisateurs coté applications, on va commencer par creer un controlleur nommé UserController
![image](https://github.com/baayaouiimane/TP2/assets/167249908/a05fd007-687e-436f-a794-0fa0c937f53a)
et on va ajouter une petite modification dans Role.java:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/fc367fe3-8ea0-48c9-9829-ec6d164445d4)
En consultant le site localhost:8083/users/user1
![image](https://github.com/baayaouiimane/TP2/assets/167249908/07d4f6ee-e5b8-4eb4-b7e6-fcae4d40cddd)
Et apres avoir apporter  une petite modification a User.java:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/73bd98ed-7918-49d2-a56e-c404d4c0b2c6)
En consultant le site localhost:8083/users/user1
![image](https://github.com/baayaouiimane/TP2/assets/167249908/80c89a23-16d6-4413-b54e-a9f14aafbd71)

































