package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.ByteIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface ByteArraySupplier extends ArraySupplier<byte[], Byte> {
  @Override
  @NotNull
  default Class<byte[]> getArrayType() {
    return byte[].class;
  }

  @NotNull
  default ByteIterator primitiveIterator() {
    return new ByteIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Byte> iterator() {
    return primitiveIterator().iterator();
  }
}
