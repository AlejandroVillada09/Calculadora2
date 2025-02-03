package Validators;
public class Validador {
    public boolean validar(int optionMenu){
        if (optionMenu >= 1 && optionMenu <= 6){
            return true;
        } else {
            return false;
        }
    }
}