
import Controller.PetController;
import Model.Pet;
import Services.Repository;
import Services.PetRepository;
import UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        Repository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    