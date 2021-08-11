package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.IntIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface IntArraySupplier extends ArraySupplier<int[], Integer> {
  @Override
  @NotNull
  default Class<int[]> getArrayType() {
    return int[].class;
  }

  @NotNull
  default IntIterator primitiveIterator() {
    return new IntIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Integer> iterator() {
    return primitiveIterator().iterator();
  }
}
