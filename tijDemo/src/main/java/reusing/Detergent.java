package reusing;//: reusing/Detergent.java
// Inheritance syntax & properties.

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

class Cleanser {
  private String s = "Cleanser";

  public int length() {
    return s.length();
  }

  public int indexOf(int ch) {
    return s.indexOf(ch);
  }

  public String replaceAll(String regex, String replacement) {
    return s.replaceAll(regex, replacement);
  }

  public int offsetByCodePoints(int index, int codePointOffset) {
    return s.offsetByCodePoints(index, codePointOffset);
  }

  @Deprecated
  public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
    s.getBytes(srcBegin, srcEnd, dst, dstBegin);
  }

  public String toLowerCase() {
    return s.toLowerCase();
  }

  public int indexOf(String str) {
    return s.indexOf(str);
  }

  public static String valueOf(boolean b) {
    return String.valueOf(b);
  }

  public String toLowerCase(Locale locale) {
    return s.toLowerCase(locale);
  }

  public int lastIndexOf(String str) {
    return s.lastIndexOf(str);
  }

  public int lastIndexOf(int ch, int fromIndex) {
    return s.lastIndexOf(ch, fromIndex);
  }

  public int compareToIgnoreCase(String str) {
    return s.compareToIgnoreCase(str);
  }

  public static String valueOf(float f) {
    return String.valueOf(f);
  }

  public boolean startsWith(String prefix, int toffset) {
    return s.startsWith(prefix, toffset);
  }

  public String substring(int beginIndex) {
    return s.substring(beginIndex);
  }

  public String replace(char oldChar, char newChar) {
    return s.replace(oldChar, newChar);
  }

  public boolean contains(CharSequence s) {
    return this.s.contains(s);
  }

  public static String valueOf(char[] data) {
    return String.valueOf(data);
  }

  public String replace(CharSequence target, CharSequence replacement) {
    return s.replace(target, replacement);
  }

  public int codePointCount(int beginIndex, int endIndex) {
    return s.codePointCount(beginIndex, endIndex);
  }

  public IntStream chars() {
    return s.chars();
  }

  public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
    s.getChars(srcBegin, srcEnd, dst, dstBegin);
  }

  public String substring(int beginIndex, int endIndex) {
    return s.substring(beginIndex, endIndex);
  }

  public String[] split(String regex) {
    return s.split(regex);
  }

  public String[] split(String regex, int limit) {
    return s.split(regex, limit);
  }

  public String replaceFirst(String regex, String replacement) {
    return s.replaceFirst(regex, replacement);
  }

  public static String copyValueOf(char[] data) {
    return String.copyValueOf(data);
  }

  public int codePointBefore(int index) {
    return s.codePointBefore(index);
  }

  public byte[] getBytes(Charset charset) {
    return s.getBytes(charset);
  }

  public CharSequence subSequence(int beginIndex, int endIndex) {
    return s.subSequence(beginIndex, endIndex);
  }

  public static String valueOf(int i) {
    return String.valueOf(i);
  }

  public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
    return s.getBytes(charsetName);
  }

  public int indexOf(int ch, int fromIndex) {
    return s.indexOf(ch, fromIndex);
  }

  public boolean isEmpty() {
    return s.isEmpty();
  }

  public boolean contentEquals(CharSequence cs) {
    return s.contentEquals(cs);
  }

  public int lastIndexOf(String str, int fromIndex) {
    return s.lastIndexOf(str, fromIndex);
  }

  public static String format(Locale l, String format, Object... args) {
    return String.format(l, format, args);
  }

  public boolean contentEquals(StringBuffer sb) {
    return s.contentEquals(sb);
  }

  public static String valueOf(Object obj) {
    return String.valueOf(obj);
  }

  public boolean equalsIgnoreCase(String anotherString) {
    return s.equalsIgnoreCase(anotherString);
  }

  public String concat(String str) {
    return s.concat(str);
  }

  public int lastIndexOf(int ch) {
    return s.lastIndexOf(ch);
  }

  public String trim() {
    return s.trim();
  }

  public char charAt(int index) {
    return s.charAt(index);
  }

  public static String valueOf(char[] data, int offset, int count) {
    return String.valueOf(data, offset, count);
  }

  public static String format(String format, Object... args) {
    return String.format(format, args);
  }

  public String toUpperCase(Locale locale) {
    return s.toUpperCase(locale);
  }

  public char[] toCharArray() {
    return s.toCharArray();
  }

  public String intern() {
    return s.intern();
  }

  public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
    return s.regionMatches(ignoreCase, toffset, other, ooffset, len);
  }

  public boolean endsWith(String suffix) {
    return s.endsWith(suffix);
  }

  public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
    return String.join(delimiter, elements);
  }

  public IntStream codePoints() {
    return s.codePoints();
  }

  public byte[] getBytes() {
    return s.getBytes();
  }

  public int compareTo(String anotherString) {
    return s.compareTo(anotherString);
  }

  public static String copyValueOf(char[] data, int offset, int count) {
    return String.copyValueOf(data, offset, count);
  }

  public static String valueOf(char c) {
    return String.valueOf(c);
  }

  public boolean matches(String regex) {
    return s.matches(regex);
  }

  public static String valueOf(long l) {
    return String.valueOf(l);
  }

  public boolean startsWith(String prefix) {
    return s.startsWith(prefix);
  }

  public int codePointAt(int index) {
    return s.codePointAt(index);
  }

  public static String join(CharSequence delimiter, CharSequence... elements) {
    return String.join(delimiter, elements);
  }

  public int indexOf(String str, int fromIndex) {
    return s.indexOf(str, fromIndex);
  }

  public String toUpperCase() {
    return s.toUpperCase();
  }

  public boolean regionMatches(int toffset, String other, int ooffset, int len) {
    return s.regionMatches(toffset, other, ooffset, len);
  }

  public static String valueOf(double d) {
    return String.valueOf(d);
  }

  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    System.out.println(x);
  }
}

public class Detergent extends Cleanser {
  // Change a method:
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // Call base-class version
  }
  // Add methods to the interface:
  public void foam() { append(" foam()"); }
  // Test the new class:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class:");
    Cleanser.main(args);
  }	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
