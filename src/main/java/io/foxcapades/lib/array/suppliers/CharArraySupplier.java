package io.foxcapades.lib.array.suppliers;

import io.foxcapades.lib.primitive.iterators.CharIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

@FunctionalInterface
public interface CharArraySupplier extends ArraySupplier<char[], Character> {
  @Override
  @NotNull
  default Class<char[]> getArrayType() {
    return char[].class;
  }
  
  @NotNull
  default CharIterator primitiveIterator() {
    return new CharIterator(getValue());
  }

  @NotNull
  @Override
  default Iterator<Character> iterator() {
    return primitiveIterator().iterator();
  }
}
