package java.org.hamcrest;

import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;

/**
 * A description of a Matcher. A Matcher will describe itself to a description
 * which can later be used for reporting.
 *
 * @see Matcher#describeTo(org.hamcrest.Description)
 */
public interface Description {
  /**
   * A description that consumes input but does nothing.
   */
  static final org.hamcrest.Description NONE = new NullDescription();
  
    /**
     * Appends some plain text to the description.
     */
    org.hamcrest.Description appendText(String text);

    /**
     * Appends the description of a {@link SelfDescribing} value to this description.
     */
    org.hamcrest.Description appendDescriptionOf(SelfDescribing value);

    /**
     * Appends an arbitrary value to the description.
     */
    org.hamcrest.Description appendValue(Object value);

    /**
     * Appends a list of values to the description.
     */
    <T> org.hamcrest.Description appendValueList(String start, String separator, String end,
                                                 T... values);

    /**
     * Appends a list of values to the description.
     */
    <T> org.hamcrest.Description appendValueList(String start, String separator, String end,
                                                 Iterable<T> values);

    /**
     * Appends a list of {@link org.hamcrest.SelfDescribing} objects
     * to the description.
     */
    org.hamcrest.Description appendList(String start, String separator, String end,
                                        Iterable<? extends SelfDescribing> values);


    public static final class NullDescription implements org.hamcrest.Description {
      @Override
      public org.hamcrest.Description appendDescriptionOf(SelfDescribing value) {
        return this;
      }

      @Override
      public org.hamcrest.Description appendList(String start, String separator,
          String end, Iterable<? extends SelfDescribing> values) {
        return this;
      }

      @Override
      public org.hamcrest.Description appendText(String text) {
        return this;
      }

      @Override
      public org.hamcrest.Description appendValue(Object value) {
        return this;
      }

      @Override
      public <T> org.hamcrest.Description appendValueList(String start, String separator,
          String end, T... values) {
        return this;
      }

      @Override
      public <T> org.hamcrest.Description appendValueList(String start, String separator,
          String end, Iterable<T> values) {
        return this;
      }

      @Override
        public String toString() {
          return "";
        }
    }
}
