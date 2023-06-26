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
 * Gets or Sets DeliveryCarrierDefault
 */
@JsonAdapter(DeliveryCarrierDefault.Adapter.class)
public enum DeliveryCarrierDefault {
  
  CZ_POST_HAND("CZ_POST_HAND"),
  
  CZ_POST_OFFICE("CZ_POST_OFFICE"),
  
  CZ_POST_OTHER("CZ_POST_OTHER"),
  
  PPL("PPL"),
  
  DPD("DPD"),
  
  GEIS("GEIS"),
  
  IN_TIME("IN_TIME"),
  
  TOP_TRANS("TOP_TRANS"),
  
  GEBRUDER_WEISS("GEBRUDER_WEISS"),
  
  LOCAL_COURIER("LOCAL_COURIER"),
  
  TNT("TNT"),
  
  GLS("GLS"),
  
  HDS_COMFORT("HDS_COMFORT"),
  
  HDS_STANDARD("HDS_STANDARD"),
  
  MALL_DEPOSIT("MALL_DEPOSIT");

  private String value;

  DeliveryCarrierDefault(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeliveryCarrierDefault fromValue(String value) {
    for (DeliveryCarrierDefault b : DeliveryCarrierDefault.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeliveryCarrierDefault> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeliveryCarrierDefault enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeliveryCarrierDefault read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeliveryCarrierDefault.fromValue(value);
    }
  }
}

