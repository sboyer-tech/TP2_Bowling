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
    private int previous;
    
    
    

	
	public SinglePlayerGame() {
                score=0;
                lancer=0;
                coup=0;
                previous=0;
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            lancer=nombreDeQuillesAbattues;
            if(coup>=1){
                coup-=1;
                score+=lancer;
            }
            if(lancer==10){
               score+=lancer;
               coup+=2;
	}
            else if(lancer<10 || lancer>=0){
                score+=lancer;
                if(previous + lancer==10){
                    coup+=1;
                }
                previous=lancer;
                
            }
        }

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score(){
                
		return score;
                
}

}

