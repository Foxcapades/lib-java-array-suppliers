package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.FloatIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface FloatArraySupplier extends ArraySupplier<float[], Float> {
  @Override
  @NotNull
  default Class<float[]> getArrayType() {
    return float[].class;
  }

  @NotNull
  default FloatIterator primitiveIterator() {
    return new FloatIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Float> iterator() {
    return primitiveIterator().iterator();
  }
}
