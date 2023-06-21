/**
 * Skip Pay API for partners
 * API documentation for Skip Pay partners.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@skippay.cz
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package cz.skippay.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Customer type.
 */
@JsonAdapter(PrecheckResultResponseSerializer.Adapter.class)
public enum PrecheckResultResponseSerializer {
  
  UNKNOWN("UNKNOWN"),
  
  FIRST_ORDER("FIRST_ORDER"),
  
  FULL("FULL"),
  
  BLOCKED("BLOCKED");

  private String value;

  PrecheckResultResponseSerializer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PrecheckResultResponseSerializer fromValue(String value) {
    for (PrecheckResultResponseSerializer b : PrecheckResultResponseSerializer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PrecheckResultResponseSerializer> {
    @Override
    public void write(final JsonWriter jsonWriter, final PrecheckResultResponseSerializer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PrecheckResultResponseSerializer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PrecheckResultResponseSerializer.fromValue(value);
    }
  }
}

