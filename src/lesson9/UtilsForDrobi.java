package lesson9;

public class UtilsForDrobi {

    public static int commonZnamm(DrobnoeChislo drb1, DrobnoeChislo drb2){

        int commonZnam = 1;
        for (int i = 1; i < drb1.getZnamenatel()* drb2.getZnamenatel();i++){
            if (i % drb1.getZnamenatel() == 0 & i % drb2.getZnamenatel() == 0 ){
                commonZnam = i;
                break;
            }

        }
          return commonZnam;
    }

}
