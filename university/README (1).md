# University
On a créé un projet nommé university et dans ce dernier on a créé un package entities avec une classe product :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/3d13c794-4589-48df-87fb-c25fb2febbb7)
On a utilisé @Data pour générer les getters et setters :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/2cd9778d-159d-434c-b9f0-0559bbbee05e)
Puis on a effectué une configuration dans le fichier  application. properties :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/10c148ad-0806-4604-a880-d4ff8dd34cec)
Si on veut se connecter à la base de données on va consulter Localhost :8085/h2-console :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/7414a874-1a6e-47a0-b6c1-b6dbd12630f3)
Puis on va utiliser l’url qu’on a créé ici :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ad00f84a-a297-4075-98c3-6f60f1ba4f93)
Et on aura la page suivante ou on peut voir le tableau product avec les attributs :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ce9ec717-1bca-4800-a7b1-3c460c07fbff)
Donc si on veut ajouter des produits a notre base de données, on a créé une interface appelée ProductRepository et on a ajoute dans la classe UniversityApplication les produits qu’on veut ajouter.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/4bf9cbfd-c11e-4daf-875a-da8bebef9f5d)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8149fed4-70aa-4337-926c-5486794d0359)
 Et voici les produits sont ajoutés dans la base de données :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/d4dfccb0-1ccc-4b4f-af5f-e4fae403e7d7)
 Ensuite si on peut afficher les produits :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/3d21fa99-4778-442f-9a0a-02cdd826e310)
 Et voici l’affichage de ces produits :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/f0ece784-feb7-44b9-8885-11c52f48440a)
 Dans ce qui precede on a travaillé avec une base de donnees h2 , maintenant on va basculer vers la base donnée  mysql. Donc on va d’abord installer xampp :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8211893a-7869-454c-a993-cb6c95465140)
Donc pour travailler avec mysql on doit changer dans les dépendances dans le code :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/cd63aff1-1165-4fee-8910-dc0cf60945c5)
Donc maintenant si on exécute notre application on va utiliser la base de données sql :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/aad33498-124f-4fac-8919-29b6d186a5e8)
Maintenant si on veut ajouter d’autre fonction par exemple une fonction qui va chercher tous les produits dont son nom contient C : 
![image](https://github.com/baayaouiimane/TP2/assets/167249908/b283f739-12d0-43ba-b6ca-7e297eb7452e)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8118d7aa-0eb7-442d-ae2a-2f7d2baf7085)
Et donc l’affichage sera comme suit, il va nous afficher les les produits qui contient C :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/3878e817-31fe-41c2-80a3-5aa47ae71392)
Une autre methode a faire on va utiliser search :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/7e6c9e6b-04e5-4ffd-bd6d-78ce8e73e3c3)
Et bien sur il va nous donner les meme résultats :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/9dad9e4b-bd6f-406b-8980-706f0302082f)
Un autre exemple, si on veut chercher les prix superieur a 3000 donc on va faire les étapes suivantes :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/b9e1af07-9447-44e9-b1bc-d30f8a4688b4)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/076c646f-70b8-409d-92ed-479f246dc403)
Et voici l’affichage :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6a69963f-c132-481e-ad75-607de23623c7)
On peut créer un web service , alors on a crée un package nomme web puis dans ce dernier on a crée une classe :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/b6444510-44a9-419c-8365-b18986f4b00c)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/44f01533-a87e-410c-b9b8-206f2b2ddba1)
On peut avoir chaque produits on utlisons son id comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ae12f4da-6d19-4a85-abf7-79463533d25c)
Par exemple le produit d’id 1 :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/88ddeb06-b7f4-4a17-918b-8ff31cd4cf24)













 
























 
























