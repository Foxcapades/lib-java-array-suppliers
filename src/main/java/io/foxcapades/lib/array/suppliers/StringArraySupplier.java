package io.foxcapades.lib.array.suppliers;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface StringArraySupplier extends ArraySupplier<String[], String> {
  @Override
  @NotNull
  default Class<String[]> getArrayType() {
    return String[].class;
  }

  @NotNull
  default Iterator<String> iterator() {
    return new StringIterator(getValue());
  }

  class StringIterator implements Iterator<String> {
    private final String[] values;
    private int pos;

    public StringIterator(@NotNull String[] values) {
      this.values = values;
    }

    @Contract(pure = true)
    public boolean hasNext() {
      return pos + 1 < values.length;
    }

    @Contract(mutates = "this")
    public String next() {
      return values[pos++];
    }
  }
}
