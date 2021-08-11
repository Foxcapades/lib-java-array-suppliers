package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.ShortIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface ShortArraySupplier extends ArraySupplier<short[], Short> {
  @Override
  @NotNull
  default Class<short[]> getArrayType() {
    return short[].class;
  }

  @NotNull
  default ShortIterator primitiveIterator() {
    return new ShortIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Short> iterator() {
    return primitiveIterator().iterator();
  }
}
