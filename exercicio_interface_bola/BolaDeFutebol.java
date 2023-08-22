public class BolaDeFutebol extends Bola{

    
        public BolaDeFutebol(String marca) {
            super(marca);
        }

    public void lancar() {
        System.out.println("A bola de futebol " + getMarca() +  " foi lançada!");
    }

   
    public void quicar() {
        System.out.println("A bola de futebol quicou no chão!");
    }

}
    
