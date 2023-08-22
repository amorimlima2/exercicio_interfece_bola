public class BolaDeBoliche extends Bola {
       
    public BolaDeBoliche(String marca) {
          super(marca);
        }

    public void lancar() {
        System.out.println("A bola de boliche " + getMarca() + " foi lancada!");
    }

   
    public void quicar() {
        System.out.println("A bola de boliche quicou no chão!");
    }

}
