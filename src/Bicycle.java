

/**
 * Enumeração que representa ...
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @since 2015-07-29
 *
 */
 
public interface Bicycle  {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
