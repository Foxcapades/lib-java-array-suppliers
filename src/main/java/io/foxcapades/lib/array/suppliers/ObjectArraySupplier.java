package io.foxcapades.lib.array.suppliers;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface ObjectArraySupplier extends ArraySupplier<Object[], Object> {
  @Override
  @NotNull
  default Class<Object[]> getArrayType() {
    return Object[].class;
  }

  @NotNull
  default Iterator<Object> iterator() {
    return new ObjectIterator(getValue());
  }

  class ObjectIterator implements Iterator<Object> {
    private final Object[] values;
    private int pos;

    public ObjectIterator(@NotNull Object[] values) {
      this.values = values;
    }

    @Contract(pure = true)
    public boolean hasNext() {
      return pos + 1 < values.length;
    }

    @Contract(mutates = "this")
    public Object next() {
      return values[pos++];
    }
  }
}
