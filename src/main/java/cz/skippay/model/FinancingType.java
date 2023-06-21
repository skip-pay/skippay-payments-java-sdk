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
 * Financing type
 */
@JsonAdapter(FinancingType.Adapter.class)
public enum FinancingType {
  
  DEFERRED_PAYMENT("DEFERRED_PAYMENT"),
  
  PAY_IN_THREE("PAY_IN_THREE");

  private String value;

  FinancingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FinancingType fromValue(String value) {
    for (FinancingType b : FinancingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FinancingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FinancingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FinancingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FinancingType.fromValue(value);
    }
  }
}

