package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.LongIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface LongArraySupplier extends ArraySupplier<long[], Long> {
  @Override
  @NotNull
  default Class<long[]> getArrayType() {
    return long[].class;
  }

  @NotNull
  default LongIterator primitiveIterator() {
    return new LongIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Long> iterator() {
    return primitiveIterator().iterator();
  }
}
