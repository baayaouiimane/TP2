
# Hospital 
Dans ce tp on a créé un projet maven à partir du site start.spring.io , et dans ce projet on a créé un package entities qui contient les classes suivantes :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/540fc210-45c9-440a-991b-f5e931590647)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/77c4734b-4930-4e51-b76f-373ad20a54a3)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f7a651bc-5c29-4873-843d-746514248d9c)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/b0947e97-5fbe-4c56-858e-a917c5693a8c)
Et une énumération :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6a85a39b-0ffa-4c77-9ea3-e7a683507d36)
Donc maintenant on peut generer notre base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/6dcdd435-0feb-4754-bb3b-73c63820eab4)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/f1d8f24d-f3be-4df6-ade3-8b23a1aa97f6)
Ensuite on va créer les interfaces jpa repository :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/25027836-2fa6-4f18-a597-1572a959b228)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/b4bbb0fe-43e4-46b3-9109-5771889bab1a)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/623b34c5-3015-4613-9d46-b268bbe3b0b1)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/246c9a90-1373-4746-b300-b6bce697c775)
On peut ajouter des patient au tableau patient comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/2ba35241-d3cb-4407-8bc8-f27a32be8dd6)
On peut les voir dans la base de donnees :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/efa800ae-7122-4a4f-8666-8fe92a25bea1)
On peut faire la meme chose avec le tableau medecin :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/acfbbc71-9204-4f43-8b50-65f4011c228e)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/d5a451a3-051e-4640-82a5-3e073ec68840)
On peut créer un rendez-vous à partir d’un patient et un medecin déjà existe dans la base de données :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/bf1a7ec7-41d5-4209-be9f-62866c26f4fc)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/ac7b0c3b-3197-47bf-b7f6-2e6208ad53f3)
On remarque que le status a la valeur 0, alors si on veut que le status soit string on va ajouter dans la classe rendezvous 
@Enumerated(EnumType.STRING) :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/fab6e0c3-1244-4ae5-9069-3ab14c7676a6)
Voici dans l’affichage on voit bien que la valeur de status devient string :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/a3540ad8-22a7-4102-9887-5c59791160fa)
Et maintenant on va faire une consultation :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/245cf6be-367b-47a2-99b8-e1de3deb4561)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/e1ff7d28-d8fb-4211-a8c3-983c3230c167)
Puis on a ajouter une couche service a notre application :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/bec3ab81-1d38-4900-84ab-4f2373d0d4c9)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/a7e6dc85-f44c-4c6e-8bad-f733791dea48)
Donc maintenant on a pas besoin d’injecter tous les interfaces repository , mais on vautiliser directement la couche service :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/73015384-61a5-4fb4-8b70-a1d4d0e7c422)
D’une autre part on peut changer le type d’id du rendezVous de long a String comme suit :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/502cb40d-1ba9-46dd-bde6-7c3016e89401)
Voici l’affichage :
![image](https://github.com/baayaouiimane/TP2/assets/167249908/87fd007f-1460-4db1-b117-20bd578c24fc)
![image](https://github.com/baayaouiimane/TP2/assets/167249908/27bbfe21-ae4c-401b-971a-76ea1c9722c7)































