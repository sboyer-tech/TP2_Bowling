package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
    private int score;
    private int lancer;
    private int coup;
    
    
    

	
	public SinglePlayerGame() {
                score=0;
                lancer=0;
                coup=0;
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            if (coup==1){
                coup-=1;
                score+=2*nombreDeQuillesAbattues+10;
                
            }
            else if(coup==2){
                
            }
            else{
               if(nombreDeQuillesAbattues<10){
                   int reste=10;
                   reste-=nombreDeQuillesAbattues;
                   score+=nombreDeQuillesAbattues;
                   if(reste!=0){
                       /*methode spair*/
                       coup+=1;
                   }
                   else if(nombreDeQuillesAbattues==10){
                       /*methode strike donc on rajoute 10* garder pour les 2 prochains boules */
                       coup+=2;
                       
                   }
               }
            }
               
               
	}

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
                
		return score;
                
	}
}

