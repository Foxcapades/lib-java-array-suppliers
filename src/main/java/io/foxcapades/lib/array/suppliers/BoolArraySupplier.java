package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.BoolIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface BoolArraySupplier extends ArraySupplier<boolean[], Boolean> {
  @Override
  @NotNull
  default Class<boolean[]> getArrayType() {
    return boolean[].class;
  }

  @NotNull
  default BoolIterator primitiveIterator() {
    return new BoolIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Boolean> iterator() {
    return primitiveIterator().iterator();
  }
}
