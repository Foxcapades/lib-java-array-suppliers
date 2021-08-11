package io.foxcapades.lib.array.suppliers;

import org.jetbrains.annotations.NotNull;

public interface ArraySupplier<T, B> extends Iterable<B> {
  @NotNull Class<T> getArrayType();

  @NotNull T getValue();

  static BoolArraySupplier of(boolean... values) {
    return () -> values;
  }

  static ByteArraySupplier of(byte... values) {
    return () -> values;
  }

  static CharArraySupplier of(char... values) {
    return () -> values;
  }

  static DoubleArraySupplier of(double... values) {
    return () -> values;
  }

  static FloatArraySupplier of(float... values) {
    return () -> values;
  }

  static IntArraySupplier of(int... values) {
    return () -> values;
  }

  static LongArraySupplier of(long... values) {
    return () -> values;
  }

  static ObjectArraySupplier of(Object... values) {
    return () -> values;
  }

  static ShortArraySupplier of(short... values) {
    return () -> values;
  }

  static StringArraySupplier of(String... values) {
    return () -> values;
  }
}
