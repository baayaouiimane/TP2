
# Hospital
Dans ce tp on a créé un projet maven à partir du site start.spring.io , et dans ce projet on a créé un package entities qui contient les classes suivantes :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/979705e6-4332-4f90-9d9e-896d94eeebab)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1e1c4778-c57b-4194-8aee-aaa2964259f0)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/25c63102-4660-4606-975b-2fd80d2f08cc)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6191bb53-a396-4b09-92e5-fa8d7364913c)
Et une énumération :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6f302552-14d6-4595-9b6f-3d60c9917293)
Donc maintenant on peut generer notre base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6a362b84-e629-42a1-8044-b1e7d3327760)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/4ab4a01e-079f-4606-912d-ec91b856d555)
Ensuite on va créer les interfaces jpa repository :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/3de4be7c-6215-41d1-99d8-73bedd8b86d4)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/4f827e7c-bb65-4685-8314-e937528ee5cf)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d94d07b0-81cf-4203-9958-4088cf88ce4c)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/4bef5363-afe5-4da6-a917-f9283b811e30)
On peut ajouter des patient au tableau patient comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/28bb942b-4fe2-4b9e-ba53-04180a73d257)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/cffdfa07-55a7-4c31-9a9f-0d7caa7988e4)
On peut les voir dans la base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d452e31c-9ecf-4076-8440-76350ce9d5f7)
On peut faire la meme chose avec le tableau medecin :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/9c09a9dc-6b39-4e36-ad03-9c59fc41c4d1)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/eb0ca541-2395-415f-ac74-fa2f3bc55030)
On peut créer un rendez-vous à partir d’un patient et un medecin déjà existe dans la base de données :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/08f4f665-5175-4b86-b8ae-5a57269f3ac0)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/e4b81542-02e0-4493-8618-71b0a884083d)
On peut faire la meme chose avec le tableau medecin :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/5cdb18fe-135e-4cf9-bd7a-8a23d95dd67f)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/2d65ad91-6389-4e97-a206-21d20f278a59)
On peut créer un rendez-vous à partir d’un patient et un medecin déjà existe dans la base de données :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/88153348-4b17-4289-943b-b918f0f906b9)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1507747c-8761-4efc-9cec-e02c15b02344)
On remarque que le status a la valeur 0, alors si on veut que le status soit string on va ajouter dans la classe rendezvous 
@Enumerated(EnumType.STRING) :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/62271d8d-58d8-4e3c-a094-253fe36f77f7)
Voici dans l’affichage on voit bien que la valeur de status devient string :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/66092c2a-d88c-41ca-aa5b-a0a91d40ae25)
Et maintenant on va faire une consultation :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f69e47eb-f259-44a9-9d58-3ba8cf192f79)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/0a027e1e-d17e-4963-80e6-002d5e46c0f8)
Puis on a ajouter une couche service a notre application :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d922c04f-6d62-4aac-ba4f-a4762ae8b9e6)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/a1fc0564-d29c-4a7a-91b7-a6dd79873dcf)
Donc maintenant on a pas besoin d’injecter tous les interfaces repository , mais on vautiliser directement la couche service :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d3e361b2-61c4-4f0f-b78d-0dbf5efc40cc)
D’une autre part on peut changer le type d’id du rendezVous de long a String comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/1ee528a9-933e-4a20-a53b-ac8483cddf2a)
Voici l’affichage :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/9d30f1c9-7bb6-4384-97ea-f3c2d5cb1b0e)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/42ee1719-ab4d-49cb-ab93-dd845d284502)
































