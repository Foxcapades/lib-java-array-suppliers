package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.DoubleIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface DoubleArraySupplier extends ArraySupplier<double[], Double> {
  @Override
  @NotNull
  default Class<double[]> getArrayType() {
    return double[].class;
  }

  @NotNull
  default DoubleIterator primitiveIterator() {
    return new DoubleIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Double> iterator() {
    return primitiveIterator().iterator();
  }
}
