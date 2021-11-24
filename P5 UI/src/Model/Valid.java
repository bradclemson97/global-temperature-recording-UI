package Model;

import java.util.Optional;

/**
 * This class is designed handling the results of data validation. If the object is
 * valid. we want to return the object. If it is not valid then we want to return
 * messages that say why it is not valid.
 *
 * In this, class, we are following a functional approach so the class using an Optional
 * object.
 *
 * @author ET
 * @version 27/08/2019 15:51
 */
public class Valid<T> {
    private T object;
    private String errorMessage;

    /**
     * This constructor is used when we have a valid object to return.
     *
     * @param object a valid object object
     */
    public Valid(T object) {
        this.object = object;
        errorMessage = "";
    }

    /**
     * This constructor is used when we want to report error messages.
     *
     * @param errorMessage The error messages
     */
    public Valid(String errorMessage) {
        this.errorMessage = errorMessage;
        this.object = null;
    }

    /**
     * Returns the error messages or an empty string. Potentially, this could be an
     * optional String.
     *
     * @return error messages if there are some and an empty string otherwise.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean noMessages() {
        return errorMessage.length() == 0;
    }

    /**
     * This returns an Optional<Person> object in order to conform with functional
     * style thinking.
     *
     * @return An Optional<Person> object
     */
    public Optional<T> get() {
        return Optional.ofNullable(object);
    }

    /**
     * If a Person object is present, returns {@code true}, otherwise {@code false}.
     *
     * @return {@code true} if a Person object is present, otherwise {@code false}
     */
    public boolean isPresent() {
        return object != null;
    }

    /**
     * If a Person object is not present, returns {@code true}, otherwise
     * {@code false}.
     *
     * @return  {@code true} if a Person object is not present, otherwise {@code false}
     */
    public boolean isEmpty() {
        return object == null;
    }
}
