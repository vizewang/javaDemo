package java.org.hamcrest.core;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import org.hamcrest.core.AllOf;

import java.util.ArrayList;

public class CombinableMatcher<T> extends TypeSafeDiagnosingMatcher<T> {
  private final Matcher<? super T> matcher;

  public CombinableMatcher(Matcher<? super T> matcher) {
    this.matcher = matcher;
  }

  @Override
  protected boolean matchesSafely(T item, Description mismatch) {
    if (!matcher.matches(item)) {
      matcher.describeMismatch(item, mismatch);
      return false;
    }
    return true;
  }

  @Override
  public void describeTo(Description description) {
    description.appendDescriptionOf(matcher);
  }

  public org.hamcrest.core.CombinableMatcher<T> and(Matcher<? super T> other) {
    return new org.hamcrest.core.CombinableMatcher<T>(new AllOf<T>(templatedListWith(other)));
  }

  public org.hamcrest.core.CombinableMatcher<T> or(Matcher<? super T> other) {
    return new org.hamcrest.core.CombinableMatcher<T>(new AnyOf<T>(templatedListWith(other)));
  }

  private ArrayList<Matcher<? super T>> templatedListWith(Matcher<? super T> other) {
    ArrayList<Matcher<? super T>> matchers = new ArrayList<Matcher<? super T>>();
    matchers.add(matcher);
    matchers.add(other);
    return matchers;
  }

  /**
   * Creates a matcher that matches when both of the specified matchers match the examined object.
   * For example:
   * <pre>assertThat("fab", both(containsString("a")).and(containsString("b")))</pre>
   */
  public static <LHS> CombinableBothMatcher<LHS> both(Matcher<? super LHS> matcher) {
    return new CombinableBothMatcher<LHS>(matcher);
  }
  
  public static final class CombinableBothMatcher<X> {
    private final Matcher<? super X> first;
    public CombinableBothMatcher(Matcher<? super X> matcher) {
        this.first = matcher;
    }
    public org.hamcrest.core.CombinableMatcher<X> and(Matcher<? super X> other) {
      return new org.hamcrest.core.CombinableMatcher<X>(first).and(other);
    }
  }

  /**
   * Creates a matcher that matches when either of the specified matchers match the examined object.
   * For example:
   * <pre>assertThat("fan", either(containsString("a")).or(containsString("b")))</pre>
   */
  public static <LHS> CombinableEitherMatcher<LHS> either(Matcher<? super LHS> matcher) {
    return new CombinableEitherMatcher<LHS>(matcher);
  }
  
  public static final class CombinableEitherMatcher<X> {
    private final Matcher<? super X> first;
    public CombinableEitherMatcher(Matcher<? super X> matcher) {
        this.first = matcher;
    }
    public org.hamcrest.core.CombinableMatcher<X> or(Matcher<? super X> other) {
      return new org.hamcrest.core.CombinableMatcher<X>(first).or(other);
    }
  }
}
