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
 * Item type
 */
@JsonAdapter(ItemType.Adapter.class)
public enum ItemType {
  
  PHYSICAL("PHYSICAL"),
  
  DISCOUNT("DISCOUNT"),
  
  SHIPPING_FEE("SHIPPING_FEE"),
  
  SALES_TAX("SALES_TAX"),
  
  DIGITAL("DIGITAL"),
  
  GIFT_CARD("GIFT_CARD"),
  
  STORE_CREDIT("STORE_CREDIT"),
  
  FEE("FEE"),
  
  INSURANCE("INSURANCE");

  private String value;

  ItemType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemType fromValue(String value) {
    for (ItemType b : ItemType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ItemType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ItemType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ItemType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ItemType.fromValue(value);
    }
  }
}

