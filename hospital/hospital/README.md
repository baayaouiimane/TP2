
# Hospital
Dans ce tp on a créé un projet maven à partir du site start.spring.io , et dans ce projet on a créé un package entities qui contient les classes suivantes :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/c2d17e41-e609-478d-a7a3-e09562ac968f)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/9cf576e7-0fd8-437c-98cc-08a2fc77d3c5)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/e2eef91c-39d9-409f-91ad-c96cee4c68e7)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/136a2203-d911-452c-b154-262ebabeb76b)
Et une énumération :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6897f9be-8d81-4ae1-8c99-4979f298bdf2)
Donc maintenant on peut generer notre base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/aa03cb1b-1142-426d-a77e-9c30925ae285)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/df7db6ca-af89-45b0-a5af-fb1af5f6a5e1)
Ensuite on va créer les interfaces jpa repository :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/01fe5ffe-8585-4f6a-b55b-ac9d16d7aeca)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/3798ba71-946e-4665-867f-20868ac17203)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/15e61eae-02ba-4bfa-9fe8-78e8aa8ebb62)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/2cd19343-f9c9-40be-8f8d-7447fb628b15)
On peut ajouter des patient au tableau patient comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/e44fc11c-023f-4d04-a8d4-b901b5b0322d)
On peut les voir dans la base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/09dea754-299c-4695-8cd2-4160bb34217a)
On peut faire la meme chose avec le tableau medecin :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8f15dfe5-d986-43d2-b749-69dddff27cee)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/8474e8fb-cea1-42d6-98cc-312335ebed56)
On peut créer un rendez-vous à partir d’un patient et un medecin déjà existe dans la base de données :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/33d89960-9c76-4f78-b69a-7e29d5d38d19)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/c9530912-164a-4d13-b496-730ef778a8a6)
On remarque que le status a la valeur 0, alors si on veut que le status soit string on va ajouter dans la classe rendezvous 
@Enumerated(EnumType.STRING) :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d878971e-8adb-4e0a-a430-50f3a0553507)
Voici dans l’affichage on voit bien que la valeur de status devient string :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f493b65d-5036-4770-a03b-82c5cf72b541)
Et maintenant on va faire une consultation :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/c9235595-6951-4fa9-80a5-c3eff8b78874)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f7080db4-c1f1-45ec-a9c1-e9b51049e6e9)
Puis on a ajouter une couche service a notre application :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1e657ef8-2b32-4ddd-a274-f9b726c50e91)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/91770d47-81ae-4a63-b379-f23689b854e7)
Donc maintenant on a pas besoin d’injecter tous les interfaces repository , mais on vautiliser directement la couche service :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/cbc70019-bc36-4c50-81b6-18c70e2ba94c)
D’une autre part on peut changer le type d’id du rendezVous de long a String comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6e6af859-1db9-4849-8f5d-3ea9f0bab4b3)
Voici l’affichage :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6e6ca31f-af82-4e82-8ba1-7925d5804a95)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/31343ffc-978e-48d6-8257-1971b0248586)















































