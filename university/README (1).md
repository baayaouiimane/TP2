
# University
On a créé un projet nomme university et dans ce dernier on a créé un package entities avec une classe product :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/47caa6ac-0691-4c2d-8449-4fb1acb32707)
On a utilisé @Data pour générer les getters et setters :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/29e65f1f-5384-4439-bd56-38522c0b1ed6)
Puis on a effectué une configuration dans application .properties:
![image](https://github.com/baayaouiimane/TP2/assets/167249908/9831aed3-cce7-4f05-a5b7-edae86a26503)
Si on veut se connecter à la base de données on va consulter Localhost :8085/h2-console :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ed7ae8f2-634a-4bd8-a108-70f0bde87941)
Puis on va utiliser l’url qu’on a créé ici :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/0fcd81d8-d4aa-4583-9f4c-0d2850a70d56)
Et on aura la page suivante ou on peut voir le tableau product avec les attributs :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/eeba228e-3b0a-4d3c-b8d0-a56773f274eb)
Donc si on veut ajouter des produits a notre base de données, on a créé une interface appelée ProductRepository et on a ajoute dans la classe UniversityApplication les produits qu’on veut ajouter.
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6fccf1c2-35ef-4614-a203-fcdb90a75ce5)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/c41f11d2-3300-461e-8824-ddb0b5c3bf81)
 Et voici les produits sont ajoute dans la base de donnees :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/96a2a46b-ffb3-4b62-b67a-b0392115b8dc)
 Ensuite si on peut afficher les produits :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/e3027889-fed4-4ea7-987c-cc8261c65865)
 Et voici l’affichage de ces produits :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/56475523-5c67-4d79-b8e7-5a5f52fb22b8)
 Dans ce qui precede on a travailler avec une base de donnees h2 , maintenant on va travailler avec une base de donnnees  mysql. Donc on va d’abord installer xampp :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/4934f43b-59ab-4fda-904e-c72b9d95b238)
 Donc pour travailler avec mysql on doit changer dans les dependances dans le code :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/3c82f841-7424-4f0c-b78b-271211884475)
 Donc maintenant si on execute notre application on va utiliser la base de donnees sql :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/68700c08-ba95-4085-95ad-2f3453fe2b28)
 Maintenant si on veut ajouter d’autre fonction par exemple une fonction qui va chercher tous les produits dont son nom contient C : 
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/10657a09-dcf0-4859-84a1-66022f4ba6ea)
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/e3315b7c-845f-4965-a482-3916890494ca)
 Et donc l’affichage sera comme suit, il va nous afficher les les produits qui contient C :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/0fd560a1-4b7c-45d7-a871-9bee7f90f62b)
 Une autre methode a faire on va utiliser search :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/8ebcb76f-f53f-45fd-9587-5c5ae8459071)
 Et bien sur on obtient  les memes resultats :
 ![image](https://github.com/baayaouiimane/TP2/assets/167249908/db6bb9fd-cae5-4b6f-aa09-76c72da7d982)
 
Un autre exemple,  cette fois ci si on veut chercher les prix  qui sont superieur a 3000 donc on va faire les etapes suivantes :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/185d73f5-f813-4a2e-91d7-e134a0f18571)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/2ff1ba38-71d2-46eb-9458-1be65de15b35)
Et voici l’affichage :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ff409bd1-53f8-46f3-991d-82c9187bdfa2)
On peut cree un web service , alors on a cree un package nomme web puis dans ce dernier on a cree une classe :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/149cef18-2d81-4dc0-afbd-e38743105924)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1335755f-d1b4-4671-8cf0-75f0cf1cd5c0)
On peut avoir chaque produits on utlisons son id comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/bde3c076-856d-4706-ac77-d37b57595fb9)
Par exemple le produit d’id 1 :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/3df9bcdc-b398-4f48-a86f-9c8747d79b32)









 
























