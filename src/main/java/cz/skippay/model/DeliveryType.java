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
 * Delivery type, for &#x60;DELIVERY_CARRIER&#x60; type can be further specified by &#x60;deliveryCarrier&#x60; attribute.
 */
@JsonAdapter(DeliveryType.Adapter.class)
public enum DeliveryType {
  
  DELIVERY_CARRIER("DELIVERY_CARRIER"),
  
  PERSONAL_BRANCH("PERSONAL_BRANCH"),
  
  PERSONAL_PARTNER("PERSONAL_PARTNER"),
  
  ONLINE("ONLINE");

  private String value;

  DeliveryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeliveryType fromValue(String value) {
    for (DeliveryType b : DeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeliveryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeliveryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeliveryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeliveryType.fromValue(value);
    }
  }
}

