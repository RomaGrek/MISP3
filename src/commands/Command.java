package commands;

/**
 * @author Kir
 * Created on 24.04.2021
 */
public interface Command {
    default void execute(String ... args) {}

    default String getName() { return ""; }
}
